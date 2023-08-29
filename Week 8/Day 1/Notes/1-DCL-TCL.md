# Data Control Language
- keywords used to grant/revoke privileges on a user
- `GRANT privilege ON db TO username`
- `REVOKE privilege ON db FROM username`
- for list of privileges that could be granted/revoked, see: https://dev.mysql.com/doc/refman/8.0/en/grant.html

---

# Transactions
- transaction: one or more DQL or DML operations performed on a database as a single unit
- DDL can be included, but cannot be rolled back. Don't use DDL in a transaction mixed with other statements
- desirable transaction properties:
    - ATOMICITY: either all statements succeed or they all fail
    - CONSISTENTENCY: transactions keep data in a consistent state
    - ISOLATION: ability of transactions to not interfere with one another (isolation level can be changed)
    - DURABILITY: transactions are logged, saved to long-term memory, and are recoverable

---

# Transaction Control Language
- START TRANSACTION
- SAVEPOINT
- ROLLBACK
- COMMIT

---

# Transaction Isolation Levels (Supplementary)
- read uncommitted: transactions can read uncommitted changes made by others (dirty reads)
- read committed: selecting same data multiple times in a transaction and not getting the same information (nonrepeatable read) as other transactions commit modifications
- repeatable read: uses data in its state at the start of a transaction, prevents nonrepeatable read / updates to the data being read
- serializable: ensures, while a transaction is reading data, thatno data is removed or deleted that can cause a difference (phantom reads)


