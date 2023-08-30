DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS aisles;

CREATE TABLE aisles(
id int AUTO_INCREMENT PRIMARY KEY,
name varchar(100),
item_count integer
);

INSERT INTO aisles VALUES (default, 'Pantry', 0),
						(default, 'Freezer', 0),
						(default, 'Health', 0);
					
CREATE TABLE items(
id integer AUTO_INCREMENT PRIMARY KEY,
name varchar(100),
price numeric(5, 2),
inventory_count integer,
aisle_id integer,
FOREIGN KEY (aisle_id) REFERENCES aisles(id)
);

INSERT INTO items values (default, 'Soup', 1.99, 10, 1);
INSERT INTO items VALUES 	(default, 'Bandaids', 2.99, 99, 3),
							(default, 'Popsicles', 5.99, 50, 2),
							(default, 'Can of Soup', 0.99,99, 1),
							(default, 'Heat Pack', 8.99,55, 3),
							(default, 'Frozen Dinner', 4.99, 20, 2),
							(default, 'Crackers', 2.99,45, 1),
							(default, 'Medicine', 8.99, 20, 3),
							(default, 'Chicken Nuggets', 5.99,4, 2),
							(default, 'Hot Sauce', 1.99,10, 1),
							(default, 'Frozen Berries', 3.99, 20, 2),
							(default, 'Bottled Water', 4.99, 30, 1);
								
SELECT * FROM aisles;
SELECT * FROM items;