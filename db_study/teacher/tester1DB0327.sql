-- ���̺� �����
create table course(
   cou_id  number(4) not null, 
   cou_name varchar(20) null, 
   Tea_name varchar(20) null,
   primary key(cou_id) 
);

create table student(
   stu_id number(4) not null,
   stu_name varchar(20) null,
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

create table dept01(
   deptno number(4),
   dname varchar2(10),
   loc varchar2(9)
);
-- ���̺� ���� �����ϱ�
alter table dept01
  modify( dname varchar2(30) ); -- �÷� ����

alter table dept01
  add( etc varchar2(50) ); -- �÷� �߰�

alter table dept01
  drop( etc ); -- �÷� �����ϱ�
  
-- ���̺��� ���� ����  
desc dept01;

-- ���̺� �̸� �����ϱ�
rename dept01 to dept02;

-- ���̺�ȿ� ���ڵ�=�ο�=��(���� ������) ��� �����ϱ�
truncate table student;
select * from student;

-- ���̺��� ���ڵ�� ������ ��� �����ϱ�
drop table student;   
--  �����ڰ� �ƴ� ����ڰ� �ٸ� ����ڸ� ���� �� ����. 
create user tester2 identified by 1234; -- ���� 

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

-- dept ������ �����ϱ�
insert into dept( deptno, dname, loc) 
          values( 10, '�渮��', '����');
insert into dept( dname, loc, deptno)
          values( '�λ��', '��õ', 20);
insert into dept values( 30, '������', '����'); -- dept( deptno, dname, loc)  ���̺��� �÷� ���� ������� 
-- insert into dept values( '�����', '����', 40 ); -- �ȵ�
insert into dept values( 40, '�����', '����' );

select * from dept;
select deptno from dept;
select dname from dept;

INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1001, '����', '���', 1013, '2007/03/10',  300, 0,20);   
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1002, '�ѿ���', '�븮', 1005, '2007/04/02',  250, 6,30);                       
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1003, '����ȣ', '����', 1005, '2005/02/10',  500, 100,30);                     
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1004, '�̺���', '����', 1008, '2003/09/02',  600, 0,20);                        
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1005, '�ŵ���', '����', 1005, '2005/04/07',  450, 200,30);   
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1006, '�嵿��', '����', 1008, '2004/01/08',  520, 0,20);                         
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1007, '��켺', '����', 1008, '2005/03/08',  500, 0,30);                    
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1008, '�ȼ���', '����', 0, '1996/04/07',  1000, 0,30); 
                       
select * from emp;      
select job from emp;
-- �ߺ��� ������ 1���� ����ϱ�  �ߺ�����
select distinct job from emp;
-- �ϱ⳻��                                                        ��������
-- ��¥            �ϱ�޸�                ����                 ��¥           �ð�        ��������
 2023-3-27    �������� �ʹ� ����   ����                     2023-3-27   11          ���� ���͵�
 2023-3-28    �Ϸ縸 ����            �帲                  2023-3-27   15          �ڹ� ���͵� 
 2023-3-29    ���� ���� ��÷        ��                     2023-3-29    9          ���� �湮

create table weather(
    we_date date not null,
    we_memo varchar2(50),
    we_text varchar2(20),
    primary key( we_date)
);
create table schedule(
    sc_date date not null,
    sc_time number(2),
    sch_memo varchar2(50),
    foreign key( sc_date) references weather(we_date)
);

insert into weather values( '2023-3-27', '�������� �ʹ� ����','����');
insert into weather values( '2023-3-28', '�Ϸ縸 ����','�帲');
insert into weather values( '2023-3-29', '���� ���� ��÷','��');
select * from weather;
insert into schedule values('2023-3-27', 11, '����͵�');
insert into schedule values('2023-3-27', 15, '�ڹٽ��͵�');
insert into schedule values('2023-3-29', 9, '����湮');
select * from schedule;