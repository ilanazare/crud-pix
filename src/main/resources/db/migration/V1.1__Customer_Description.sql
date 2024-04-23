CREATE DATABASE IF NOT EXISTS challenge;

CREATE TABLE customers (
    customer                      VARCHAR(50)        NOT NULL   ,
    name                          VARCHAR(40)        NOT NULL   ,
    cpf                           VARCHAR(20)        NOT NULL   ,
    email                         VARCHAR(30)        NOT NULL   ,
    phone                         VARCHAR(15)        NOT NULL   ,
    PRIMARY KEY (customer)
) ENGINE = InnoDB;

INSERT INTO customers(customer, name, cpf, email, phone) VALUES ('23454345090', 'iva luis', '77872339587', 'iva@hotmail', '71984376654');
INSERT INTO customers(customer, name, cpf, email, phone) VALUES ('90987876765', 'camila', '77834563957', 'camila@hotmail', '7198456654');
