CREATE DATABASE IF NOT EXISTS challenge;

CREATE TABLE payment (
    customer                    VARCHAR(50)         NOT NULL    ,
    account                     VARCHAR(20)         NOT NULL    ,
    pix_type                    VARCHAR(40)                     ,
    pix_key                     VARCHAR(40)                     ,
    PRIMARY KEY (customer)
) ENGINE = InnoDB;
