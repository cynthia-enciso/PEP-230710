-- stored procedures

DELIMITER //

CREATE PROCEDURE restockItemInventory(IN item_id INTEGER)
BEGIN
	UPDATE items SET inventory_count = 99 WHERE id = item_id;
END //

DELIMITER ;

SELECT * from items;
CALL restockItemInventory(1);

-- ============================================================
DELIMITER //

CREATE PROCEDURE getMaxPrice(OUT maxVal NUMERIC(5, 2))
BEGIN
	SELECT MAX(price) INTO maxVal FROM items;
END //

DELIMITER ;

CALL getMaxPrice(@max_price);

SELECT @max_price;

-- ============================================================

-- creating and using a user-defined variable
SET @my_var = 5;
SELECT @my_var;

DELIMITER //
CREATE PROCEDURE addFive(INOUT my_var INTEGER)
BEGIN
	SET my_var = my_var + 5;
END //

DELIMITER ;

CALL addFive(@my_var);

SELECT @my_var;

-- ============================================================
CREATE SEQUENCE my_sequence START 1;
CREATE SEQUENCE my_sequence2 START 10;

SELECT nextval('my_sequence2');
SELECT setval('my_sequence', 5);
SELECT nextval('my_sequence');

CREATE SEQUENCE my_sequence3 INCREMENT BY 2 START 20;
SELECT nextval('my_sequence3');
