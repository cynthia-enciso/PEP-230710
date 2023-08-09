
drop table if exists memberships;
drop table if exists dvds;
drop table if exists books;

create table books(
	isbn int auto_increment primary key,
	title varchar(100),
	author varchar(100),
	genre varchar(100),
	page_count int
);

create table dvds(
	id int auto_increment primary key,
	title varchar(100),
	year_released year,
	genre varchar(100),
	length_in_minutes int
);

create table memberships(
	id int auto_increment primary key,
	first_name varchar(100),
	last_name varchar(100),
	member_since date,
	book_checked_out int,
	dvd_checked_out int,
	foreign key (book_checked_out) references books(isbn),
	foreign key (book_checked_out) references dvds(id)
);

INSERT INTO books(title, author, genre, page_count) 
VALUES('Don Quixote', 'Miguel de Cervantes', 'Epic', 1077),
    ("Alice's Adventures in Wonderland", 'Lewis Carroll', "Adventure", 104),
    ('The Adventures of Huckleberry Finn', 'Mark Twain', "Adventure", 362),
    ('The Adventures of Tom Sawyer', 'Mark Twain', "Adventure", 274),
    ('Treasure Island', 'Robert Louis Stevenson', 'Adventure', 238),
    ('Pride and Prejudice', 'Jane Austen', 'Drama', 254),
    ('Wuthering Heights', 'Emily Bronte', 'Drama', 400),
    ('Jane Eyre', 'Charlotte Bronte', 'Drama', 352),
    ('Moby Dick', 'Herman Melville', 'Action', 495),
    ('The Scarlet Letter', 'Nathaniel Hawthorne', 'Drama', 272),
    ('Gulivers Travels', 'Joathan Swift', 'Adventure', 318),
    ("The Pilgrim's Progress", 'John Bunyan', 'Action', 365),
    ('A Christmas Carol', 'Charles Dickens', "Crime", 104),
    ('David Copperfield', 'Charles Dickens', 'Mystery', 600),
    ('Little Women', 'Louisa May Alcott', "Crime", 444);

INSERT INTO dvds(title, year_released, genre, length_in_minutes)
VALUES('The Shawshank Redemption', 1994, 'Drama', 142),
('The Godfather', 1972, 'Crime', 153),
('The Dark Knight', 2008, 'Action', 150),
('The Godfather Part 2', 1974, 'Crime', 210),
('12 Angry Men', 1957, 'Crime', 96),
("Schindler's List", 1993, 'Drama', 195),
('The Lord of the Rings: The Return of the King', 2003, 'Adventure', 201),
('Pulp Fiction', 1994, 'Drama', 154),
('The Lord of the Rings: The Fellowship of the Ring', 2001, 'Adventure', 178),
('The Good, the Bad, and the Ugly', 1966, 'Western', 178),
('Forrest Gump', 1994, 'Drama', 142),
('Fight Club', 1999, 'Drama', 139),
('The Lord of the Rings: The Two Towers', 2002, 'Adventure', 179),
('Inception', 2010, 'Action', 148),
('The Matrix', 1999, 'Action', 136);

INSERT INTO memberships(first_name, last_name, member_since, book_checked_out, dvd_checked_out)
VALUES ('Wilma', 'Jenkins', '2019-04-15', 12, 2),
('Kenny', 'Shepard', '2001-10-01', 1, null),
('Alan', 'Lovelace', '1995-05-17', null, null),
('Mike', 'Gomez', '2000-12-13', 4, 10),
('Jamie', 'Hernandez', '2020-01-12', 2, 12),
('Nicole', 'Smith', '2003-07-20', null, 4),
('Frederick', 'Sweeney', '2003-05-07', 8, null),
('Conrad', 'Williams', '2023-03-01', 3, 9),
('Dorian', 'Wallace', '2009-11-11', 10, 13),
('Candace', 'Jones', '2003-01-02', 5, 1),
('Jerry', 'Griffin', '2019-03-03', 11, null),
('Sherry', 'McGuire', '2011-09-02', null, null),
('Sally', 'Rutherford', '1998-10-01', null, 11),
('Boris', 'Greene', '1990-10-05', 6, 6),
('Nancy', 'Morales', '1990-10-05',4, 4),
('Jared', 'Erickson', '1990-10-05',10, 3),
('Larry', 'Park', '1990-10-05',12, 9);

