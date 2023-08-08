-- 1NF
-- add a PK
-- cell values are atomic
-- remove redundant columns

DROP TABLE IF EXISTS zookeepers;

CREATE TABLE zookeepers(
	id integer auto_increment PRIMARY KEY,
	first_name varchar(100),
	last_name varchar(100),
	exhibit varchar(100),
	animal_type varchar(100),
	salary integer,
	title varchar(100)
);

INSERT INTO zookeepers 
VALUES(default, 'Debra', 'Jones', 'Savannah Animals', 'Zebra', 50000, 'Level 1 Zookeeper');
SELECT * FROM zookeepers;