#### Normalization, Multiplicity, and Referential Integrity
- Understand UNF, 1NF, 2NF,and 3NF
- Understand table relationships
- Understand how to maintain referential integrity

---
### Normalization
- designing a database to efficiently store and query data
- reduce redundancy
- tables represent separate entities

---

### Unnormalized
- can include redundant data or columns
- no primary key

---

### First Normal Form
- primary key is present
- values are atomic
- no redundant columns

---

### Second Normal Form
- removes any partial dependencies (direct relationship to only part of key)
- any non-key columns must describe the key

---
### Third Normal Form
- removes any transitive dependencies (indirect relationships not regarding the key)
- if we look at one column's value, can we infer the value of another column?
- if we update one column's value, would we need to update the value of another column?

---

# Multiplicity
- one to one: a record in one table and a record in the other table should be associated with only each other
- one to many: a record in one table can be associated with many records in the other table, but but the records in the other table can only be associated with one record from the first table
- many to many: a record in one table can be associated with many records in another table and vice versa. requires a bridge table

---
# Referential Integrity
- on your foreign key, you can specify a referential integrity action
- ON DELETE CASCADE
- ON DELETE SET NULL
- ON DELETE RESTRICT / NO ACTION
---
# Resources
- https://dev.mysql.com/doc/refman/8.0/en/create-table-foreign-keys.html#foreign-key-referential-actions