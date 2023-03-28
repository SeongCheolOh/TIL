create table campingEqu(
equCode varchar2(10) not null,
equName varchar2(30),
equPrice number(8),
equCnt number(4),
primary key(equCode)
);
drop table campingEqu;
insert into campingEqu values('T-100','텐트',100000,10);
insert into campingEqu values('C-200','의자',10000,100);
insert into campingEqu values('F-100','그릇',50000,70);
select * from campingEqu;

create table customer(
custId varchar2(10)  not null,
custName varchar(30),
custPhone number(20),
custAddress varchar2(100),
primary key(custId)
);
insert into customer values('c-147258','홍길동',01012345678,'서울시 강동구');
insert into customer values('c-258369','이순신',01087654321,'경기도 하남시');
insert into customer values('c-369159','최수연',01055557777,'경기도 성남시');
select * from customer;

create table rent(
custId varchar2(10)  not null,
equCode varchar2(15),
equCnt number(4),
rentDate date,
rentPrice number(10),
primary key (custId),
foreign key(custID) references customer(custId),
foreign key(equCode) references campingEqu(equCode)
);
insert into rent values('c-147258','C-200',4,'23-03-28',40000);
insert into rent values('c-258369','T-100',3,'23-04-07',300000);
insert into rent values('c-369159','F-100',16,'23-03-28',800000);
delete from rent where custId='c-147258';
select * from (rent);

create table return(
custId varchar2(10)  not null,
equCode varchar2(15),
equCnt number(20),
returnDate date,
returnPrice number(10),
primary key(custId),
foreign key(custId) references customer(custId),
foreign key(equCode) references campingEqu(equCode)
);
alter table return drop(returnPrice);/*속성 삭제*/
alter table return add(returnRDate date);/* 속성 추가*/
alter table return drop(returnDate);
alter table return add(EstimatedReturnDate date);/* 반납예정일 이름 수정*/
alter table return drop(returnRdate);
alter table return add(ActualReturnDate date);/* 실제반납일 이름 수정 */
insert into return values('c-147258','C-200',4,'23-04-03','23-03-31');
select * from (return);

create table overDue(
custId varchar2(10)  not null,
equCode varchar2(15),
equCnt number(20),
overDue number(4),
overDueFees number(10),
primary key(custId),
foreign key(custId) references customer(custId),
foreign key(equCode) references campingEqu(equCode)
);

create table bank(
bName varchar2(15) not null,
bSpot varchar2(100),
primary key(bName)
);

create table bankAccount(
bAccount number(20) not null,
bName varchar2(15),
bAccountType varchar2(15),
bBalance /*잔액*/  number(30),
bOpenDate date,
bCardYN varchar2(10),
primary key(bAccount),
foreign key(bName) references bank(bName)
);
drop table bankAccount

create table bCustomer(
custId varchar2(15) not null,
bAccount number(20),
custSsn number(20) not null,
custName varchar2(30),
custAdderss varchar2(100),
custJob varchar2(30),
custEmail varchar2(50),
custPhone number(15),
primary key(custId),
foreign key(bAccount) references bankAccount(bAccount)
);
