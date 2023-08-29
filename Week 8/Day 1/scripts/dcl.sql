-- DCL: data control language
-- edit permissions/privileges that users can have

-- view all databases
show databases;

-- view all tables from a specific database
-- mysql db is a db that contains information about your mySQL server itself
show tables from mysql;

-- find all users
select * from mysql.user;


-- not specifying localhost means user is able to log in from anywhere
create user 'user1' identified by 'pass';
create user 'user2'@'localhost' identified by 'pass';

-- show current user privileges
show grants;

-- resultset is GRANT USAGE ON *.* to user1: no privileges
show grants for 'user1';

-- DCL part
-- *.* means all databases
-- * means default database
grant select on *.* to 'user1';
revoke all privileges, grant option from 'user1';