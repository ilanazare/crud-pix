CREATE DATABASE IF NOT EXISTS challenge;

CREATE TABLE customers (
    customer                      VARCHAR(50)        NOT NULL   ,
    name                          VARCHAR(40)        NOT NULL   ,
    cpf                           VARCHAR(20)        NOT NULL   ,
    email                         VARCHAR(30)        NOT NULL   ,
    phone                         VARCHAR(15)        NOT NULL   ,
    PRIMARY KEY (customer)
) ENGINE = InnoDB;
