-- ����� �����
create user tester1 identified by 1234;
-- ����(����) �ֱ�
grant connect, resource to tester1;
-- stmanager ������� DB�����
create user stmanager identified by 1234;
-- ����(����) �ֱ�
grant connect, resource to stmanager

-- 1�ܰ� DataBase �����
-- 2�ܰ� ���� �ο��ޱ�
-- 3�ܰ� ���̺� �����
-- 3-1 ���������
create table course(
    cou_id number(4) not null,
    cou_name varchar(20) null,
    Tea_name varchar(20) null,
    primary key(cou_id) --ǥ�� ��Ÿ�� �� ��ǥ��(�⺻ Ű)
);
create table student(
    stu_id number(4) not null,
    stu_name varchar(20) null,
    age number(3) null,
    stu_email varchar2(20) null,
    cou_id number(4) not null,
    sex char(1) default 'M',
    primary key(stu_id),
    foreign key(cou_id) references course(cou_id)
);

--������ ����
insert into course values (10,'�����','������');
insert into course values (20,'�����','������');
insert into course values (30,'������','Ȳ����');
insert into course values (40,'��ǥ��','������');

insert into student value(101, '������', 24,'moon@naver.com',10,'M');
insert into student value(102, '���Ѽ�', 22,'fiveone@naver.com',40,'M');
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

--������ �˻�
select * from course;
select * from student;
--���̺� �ȿ� ���ڵ�=�ο�=��(���� ������) ��� �����ϱ�
truncate table student;
select *from student;

--���̺� ����
create table dept01(
    deptno number(4),
    dname varchar2(10),
    loc varchar2(9)
);
--���� ����
alter table dept01
modify(dname varchar2(30));
--���� �߰�
alter table dept01
add(etc varchar2(50));
--���� ����
alter table depth01
drop(etc);
--���̺� �̸� �����ϱ�
rename dept01 to dept02;
--���̺��� ���ڵ�� ������ ��� �����ϱ�
drop table student
--���� Ȯ��
desc dept01;
desc dept02;
--����� ����
create user tester2 identified by 1234;
create user orauser1 identified by 1234;
--���� �ο�
grant create session to orauser1;--���� ���� ����
--���� ���� (�ο��� �������� ���� �����ϴ�)
revoke create session from orauser1;
--����� ����
drop user tester2;
drop user orauser1;

create user tester02 identified by tester021234;
create user tester03 identified by tester031234;
grant connect, resource to tester02, tester03;