create table account
(
    id    int primary key auto_increment,
    name  varchar(32),
    money double
) default char set utf8mb4;
insert into account (id, name, money)
values (1, 'Tom', 1000),
       (2, 'Jerry', 1000);
create table log
(
    id         int primary key auto_increment,
    info       text,
    createDate datetime
) default char set utf8mb4;