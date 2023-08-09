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