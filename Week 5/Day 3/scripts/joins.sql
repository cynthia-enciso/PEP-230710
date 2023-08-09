SELECT * FROM memberships;
SELECT * FROM books;
SELECT * FROM dvds;


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