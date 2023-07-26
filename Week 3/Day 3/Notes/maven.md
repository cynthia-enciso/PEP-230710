# Installation (Supplementary)
- download into folder of your choice, add /bin folder to your path: https://maven.apache.org/download.cgi
- Maven Wrapper: https://www.baeldung.com/maven-wrapper and https://maven.apache.org/wrapper/maven-wrapper-plugin/usage.html

---

# Maven
- build tool: tool that makes it easier to perform common build steps
- build steps: common steps taken to go from development to deployment

---

# Lifecycle Phases
- clean lifecycle includes the clean phase: removes target folder
- default lifecycle phases
- 1) validate: Is project valid, i.e. does it have a POM? Project structure is OK?
- 2) compile: Compile source code
- 3) test: run testing framework
- 4) package: package compiled code into distributable format
- 5) verify: run integration tests
- 6) install: install distributable into local repository for use in other local projects
- 7) deploy: if configured, copy distributable to remote repository to share with others

---

# Dependency vs Plugin
- dependency: external code that is used to add functionality to your source code
- plugin: external code that is used to add functionality to your build tool
