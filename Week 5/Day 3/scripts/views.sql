-- VIEW
DROP VIEW IF EXISTS availabe_books;
DROP VIEW IF EXISTS available_dvds;
DROP VIEW IF EXISTS full_join;

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

-- extra: give me all available media
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