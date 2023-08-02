-- DQL 
-- data query language

SELECT * FROM pets;
SELECT name, species FROM pets;

-- comparison operators
-- =, <> or !=, <, <=, >, >=
SELECT * FROM pets WHERE weight > 20;
SELECT * FROM pets WHERE weight >= 20;
SELECT * FROM pets WHERE species = 'Cat';
SELECT * FROM pets WHERE species != 'Cat';

-- logical operators
-- precedence: NOT > AND > OR 
SELECT * FROM pets WHERE chipped AND species = 'Dog';
SELECT * FROM pets WHERE chipped OR species = 'Dog';
SELECT * FROM pets WHERE NOT chipped OR species = 'Dog';
SELECT * FROM pets WHERE NOT chipped OR NOT species = 'Dog';
SELECT * FROM pets WHERE date_of_last_visit > '2023-01-01' OR chipped AND weight < 20;

SELECT * FROM pets WHERE date_of_last_visit > '2023-01-01' OR chipped AND weight >= 20;
SELECT * FROM pets WHERE (date_of_last_visit > '2023-01-01' OR chipped) AND weight >= 20;
SELECT * FROM pets WHERE (date_of_last_visit > '2023-01-01' OR chipped) AND NOT weight >= 20;

-- more comparison operators
-- BETWEEN, IN, NULL
SELECT * FROM pets WHERE weight BETWEEN 20 AND 70.4; -- inclusive
SELECT * FROM pets WHERE name BETWEEN 'A' AND 'D';
-- SELECT * FROM pets WHERE name BETWEEN 'A' AND 'D';
SELECT * FROM pets WHERE weight NOT BETWEEN 20 AND 70.4; 
SELECT * FROM pets WHERE age IN (1, 3, 5, 7);
SELECT * FROM pets WHERE age NOT IN (1, 3, 5, 7);
SELECT * FROM pets WHERE date_of_last_visit IS NULL;
SELECT * FROM pets WHERE date_of_last_visit IS NOT NULL;

-- matching
-- %: any number of characters
-- _: a single character
SELECT * FROM pets WHERE name LIKE 'M%'; -- starts with M
SELECT * FROM pets WHERE name LIKE '%E'; -- ends with E

-- four letter word that starts with Mi, then has any one character, and then ends with o
SELECT * FROM pets WHERE name LIKE 'Mi_o'; 

SELECT * FROM pets WHERE name LIKE 'B____'; -- five letter word that starts with B
SELECT * FROM pets WHERE name LIKE 'C%E'; -- any word that starts with C and ends with E

-- additional stuff

-- distinct
SELECT age FROM pets WHERE age = 2; -- all age values from records where age = 2
SELECT DISTINCT age FROM pets WHERE age = 2; -- get all unique age values from previous query's result
SELECT DISTINCT age FROM pets; -- get all unique age values 
SELECT DISTINCT age, chipped FROM pets; -- get all unique combinations of age and chipped 

-- alias
SELECT name AS 'Pet Name' FROM pets;
SELECT name AS 'Pet Name', chipped AS 'Is Microchipped' FROM pets;


-- order by, limit, offset
SELECT * FROM pets WHERE age > 5 ORDER BY age ASC; -- ASC is default
SELECT * FROM pets WHERE age > 5 ORDER BY age DESC;
SELECT * FROM pets WHERE age > 5 ORDER BY age DESC LIMIT 3;

-- offset means skip this many. offset must be used just with limit
SELECT * FROM pets WHERE age > 5 ORDER BY age DESC LIMIT 3 OFFSET 1; 
SELECT * FROM pets LIMIT 5;
