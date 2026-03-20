branch ? 
git checkout -b name 
git branch name
git checkout name

can we work directly on main/master branch ? No


you created a feature branch and completed your task.
Company wants that code in main branch.

merge -> combining changes from one branch to another branch.

Testing the merging of the code.


# How to do a git merge 
- created a feature branch
- made changes in feature and added and commited there.
- checkout to destination(main/master) branch.
- git merge sourceBranchName to merge to changes in destination branch.

main -> destination
testMerge -> source

A new change done to show checkout error.
when we have uncommited changes in the current branch and 
we try to check out to another branch, it will give error and say either commit or stash


Stash -> store these changes temporarily at a location and bring them back when needed
git stash -> used to stash the changes (Storing temporarily at a location)
git stash pop -> bring back the stashed changes
