CREATE DATABASE IF NOT EXISTS challenge;

CREATE TABLE accounts (
    customer                    VARCHAR(50)        NOT NULL   ,
    bank                        VARCHAR(30)        NOT NULL   ,
    agency                      VARCHAR(40)        NOT NULL   ,
    account                     VARCHAR(20)        NOT NULL   ,

   PRIMARY KEY (customer)
) ENGINE = InnoDB;

INSERT INTO accounts(customer, bank, agency, account) VALUES ('23454345090', 'BANCO_DO_BRAZIL', '3454-4', '8987769-0');
INSERT INTO accounts(customer, bank, agency, account) VALUES ('90987876765', 'PAG_BANK', '3456-7' ,'8987650-8');
