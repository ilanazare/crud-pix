CREATE DATABASE IF NOT EXISTS challenge;

CREATE TABLE payment (
    customer                    VARCHAR(50)        NOT NULL   ,
    account                   VARCHAR(20)       NOT NULL   ,
    pix_type                   VARCHAR(40)                  ,
    pix_key                    VARCHAR(40)                  ,
    PRIMARY KEY (customer)
) ENGINE = InnoDB;

insert into payment(customer, account, pix_type, pix_key) values ('23454345090', '8987769-0', 'PHONE' , '71965654334');
insert into payment(customer, account, pix_type, pix_key) values ('90987876765', '8987650-8' ,'PHONE' , '71984191099');