SELECT * FROM memberships;
SELECT * FROM books;
SELECT * FROM dvds;
DROP VIEW IF EXISTS availabe_books;
DROP VIEW IF EXISTS available_dvds;
DROP VIEW IF EXISTS full_join;

-- JOINS

-- INNER: returns matches
-- find all members that have checked out a book and give me the member and book information

SELECT * FROM memberships;

SELECT * FROM books;

SELECT *
FROM memberships m
    INNER JOIN books b ON m.book_checked_out = b.isbn;

-- ==========================================================================
-- LEFT

SELECT * FROM memberships;

SELECT * FROM books;

SELECT *
FROM memberships m
    LEFT JOIN books b ON m.book_checked_out = b.isbn;

-- INNER JOIN and LEFT JOIN without NULLs - same results

SELECT *
FROM memberships m
    INNER JOIN books b ON m.book_checked_out = b.isbn;

SELECT *
FROM memberships m
    LEFT JOIN books b ON m.book_checked_out = b.isbn
WHERE b.isbn IS NOT NULL;

-- ==================================================================

-- RIGHT

SELECT *
FROM memberships m
    RIGHT JOIN books b ON m.book_checked_out = b.isbn;

-- =============================================================================

-- SELF
-- give me combinations of two books where they are NOT the same book but have the same genre
SELECT * FROM BOOKS;

SELECT
    b1.title,
    b2.title,
    b1.genre
FROM books b1
    INNER JOIN books b2 ON b1.genre = b2.genre
WHERE b1.isbn != b2.isbn;

-- same results

SELECT
    b1.title,
    b2.title,
    b1.genre
FROM books b1
    LEFT JOIN books b2 ON b1.genre = b2.genre
WHERE b1.isbn != b2.isbn;

-- more than one column joined on

SELECT
    b1.title,
    b2.title,
    b1.genre,
    b1.author
FROM books b1
    LEFT JOIN books b2 ON b1.genre = b2.genre AND b1.author = b2.author
WHERE b1.isbn != b2.isbn;

-- ======================================================

-- CROSS
-- I want to see all possible combinations of books and dvds in the library

SELECT * FROM books b CROSS JOIN dvds d;

-- omitting join type results in a cross join

SELECT * FROM books b JOIN dvds d;
-- ===============================================================
-- subquery
-- how about members who've checked out a book AND a dvd? implemented using a subquery

SELECT *
FROM memberships m
    INNER JOIN books b ON m.book_checked_out = b.isbn
    INNER JOIN dvds d ON m.dvd_checked_out = d.id;

SELECT *
FROM (
        SELECT *
        FROM memberships m
            INNER JOIN books b ON m.book_checked_out = b.isbn
    ) as result1
    INNER JOIN dvds d ON result1.dvd_checked_out = d.id;


-- using a subquery that returns one VALUE

SELECT * from memberships;

SELECT * FROM memberships where ID = 1;

SELECT member_since FROM memberships where ID = 1;

SELECT *
FROM memberships
WHERE member_since > (
        SELECT member_since
        FROM memberships
        where ID = 1
    );

-- using a subquery that returns more than one value

SELECT member_since
FROM memberships
WHERE
    member_since BETWEEN '1980-01-01' AND '2000-01-01';

SELECT * FROM memberships WHERE first_name LIKE "S%";

SELECT *
FROM memberships
WHERE
    first_name LIKE "S%"
    AND member_since IN (
        SELECT member_since
        FROM memberships
        WHERE
            member_since BETWEEN '1980-01-01' AND '2000-01-01'
    );

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

-- ===========================================================================
-- VIEW

CREATE VIEW full_join AS
SELECT *
FROM memberships m
    LEFT JOIN books b ON m.book_checked_out = b.isbn
UNION
SELECT *
FROM memberships m
    RIGHT JOIN books b ON m.book_checked_out = b.isbn;

SELECT * FROM full_join;

SELECT *
FROM full_join
WHERE
    book_checked_out is not null
    AND page_count > 300;

CREATE VIEW availabe_books AS
SELECT b.*
FROM memberships m
    RIGHT JOIN books b ON m.book_checked_out = b.isbn
WHERE
    book_checked_out IS NULL;

SELECT * FROM availabe_books ;

-- extra:give me all available media
SELECT b.*
FROM memberships m
    RIGHT JOIN books b ON m.book_checked_out = b.isbn
WHERE
    book_checked_out IS NULL
UNION
SELECT d.*
FROM memberships m
    RIGHT JOIN dvds d ON m.dvd_checked_out = d.id
WHERE dvd_checked_out IS NULL;