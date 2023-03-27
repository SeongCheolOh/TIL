create table patient(
pnum varchar2(10)not null,
pname varchar2(30),
dcode varchar2(10),
page number(3),
primary key(pnum),
foreign key(dcode) references disease(dcode)
);
drop table patient
insert into patient values('p1001','김철수','a01',30);
insert into patient values('p1002','양길현','a03',29);
insert into patient values('p1003','임영수','a01',50);
select * from patient;

create table disease(
dcode varchar2(10)not null,
dname varchar2(20),
dsymp varchar2(20),
primary key(dcode)
);
drop table disease
insert into disease values('a01','뇌졸증','어지러움');
insert into disease values('a02','콜레라','설사');
insert into disease values('a03','기관지염','발열');
insert into disease values('a04','장티푸스','발열');
select *from disease;

create table diary(
today date not null,
memo varchar2(50),
weather varchar2(20),
primary key(today)
);
drop table diary
insert into diary values('2023-03-27','과제물이 너무 많음','맑음');
insert into diary values('2023-03-28','하루만 참자','흐림');
insert into diary values('2023-03-29','복권을 샀음','비');
select * from diary;

create table  diarydata(
today date not null,
hrs number(2),
오늘할일 varchar2(50),
foreign key(today) references diary(today)
);
drop table diarydata
insert into diarydata values('2023-03-27',11,'영어 스터디');
insert into diarydata values('2023-03-27',15,'자바 스터디');
insert into diarydata values('2023-03-29',9,'은행 방문');
select * from diarydata;
