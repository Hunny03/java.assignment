"""After every push, GitHub Actions runs this script.

programs/arrays/CopyArray.java   (package arrays;  + a "// Q001" tag line)
   ->  compile + run (input from inputs/q001.txt)  ->  docs/shots/q001.png (output screenshot)
                                                    ->  docs/q001.html     (question page)
                                                    ->  docs/topic-*.html  (list of questions of a topic)
                                                    ->  docs/index.html    (topic blocks)
Only new / changed programs are run again, the old output of the others is reused.
Java handling (packages, compile, run) is in javapkg.py.
"""
import hashlib
import html
import json
import re
import sys
from pathlib import Path

from PIL import Image, ImageDraw, ImageFont

import javapkg as jp

# ---- apni details yahan badlo ----
NAME = "Hunny"
COURSE = "Bachelor of Computer Applications"
COURSE_SHORT = "BCA"
ROLL = "7081/24"
# ----------------------------------

FOOTER = f"Core Java Practical File · Made by {NAME} · {ROLL}"
ROOT = Path(__file__).parent
DOCS = ROOT / "docs"
SHOTS = DOCS / "shots"
OUTPUTS = ROOT / "outputs"
CACHE_FILE = ROOT / "build_cache.json"
TEMPLATES = ROOT / "templates"
FONT_PATHS = [
    "/usr/share/fonts/truetype/dejavu/DejaVuSansMono.ttf",
    "/Library/Fonts/Courier New.ttf",
    "C:/Windows/Fonts/consola.ttf",
]


# ---------- output ka screenshot (PNG) ----------
def load_font(size):
    for p in FONT_PATHS:
        try:
            return ImageFont.truetype(p, size)
        except OSError:
            continue
    return ImageFont.load_default()


def make_screenshot(text, path):
    lines = text.replace("\t", "    ").rstrip("\n").split("\n") if text.strip() else ["(no output)"]
    if len(lines) > 300:
        lines = lines[:300] + ["... (output truncated)"]
    font = load_font(15)
    pad, lh = 16, 21
    width = max(int(max(font.getlength(l) for l in lines)) + pad * 2, 520)
    height = lh * len(lines) + pad * 2
    img = Image.new("RGB", (width, height), "#111111")
    d = ImageDraw.Draw(img)
    for i, l in enumerate(lines):
        d.text((pad, pad + i * lh), l, font=font, fill="#dddddd")
    img.save(path)


# ---------- HTML helpers ----------
def fill(template_name, values):
    t = (TEMPLATES / template_name).read_text(encoding="utf-8")
    return re.sub(r"\{\{(\w+)\}\}", lambda m: values[m.group(1)], t)


def esc(s):
    return html.escape(s, quote=False)


def topic_file(topic):
    return "topic-" + re.sub(r"[^a-z0-9]+", "-", topic.lower()).strip("-") + ".html"


def show_code(files):
    """Code shown on the page. The // Qnnn tag lines are hidden."""
    def clean(src):
        return jp.TAG_RE.sub("", src).strip("\n").rstrip()
    if len(files) == 1:
        return clean(next(iter(files.values())))
    return "\n\n".join(f"// ---- {Path(n).name} ----\n{clean(src)}" for n, src in sorted(files.items()))


def main():
    questions = jp.load_questions()
    by_n = {q["n"]: q for q in questions}
    total = len(questions)

    SHOTS.mkdir(parents=True, exist_ok=True)
    OUTPUTS.mkdir(exist_ok=True)
    cache = json.loads(CACHE_FILE.read_text()) if CACHE_FILE.exists() else {}
    failed = False

    # find every // Qnnn tagged Java file in programs/<package>/...
    packages = jp.load_packages()
    sources, problems, _untagged = jp.scan_sources(by_n, packages)
    ids = sorted(q for q in sources if int(q[1:]) in by_n)

    missing = [q["topic"] for q in questions if q["topic"] not in packages]
    if missing:
        print("Note: these topics are not in packages.json (automatic package names are used): "
              + ", ".join(sorted(set(missing))))

    # delete page / screenshot of programs that no longer exist
    for old in list(DOCS.glob("q[0-9][0-9][0-9].html")) + list(SHOTS.glob("q*.png")) + list(OUTPUTS.glob("q*.txt")):
        if old.stem not in ids:
            old.unlink()
            cache.pop(old.stem, None)

    # problems that are not tied to a question number in questions.json
    for qid, errs in problems.items():
        if int(qid[1:]) not in by_n:
            failed = True
            for e in errs:
                print(f"::error::{e}")

    # run new / changed programs
    for qid in ids:
        files = sources[qid]
        stdin_text = jp.read_input(qid)
        if qid in problems:
            failed = True
            for e in problems[qid]:
                print(f"::error file=programs/{e.split(": ", 1)[0]}::{e}")
            continue
        digest = hashlib.sha256(
            ("\0".join(f"{n}\0{s}" for n, s in sorted(files.items())) + "\0" + stdin_text).encode()
        ).hexdigest()
        shot = SHOTS / f"{qid}.png"
        if cache.get(qid) == digest and shot.exists():
            continue
        print(f"Running {qid} ...")
        ok, out = jp.run_java(files, stdin_text)
        if not ok:
            failed = True
            msgs = [l for l in out.splitlines() if l.strip() and not l.startswith("Compile error")]
            print(f"::error file=programs/{next(iter(files))}::{msgs[0] if msgs else 'error'}")
            print(out)
            continue
        (OUTPUTS / f"{qid}.txt").write_text(out, encoding="utf-8")
        make_screenshot(out, shot)
        cache[qid] = digest

    CACHE_FILE.write_text(json.dumps(cache, indent=1, sort_keys=True))

    # jinka screenshot ban chuka hai wahi pages banenge
    done = {q for q in ids if (SHOTS / f"{q}.png").exists()}

    # topic ke hisaab se questions (order wahi jo questions.json mein hai)
    topics, order = {}, []
    for q in questions:
        if q["topic"] not in topics:
            topics[q["topic"]] = []
            order.append(q["topic"])
        topics[q["topic"]].append(q)

    # question pages: prev / next usi topic ke solved questions ke beech
    for topic in order:
        solved = [f"q{q['n']:03d}" for q in topics[topic] if f"q{q['n']:03d}" in done]
        for i, qid in enumerate(solved):
            n = int(qid[1:])
            files, stdin_text = sources[qid], jp.read_input(qid)
            caption = ""
            if stdin_text.strip():
                caption = f"<figcaption>Input given: {esc(', '.join(stdin_text.split()))}</figcaption>"
            prev_btn = f'<a class="btn o" href="{solved[i-1]}.html">← Prev</a>' if i > 0 else ""
            next_btn = f'<a class="btn o" href="{solved[i+1]}.html">Next →</a>' if i < len(solved) - 1 else ""
            page = fill("question.html", {
                "num": f"{n:03d}", "id": qid, "topic": esc(topic), "topic_file": topic_file(topic),
                "question": esc(by_n[n]["text"]), "code": esc(show_code(files)),
                "input_caption": caption, "prev": prev_btn, "next": next_btn, "footer": FOOTER,
            })
            (DOCS / f"{qid}.html").write_text(page, encoding="utf-8")

    # topic pages + home page
    for old in DOCS.glob("topic-*.html"):
        old.unlink()
    cards = []
    for idx, topic in enumerate(order, 1):
        qs = topics[topic]
        solved_count = sum(1 for q in qs if f"q{q['n']:03d}" in done)
        tiles = []
        for q in qs:
            qid = f"q{q['n']:03d}"
            inner = f'<span class="n">{q["n"]:03d}</span><span class="q">{esc(q["text"])}</span>'
            if qid in done:
                tiles.append(f'        <a class="blk" href="{qid}.html">{inner}<span class="go">Open solution →</span></a>')
            else:
                tiles.append(f'        <div class="blk off">{inner}<span class="go">Pending</span></div>')
        (DOCS / topic_file(topic)).write_text(fill("topic.html", {
            "topic": esc(topic), "solved": str(solved_count), "count": str(len(qs)),
            "tiles": "\n".join(tiles), "footer": FOOTER,
        }), encoding="utf-8")
        cards.append(
            f'        <a class="blk" href="{topic_file(topic)}"><span class="n">{idx:02d}</span>'
            f'<span class="q">{esc(topic)}</span>'
            f'<span class="go">{solved_count} / {len(qs)} done →</span></a>'
        )

    (DOCS / "index.html").write_text(fill("index.html", {
        "name": NAME, "course": COURSE, "course_short": COURSE_SHORT, "roll": ROLL,
        "done": str(len(done)), "total": str(total), "groups": "\n".join(cards), "footer": FOOTER,
    }), encoding="utf-8")
    print(f"Done. {len(done)} / {total} programs.")

    if failed:
        sys.exit(1)


if __name__ == "__main__":
    main()
