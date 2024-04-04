CREATE DATABASE IF NOT EXISTS challenge;

CREATE TABLE payment (
    account                   VARCHAR(20)       NOT NULL   ,
    pix_type                   VARCHAR(40)                  ,
    pix_key                    VARCHAR(40)                  ,
    PRIMARY KEY (account)
) ENGINE = InnoDB;

insert into payment(account, pix_type, pix_key) values ('8987769-0', 'PHONE' , '71965654334');
insert into payment(account, pix_type, pix_key) values ('8987650-8' ,'PHONE' , '71984191099');