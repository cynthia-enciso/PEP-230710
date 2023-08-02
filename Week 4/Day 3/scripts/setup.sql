drop table if exists pets;

create table pets(
	id int auto_increment primary key,
	name varchar(100) not null,
	chipped boolean default false,
	age int check (age > 0),
	weight numeric(5, 2) check (weight > 0),
	species varchar(100) not null,
	date_of_last_visit date
);

INSERT INTO pets(name, chipped, age, weight, species, date_of_last_visit) 
VALUES('Charlie', true, 5, 20.9, 'Dog', '2022-01-01'),
('Taz', false, 2, 0.5, 'Cat', '2019-05-04'),
('Freddie', true, 4, 1.1, 'Bird', '2019-11-10'),
('Felix', false, 1, 3.5, 'Cat', '2023-01-15'),
('Mud', true, 9, 70.4, 'Dog', '2020-04-05'),
('Chocolate', true, 20, 60.5, 'Dog', null),
('Cupcake', true, 10, 20.0, 'Cat', '2022-10-10'),
('Puddle', false, 3, 10.5, 'Bird', '2019-06-19'),
('Baxter', false, 2, 18.9, 'Cat', '2023-02-14'),
('Bruno', true, 1, 100.2, 'Dog', '2020-04-01'),
('Barty', true, 1, 100.2, 'Dog', '2020-04-01'),
('Philip', false, 8, 85.9, 'Dog', null),
('Milo', false, 2, 5, 'Cat', '2022-08-07'),
('Miko', true, 4, 5, 'Cat', '2019-02-01'),
('Miao', false, 1, 2, 'Cat', null);