-- running this statement...
select * from people;

-- really is running this tranaction.
start transaction;
select * from people;
commit;


-- ATOMICITY: all statements should succeed if nothing goes wrong, otherwise none succeed
start transaction;
update people set state = 'AL' where id = 1;
update people set age = 'AL' where id = 1;
commit;



-- CONSISTENCY and ISOLATION: a single transaction should leave data in consistent state
--  and no transactions should depend on one another
select * from people;
select * from iq_type;

-- ideally, we want to change these two transactions...
start transaction;
update people set iq = 130 where id = 1;
commit;

start transaction;
update people set iq_type = 3 where id = 1;
commit;

-- so that they are a single transaction
start transaction;
update people set iq = 130 where id = 1;
update people set iq_type = 3 where id = 1;
commit;

-- SAVEPOINT AND ROLLBACK
select * from people;
start transaction;
-- updating Mike
update people set iq = 130 where id = 1;
update people set iq_type = 3 where id = 1;
SAVEPOINT mike;
-- updating Jamie
update people set iq = 85 where id = 2;
update people set iq_type = 2 where id = 2;
ROLLBACK TO mike;
commit;