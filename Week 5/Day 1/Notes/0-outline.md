# JDBC and DAO Continued
1. Create a connection utility class
2. Hide your sensitive information by using a properties file
3. preventing SQL injection with PreparedStatement

---
# Concept: Factory
- designing code so that it encapsulates object creation logic
- in a utility class, we can create a static method that returns a Connection object

---
# Properties File
- separates logic and configuration code
- hides sensitive information

---
# Prepared Statements
- help prevent SQL injection because of pre-compiling statements
- database knows what to expect
- values sent to db must match parameters