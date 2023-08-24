# Version Control
- managing and keeping track of files and their changes
- repository: folder that represents a programming project that is under version control.
- a special folder within the repository stores file change information (.git for Git)

# Git
- distributed version control system (one remote repo and at least one local repo)
- files have states: modified, staged, committed
- Git has three different "areas": working tree, staging area, and Git directory
- working tree: a checkout of a commit (a version of your project you are working with)
- staging area: files chosen to have their current changes be added to next commit / next version of project
- Git directory: .git folder that keeps track of commits / all versions of the project.

# Workflow
- you make changes to some files and/or create new files
- you stage your changes and/or new files
- you commit with a message
- you push your changes to remote and/or begin again making changes
- check the status of your repository every step of the way!

# Undoing
- `git restore filename`: reverting changes of a modified file
- `git restore --staged filename`:unstaging a modified file
- `git commit --ammend "message"`: replace last commit
- `git stash`: save current modifications and staged for another time
- `git stash pop`: get those modifications and staged back
- `git reset`: reverts a commit, and may revert staged changes and modified files depending on which flag you choose: https://stackoverflow.com/questions/3528245/whats-the-difference-between-git-reset-mixed-soft-and-hard

