"""Professor ki site se saare questions ek baar nikaal ke questions.json banata hai.
Chalane ka tareeka:  pip install requests beautifulsoup4  &&  python scrape_questions.py
"""
import json, re, sys, time
import requests
from bs4 import BeautifulSoup

BASE = "https://c4knowledgeseekers.in"
MAIN = BASE + "/practice/core-java-programming"
HEADERS = {"User-Agent": "Mozilla/5.0"}

# Ye topics website mein nahi chahiye (site ke URL ke last wale hisse se match hota hai)
EXCLUDE = {
    "applets",
    "graphical-user-interface-awt",
    "delegation-event-model",
    "graphical-user-interface-swings",
}


def get(url):
    r = requests.get(url, headers=HEADERS, timeout=30)
    r.raise_for_status()
    return BeautifulSoup(r.text, "html.parser")


def clean(t):
    return re.sub(r"\s+", " ", t).strip()


# 1) main page se saare topic links (jaise .../core-java-programming/arrays)
topic_re = re.compile(r"^/practice/core-java-programming/([a-z0-9-]+)$")
topics, seen = [], set()
for a in get(MAIN).find_all("a", href=True):
    href = a["href"].replace(BASE, "")
    m = topic_re.match(href)
    if m and m.group(1) not in EXCLUDE and href not in seen:
        seen.add(href)
        topics.append((clean(a.get_text(" ")), href))

# 2) har topic page se questions (heading + "Start Solving" link)
q_re = re.compile(r"^/practice/core-java-programming/[a-z0-9-]+/\d+$")
questions, n = [], 0
for _, href in topics:
    soup = get(BASE + href)
    title = soup.find("h1")
    topic = clean(title.get_text()) if title else href.rsplit("/", 1)[-1].upper()
    found = 0
    for a in soup.find_all("a", href=True):
        h = a["href"].replace(BASE, "")
        if not q_re.match(h):
            continue
        h3 = a.find_previous("h3")
        if not h3:
            continue
        n += 1
        found += 1
        questions.append({"n": n, "topic": topic, "text": clean(h3.get_text(" ")), "url": BASE + h})
    print(f"{topic}: {found}")
    time.sleep(0.5)

json.dump(questions, open("questions.json", "w", encoding="utf-8"), ensure_ascii=False, indent=1)
with open("questions.txt", "w", encoding="utf-8") as f:
    for q in questions:
        f.write(f"{q['n']:03d} [{q['topic']}] {q['text']}\n")
print(f"\nTotal questions: {len(questions)}  ->  questions.json, questions.txt")
if len(questions) != 392:
    print("NOTE: 392 nahi aaye, dekh lo ki professor ki list se match karta hai ya nahi.", file=sys.stderr)
