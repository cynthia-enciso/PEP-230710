# N-Tier Architecture (supplementary)
- separates app into layers that are each responsible for a group of related tasks
- layers interact with one another through interfaces you define
- benefits: more organized, flexible, and maintainable code

---

# Controller
1. takes input from client
2. calls service layer for decision making
3. sends output afterward

---

# Service
1. takes input from controller
2. makes decisions (validation, error handling)
3. communicates with DAO layer if data management needed
4. returns information to controller
---

# DAO
1. takes input from service layer
2. performs CRUD operations on database
3. returns a result to service layer
---

# Model
- contains classes that represent entities

