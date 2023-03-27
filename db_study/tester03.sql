create table patient(
pnum varchar2(10)not null,
pname varchar2(30),
dcode varchar2(10),
page number(3),
primary key(pnum),
foreign key(dcode) references disease(dcode)
);
drop table patient
insert into patient values('p1001','��ö��','a01',30);
insert into patient values('p1002','�����','a03',29);
insert into patient values('p1003','�ӿ���','a01',50);
select * from patient;

create table disease(
dcode varchar2(10)not null,
dname varchar2(20),
dsymp varchar2(20),
primary key(dcode)
);
drop table disease
insert into disease values('a01','������','��������');
insert into disease values('a02','�ݷ���','����');
insert into disease values('a03','�������','�߿�');
insert into disease values('a04','��ƼǪ��','�߿�');
select *from disease;

create table diary(
today date not null,
memo varchar2(50),
weather varchar2(20),
primary key(today)
);
drop table diary
insert into diary values('2023-03-27','�������� �ʹ� ����','����');
insert into diary values('2023-03-28','�Ϸ縸 ����','�帲');
insert into diary values('2023-03-29','������ ����','��');
select * from diary;

create table  diarydata(
today date not null,
hrs number(2),
�������� varchar2(50),
foreign key(today) references diary(today)
);
drop table diarydata
insert into diarydata values('2023-03-27',11,'���� ���͵�');
insert into diarydata values('2023-03-27',15,'�ڹ� ���͵�');
insert into diarydata values('2023-03-29',9,'���� �湮');
select * from diarydata;
