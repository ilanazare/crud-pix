CREATE DATABASE IF NOT EXISTS challenge;

CREATE TABLE accounts (
    customer                    VARCHAR(50)        NOT NULL   ,
    bank                        VARCHAR(30)        NOT NULL   ,
    agency                      VARCHAR(40)        NOT NULL   ,
    account                     VARCHAR(20)        NOT NULL   ,

   PRIMARY KEY (customer)
) ENGINE = InnoDB;

