CREATE DATABASE IF NOT EXISTS challenge;

CREATE TABLE user (
    customer                    VARCHAR(50)         NOT NULL    ,
    email                       VARCHAR(20)         NOT NULL    ,
    password                    VARCHAR(40)                     ,
    role                        VARCHAR(40)                     ,
    PRIMARY KEY (customer)
) ENGINE = InnoDB;