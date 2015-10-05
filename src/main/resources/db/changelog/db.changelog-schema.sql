--liquibase formatted sql

--changeset mike:1
create table accounts (
	id int primary key auto_increment,
	name varchar(80)
);