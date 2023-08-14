# Functional Programming
- using functions to solve problems
- specifying what you want to happen to get results, not how you want it to happen
- (use predefined functions and rely heavily on chaining function calls, not on creating structure, like classes where we define the "how")

---

# Functional Interfaces
- interfaces that have only one abstract method
- think of them as supertypes whose one behavior can be assigned an implementation directly
- there are many already available to use
- https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html 

---

# Key Concept
- wherever we have a functional interface reference variable / parameter, we have a position where we can use a lambda (or method reference)
- functional interfaces enable functional programming in Java
