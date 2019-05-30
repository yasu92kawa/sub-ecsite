set names utf8;
set foreign_key_checks = 0;

drop database if exists ecsite ;
create database ecsite ;
use ecsite;


drop table if exists login_user;
create table login_user(

id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
update_date datetime,
admin_flg varchar(1)



);

drop table if exists item_info;
create table item_info(

id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime

);


drop table if exists user_buy_item;
create table user_buy_item(

id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
update_date datetime

);

insert into item_info(item_name,item_price,item_stock) values("noteBOOK",100,3);
insert into login_user(login_id,login_pass,user_name,admin_flg) values("taro","taro","taro",1);







