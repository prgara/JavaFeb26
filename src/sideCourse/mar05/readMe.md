# Recap
abs vs rel path ? grep ?  5 6 1 

Group of 5 working on a project created a project folder like -> 
project-final -> project-final-v2 -> project-final_v3_final -> project-final-latest

problems -> 
No idea who changed what
overwrite
which one is correct/present project
No way to go back

Software development needs
- History of changes - documentation
- backup
- team collaboration
- ability to go back
- Code Approval

VCS -> Version control system - tool to track, manage, control the source code.

Git is a version control system. it keeps track of who changed what and when. It works offline
developed by Linus Torvalds

Github/Bitbucket/GitLab -> online software/platform which manages all remote repositories.

Repo -> A git repo is like a project folder with a memory.

.git 

Commands 
- git init -> Initialize a git repo
- git status -> to check the status
- git add fileName -> add a file to staging area
- git commit -m "msg" -> commit the changes
- git log -> show commit logs

staging-area -> it is a place where you select which changes should go to into next commit
commit -> snapshot of the code at a point in a time.

git init                  ADD           Commit            PUSH
local-repo(gitClass) -> Staging area -> local commit -> remote repo


create a project and start git to track the files
project/
src/ -> notes.txt
logs/ -> app.log
docs/ -> index.java

Add any 4-5 line content in log file and commit that changes with a meaningful msg

create a repo on github and connect with your local and make a first push





