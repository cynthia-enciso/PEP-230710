DROP TABLE IF EXISTS people;
DROP TABLE IF EXISTS iq_type;


CREATE TABLE iq_type(
	id integer AUTO_INCREMENT PRIMARY KEY,
	category varchar(100)
);

CREATE TABLE people(
	id integer AUTO_INCREMENT PRIMARY KEY,
	first_name varchar(100),
	last_name varchar(100),
	state varchar(2),
	age integer,
	iq integer,
	iq_type integer,
	FOREIGN KEY (iq_type) REFERENCES iq_type(id)
);

INSERT INTO iq_type VALUES (default, 'low'),
						(default, 'average'),
						(default, 'high');

INSERT INTO people VALUES (default, 'Mike', 'Jones', 'TX', 70, 50, 1),
						(default, 'Jamie', 'Johnson', 'AL', 24, 130, 3),
						(default, 'Mia', 'Carlton', 'VT', 10, 85, 2),
						(default, 'Carl', 'Watson', 'RI', 38, 125, 3),
						(default, 'Harper', 'Gummer', 'WA', 25, 158, 3),
						(default, 'Carson', 'Engelson', 'KS', 46, 15, 1),
						(default, 'Barry', 'Torres', 'CA', 21, 110, 2),
						(default, 'Lorrie', 'Carmichael', 'TX', 18, 125, 3),
						(default, 'Wilma', 'Jackson', 'VT', 31, 118, 3),
						(default, 'Fred', 'Foley', 'RI', 13, 160, 3),
						(default, 'Uma', 'McMarson', 'WA', 35, 110, 2),
						(default, 'Polly', 'West', 'WA', 90, 22, 1),
						(default, 'Penelope', 'Pope','OH', 52, 109, 2),
						(default, 'George', 'Newburg', 'TN', 42, 90, 2),
						(default, 'Henry', 'Smith', 'CA', 32, 110, 2),
						(default, 'Quentin', 'Jones', 'CA', 23, 150, 3);