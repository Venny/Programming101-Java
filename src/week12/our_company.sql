drop database OurCompany;
create database OurCompany;
USE OurCompany;

CREATE TABLE departments (
	department_id int NOT NULL AUTO_INCREMENT,
    department_name varchar(255) NOT NULL,
	primary key(department_id)
);

CREATE TABLE employees (
	employee_id int NOT NULL AUTO_INCREMENT,
	department_id int NOT NULL,
    manager_id int,
    first_name varchar(255) NOT NULL,
    last_name varchar(255) NOT NULL,
    date_of_birth date,
    email varchar(255),
    primary key(employee_id),
    foreign key(department_id) REFERENCES departments(department_id),
    foreign key(manager_id) REFERENCES employees(employee_id)
);

CREATE TABLE categories (
	category_id int NOT NULL AUTO_INCREMENT,
    id char(3) unique NOT NULL,
    category_name varchar(255) NOT NULL,
	primary key(category_id)
);

CREATE TABLE products (
	product_id int NOT NULL AUTO_INCREMENT,
	product_name varchar(255) NOT NULL,
    category_id int NOT NULL,
    price  decimal(8, 2) NOT NULL,
    primary key(product_id),
    foreign key(category_id) REFERENCES categories(category_id)
);

CREATE TABLE customers (
	customer_id int NOT NULL AUTO_INCREMENT,
	customer_name varchar(255) NOT NULL,
	email varchar(255),
    primary key(customer_id)
);

insert into departments(department_name) VALUES ('Front-End Department');
insert into departments(department_name) VALUES ('Back-End Department');
insert into departments(department_name) VALUES ('QA Department');
insert into departments(department_name) VALUES ('HR Department');

insert into employees(department_id,manager_id,first_name,last_name) VALUES (1, NULL, 'Artin', 'Mihov');
