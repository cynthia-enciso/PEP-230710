-- UNNORMALIZED

DROP TABLE IF EXISTS zookeepers;

CREATE TABLE zookeepers(
	first_name varchar(100),
	last_name varchar(100),
	exhibit varchar(100),
	animal_type1 varchar(100),
	animal_type2 varchar(100),
	animal_type3 varchar(100),
	salary integer,
	title varchar(100)
);

INSERT INTO zookeepers 
VALUES('Debra', 'Jones', 'Savannah Animals, Elephant Exhibit', 'Zebra', 'Elephant', 'Giraffe', 50000, 'Level 1 Zookeeper');
SELECT * FROM zookeepers;