create database OurCompany;

USE OurCompany;
CREATE TABLE departments (
	primary key(department_id),
    department_name varchar(255) NOT NULL
);

CREATE TABLE employees (
	primary key(employee_id),
    first_name varchar(255) NOT NULL,
    last_name varchar(255) NOT NULL,
    email varchar(255)  
);

CREATE TABLE products (
	 primary key(product_id),
     product_name varchar(255) NOT NULL
);

CREATE TABLE products (
	 primary key(product_id),
     product_name varchar(255) NOT NULL,
     category varchar(255) NOT NULL     
);
