# Functions
- callable block of code that takes in zero or more parameters and returns a value
- mainly used to perform and return calculations
- use as an expression (since it returns a value)
- can include DQL and DML (and DDL but not used often in function)

# Stored Procedures
- callable block of code that takes in parameters
- does not use a return statement
- can include DQL and DML (and DDL but not used often in function)
- can contain TCL

# Parameters
- IN: input parameter. default (and only) type for functions. works like Java parameters (value is used but modifications do not modify original value/variable itself)
- OUT: value from procedure is passed to caller. user defined variable needed.
- INOUT: caller passes in value and CAN be modified by procedure and modification is reflected outside of procedure. user defined variable needed.

# Trigger
- database object that activates when a particular event occurs on the table it is associated with
- events are DML (insert, delete, update)
- triggers can activate before or after the event

# Sequence (Not Creatable in MySQL)
- database object that generates a series of integer values
- starting value must be positive
- increment can be custom

# Flow Control Statements (Supplementary)
- https://dev.mysql.com/doc/refman/8.0/en/flow-control-statements.html