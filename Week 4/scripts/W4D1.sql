
/*
 * 
DDL
data definition language
CREATE, ALTER, DROP
 * 
 * 
 * 
 */

DROP TABLE IF EXISTS pets;
-- DROP TABLE pet;

create table pets(
	name varchar(100),
	chipped boolean,
	age int,
	weight numeric(5, 2),
	data_of_last_visit date
);

-- ALTER
ALTER TABLE pets ADD COLUMN species varchar(100);
ALTER TABLE pets MODIFY COLUMN species varchar(150);
ALTER TABLE pets MODIFY COLUMN species;
ALTER TABLE pets DROP COLUMN species;

-- ALTER TABLE table_name RENAME TO new_table_name; 
-- ALTER TABLE pets RENAME TO pet;
-- ALTER TABLE table_name RENAME COLUMN old_column_name TO new_column_name;
ALTER TABLE pets RENAME COLUMN species TO animal_type;

-- insert
INSERT INTO pets VALUES ('Patsy', true, 5, 30.555, '2022-03-10', 'Dog');
SELECT * FROM pets;
-- SELECT * FROM pet;



-- drop, truncate
TRUNCATE TABLE pets;