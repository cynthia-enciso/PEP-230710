# Stack
- area in memory keeps track of the currently executing methods
- stores any variables that these methods create and use
- smaller than heap

---

# Heap
- area in memory that stores class members and objects
- larger than stack

---

# String Pool
- String objects are also stored in the Heap, but they may or may not be stored in a specific heap area, the String Pool!
- a String is stored in pool if object was created using **literal notation** (double quotes) AND object is not already in the pool
- a String is stored outside of pool if object was created using **object notation** (new keyword + constructor) EVEN IF object is already in the pool

---

# Importance?
- reference variables are stored in the stack
- objects are stored in the heap
- knowing this helps to understand the objects you are working with!

---

# Garbage Collection
- background process created by JVM to delete unused objects
- frees up space for us
- we don't control the garbage collector