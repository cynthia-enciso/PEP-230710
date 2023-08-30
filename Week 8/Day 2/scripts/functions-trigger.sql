-- functions

-- required characteristic being either: DETERMINISTIC, NO SQL, or READS SQL DATA: https://stackoverflow.com/questions/57874563/can-someone-help-me-with-functions-in-mysql#:~:text=log_bin_trust_function_creators%20variable%20controls%20whether%20binary,to%20create%20unsafe%20stored%20functions.&text=When%20you%20create%20a%20stored,it%20does%20not%20modify%20data.
-- https://dev.mysql.com/doc/refman/8.0/en/create-procedure.html 
CREATE FUNCTION returnHelloWorld()
RETURNS VARCHAR(100)
DETERMINISTIC 
RETURN 'hello world';

SELECT returnHelloWorld();

-- =============================================================================== 
DROP FUNCTION funcWithParams;

CREATE FUNCTION funcWithParams(num1 INTEGER, num2 INTEGER, num3 INTEGER)
RETURNS INTEGER
NO SQL
RETURN num1 + num2 + num3;

SELECT funcWithParams(1, 2, 3);


-- =============================================================================== 

DELIMITER //

CREATE FUNCTION countOfCheaperItems(max_price NUMERIC(5, 2))
RETURNS INTEGER
READS SQL DATA
BEGIN
	-- declare any variables
	DECLARE itemCount INTEGER;

	-- perform operation
	SELECT COUNT(*) INTO itemCount FROM items WHERE items.price < max_price;

	-- return value
	RETURN itemCount;
END //

DELIMITER ;

SELECT countOfCheaperItems(5.99);

-- =============================================================

DELIMITER //

CREATE TRIGGER insertItemTrigger
-- AFTER | BEFORE     INSERT | UPDATE | DELETE 
AFTER INSERT ON items
FOR EACH ROW 
BEGIN 
	-- IF my inserted record is associated with aisle 1
	IF NEW.aisle_id = 1 
		-- THEN update aisle 1's item_count
		THEN UPDATE aisles SET item_count = item_count + 1 WHERE id = 1;
	-- ELSE IF inserted record is associated with aisle 2
	ELSEIF NEW.aisle_id = 2 
		-- THEN update aisle 2's item_count
		THEN UPDATE aisles SET item_count = item_count + 1 WHERE id = 2;
	-- ELSE IF inserted record is associated with aisle 3
	ELSEIF NEW.aisle_id = 3 
		-- THEN update aisle 3's item_count
		THEN UPDATE aisles SET item_count = item_count + 1 WHERE id = 3;
	-- END IF
	END IF;
END //

DELIMITER ;

SELECT * FROM items;
SELECT * FROM aisles;

INSERT INTO items values (default, 'Ice Cream', 4.99, 10, 2);




