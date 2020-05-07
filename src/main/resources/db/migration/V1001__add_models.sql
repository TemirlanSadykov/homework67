use `store`;

CREATE TABLE `store` (
                         `id` INT auto_increment NOT NULL PRIMARY KEY,
                         `name` varchar(128) NOT NULL,
                         `address` varchar(128) NOT NULL,
                         `image` varchar(128) NOT NULL,
                         `description` varchar(128) NOT NULL
);

create table `product` (
                           `id` INT auto_increment NOT NULL PRIMARY KEY ,
                           `name` varchar(128) NOT NULL,
                           `image` varchar(128) NOT NULL,
                           `price` float not null,
                           `quantity` INT NOT NULL,
                           `type` varchar(128) NOT NULL
);

create table `buyer` (
                         `id` INT auto_increment NOT NULL PRIMARY KEY ,
                         `name` varchar(128) NOT NULL,
                         `surname` varchar(128) NOT NULL,
                         `email` varchar(128) NOT NULL,
                         `password` varchar(128) NOT NULL
);
create table `order` (
                         `id` INT auto_increment NOT NULL PRIMARY KEY ,
                         `buyer_email` varchar(128) NOT NULL,
                         `store_name` varchar(128) NOT NULL,
                         `product_name` varchar(128) NOT NULL
);

insert into `product` (`name`, `image`, `price`, `quantity`, `type`) values ('Coffee', 'coffee.png', 200, 15, 'food'), ('Pizza', 'pizza.png', 315, 30, 'food');
insert into `store` (`name`, `image`, `address`, `description`) values ('Margarita', 'store1.png', 'Sovetskaya', 'Very good store'), ('Imperial', 'store2.png', 'Donetskaya', 'Best store');

