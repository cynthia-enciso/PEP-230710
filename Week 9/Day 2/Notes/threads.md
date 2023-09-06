# Threads and Concurrency
- thread: single sequential flow of execution of a process
- multithreading: the use of multiple threads in an application
- process: an program that is currently running. A process can have multiple threads of execution. 
- concurrency: ability of a program (or computer) to multitask
- The threads of a process share heap space but have their own stack in memory.
- a process ends when there are no user threads running (like the main thread)
- you can create a thread by subclassing Thread or by implementing Runnable
- threads have an id, name, and priority
---

# Thread States
- NEW - created, but not yet started
- RUNNABLE - started, able to perform tasks and active
- TERMINATED - thread reached end of run method or is no longer active
- WAITING - thread is paused because of join() or it is waiting its turn to execute
- TIMED WAITING - WAITING but with a time limit
- BLOCKED - waiting for another thread to release lock on resource

---

# Useful Thread Methods
- getState(): return state of thread
- interrupt(): interrupts a running, waiting, blocked, or sleeping thread
- join(): allows one thread to wait for the completion of another
- sleep(): pauses thread so other threads can run. Can be interrupted
- start(): starts executing of thread
- isAlive(): true if started and not yet dead thread

---

# Resources
- https://docs.oracle.com/javase/tutorial/essential/concurrency/
- https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html