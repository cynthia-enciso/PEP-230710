DROP TABLE IF EXISTS pets;
DROP TABLE IF EXISTS vet_specialists;

CREATE TABLE vet_specialists(
	id integer auto_increment primary key,
	name varchar(100),
	species varchar(100),
	wage integer default 50000
);

CREATE TABLE pets(
	id integer auto_increment primary key,
	name varchar(100),
	age integer,
	species varchar(100),
	vet_id integer,
	FOREIGN KEY (vet_id) REFERENCES vet_specialists(id)
);

INSERT INTO vet_specialists(name, species, wage) VALUES('Wanda Jones', 'Dog', 45000);
INSERT INTO vet_specialists(name, species, wage) VALUES('Terry Gonzalez', 'Bird', 65000);
INSERT INTO vet_specialists(name, species, wage) VALUES('Mike Reeves', 'Horse', 75000);
INSERT INTO vet_specialists(name, species, wage) VALUES('Jasmine Flores', 'Reptile', 55000);
INSERT INTO vet_specialists(name, species, wage) VALUES('Philip Smith', 'Cat', 60000);

INSERT INTO pets(name, age, species, vet_id) 
values('Cosmo', 2, 'Dog',  1),
	('Freddie', 4, 'Cat', 5),
	('Gopher',  5, 'Dog', 1),
	('Fiona', 4, 'Cat', 5),
	('Felix', 10,  'Bird', 2),
	('Barbara', 3,  'Bird', 2),
	('Biscuit',  1, 'Rodent', null),
	('Nemo',  1,   'Fish', null),
	('Milo', 2,   'Cat', 5),
	('Barry', 4,  'Dog', 1);

-- SELECT * FROM pets;
-- SELECT * FROM vet_specialists;