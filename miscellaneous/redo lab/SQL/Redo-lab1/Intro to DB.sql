/*
Install MSSql and SSMS
https://www.youtube.com/watch?v=pmbXs7gTVTk

Intro to DB modules (2) and DB career path

Real world examples: school, hospital, library... brainstorm data they need to store

In the past, data were stored in papers... (show image)

then by excel (show the sample)

Discuss the disadvantages of the paper-and-excel ways to store data
	Size getting bigger and bigger --> speed
	retrieve data, update false data, insert new data, clean old data (how 2 and more persons work together
	authorization and sensitive data: who can view what
	Missing data, typo-error
	Crashed, disconnected machine -> data lost

Therefore we need databases to solve all problems

Rw ex: aptech needs sale+marketing database, hr database, student database...

A db consists of tables

ex: library stores book data --> brainstorm data of a book --> introduce a table
	library stores borrower's data --> brainstorm --> table

Discuss TABLE, COLUMN (info), ROW (individual) --> show NW.Customer
Column: 
	data type (slides)
	NULL vs NOT NULL
	Primary Key to identify each row (eg. ID)

*/

create database LTN_357_AM; --show the result

use LTN_357_AM; --what's this?
create table Students(
	id int primary key,
	first_name varchar(255) not null,
	last_name varchar(255) not null,
	age int
); --show the result

alter table Students
add email varchar(255);

alter table Students
drop column email;

drop table Students;

insert into Students (id, first_name, last_name, age)
values (1, 'Minh', 'Le', 21);

insert into Students (id, first_name, last_name, age)
values (1, 'Khanh', 'Pham', 20); --failed due to PK

insert into Students (id, first_name, last_name)
values (2, 'Khanh', 'Pham'); --null age

update Students 
set last_name = 'Le'
where first_name = 'Khanh'; --1 row

update Students
set age = 22
where last_name = 'Le'; --2 rows

delete from Students 
where first_name = 'Minh';

--default value and check
create table Students(
	id int primary key,
	first_name varchar(255) not null,
	last_name varchar(255) not null,
	age int default 15,
	check (age >=15)
); --constraints folder

insert into Students (id, first_name, last_name)
values (1, 'Minh', 'Le');

insert into Students (id, first_name, last_name, age)
values (2, 'Khanh', 'Pham', 11); --failed


--one to many relationship: 1 teacher teaches many modules and 1 module has only 1 teacher
--foreign key: refers to the PK in another table  (relationship between tables)
create table Teachers (
	id int primary key,
	first_name varchar(255) not null,
	last_name varchar(255) not null,
);

create table Modules (
	id int primary key,
	name varchar(255) not null,
	length_in_hours int not null,
	teacherID int foreign key references Teachers(id),
	check (length_in_hours >= 16)

);

------------------
insert into Teachers (id, first_name, last_name)
values (1, 'Bach', 'Le');

insert into Teachers (id, first_name, last_name)
values (2, 'Thang', 'Dao');

insert into Teachers (id, first_name, last_name)
values (3, 'Cuong', 'Do');

------------------
insert into Modules (id, name, length_in_hours, teacherID)
values (1, 'C programming', 40, 3);

insert into Modules (id, name, length_in_hours, teacherID)
values (2, 'HTML5', 40, 4); --failed, no teacherId 4

insert into Modules (id, name, length_in_hours, teacherID)
values (2, 'HTML5', 40, 1); 

insert into Modules (id, name, length_in_hours, teacherID)
values (3, 'Bootstrap jQuery', 16, 2); 

insert into Modules (id, name, length_in_hours, teacherID)
values (4, 'SQL', 16, 2); 


--SELF STUDY: UNIQUE, IDENTITY constraints