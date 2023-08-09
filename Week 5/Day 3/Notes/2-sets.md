# Sets
- used to query more than one table
- resultset is a combination of the rows of both tables
- select same amount of columns
- selected columns datatypes and order must match
- ALL: keyword that includes duplicates it set operation results

---

# Syntax
QUERY 1
UNION | INTERSERCT | EXCEPT
QUERY 2;

---

# UNION
- return all rows from both queries

---

# INTERSECT
- return common rows from both queries

---

# EXCEPT / MINUS
- return rows unique only from the first query

---
# When to Use Set vs Join
- Join: Querying very different information from two tables
- Set: Querying several similar columns from two tables