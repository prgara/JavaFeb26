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



main/master -> master copy of the project
release/develop -> for developing the features and doing prod release
feature-> short-lived and will be deleted once task is completed

You have been assigned a task in Jira (5 days)
You will create a feature branch from release/develop and you will make the changes and then will push that changes to remote.
you will create PR and merge the changes in destination branch (main) and then you can del the feature branch
at end of the day , they will push to remote. counts the num of commits - 5 



