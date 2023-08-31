# Design Pattern
- tried and true software design for keeping apps maintainable, flexible, and scalable

---

# Factory Pattern
- creating objects without exposing creation logic to client code
- problem solved by this pattern:
    - you have client code keeps track of all available objects it can create
    - if you want to create an additional class for client code to use, client code needs to be updated
- solution this pattern provides:
    - by removing object creation responsibility from client, client just uses factory to get an object and no longer needs to keep track of concrete classes that it needs to choose from
--- 

# Simple Factory
- not full implementation of the design pattern, but a good first step
- does take responsibility from client
- not flexible
- A class separate from the client class is created to keep track of available options/objects that client code can use
- does not follow Open/Closed Principle since you have to update class if additional option/object added

---

# Factory Method Pattern (Supplementary)
- does take responsibility from client
- flexible
- Class with client code relies on an abstract factory method. Subclassing superclass allows us to add more options to client code by overriding factory method. Follows Open/Closed Principle.

---

# Singleton Pattern
- ensure there can only be one instance of the class and it can be accessed throughout project
- solution this pattern provides:
    - for classes where creating more than one object can lead to problems (one logger to ensure your logs are not conflicting/duplicated/out of order)
    - when you want the object to exist only when it is needed (for example, you don't want to create a global object from the start of application if it is resource intesive)
    - use case we've already seen: connection to a database