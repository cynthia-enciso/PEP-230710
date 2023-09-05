# Optionals
- A wrapper object that can be used to represent optional values rather than using null
- "The purpose of Optional is not to replace every single null reference in your codebase but rather to help design better APIs in which—just by reading the signature of a method—users can tell whether to expect an optional value"
- using Optional forces you to actively unwrap an Optional to deal with the absence of a value, leads to less unintended null pointer exceptions
- they are primarily intended to be used as a return type but they can also be used where null is likely to cause errors

---

# Using Optionals
- use .empty(), .of(), .ofNullable() to create Optionals
- .isPresent() or .isEmpty()
- .ifPresent()
- .get()
- .orElse()
- .orElseThrow()

---

# Resources
- https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html
- https://www.oracle.com/technical-resources/articles/java/java8-optional.html 