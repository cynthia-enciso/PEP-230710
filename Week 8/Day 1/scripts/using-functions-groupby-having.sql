-- aggregate functions: https://dev.mysql.com/doc/refman/8.0/en/aggregate-functions.html

select * from people;

select sum(age)
from people;

SELECT min(iq)
FROM people;

SELECT max(iq)
FROM people;

SELECT COUNT(*)
FROM people;

select count(state)
from people;

select count(DISTINCT state)
from people;

SELECT avg(iq)
from people;


-- results you select should be uniform/make sense in how many values are returned in each selection
select id, count(state)
from people;

-- this works, even if it isn't meaningful
select sum(age), count(state)
from people;

-- scalar functions: https://ramkedem.com/en/mysql-scalar-functions/
SELECT UCASE(first_name)
FROM people;

-- returns a substring
SELECT MID(first_name, 1, 2)
from people;

-- ciel() and floor()
SELECT ROUND(iq / 2)
FROM people;

-- LEN in MySQL
SELECT LENGTH(first_name)
FROM people;

-- GROUP BY: if an aggregate is used, specify which column's value to group record information from

select count(state)
from people;

-- count records that are associated with values in grouped on column
select state, count(state)
from people
group by state;

-- ORDER BY
select * from people ORDER BY first_name;

-- order by works without grouping but not meaningful if using an aggregate since aggregate returns one value
select count(state)
from people
order by count(state);

-- you can order by whatever columns are returned in the resultset
select state, count(state)
from people
group by state
order by state;


select state, count(state)
from people
group by state
order by count(state);

-- HAVING vs WHERE: where filters before the grouping, having afterward
select state, count(state)
from people
group by state;

-- filtering before grouping (only return records where iq > 50, THEN group)
select state, count(state)
from people
WHERE iq > 50
group by state;

-- filtering after grouping (from the grouping resultset, filter so that only records where count(state) is greater than 1)
select state, count(state)
from people
group by state
HAVING count(state) > 1;


-- including before and after filtering
select state, count(state)
from people
where iq > 50
group by state
HAVING count(state) > 1;

-- including order by (goes at very end)
select state, count(state)
from people
where iq > 50
group by state
HAVING count(state) > 1
order by count(state) DESC;
