# SpringBoot_Demo
教务系统 springboot 后端api

mysql数据库    

drop database test1;
create database test1;


use test1;
alter database test1 default character set = utf8mb4;

drop table tb_student;
create table tb_student(
   stu_id int primary key auto_increment ,
   stu_name varchar(15),
   stu_sex varchar(15) ,
   stu_stuid varchar(15)
);
insert into tb_student(stu_name,stu_sex,stu_stuid) values('root','男','123456');

drop table tb_teacher;
create table tb_teacher(
   tea_id int primary key auto_increment,
   tea_name varchar(15),
   tea_position varchar(20)
);
 
 insert into tb_teacher(tea_name,tea_position) values('root','电子工程');

