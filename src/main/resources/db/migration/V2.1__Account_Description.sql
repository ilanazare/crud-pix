CREATE DATABASE IF NOT EXISTS challenge;

CREATE TABLE accounts (
    customer                    VARCHAR(50)        NOT NULL   ,
    bank                        VARCHAR(30)        NOT NULL   ,
    agency                      VARCHAR(40)        NOT NULL   ,
    account                     VARCHAR(20)        NOT NULL   ,
    pix_type                VARCHAR(20)        NOT NULL   ,
    pix_key              VARCHAR(20)        NOT NULL   ,

   PRIMARY KEY (customer)
) ENGINE = InnoDB;

insert into accounts(customer, bank, agency, account, pix_type, pix_key) values ('23454345090', 'BANCO_DO_BRAZIL', '3454-4', '8987769-0', 'PHONE', '71965654334');
insert into accounts(customer, bank, agency, account, pix_type, pix_key) values ('90987876765', 'PAG_BANK', '3456-7' ,'8987650-8', 'PHONE' , '71984191099');
