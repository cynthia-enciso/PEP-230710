# SOLID Design Principles
- goal is to make more understandable, flexible, and maintainable software

---

# SRP
- Single Responsibility Principle
- "a class should do one thing and therefore it should have only a single reason to change"
- no useless entities either (can you name its one job? If not, get rid of)

---

# OCP
- Open/Closed Principle
- entity should be open for extension, closed for modification

---

# LSP
- Liskov Substitution Principle
- subtypes should be substitutable for their parent types
- a subclass should not try to redefine intended behavior of supertype

---

# ISP
- Interface Segregation Principle
- "clients should not be forced to depend upon interfaces that they do not use"
- keep supertypes small: no unrelated state or behavior should be required

---

# DIP
- Dependency Inversion Principle
- "depend upon abstractions, not concretions"
- client code and its dependencies should not assume implementation or the "how" of each other 
- client code and its dependencies both should depend on an interface


