CREATE DATABASE IF NOT EXISTS challenge;

CREATE TABLE accounts (
    id INT  AUTO_INCREMENT                         NOT NULL   ,
    customer                    VARCHAR(50)        NOT NULL   ,
    bank                        VARCHAR(30)        NOT NULL   ,
    agency                      VARCHAR(40)        NOT NULL   ,
    account                     VARCHAR(20)        NOT NULL   ,
    PRIMARY KEY (id)
) ENGINE = InnoDB;

insert into accounts(customer, bank, agency, account) values ('23454345090', 'BANCO_DO_BRAZIL', '3454-4', '8987769-0');
insert into accounts(customer, bank, agency, account) values ('90987876765', 'PAG_BANK', '3456-7' ,'8987650-8');
