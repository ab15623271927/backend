CREATE TABLE users
(
    userId int(11) NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    pwd float(10) DEFAULT NULL,
    PRIMARY KEY (userId)
);