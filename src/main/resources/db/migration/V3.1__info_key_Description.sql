CREATE DATABASE IF NOT EXISTS challenge;

CREATE TABLE info (
    id INT  AUTO_INCREMENT                      NOT NULL   ,
    customer                  VARCHAR(50)       NOT NULL   ,
    account                   VARCHAR(20)       NOT NULL   ,
    pixType                   VARCHAR(40)                  ,
    pixKey                    VARCHAR(40)                  ,
    PRIMARY KEY (id)
) ENGINE = InnoDB;

insert into info(customer, account, pixType, pixKey) values ('23454345090', '8987769-0', 'PHONE' , '71965654334');
insert into info(customer, account, pixType, pixKey) values ('90987876765', '8987650-8' ,'PHONE' , '71984191099');