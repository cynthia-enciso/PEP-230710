# UNIX Commands
- Why learn these commands? You may not have access to a GUI when developing parts of your application
- terminal: visible GUI window that starts and connects to a shell
- shell: a program that represents a session of communication to the OS
- command line: the literal line and cursor where you can enter input
- Git for Windows: contains Git and GitBASH which allows the use of UNIX-like commands

---

# Command Terminology
- commands: input you enter to start a program that does a task
- arguments: values entered after a command as arguments to be used
- flags/options: keywords that change behavior of command

---

# Navigating Your Filesystem
- pwd: print working directory
- cd: change directory (. represents current directory, to navigate backwards, use ..)
- ls: list directory contents (flags commonly used are -a and -l)
- `command --help` to get information about a command (in GitBash) (supplementary)
- `man command`to get information about a command (regular Bash on Linux/Mac) (supplementary)
---

# Interacting with Files and Folders
- `touch filename` to create a file
- `mkdir foldername` to create a folder
- cat: view contents of files
- vi or vim (supplementary): to edit with a text-based text editor (`i` enters insert mode, esc then `:wq` quits and saves)
- rm: removes a file (with -r flag, can be used to remove a directory)
- `grep textToFind filename` to search for text in file
- `cp filename1 filename2/folder` copy command (-r is used to copy a directory)
- `mv filename1 filename2/folder` used to either move files or rename files, depending on arguments

# Common Operators (Supplementary)
- > is for redirecting output to a file by overwriting it
- >> is for redirecting output to a file by appending it
- && is for doing several operations, one after the other
- | is for redirecting output from one command to be input of another
