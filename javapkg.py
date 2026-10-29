"""Shared helpers for build.py, manage.py and migrate_old.py (no Pillow needed here).

How a question is linked to its Java file(s)
--------------------------------------------
Java files live in topic packages:  programs/arrays/CopyArray.java  (package arrays;)
A file belongs to a question when it has a tag line like   // Q001   anywhere in the file.
A question can have many files (all tagged with the same number); the one with main() is run.
Input for a question (optional) is in  inputs/q001.txt
Topic -> package names are in packages.json
"""
import json
import os
import re
import subprocess
import tempfile
from pathlib import Path

ROOT = Path(__file__).parent
PROGRAMS = ROOT / "programs"
INPUTS = ROOT / "inputs"
QUESTIONS_FILE = ROOT / "questions.json"
PACKAGES_FILE = ROOT / "packages.json"
TIMEOUT = 10  # seconds, to stop infinite loops

MAIN_RE = re.compile(r"void\s+main\s*\(")
PACKAGE_RE = re.compile(r"^[ \t]*package\s+([\w.]+)\s*;[ \t]*\r?\n?", re.MULTILINE)
TAG_RE = re.compile(r"^[ \t]*//[ \t]*Q(\d{1,3})[ \t]*$", re.MULTILINE)
PKG_NAME_RE = re.compile(r"[a-z][a-z0-9_]*(\.[a-z][a-z0-9_]*)*")

JAVA_WORDS = set("""abstract assert boolean break byte case catch char class const continue default do
double else enum extends final finally float for goto if implements import instanceof int interface long
native new package private protected public return short static strictfp super switch synchronized this
throw throws transient try void volatile while true false null""".split())


# ---------- questions + package names ----------
def load_questions():
    if not QUESTIONS_FILE.exists():
        raise SystemExit("questions.json not found. Copy it from your old repo, or run `python scrape_questions.py`.")
    return json.loads(QUESTIONS_FILE.read_text(encoding="utf-8"))


def load_packages():
    if PACKAGES_FILE.exists():
        return json.loads(PACKAGES_FILE.read_text(encoding="utf-8"))
    return {}


def save_packages(mapping):
    PACKAGES_FILE.write_text(json.dumps(mapping, indent=2, ensure_ascii=False) + "\n", encoding="utf-8")


def slug_package(topic):
    """Automatic package name for a topic that is not in packages.json yet."""
    s = re.sub(r"[^a-z0-9]+", "", topic.lower()) or "misc"
    if s[0].isdigit():
        s = "p" + s
    if s in JAVA_WORDS:
        s += "s"
    return s


def valid_package(name):
    return bool(PKG_NAME_RE.fullmatch(name)) and not any(p in JAVA_WORDS for p in name.split("."))


def package_for(topic, mapping):
    return mapping.get(topic) or slug_package(topic)


def pkg_dir(pkg):
    return PROGRAMS / pkg.replace(".", "/")


# ---------- finding the Java files of every question ----------
def scan_sources(by_n, mapping):
    """Returns (sources, problems, untagged)
    sources : {"q001": {"arrays/CopyArray.java": "<code>", ...}}
    problems: {"q001": ["message", ...]}
    untagged: [relative paths of .java files that have no // Qnnn tag]
    """
    sources, problems, untagged = {}, {}, []
    if not PROGRAMS.exists():
        return sources, problems, untagged
    for f in sorted(PROGRAMS.rglob("*.java")):
        rel = f.relative_to(PROGRAMS).as_posix()
        src = f.read_text(encoding="utf-8")
        tags = sorted({int(n) for n in TAG_RE.findall(src)})
        if not tags:
            untagged.append(rel)
            continue
        pkg = PACKAGE_RE.search(src)
        declared = pkg.group(1) if pkg else ""
        folder = Path(rel).parent.as_posix()
        folder = "" if folder == "." else folder
        for n in tags:
            qid = f"q{n:03d}"
            sources.setdefault(qid, {})[rel] = src
            errs = problems.setdefault(qid, [])
            if n not in by_n:
                errs.append(f"{rel}: tag // {qid.upper()} is not a question number in questions.json.")
                continue
            if not declared:
                errs.append(f"{rel}: there is no package line. Add `package {package_for(by_n[n]['topic'], mapping)};` "
                            f"as the first code line.")
                continue
            if declared.replace(".", "/") != folder:
                errs.append(f"{rel}: it says `package {declared};` but the file is in folder "
                            f"'programs/{folder or '(root)'}'. Package name and folder must match "
                            f"(file should be in programs/{declared.replace('.', '/')}/).")
                continue
            expected = package_for(by_n[n]["topic"], mapping)
            # sub-packages are allowed: topic package 'packages' also accepts 'packages.q254', 'packages.c4.sample' ...
            if declared != expected and not declared.startswith(expected + "."):
                errs.append(f"{rel}: {qid.upper()} is a '{by_n[n]['topic']}' question, so its package must be "
                            f"'{expected}' (see packages.json), but this file is in '{declared}'.")
    problems = {q: e for q, e in problems.items() if e}
    return sources, problems, untagged


def read_input(qid):
    p = INPUTS / f"{qid}.txt"
    return p.read_text(encoding="utf-8") if p.exists() else ""


# ---------- compile + run ----------
def find_main_class(files):
    """files: {relative/path.java: source}. Fully qualified name of the class that has main()."""
    for name, src in sorted(files.items()):
        m = MAIN_RE.search(src)
        if not m:
            continue
        pub = re.search(r"public\s+(?:final\s+|abstract\s+)*class\s+(\w+)", src)
        if pub:
            cls = pub.group(1)
        else:
            before = [x.group(1) for x in re.finditer(r"\bclass\s+(\w+)", src) if x.start() < m.start()]
            cls = before[-1] if before else Path(name).stem
        pkg = PACKAGE_RE.search(src)
        return f"{pkg.group(1)}.{cls}" if pkg else cls
    return None


def run_java(files, stdin_text):
    """(ok, text). ok=False means compile error / no main / timeout."""
    cls = find_main_class(files)
    if not cls:
        return False, "main method not found."
    with tempfile.TemporaryDirectory() as tmp:
        c = subprocess.run(
            ["javac", "-encoding", "UTF-8", "-sourcepath", str(PROGRAMS), "-d", tmp]
            + [str(PROGRAMS / n) for n in sorted(files)],
            capture_output=True, text=True,
        )
        if c.returncode != 0:
            msg = (c.stderr or c.stdout).replace(str(PROGRAMS) + os.sep, "programs/")
            return False, "Compile error:\n" + msg
        try:
            r = subprocess.run(
                ["java", "-Dfile.encoding=UTF-8", "-cp", tmp, cls],
                cwd=tmp, input=stdin_text, capture_output=True, text=True, timeout=TIMEOUT,
            )
        except subprocess.TimeoutExpired:
            return False, f"Program did not finish in {TIMEOUT} seconds (infinite loop?)."
        return True, r.stdout + r.stderr
