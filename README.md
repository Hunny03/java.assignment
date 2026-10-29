# Core Java Practical File (topic-wise packages)

Website: Home (topics) -> Topic page (questions) -> Question page (code + output).
Everything is built automatically by GitHub Actions after every push.

## How programs are organised

```text
programs/
├── arrays/          <- package arrays
│   ├── CopyArray.java
│   └── ReverseArray.java
├── functions/       <- package functions
│   └── Factorial.java
└── oop/             <- package oop
    ├── Shape.java
    ├── Circle.java
    └── ShapeDemo.java
inputs/
└── q001.txt         <- optional input for question 1
packages.json        <- which topic uses which package
questions.json       <- the 392 questions (from your old repo / scraper)
```

Every Java file starts like this:

```java
// Q001
package arrays;

public class CopyArray { ... }
```

* `// Q001` links the file to question 1 (the website uses it). Put the same tag in every file of
  that question (for example interface + classes + the class with `main`).
* `package arrays;` must match the folder `programs/arrays/` and the topic in `packages.json`.
* Class names must be **unique inside one package** (Java rule). `CopyArray`, `ReverseArray` ... not `Main`.
* The tag line is hidden on the website page; `package ...;` is shown.

## One-time setup (new repository)

1. Extract this ZIP. Open the `java-assignment` folder in VS Code (File > Open Folder).
2. Copy `questions.json` (and `questions.txt`) from your OLD repo into this folder.
   (No old file? run `pip install requests beautifulsoup4` then `python scrape_questions.py`.)
3. Open the terminal in VS Code (Terminal > New Terminal) and run:
   ```text
   pip install pillow
   python manage.py packages
   ```
   Check that every topic shows the package name you want. If a topic says
   "not in packages.json", run `python manage.py packages --sync`, then open `packages.json`
   and change names if you like. Several topics may share one package (e.g. both array topics -> `arrays`).
4. Move your old programs in (this only READS your old repo):
   ```text
   python migrate_old.py ../old-repo-folder
   python migrate_old.py ../old-repo-folder --apply
   ```
   The first command is a preview. If it lists CONFLICTs (same class name twice in one package,
   e.g. two `Main`), rename the class in the OLD file (VS Code: click class name, press F2) and run again.
5. Test locally: `python manage.py check` then `python build.py`. Open `docs/index.html` in a browser.
6. Create an empty repository on GitHub (no README), then in the terminal:
   ```text
   git init
   git add .
   git commit -m "Java assignment with packages"
   git branch -M main
   git remote add origin https://github.com/YOUR-NAME/YOUR-REPO.git
   git push -u origin main
   ```
7. On GitHub: Settings > Pages > Source: "Deploy from a branch" > Branch `main`, folder `/docs` > Save.
   Settings > Actions > General > Workflow permissions: "Read and write permissions" > Save.
8. Actions tab: the "Build assignment pages" run turns green and pushes the generated pages.
   After it finishes, run `git pull` in VS Code to get them.
   (If the first run did not start: Actions > Build assignment pages > Run workflow.)

## Daily work

```text
python manage.py new 12 ReverseArray            creates programs/<package>/ReverseArray.java
python manage.py new 12 ReverseArray --input    ... plus inputs/q012.txt (write the input values in it)
python manage.py run 12                         compile + run question 12 and show the output
python manage.py check                          finds wrong package / missing tag / wrong folder
git add .   ->   git commit -m "Q12"   ->   git push
```
`new` already knows the topic of question 12, creates the package folder if needed and prints the question text.
Then wait for the GitHub Action, then `git pull`.

## Managing packages

* See everything: `python manage.py packages`
* Rename a package (moves folder, fixes `package`/`import` lines and packages.json):
  ```text
  python manage.py rename-package arrays arrays1d            (preview)
  python manage.py rename-package arrays arrays1d --apply    (do it)
  ```
* Sub-packages work too: `"Inheritance": "oop.inheritance"` -> folder `programs/oop/inheritance/`.
* Change which package a topic uses: edit `packages.json`, then move the files with
  `rename-package` or by hand, and fix their `package` line.

## If something fails

* Red build on GitHub: open the run, the `::error` line says which file and why.
* "package ... must match folder": the `package x;` line and the folder `programs/x/` differ.
* "must be in package ...": the question's topic belongs to another package (see packages.json).
* A question whose build fails keeps its old page/output until you fix it.
