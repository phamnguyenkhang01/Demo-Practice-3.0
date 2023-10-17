use test;

CREATE TABLE if NOT EXISTS product (
    pid int(8) NOT NULL AUTO_INCREMENT,
    name varchar(128) NOT NULL,
    price float NOT NULL,
    quantity int NOT NULL,
    PRIMARY KEY (pid)
);

INSERT INTO product(name, price, quantity) VALUES("Ben's Picture", 4000.00, 10);
INSERT INTO product(name, price, quantity) VALUES("GPU 3080 Ti", 1949.86, 10);
INSERT INTO product(name, price, quantity) VALUES("Keyboard", 89.99, 10);
INSERT INTO product(name, price, quantity) VALUES("Microphone", 231.18, 10);
INSERT INTO product(name, price, quantity) VALUES("Monitor", 325.20, 10);
INSERT INTO product(name, price, quantity) VALUES("Mouse", 38.99, 10);
INSERT INTO product(name, price, quantity) VALUES("Speaker", 109.31, 10);
INSERT INTO product(name, price, quantity) VALUES("USB HD camera", 205.49, 10);


CREATE TABLE if NOT EXISTS productOrder (
    oid char(16) NOT NULL,
    description varchar(512) NOT NULL,
    total float NOT NULL,
    date_time timestamp NOT NULL,
    PRIMARY KEY (`oid`)
);

CREATE TABLE if NOT EXISTS orderDetails (
    oid char(16) NOT NULL,
    pid int(8) NOT NULL,
    PRIMARY KEY(oid, pid),
    quantity int NOT NULL,
    FOREIGN KEY (oid) REFERENCES productOrder(oid),
    FOREIGN KEY (pid) REFERENCES product(pid)
);