# Synchronization
- threads share access to objects, which can lead to data consistency issues
- synchronization: temporarily prevents more than one thread from accessing an object
- to synchronize an object, you can use either a synchronized method or synchronized statements
- synchronized method: adding synchronized keyword in signature allows for its related object to lock when in use
- synchronized statement: uses the synchronized keyword and a parameter that specifies which object to lock when the statement runs
- synchronization can lead to its own problems

---

# Synchonization Issues
- thread contention: more than one thread attempting to access the same resources and are slowed down or cannot execute properly
- starvation: a threads not being able to access a resource as frequently as it wants to and waits often / is slow to execute
- deadlock: threads are blocked forever as they wait for one another
- livelock: threads execute, however they are in a cycle of responding to one another and cannot proceed

---

# Using Synchronized Objects
- when a thread has access to an object, it holds an objects "lock" or monitor, which is an indicator that the object is "owned" by the thread. When it is finished with it, it releases the lock. 
- You can use holdsLock() on a thread and pass in an object as an argument to check ownership.
- objects have the wait() and notify() or notifyAll() methods
- if an object calls wait() in a thread, that thread will wait until the object uses a notify() method. Can be timed.
- wait() and notify() must be within a synchronized block (current thread needs access to the object when these methods are called)

---

# Producer-Consumer Problem
- Classic synchronization problem
- Two threads must work together to interact with a queue. One consumes from the queue, the other adds to the queue. 
- The consumer must not try to consume if there are no elements
- The producer must not try to produce if there are no more positions to fill
--- 

# Resources
- https://docs.oracle.com/javase/tutorial/essential/concurrency/