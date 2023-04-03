-- 7�� ���̺� ���� ����, ����, �����ϴ� DDL (Database Define Language)-������ ���Ǿ�
-- ��ǥ ���̺� ����� ���� ����
-- ��Ű�� ??
select table_name from user_tables;
create table emp01(
   empno number(4),
   ename varchar2(14),
   sal number(7,3)
);
desc emp01; -- ���̺��� ���� ����
create table emp02(
   empno number(4) default 1000,
   ename varchar2(14) default 'ȫ�浿',
   sal number(7,3)
);
insert into emp01( empno ) values ( 2000 );
insert into emp02( sal ) values ( 500 );
select * from emp01;
select * from emp02;
-- ���̺� ������ ����� �̸� �μ��� �Ի���-�⺻������ ���� ��¥  ���̺���� emp03
create table emp03(
   ename varchar2(20),
   deptno varchar2(20),
   hiredate date default sysdate
);
-- ������ �����ϱ� ������ ����� 2022/10/08  �̼��� ������ 2023/03/31
insert into emp03 values( '������', '�����', '2022/10/08');
-- insert into emp03 values( '�̼���', '������' );���� 
insert into emp03 ( ename, deptno) values( '�̼���', '������' );
select * from emp03;

-- emp01 ���̺�ȿ� birth �÷� �߰��ϱ�
alter table emp01
  add( birth date default sysdate );
-- ���̺� ��������
desc emp01;
-- sal �÷��� �ڷ����� number(7,3) --> number(8) �����ϱ� ������ �������� ����
alter table emp01
  modify( sal number(8) );
--  empno varchar2(10) ename varchar2(20) �� �����ϱ� ���� : �����Ͱ� ������ ������ ������ �� ����. 
alter table emp01
  modify( empno varchar2(10), 
          ename varchar2(20) );
          
select * from emp01;
-- empno�� ���� null�� �����ϱ�
update emp01 set empno = null ;

select * from emp02;
-- sal �÷��� �����
alter table emp02
   drop column sal; 
desc emp02;
select * from emp03;
-- deptno, hiredate �÷��� ��� �����ϱ� ���� 1���� �÷��� �����. ��� �÷��� �� ���� �� ����. �ּ� 1���� ���� �ξ�� �Ѵ�. 
alter table emp03
   drop column deptno;
alter table emp03
   drop column hiredate;
alter table emp03
   drop column ename;
-- ���ڵ���� ���� ���� ��쿡 �÷� ����(�߰�, ����, ����)�� ��� �����ͺ��̽� �ӵ��� �������ϴ�.  
-- �׷��� �ȵ˴ϴ�. ������ �÷��� �ٷ� �ٷ� ����°� �ƴ϶� unused�� ����� �ΰ� ���߿� �Ѳ����� �����մϴ�.
select * from emp02;
alter table emp02
  set unused ( ename ); -- ������� ���� �÷��� üũ�ϴ� ��
desc emp02; 
select * from emp02; -- unused�� �÷��� �˻��� ���� �ʴ´�.
alter table emp02  -- unused�� �÷��� ������ �����Ѵ�.
  drop unused columns;
  
-- ���̺�� ����
select * from emp01;
rename emp01 to newEmp01;
desc newEmp01;
select * from newEmp01;

-- ���̺��� ������ �����ϴ� �� = ���̺� ����
drop table newEmp01;
drop table emp03;

-- ���̺� �Ӿȿ� ������(���ڵ�)�� ��� �����ϱ�
create table copyEmp as select * from emp;
-- ���̺� �Ӿȿ� ������(���ڵ�)�� ��� �����ϱ� ���1) delete������  ���2) truncate table��  
select * from copyEmp;  
--  ���1) delete������ Ʈ����ǿ��� �۾��� �̷�� ���Ƿ� commit �ϱ� ���� rollback�ؼ� ������ ����� �� �ִ�. 
delete from copyEmp;
rollback; -- ������� �ߴ� ����� Ʈ�����( all or nothing )���� �۾��ϴ� �͵��� �ǵ����� 
-- Ʈ������� ���࿡�� ���� �����ϴ� ���� ���� ��� �������� 100% �Ϸ�Ǿ���� ����, �߰��� ���߸� ó������ �ǵ��� ���� ��  

-- ���2) truncate table -- Ʈ����ǰ��� �Ǵ� Ʈ����� �ý��� �������� �۾��� �ϴ� ���� �ƴ϶� �ٷ� DB���̺��� �������� ���� ��� �ȵ�
truncate table copyEmp; -- rollback���� �ǵ����� �ϴϱ� �ȵ�. 


-- ������ ��ųʸ�
-- ����ڰ� ����� ���̺��� �ƴϰ� �����ͺ��̽� �������� �ڵ����� ����� �����Ͽ� �ش�. 
-- ����ڴ� ���⸸ �Ѵ�. ����ڴ� �����ͺ��̽� �����ȿ� ��� �ִ� ������ ���� �̿��Ѵ�. 
-- user_  all_  dba_
-- ~~ ���� - ����, ����, ����, ���� ���� �Ǿ� ����
-- ~~ �д´� - ���⸸ ������
select table_name from user_tables;
select * from user_tables;
select table_name, max_trans from user_tables;

select * from all_tables;

-- ------------
-- DML - Data Manipulation Language  - ������ ���۾� �������ڰ� �ڹ��ڵ忡 ��ɾ� �� �ش�. 
-- select insert update delete 
create table dept01(
  deptno number(2),
  dname varchar2(14),
  loc varchar2(13)
);

desc dept01;

insert into dept01 values( 10, '�渮��', '����') ;
-- insert into dept01 values( 20, '�λ��','��õ' ); 
-- insert�� �ڿ� select�� ������ ����� ���ʴ�� �� ���̺��� �÷��� �־� �ش�.
insert into dept01(deptno, dname, loc)  select deptno, dname, loc from dept where deptno = 20 ; 
-- select���� ������(4��)�� ��� 4���� ���� ���Եȴ�.
insert into dept01(deptno, dname, loc)  select deptno, dname, loc from dept  ; 
-- select���� ������(4��)�� ��� 4���� ���� ���Եȴ�.
insert into dept01(deptno, dname, loc)  select deptno, dname from dept  ;   -- error  ', loc' ������
insert into dept01(deptno, dname)  select deptno, dname from dept  ;  -- insert�� �������� �̷��� �˻��Ͻø� �ȴ�.  
-- ���� ����, ���� ����, ��¥ ����, null ����
-- dept01 ���̺� ���� �÷� date �߰��ϱ� 
alter table dept01
  add birth date;
desc dept01;
-- deptno 20 or 30 �� ���ڵ�ȿ� ���� ��¥�� ������ ���� �־� �ּ���
insert into dept01 ( deptno, dname, loc, birth ) 
       select  deptno, dname, loc, sysdate from dept where deptno in ( 20,30 );
select * from dept01;
-- dname ������� ����� �μ�, �μ���, ����, birth�� 1990/12/25�� �����ϱ� 


select * from dept01;

select * from dept;
-- dept���̺��� tourism �÷��� �����ϱ�
alter table dept 
   drop column tourism;
-- deptno�� 20�� ���ڵ常 �˻��ϱ�
select * from dept where deptno = 20;
------------------------------------
--���ڵ� ������ �� insert ��
--���� insert into ���̺�� (�÷���1, �÷���2 ...) values ('������'...);
--���ڵ� ������ �� update��
--���� update ���̺�� set �÷��� = '������', ... where ������
select * from emp;
--mgr 1005�� ����� �޿��� 50���� �λ�
update emp set sale = sale+50 where mgr= 1005;
--job�� ��� �븮�� ����� ���ʽ��� 30���� �λ�
update emp set comm = comm+30 where job in ('���','�븮');
--�Ի����� 05�� ������ ����� �޿��� 100���� �λ�
update emp set sale = sale+100 where hiredate<='05/01/01';
--��� �޿����� ���� ���� �����鿡�� ���ʽ��� 50���� �ּ���
select avg(sale) from emp; -- ��հ� ���ϴ� �ڵ�
update emp set comm=comm +50 where sale< (select avg(sale) from emp);
--�μ����� ���� ���� �޴� ����� �޿� 100������ �谨�ϱ�
select deptno, max(sale) from emp group by deptno where deptno is not null; -- �Ұ���
select  deptno, max(sale)  from emp where deptno is not null group by deptno ; -- �μ����� ���� ���� �޴� ���(�μ� ���»�� ����);
select sale from emp where sale in (select  max(sale)  from emp group by deptno);
update emp set sale = sale-100 
where sale in (select  max(sale)  from emp group by deptno);
-- job=���� �̰ų� �Ի��� 98/12/31 ������ ����� �޿� = �޿�+��ձ޿��� �����ϱ�
select sale,ename,deptno from emp where job='����' or hiredate<='98/12/31';
update emp set sale = sale+(select avg(sale)from emp) where job='����' or hiredate<='98/12/31'; 
update emp set job='����' where job is null;
--job= ������ ������� ������� ����
update emp set job='���' where job = '����';
--delete ��
--��� >> delete from emp where ���ǹ�
create table c4emp as select * from emp;
select * from c4emp;
--�޿��� 1000���� �̻��� ��� ����
delete from c4emp where sale>1000;
--mgr�� 1008, 1003�� ��� �����ϱ�
delete from c4emp where mgr in(1008, 1003);
--��, �̾� �����ϰ� ��� ����
delete from c4emp where not(ename like '��%' or ename like '��%');
--���ʽ��� 100���� �̻��� ��� �����ϱ�
delete from c4emp where comm>=100;
--�μ��� 10�̰ų� 20�� ��� �����ϱ�
delete from c4emp where deptno in(10,20);
rollback;

insert into emp(deptno) values (40) ; -- 0~100 �Ҽ���x 500
--�����ͺ��̽� ��ųʸ��� ���Ͽ� �������ǿ� ���� ���� ����
desc user_constraints;
--�����ͺ��̽� ��ųʸ��� ���Ͽ� ���������� ���Ǹ�, Ÿ��, ���̺���� �����ؼ� ����
select constraint_name, constraint_type from user_constraints;
--��ü �������ǿ� ���õ� �÷��� ����
select * from user_constraints;

--�� ���������� ����� -> ���� -> ����
--����� ���̺� ������ �� ���������� �Ǵ�
create table emp03(
empno number(4) not null,
ename varchar2(10) not null,
job varchar2(10),
deptno number(2));
--�������� Ȯ��
select constraint_name, constraint_type, table_name, search_condition from user_constraints where table_name in('EMP03');
drop table emp03;
--unique ���� ����
create table emp03(
empno number(4) unique,
ename varchar2(10) unique,
job varchar2(10),
deptno number(2));
--�����ϱ�
--1) ������
insert into emp03 values (1001, 'ȫ�浿', '����', 10);
-- empno ���� �Է��ϱ�
insert into emp03(ename, job, deptno) values ('�̼���', '�λ���', 10);
--ename ���� �Է��ϱ�
insert into emp03(empno, job, deptno) values (1002, '���', 20);
--Ȯ��
select * from emp03;
--2)���� >> unique Ű�� �������� ������ ����

--���� ���Ǹ� (Constraint_name)�� ����ڰ� ����
--�ϴ� �������Ǹ� ���»����ΰ� Ȯ��
select * from user_constraints where table_name in ('EMP03');
drop table emp03;--�����
create table emp03(
empno number(4) constraint emp03_empno_uk unique, -- constraint �������Ǹ� ��������
ename varchar2(10) constraint emp03_ename_uk unique,
job varchar2(10) constraint emp03_job_nn not null,
deptno number(2) constraint emp03_deptno_nn_uk not null unique);
drop table emp03;--�����
create table emp03(
empno number(4) constraint emp03_empno_pk primary key, -- constraint �������Ǹ� ��������
ename varchar2(10) constraint emp03_ename_uk unique,
job varchar2(10) constraint emp03_job_nn not null,
deptno number(2) constraint emp03_deptno_nn_uk not null unique
--���2)
--constraint emp03_empno_pk primary key(empno)�� ���� �ᵵ �ȴ�
);
--foriegn(����) key �ܷ�Ű
--����� ���� 1) �θ����̺� 2) �ڽ����̺�
drop table emp03; --�����
--1) �θ����̺�
create table dept03(
deptno number(4),
dname varchar2(10),
loc varchar2(10),
constraint dept03_deptno_pk primary key(deptno));
--2) �ڽ����̺�
create table emp03(
empno number(4),
ename varchar2(20),
deptno number(4) constraint emp03_deptno_nn not null
                                   constraint emp03_deptno_fk references dept03(deptno),
--empno �⺻Ű
constraint emp03_empno_pk primary key(empno) );
--�Ǵ�
drop table emp03;
create table emp03(
empno number(4),
ename varchar2(20),
deptno number(4) constraint emp03_deptno_nn not null,
foreign key(deptno) reference dept03(deptno));--�ڽ����̺�
--������ ��ųʸ��� ���ؼ� ���������� ���� ����
select * from user_constraints where table_name in ('EMP03', 'DEPT03');
--�Է��Ҷ��� �θ� ����
insert into dept03 values(10,'�渮��', '����');
insert into emp03 values(1001, 'ȫ�浿', 30); --����>>�θ� 30�� ���
insert into emp03 values(1001,'ȫ�浿',10);

drop table dept03;-- �ڽ����̺� ����� �����Ͱ� ������ �ڽ� ���� �����ؾ� �θ����̺� ���� ����

create table emp03(
empno number(4),
salary number(10) check(salary between 500 and 5000), -- �������Ǹ��� ������� �ʰ�
comm number(10) constraint emp03_comm_ck check(comm between 10 and 1000));
select * from user_constraints where table_name in ('EMP03');
--���� �Է�
insert into emp03 values(1001, 800, 20);
--���� �Է�
insert into emp03 values(1001, 8000, 50);
insert into emp03 values(1001, 5000, 0);

--���� �����
--���� ����, ����

--����Ű >> 2�� �̻��� �÷��� ���� �⺻Ű�� ���� ��
--ex)�ڵ�����ȣ ��4�ڸ� +  �̸�
drop table emp03;
create table emp03(
ephone number(4),
ename varchar2(20),
job varchar2(20),
constraint emp03_ephone_ename_pk primary key(ephone, ename));
insert into emp03 values (3334, 'ȫ�浿', '���');
insert into emp03 values (3334, '�̱浿', '���');
insert into emp03 values (3334, '��浿', '���');
insert into emp03 values (3334, 'ȫ�浿', '���');--���� (�����̸Ӹ� Ű >> �ߺ� �Ұ�)

drop table emp03;
create table emp03(
empno number(4),
ename varchar2(20),
job varchar2(20),
deptno number(4));
--���� ���� �߰�
alter table emp03
add constraint emp03_empno_pk_ primary key(empno);
--Ȯ��
select *from user_constraints where table_name in ('EMP03');
--�ϴ� ����� �ٽ� ����
drop table dept03;
create table dept03(
deptno number(4),
dname varchar2(20),
loc varchar2(20));
--deptno primary key �������� �߰��ϱ�
alter table dept03
add constraint dept03_deptno_pk primary key(deptno);
--emp03 ���̺��� �÷� deptno�� �ܷ�Ű�� �����ϱ�
alter table emp03 
add constraint emp03_deptno_fk foreign key(deptno) references dept03(deptno);
select * from dept03;

--dname loc�� ����Ű�� �������� �߰�
alter table dept03
add constraint dept03_dname_loc_pk primary key(dname, loc);

drop table emp03;
drop table dept03;

create table dept03(
deptno number(4),
dname varchar2(20),
loc varchar2(20));
create table emp03(
empno number(4),
ename varchar2(20),
job varchar2(20),
deptno number(4));
--dname not null�� ���������� ���� �� modefi~~
--why??>> not null�� �������� ������ �ڵ����� null�Ǳ⶧��
alter table dept03
    modify dname constraint deptno03_dname_nn not null;
--ename not null�� ���� ������ �����ϱ�
alter table emp03
    modify ename constraint emp03_ename_nn not null;
--�������� ���� p.143
--dept03.deptno�� �⺻Ű�� �������� �߰�
alter table  deot03_deptno primary key(deptno);
--emp03.empno�� �⺻Ű�� �������� �߰�
alter table dept03
    drop    constraint dept03_dname_nn_; --���1) �������Ǹ� ����

--���̹� ī�� 1408
create table employee(
emp_no number(4),
emp_name varchar2(20),
salary number(6),
birthday date);
create table project(
pro_no number(4),
pro_content varchar2(100),
start_date date,
finish_date date);
create table specialty(
emp_no number(4),
specialty varchar2(20));
create table assign(
emp_no number(4),
pro_no number(4));
--primary key ����
alter table employee
add constraint employee_emp_no_pk primary key(emp_no);
alter table project
add constraint project_pro_nu_pk primary key(pro_no);
alter table specialty
add constraint specialty_emp_no_specialty_pk primary key(emp_no,specialty);
alter table assign
add constraint assign_emp_no_pro_no_pk primary key(emp_no, pro_no);
--foreign key ����
alter table specialty
add constraint emp_no_fk foreign key(emp_no) references employee(emp_no);
alter table assign
add constraint emp_no_fk foreign key(emp_no) references employee(emp_no);
alter table assign
add constraint pro_no_fk foreign key(pro_no) references project(pro_no);
--ī�� ���� �ϼ��ϼ���!
--cascade
--�θ� ���̺��� �ڷḦ �����ϸ� �ڽĵ� ���� ����
--�θ� ���̺��� �ڷḦ �����ϸ� �ڽĵ� ���� ����
--�� �� �ְ� ���������� ����� �ִ� ��
drop table emp03;
drop table dept03;

create table emp03(
empno number(4),
ename varchar2(10)
    constraint emp03_ename_nn not null,
job varchar2(10),
deptno number(2),
constraint emp03_empno_pk primary key(empno),
constraint emp03_job_uk unique(job),
constraint emp03_deptno_fk foreign key(deptno) references dept03(deptno));

create table dept03(
deptno number(2),
dname varchar2(10),
loc varchar2(10),
constraint dept03_deptno_pk primary key(deptno));
--�������� Ȯ��
select * from user_constraints where table_name in ('EMP03', 'DEPT03');
--�����͸� ������ �� ���� >> 1)�θ� 2)�ڽ�
insert into emp03 value(1000, 'ȫ�浿', '���', 50); --���� �߻�<<�ܷ�Ű �����̱� ������
--���� ���ִ� ��� 1) �θ� �ڷ� �켱���� �Է��ϱ� 2) ���������� �ӽ÷� ��Ȱ��ȭ(disable constraint)
alter table emp03 --��Ȱ��ȭ (�� �������)
    disable constraint emp03_deptno_fk; 
--��Ȱ��ȭ
alter table emp03
    enbale constraint emp03_deptno_fk;
delete * from emp03;
--cascade �ɼ�
alter table dept03
    disable primary key cascade; 
alter table dept03
    enable primary key cascade;
alter table emp03
    enable emp03_deptno_fk;
select * from user_constraints where table_name in ('EMP03', 'DEPT03');
insert into emp03 values(1000, 'ȫ�浿', '���', 50);
--ī�� 1410 Join // ppt p.144