# Recap

VCS 
git vs github ?
commit ?

git -- help

These are common Git commands used in various situations:

start a working area (see also: git help tutorial)
clone      Clone a repository into a new directory
init       Create an empty Git repository or reinitialize an existing one

work on the current change (see also: git help everyday)
add        Add file contents to the index
mv         Move or rename a file, a directory, or a symlink
restore    Restore working tree files
rm         Remove files from the working tree and from the index

examine the history and state (see also: git help revisions)
bisect     Use binary search to find the commit that introduced a bug
diff       Show changes between commits, commit and working tree, etc
grep       Print lines matching a pattern
log        Show commit logs
show       Show various types of objects
status     Show the working tree status

grow, mark and tweak your common history
backfill   Download missing objects in a partial clone
branch     List, create, or delete branches
commit     Record changes to the repository
merge      Join two or more development histories together
rebase     Reapply commits on top of another base tip
reset      Reset current HEAD to the specified state
switch     Switch branches
tag        Create, list, delete or verify tags

collaborate (see also: git help workflows)
fetch      Download objects and refs from another repository
pull       Fetch from and integrate with another repository or a local branch
push       Update remote refs along with associated objects

git add --help → tell about that particular command


Imagine your company website is live and used by customers.
Can we directly experiment on live code ? 

Calculator -> add, sub, mul,div ---> V1
v2 -> trignomerty 

branch -> separate workspace created from the existing code.
It is independent line of development.

purpose of the branch
- release safely
- rollback to previous version
- adding new features
- bug fixes


Branching strategy
It defines
- which branches exist
- when to create
- when to merge


push -> 
Pull -> taking remote code to local
pull request -> it is to create a request to merge one branch to another branch
merge -> merge one branch to another branch


main -> feature branch -> push -> PR ->  reviewed and approved by someone -> merging

3 branching strategy
back merge 

feature branches are short lived.

bug in prod 

Hotfix branch -> bug fixing 
product manager or product owner wants a fix asap

30 march
release cycles -> monthly or biweekly


prod v1  -> bug 
main v1 -> hotfix branch 
release v1 -> v2 -> regression testing -> bug fixed
develop v2

release 1.0
1.1
1.2
1.3
1.4
1.5
2.0 2.1

1.2.3     1-major rel    2-minor rel            3-hotfix

18
26.2
26.3
26.5
27

release x.xx
x.x1
x.x2


# Branch
- git branch -> shows all the branches 
- git branch branchName -> create a new branch
- git checkout branchName -> switch to another branch
- git checkout -b branchName -> create new branch and checkout to that branch
- git clone repoLink -> clone repo to local

- clone the repo and create a branch and push to the github.

























