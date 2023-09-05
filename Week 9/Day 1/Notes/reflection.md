# Reflection API
- reflect package and the Class class (which is in the lang package)
- reflection allows programmatic access to information about a class itself and its members
- used by debuggers, interpreters, frameworks, etc
---

# Class Class
- https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html
- https://docs.oracle.com/javase/tutorial/reflect/class/classMembers.html
- instances of this class represent classes or interfaces themselves
- getFields() / getDeclaredFields() / getField() / getDeclaredField()
- getMethods() / getDeclaredMethods() / getMethod() / getDeclaredMethod()
- getConstructors() / getDeclaredConstructors() / getConstructor() / getDeclaredConstructor()
- and much more information can be obtained a well

--- 

# Method, Field, Constructor Classes
- https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Method.html
- https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Constructor.html
- getModifiers(), getParameterTypes() getParameterCount(), and more
- https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Field.html
- get(), getType(), set(), and more


