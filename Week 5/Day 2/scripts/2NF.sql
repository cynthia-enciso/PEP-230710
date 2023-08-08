-- 2ND
-- removes any partial dependencies (Partial dependency is a situation in which a non-key attribute of a table depends on only a part of the primary key)
-- any non-key columns must describe the key

DROP TABLE IF EXISTS zookeepers;
CREATE TABLE zookeepers(
	id integer auto_increment PRIMARY KEY,
	first_name varchar(100),
	last_name varchar(100),
-- 	exhibit varchar(100)
-- 	animal_type varchar(100), -- functional dependency with exhibit
	salary integer,
	title varchar(100)
);

DROP TABLE IF EXISTS exhibits;
CREATE TABLE exhibits(
	id integer auto_increment PRIMARY KEY, 
	exhibit_name varchar(100)
);

DROP TABLE IF EXISTS animals;
CREATE TABLE animals(
	id integer auto_increment PRIMARY KEY, 
	species varchar(100)
	-- depends on exhibits
);

INSERT INTO zookeepers VALUES (default, 'Brenda', 'Jackson', 50000, 'Level 1 Zookeeper');
INSERT INTO exhibits VALUES (default, 'Savannah Herbivores');
INSERT INTO exhibits VALUES (default, 'Elephant Exhibit');
INSERT INTO animals VALUES (default, 'Zebra');
INSERT INTO animals VALUES (default, 'Elephant');
INSERT INTO animals VALUES (default, 'Giraffe');


SELECT * FROM zookeepers;
SELECT * FROM exhibits;
SELECT * FROM animals;