# Throwables
- exceptional events that occur during runtime are represented by Throwable objects
- throwables contain information about the situation that occurred
- two types of throwables: error and exception
- main takeaway: know what issues can happen and know how to handle them
---

# Errors
- don't throw them intentionally!
- the JVM throws them when it absolutely has to
- situations: out of stack or heap memory
- NOT recoverable, let the application crash

---

# Unchecked Exceptions
- "Unanticipated errors in logic that show up at runtime"
- issue is usually a logical problem (bug that needs squashing or an edge-case is overlooked)
- ex) ArithmeticException, ArrayIndexOutOfBoundsException

---

# Checked Exceptions
- "Anticipated problems associated with the normal use of an API"
- checked for at compile time - if found by JVM and not handled, compilation error occurs
- SQLException, FileNotFoundException

---

# Why Use Exceptions?
- separating logic from error-handling code
- throwing/ducking is made easy
- exceptional events are objects, so we can take advantage of inheritance

---

# Common Exceptions
- NullPointerException
- ArrayIndexOutOfBoundsException
- ArithmeticException
- IllegalArgumentException
- IOException
- FileNotFoundException

---

# Best Practices
- use exceptions sparingly (remember, *exceptional* events!)
- anticipate issues so that unchecked exceptions don't occur
- if you have an exceptional circumstance you want to represent, then DO use unchecked exceptions as we are moving away from using checked exceptions



