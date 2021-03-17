use mydb;
show tables;
-- ..............ques 1 to 4..................-- 
create table author(
id int PRIMARY KEY auto_increment,
name varchar(20),
streetnumber varchar(30),
location varchar(20),
state varchar(20)
);
create table subject(
id int PRIMARY KEY AUTO_INCREMENT,
author_id int,
 FOREIGN KEY (author_id)
REFERENCES author(id)
);

select * from author;
select * from subject;
-- ...................one to one..............--  

create table authorone(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(20),
age int
);

create table bookone(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(20),
FOREIGN KEY (author_id)
REFERENCES authorone(id)
);

select * from authorone;
select * from bookone;

-- ...................one to Many..............-- 

create table author_one_to_many(
id int PRIMARY KEY auto_increment,
name varchar(20)
);
create table book_one_to_many(
id int PRIMARY KEY AUTO_INCREMENT,
author_id int,
 FOREIGN KEY (author_id)
REFERENCES author_one_to_many(id)
);

select * from author_one_to_many;
select * from book_one_to_many;

-- ...................Many to Many..............-- 


create table authormany(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(20)
);

create table bookmany(
id int PRIMARY KEY AUTO_INCREMENT,
name varchar(20)
);


select * from authormany;
select * from bookmany;

