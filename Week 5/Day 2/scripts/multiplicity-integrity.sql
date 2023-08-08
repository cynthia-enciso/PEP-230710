DROP TABLE IF EXISTS zookeepers_exhibits;
DROP TABLE IF EXISTS zookeepers;
DROP TABLE IF EXISTS animals;
DROP TABLE IF EXISTS exhibits;
DROP TABLE IF EXISTS titles;

-- one to one
-- one to many
-- many to many

-- one to many relationship: 
-- one title can be associated with many zookeepers
-- a zookeeper should one be associated with one title
CREATE TABLE titles(
	id integer auto_increment primary key,
	title_name varchar(100),
	salary integer
);

CREATE TABLE zookeepers(
	id integer auto_increment primary key,
	first_name varchar(100),
	last_name varchar(100),
	title_id integer, -- adding NOT NULL constraint may cause issue if using SET NULL as an action
	FOREIGN KEY (title_id) REFERENCES titles(id) ON DELETE SET NULL
);

CREATE TABLE exhibits(
	id integer auto_increment primary key,
	exhibit_name varchar(100)
);

-- many to many:
-- bridge table that keeps records representing the associations between two tables
CREATE TABLE zookeepers_exhibits(
	zookeeper_id integer,
	exhibit_id integer,
	FOREIGN KEY (zookeeper_id) REFERENCES zookeepers(id) ON DELETE CASCADE,
	FOREIGN KEY (exhibit_id) REFERENCES exhibits(id) ON DELETE CASCADE,
	PRIMARY KEY (zookeeper_id, exhibit_id)
);

-- one to many
CREATE TABLE animals(
	id integer auto_increment primary key,
	species varchar(100),
	exhibit_id integer,
	FOREIGN KEY (exhibit_id) REFERENCES exhibits(id) ON DELETE SET NULL
);


INSERT INTO titles VALUES (default, 'Level 1 Zookeeper', 50000);

INSERT INTO zookeepers VALUES (default, 'Brenda', 'Jackson', 1);

INSERT INTO exhibits VALUES (default, 'Savannah Herbivores');
INSERT INTO exhibits VALUES (default, 'Elephant Exhibit');

INSERT INTO zookeepers_exhibits VALUES (1, 1);
INSERT INTO zookeepers_exhibits VALUES (1, 2);

INSERT INTO animals VALUES (default, 'Zebra', 1);
INSERT INTO animals VALUES (default, 'Elephant', 2);
INSERT INTO animals VALUES (default, 'Giraffe', 1);
INSERT INTO animals(species) VALUES ('Zebra');
DELETE FROM titles WHERE id = 1;

SELECT * FROM zookeepers;
SELECT * FROM exhibits;
SELECT * FROM animals;
SELECT * FROM titles;
SELECT * FROM zookeepers_exhibits;