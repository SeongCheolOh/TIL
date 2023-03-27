create table student(
std_num number(7) not null,
std_name varchar2(20),
std_ssn varchar2(20),
std_age number(3),
teacher varchar2(20),
primary key(std_num),
foreign key(teacher) references teacher(tec_num)
);

desc student
drop table student

insert into student values(2312051,'홍길동','040507-4063574',20,'t-100');
insert into student values(2211068,'이순신','021124-3069870',22,'t-200');

select * from student;

create table teacher(
tec_num varchar2(10) not null,
tec_name varchar2(20),
tec_subject varchar2(20),
tec_phoneNum number(15),
tec_building varchar2(20),
primary key(tec_num)
);
drop table teacher
insert into teacher values('t-100','정현희','컴퓨터공학',01087443334,'이과동');
insert into teacher values('t-200','이수진','무용학과',01023479874,'예술동');
select * from teacher;
