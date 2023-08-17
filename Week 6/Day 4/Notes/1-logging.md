# Logging with Logback
- logging: keep a log of events that occur from an application
- small and speedy logging framework
- 3 main components: Logger, Appender, Layout
- Logger: object that allows you to create logs
- Appender: object that represents destination of a log
- Layout: object that allows you to control log message formatting

--- 

# How to Use a Logger
1. configure it
2. add Logger objects in classes you want to use logging
3. use the Logger object logging-level methods

---

# Logging Levels
- TRACE: informational events for the tiniest of details
- DEBUG: informational events of low importance
- INFO: highlight overall progress
- WARN: specify potentinally harmful situations
- ERROR: specifies error event that may be fatal
- you can use OFF as well

---

# Configuration
- if no configuration given, default logger can be used
- default logger: has a logging level of debug and lengthy debug message format
- to configure, create `logback.xml` file under main > resources
- create appenders
- create loggers and assign them appenders