"""Small helper for managing packages and creating new programs.

  python manage.py packages                 show every topic, its package and your progress
  python manage.py packages --sync          add topics missing in packages.json (automatic names)
  python manage.py new 12 ReverseArray      create programs/<package>/ReverseArray.java for question 12
  python manage.py new 12 ReverseArray --input   ... and also an empty inputs/q012.txt
  python manage.py check                    find mistakes (wrong package, missing tag ...) without running Java
  python manage.py run 12                   compile + run question 12 here and print its output
  python manage.py rename-package arrays arrays1d          (preview)
  python manage.py rename-package arrays arrays1d --apply  (really do it)
"""
import argparse
import re
import shutil
import sys

import javapkg as jp


def parse_q(text):
    m = re.fullmatch(r"[qQ]?(\d{1,3})", text.strip())
    if not m:
        sys.exit(f"'{text}' is not a question number. Use for example 12 or q012.")
    return int(m.group(1))


def load():
    questions = jp.load_questions()
    by_n = {q["n"]: q for q in questions}
    mapping = jp.load_packages()
    return questions, by_n, mapping


# ---------------- packages ----------------
def cmd_packages(args):
    questions, by_n, mapping = load()
    sources, _problems, _untagged = jp.scan_sources(by_n, mapping)
    topics, order = {}, []
    for q in questions:
        if q["topic"] not in topics:
            topics[q["topic"]] = []
            order.append(q["topic"])
        topics[q["topic"]].append(q["n"])
    print(f"{'Topic':45} {'Package':22} Done")
    for t in order:
        pkg = jp.package_for(t, mapping)
        done = sum(1 for n in topics[t] if f"q{n:03d}" in sources)
        flag = "" if t in mapping else "   <- not in packages.json (automatic name)"
        print(f"{t[:44]:45} {pkg:22} {done}/{len(topics[t])}{flag}")
    new = {t: jp.package_for(t, mapping) for t in order if t not in mapping}
    if args.sync and new:
        mapping.update(new)
        jp.save_packages(mapping)
        print(f"\nAdded {len(new)} topic(s) to packages.json. Open it to change any name.")
    elif new:
        print("\nRun `python manage.py packages --sync` to write the missing ones into packages.json.")
    bad = [f"{t}: {p}" for t, p in mapping.items() if not jp.valid_package(p)]
    if bad:
        print("\nInvalid package names in packages.json (use lowercase letters/digits, e.g. arrays):")
        print("  " + "\n  ".join(bad))


# ---------------- new program ----------------
TEMPLATE = """// Q{n:03d}
package {pkg};
{imports}
public class {cls} {{
    public static void main(String[] args) {{
{body}    }}
}}
"""


def cmd_new(args):
    _questions, by_n, mapping = load()
    n = parse_q(args.q)
    if n not in by_n:
        sys.exit(f"Question {n} is not in questions.json.")
    cls = args.cls.removesuffix(".java")
    if not re.fullmatch(r"[A-Za-z_]\w*", cls) or cls in jp.JAVA_WORDS:
        sys.exit(f"'{cls}' is not a valid Java class name.")
    q = by_n[n]
    pkg = jp.package_for(q["topic"], mapping)
    if q["topic"] not in mapping:
        mapping[q["topic"]] = pkg
        jp.save_packages(mapping)
        print(f"(Added '{q['topic']}' -> '{pkg}' to packages.json)")
    path = jp.pkg_dir(pkg) / f"{cls}.java"
    if path.exists():
        sys.exit(f"{path.relative_to(jp.ROOT).as_posix()} already exists. Class names must be unique inside a package.")
    path.parent.mkdir(parents=True, exist_ok=True)
    imports, body = "", "        // write your code here\n"
    if args.input:
        imports = "\nimport java.util.Scanner;\n"
        body = "        Scanner sc = new Scanner(System.in);\n        // write your code here\n"
        jp.INPUTS.mkdir(exist_ok=True)
        inp = jp.INPUTS / f"q{n:03d}.txt"
        if not inp.exists():
            inp.write_text("", encoding="utf-8")
    path.write_text(TEMPLATE.format(n=n, pkg=pkg, cls=cls, imports=imports, body=body), encoding="utf-8")
    print(f"Question {n:03d} [{q['topic']}]: {q['text']}")
    print(f"Created {path.relative_to(jp.ROOT).as_posix()}")
    if args.input:
        print(f"Created inputs/q{n:03d}.txt  (type the input values here)")


# ---------------- check / run ----------------
def cmd_check(_args):
    _questions, by_n, mapping = load()
    sources, problems, untagged = jp.scan_sources(by_n, mapping)
    for qid in sorted(problems):
        for e in problems[qid]:
            print(f"ERROR {qid}: {e}")
    for rel in untagged:
        print(f"note: programs/{rel} has no // Qnnn tag, so it is not shown on the website "
              f"(fine for helper classes).")
    for t, p in mapping.items():
        if not jp.valid_package(p):
            print(f"ERROR packages.json: '{p}' (topic {t}) is not a valid package name.")
    print(f"\n{len(sources)} question(s) found, {len(problems)} with errors.")
    if problems:
        sys.exit(1)


def cmd_run(args):
    _questions, by_n, mapping = load()
    n = parse_q(args.q)
    qid = f"q{n:03d}"
    sources, problems, _ = jp.scan_sources(by_n, mapping)
    if qid not in sources:
        sys.exit(f"No Java file with the tag // {qid.upper()} was found in programs/.")
    if qid in problems:
        sys.exit("\n".join(problems[qid]))
    ok, out = jp.run_java(sources[qid], jp.read_input(qid))
    print(out)
    if not ok:
        sys.exit(1)


# ---------------- rename a package ----------------
def cmd_rename(args):
    old, new = args.old, args.new
    if not jp.valid_package(new):
        sys.exit(f"'{new}' is not a valid package name (lowercase letters/digits, e.g. arrays or oop.inheritance).")
    src, dst = jp.pkg_dir(old), jp.pkg_dir(new)
    if not src.is_dir():
        sys.exit(f"Folder programs/{old.replace('.', '/')} does not exist.")
    if dst.exists():
        sys.exit(f"programs/{new.replace('.', '/')} already exists. Merging packages is not done automatically.")
    pat = re.compile(r"^([ \t]*(?:package|import(?:[ \t]+static)?)[ \t]+)" + re.escape(old) + r"(?=[.;])", re.MULTILINE)
    changes = []
    for f in sorted(jp.PROGRAMS.rglob("*.java")):
        text = f.read_text(encoding="utf-8")
        new_text = pat.sub(lambda m: m.group(1) + new, text)
        if new_text != text:
            changes.append((f, new_text))
    mapping = jp.load_packages()
    remap = {t: (new + p[len(old):]) for t, p in mapping.items() if p == old or p.startswith(old + ".")}
    print(f"Folder: programs/{old.replace('.', '/')}  ->  programs/{new.replace('.', '/')}")
    print(f"package/import lines changed in {len(changes)} file(s); packages.json entries changed: {len(remap)}")
    if not args.apply:
        print("\nThis was only a preview. Add --apply to do it.")
        return
    for f, text in changes:
        f.write_text(text, encoding="utf-8")
    dst.parent.mkdir(parents=True, exist_ok=True)
    shutil.move(str(src), str(dst))
    if remap:
        mapping.update(remap)
        jp.save_packages(mapping)
    print("\nDone. Now run `python manage.py check`.")


def main():
    ap = argparse.ArgumentParser(description=__doc__, formatter_class=argparse.RawDescriptionHelpFormatter)
    sub = ap.add_subparsers(dest="cmd", required=True)
    p = sub.add_parser("packages"); p.add_argument("--sync", action="store_true"); p.set_defaults(f=cmd_packages)
    p = sub.add_parser("new"); p.add_argument("q"); p.add_argument("cls"); p.add_argument("--input", action="store_true"); p.set_defaults(f=cmd_new)
    p = sub.add_parser("check"); p.set_defaults(f=cmd_check)
    p = sub.add_parser("run"); p.add_argument("q"); p.set_defaults(f=cmd_run)
    p = sub.add_parser("rename-package"); p.add_argument("old"); p.add_argument("new"); p.add_argument("--apply", action="store_true"); p.set_defaults(f=cmd_rename)
    args = ap.parse_args()
    args.f(args)


if __name__ == "__main__":
    main()
