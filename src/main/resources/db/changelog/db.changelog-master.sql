--liquibase formatted sql

--changeset mike:1
create table accounts (
	id int primary key auto_increment,
	name varchar(80)
);

--changeset mike:2
insert into accounts(name) values('Mike');
insert into accounts(name) values('Evan');
insert into accounts(name) values('Steve');
insert into accounts(name) values('Jackie');