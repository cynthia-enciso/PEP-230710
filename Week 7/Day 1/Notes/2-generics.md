"Compile-time bugs...can be detected early on; you can use the compiler's error messages to figure out what the problem is and fix it, right then and there. Runtime bugs, however, can be much more problematic... Generics add stability to your code by making more of your bugs detectable at compile time." - docs

# Generics
- enables classes to be parameterized so they can be re-used with different types as input, like methods
- alternative is using Object as type of state, which would require casting and could lead to runtime issues

---

# Adding Generics
- add a generic type declaration to your class, ex `ClassName<T>`
- you can specify more than one type variable as a parameter
- use the type variables throughout the class
- bounded types: requirement that type must be subtype or of same type as specified type
    - ex) ClassName<T extends SuperType>
    - supertype can be a class or interface
---

# Using Generic Classes
- generic type invocation: when using the parameterized class, replace the type param name with the actual type you want to use
- ex) ArrayList<String> stringList;
- raw type: if you do not specify a type, the Object type will be used

---

# Naming Conventions
- type params are single, uppercase letters
- E: Element
- K: Key
- N: Number
- T: Type
- V: Value
- S,U,V etc: 2nd, 3rd, 4th types
