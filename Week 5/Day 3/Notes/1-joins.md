# Joins
- used to query more than one table
- resultset is a combination of the columns of both tables
- a related column from both tables is required
- INNER, LEFT, RIGHT, FULL, SELF, CROSS

# Syntax
SELECT columns
FROM table1
JOIN-TYPE JOIN table2
ON related columns;

---

# Inner Join
- returns records where values in related column match

---

# Left Join
- returns all records from the first table and any matches as well

---

# Right Join
- returns all records from the second table and any matches as well

---

# Full Join
- returns all records from both tables as well as any matches
- created by creating a UNION between a left and right join

---

# Self Join
- used to compare records within a table with other records within the same table
- you would need to use the same table but use different aliases 

---

# Cross Join
- results are combinations of each record combined with every other record
- useful if you are looking for all possible combinations of something
- if the join type keyword is omitted, a cross join will be the result