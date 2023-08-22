# Queue 
- FIFO: add to end/tail, remove from beginning/head
- Java has an interface that represents this data structure
- operations unique to queues: offer, peek, poll
- offer: attempt and adds, if you are able to
- peek: attempt to get head, if there is one
- poll: attempt and remove, if you are able to
- using add(), remove(), and element() would throw exceptions

---

# Stack
- LIFO: add to end/top, remove from end/top
- Java has a legacy class that represents this data structure
- Java recommends the Deque type instead
- stack operations: push, peek, pop
- push: add to top
- peek: view top
- pop: remove top
