"""Moves the programs of your OLD repo into this repo's package layout.

  python migrate_old.py ../old-repo            (preview, changes nothing)
  python migrate_old.py ../old-repo --apply    (really copies)

Old:  old-repo/programs/q001/CopyArray.java  (+ input.txt)
New:  programs/arrays/CopyArray.java         (with `// Q001` and `package arrays;` added)
      inputs/q001.txt
Your old repo is only READ, never changed.
If two questions use the same class name in the same package (for example both have `Main`),
that question is skipped and listed. Rename the class in the old file (VS Code: F2) and run again.
"""
import re
import sys
from pathlib import Path

import javapkg as jp


def convert(src, n, pkg):
    src = jp.TAG_RE.sub("", src)
    src = jp.PACKAGE_RE.sub("", src, count=1)
    return f"// Q{n:03d}\npackage {pkg};\n\n" + src.lstrip("\r\n")


def main():
    args = [a for a in sys.argv[1:] if not a.startswith("--")]
    apply = "--apply" in sys.argv
    if len(args) != 1:
        sys.exit(__doc__)
    old = Path(args[0]) / "programs"
    if not old.is_dir():
        sys.exit(f"{old} not found. Give the path of your OLD repo folder.")
    questions = jp.load_questions()
    by_n = {q["n"]: q for q in questions}
    mapping = jp.load_packages()

    migrated, same, conflicts, skipped = [], [], [], []
    planned = {}  # target path -> question that will use it (to spot clashes inside this run)
    for d in sorted(old.iterdir()):
        if not (d.is_dir() and re.fullmatch(r"q\d{3}", d.name)):
            continue
        n = int(d.name[1:])
        files = sorted(d.glob("*.java"))
        if not files:
            continue
        if n not in by_n:
            skipped.append(f"{d.name}: not in questions.json")
            continue
        pkg = jp.package_for(by_n[n]["topic"], mapping)
        plan, clash = [], None
        for f in files:
            new_src = convert(f.read_text(encoding="utf-8"), n, pkg)
            target = jp.pkg_dir(pkg) / f.name
            if target in planned and planned[target] != d.name:
                clash = (f"{d.name}/{f.name} -> programs/{pkg.replace(".", "/")}/{f.name} "
                         f"clashes with {planned[target]} (same class name in the same package)")
                break
            if target.exists():
                if target.read_text(encoding="utf-8") == new_src:
                    plan.append((target, None))      # already migrated
                    continue
                clash = f"{d.name}/{f.name} -> programs/{pkg.replace('.', '/')}/{f.name} already exists (another question?)"
                break
            plan.append((target, new_src))
        if clash:
            conflicts.append(clash)
            continue
        inp = d / "input.txt"
        if all(s is None for _, s in plan):
            same.append(d.name)
            continue
        for target, _ in plan:
            planned[target] = d.name
        migrated.append(d.name)
        if apply:
            for target, new_src in plan:
                if new_src is not None:
                    target.parent.mkdir(parents=True, exist_ok=True)
                    target.write_text(new_src, encoding="utf-8")
            if inp.exists():
                jp.INPUTS.mkdir(exist_ok=True)
                (jp.INPUTS / f"{d.name}.txt").write_text(inp.read_text(encoding="utf-8"), encoding="utf-8")
        print(f"{'copied' if apply else 'would copy'}: {d.name} -> package {pkg}  ({', '.join(f.name for f in files)})")

    print(f"\n{len(migrated)} question(s) {'migrated' if apply else 'ready to migrate'}, "
          f"{len(same)} already done, {len(conflicts)} conflict(s), {len(skipped)} skipped.")
    for c in conflicts:
        print("CONFLICT:", c)
    for s in skipped:
        print("SKIPPED:", s)
    if not apply and migrated:
        print("\nThis was only a preview. Add --apply to copy the files.")


if __name__ == "__main__":
    main()
