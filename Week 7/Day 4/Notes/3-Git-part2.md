# Using a Remote Repository
- `git remote add nameofremote URL`: connect remote repo to local
- `git push --set-upstream nameOfRemote branchname` connect local branch to remote branch on repo
- fetch: gets work from origin, but doesn't merge
- pull: fetches and merges

# Branches
- you start off with one line of development, which is meant to be stable (main)
- branches are created for new features or revisions (bug fixes)
- are a branch is merged, delete it
- if two branches modified same file and merge, you need to resolve the merge conflict (decide what changes to discard or keep for that file)

# Commands
- `git branch branchname` creates a branch
- `git checkout branchname` goes to specified branch 
- `git checkout -b branchname` creates and goes to branch
- `git branch` see your branches
- `git branch -d branchname` deletes a branch (-D forces if there are unmerge changes)
- `git merge branchname` merges specified branches commits to your current branch
- `git log` shows commits (some flags you can use: --oneline --decorate --all --graph)