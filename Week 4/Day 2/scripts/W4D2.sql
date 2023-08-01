/*
 * Constraints
 * not null
 * unique
 * default
 * check
 * PK
 * FK
 
 * */

drop table if exists vet_specialists;
drop table if exists pets;

create table vet_specialists(
	id int auto_increment primary key,
	name varchar(100) not null,
	species varchar(100),
	wage int default 50000
);

create table pets(
	id int auto_increment primary key,
	name varchar(100) not null,
	chipped boolean default false,
	age int check (age > 0),
	weight numeric(5, 2) check (weight > 0),
	species varchar(100) not null,
	data_of_last_visit date
-- 	vet_id int,
-- 	foreign key (vet_id) references vet_specialists(id)
);


/*
 * DML
 * INSERT
 * UPDATE
 * DELETE
 * 
 * 
 * */

INSERT INTO vet_specialists(name, species, wage) VALUES ('Mark Brown', 'Dog', default),
												  ('Sally Johnson', 'Cat', 45000),
												  ('Jacob Greene', 'Bird', default);

-- INSERT INTO pets VALUES (default, 'Darcy', 0, 1, 15.2, 'Cat', null, null);
-- INSERT INTO pets VALUES (default, 'Rusty', 0, 1, 15.2, 'Dog', null, 1);
											
												 
INSERT INTO pets VALUES (default,'Darcy', 0, 1, 15.2, 'Cat', '2022-03-05');
INSERT INTO pets VALUES (default, 'Poncho', 0, 1, 15.2, 'Dog', '2023-10-03');
INSERT INTO pets VALUES (default, 'Rusty', 0, 1, 15.2, 'Bird', '2022-09-10');
INSERT INTO pets VALUES (default, 'Greg', 0, 1, 15.2, 'Cat', '2023-01-15');
INSERT INTO pets VALUES (default, 'Bob', 0, 1, 15.2, 'Dog', '2022-03-20');
INSERT INTO pets VALUES (default, 'Jerry', 0, 3, 15.2, 'Dog', '2022-03-20');

select * from vet_specialists;
select * from pets;

delete from pets;
delete from vet_specialists where id = 1;
delete from pets where id = 4;
truncate table vet_specialists;

UPDATE pets SET name = 'Charlie';
UPDATE pets SET chipped = true WHERE species = 'Dog' OR species = 'Cat';
UPDATE pets SET age = 2 WHERE id = 2;


