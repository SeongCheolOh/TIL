-- ����� �����
create user tester1 identified by 1234;
-- ����(����) �ֱ�
grant connect, resource to tester1;
-- stmanager ������� DB�����
create user stmanager identified by 1234;
-- ���� �ֱ�
grant connect, resource to stmanager;

-- 1�ܰ� �����ͺ��̽� ����� 2�ܰ� ������ �ο� �޴´�.
-- 3�ܰ� ���̺� �����
-- ���̺� �����
create table course(
   cou_id  number(4) not null, 
   cou_name varchar(20) null, 
   Tea_name varchar(20) null,
   primary key(cou_id) 
);

create table student(
   stu_id number(4) not null,
   stu_name varchar2(20) null,
   age number(4) null,
   stu_email  varchar2(20) null,
   cou_id number(4) not null,
   sex char(1) default 'M',
   primary key(stu_id),
   foreign key(cou_id) references course(cou_id)
);

-- ���̺�ȿ� �����͸� �ֱ�(�����Ѵ�)
insert into course values( 10, '�����','������');
insert into course values( 20, '�����','������');
insert into course values( 30, '������','Ȳ����');
insert into course values( 40, '��ǥ��','������');

insert into student values( 101, '������',24, 'moon@nate.com', 10, 'M');
insert into student values( 102, '���Ѽ�',22, 'five@nate.com', 20, 'M');
INSERT INTO STUDENT VALUES(103,'���뼮', 22,'again@nate.com',20,'M');
INSERT INTO STUDENT VALUES(104,'����ö', 22,'cook@nate.com',20,'M');
INSERT INTO STUDENT VALUES(105,'��ȫ��', 24,'red@nate.com',10,'M');
INSERT INTO STUDENT VALUES(106,'������', 21,'kim@nate.com',20,'M');
INSERT INTO STUDENT VALUES(107,'�ڽ���', 22,'season@nate.com',20,'M');
INSERT INTO STUDENT VALUES(108,'������', 27,'brother@nate.com',10,'M');
INSERT INTO STUDENT VALUES(109,'������', 22, NULL,20,'F');
INSERT INTO STUDENT VALUES(110,'�ڱ⼮', 34,'flag@nate.com',10,'M');
INSERT INTO STUDENT VALUES(111,'��ȿ��', 24,'od@nate.com',30,'F');
INSERT INTO STUDENT VALUES(112,'��â��', 34,'window@nate.com',30,'M');
INSERT INTO STUDENT VALUES(113,'������', 28, NULL, 10,'M');
INSERT INTO STUDENT VALUES(114,'�̺���', 29,'bbong@nate.com',10,'M');
INSERT INTO STUDENT VALUES(115,'��â��', 24,'chang@nate.com',30,'M');
INSERT INTO STUDENT VALUES(116,'����', 34,'shine@nate.com',10,'M');

-- ���̺�ȿ� �����͸� �˻��ϱ�
select * from course;
select * from student;



create user tester2 identified by 1234;

create user orauser1 identified by 1234;
-- ������ �ο��Ѵ�. 
grant create session to orauser1;
--  ������ �����Ѵ� revoke ���Ѹ����ϰ� from ����ڸ�;
revoke create session from orauser1;

-- ����� �����ϱ� 
drop user orauser1;
drop user tester2;

-- dept���̺� �����
drop table dept;
create table dept( 
   deptno number(2) not null,
   dname varchar2(14),
   loc varchar2(13),
   primary key(deptno)
);
-- emp ���̺� �����
create table emp(
   empno number(4) not null,
   ename varchar2(10),
   job varchar2(9),
   mgr number(4),
   hiredate date,
   sale number(7,2),
   comm number(7,2),
   deptno number(2) not null,
   primary key(empno),
   foreign key(deptno) references dept( deptno ) 
);

