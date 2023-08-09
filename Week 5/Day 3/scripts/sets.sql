-- SET OPERATIONS
-- select same amount of columns
-- selected columns datatypes must match
-- selected columns order must match
-- adding ALL: include duplicates

-- UNION
-- give me all items, either books or dvds
-- resultset column names match the selected columns from the first query

SELECT isbn, title FROM books UNION SELECT id, title FROM dvds;

-- longer media (column names used are from first select query)

SELECT isbn, title, genre
from books
WHERE page_count >= 500
UNION
SELECT id, title, genre
FROM dvds
WHERE length_in_minutes > 150;

SELECT isbn, title, genre
from books
WHERE page_count >= 500
UNION
SELECT id, title, genre
FROM dvds
WHERE length_in_minutes > 150
ORDER BY title;

-- INTERSECT
-- return common genres from both books and dvds

SELECT genre FROM books INTERSECT SELECT genre FROM dvds;

-- EXCEPT (minus)
-- return unique genres from books that aren't listed in dvds

SELECT genre FROM books EXCEPT SELECT genre FROM dvds;

-- FULL JOIN

SELECT *
FROM memberships m
    LEFT JOIN books b ON m.book_checked_out = b.isbn
UNION
SELECT *
FROM memberships m
    RIGHT JOIN books b ON m.book_checked_out = b.isbn;

-- we see duplicate matches with UNION ALL

SELECT *
FROM memberships m
    LEFT JOIN books b ON m.book_checked_out = b.isbn
UNION ALL
SELECT *
FROM memberships m
    RIGHT JOIN books b ON m.book_checked_out = b.isbn;