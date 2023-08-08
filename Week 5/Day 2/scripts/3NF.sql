-- boyce-codd: 3rd but if there are multiple overlapping candidate keys, 
-- parts of keys cannot depend on any column that is not a whole key

-- 3NF
-- get rid of any transitive dependencies (indirect dependencies)
-- if we look at one column's value, can we infer the value of another column?
-- if we update one column's value, would we need to update the value of another column?


DROP TABLE IF EXISTS zookeepers;
DROP TABLE IF EXISTS exhibits;
DROP TABLE IF EXISTS animals;
DROP TABLE IF EXISTS titles;

CREATE TABLE zookeepers(
	id integer auto_increment primary key,
	first_name varchar(100),
	last_name varchar(100)
);

CREATE TABLE titles(
	id integer auto_increment primary key,
	title_name varchar(100),
	salary integer
);

CREATE TABLE exhibits(
	id integer auto_increment primary key,
	exhibit_name varchar(100)
);

CREATE TABLE animals(
	id integer auto_increment primary key,
	species varchar(100)
);

INSERT INTO zookeepers VALUES (default, 'Brenda', 'Jackson');
INSERT INTO exhibits VALUES (default, 'Savannah Herbivores');
INSERT INTO exhibits VALUES (default, 'Elephant Exhibit');
INSERT INTO animals VALUES (default, 'Zebra');
INSERT INTO animals VALUES (default, 'Elephant');
INSERT INTO animals VALUES (default, 'Giraffe');
INSERT INTO titles VALUES (default, 'Level 1 Zookeeper', 50000);

SELECT * FROM zookeepers;
SELECT * FROM exhibits;
SELECT * FROM animals;
SELECT * FROM titles;
