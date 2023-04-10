-- 7�� ���̺� ���� ����, ����, �����ϴ� DDL (Database Define Language)-������ ���Ǿ�
-- ��ǥ ���̺� ����� ���� ����
-- ��Ű�� ??
select * from user_tables;
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

----------------
-- ���ڵ带 ������ �� inset��
-- ���� insert into ���̺�� (�÷���1, �÷���2 ...) values( '������',...);
-- ���ڵ带 ������ �� update��
-- ���� update ���̺�� set �÷��� = '������', ... where ������ 
select * from emp;
-- mgr 1005�� ����� �޿��� 50���� �λ�
update emp set sale = sale+50 where mgr=1005;
-- job�� ���, �븮�� ����� ���ʽ��� 30���� �λ��� �ּ���
update emp set comm = comm + 30 where job in ('���','�븮');
-- �Ի����� 05�� ������ ����� �޿��� 100���� �λ��ϼ���.
update emp set sale = sale + 100 where hiredate <= '05/01/01';
-- ��� �޿����� ���� ���� ������ ���ؼ� ���ʽ� 50���� �����ϼ���.
-- ��� �޿�?
select avg(sale) from emp;
update emp set comm = comm + 50 where sale <= ( select avg(sale) from emp );
select * from emp;
-- �μ����� ���� ���� �޴� ����� �޿� 100���� �谨�ϱ�
-- 1�ܰ� �μ����� ���� ���� �޴� �����?
select ename, deptno, sale from emp where  sale in ( select  max(sale) from emp group by deptno );
select sale from emp where  sale in ( select  max(sale) from emp group by deptno );
update emp
  set sale = sale - 100
  where   sale in ( select  max(sale) from emp group by deptno )  ;
-- job �����̰ų� �Ի��� 98/12/31���� �Ի��� ����� �޿� = �޿� + ��ձ޿� �����ϱ�
update emp 
      set sale = sale + ( select avg(sale) from emp )
      where job='����' or hiredate <= '98/12/31'; 
select * from emp;
-- job ������ ������� ��� �����ϼ���.
update emp set job='���' where job='����';

-----------------------
-- delete�� 
-- delete from emp where ���ǹ�; 
create table c4emp as select * from emp;
select * from c4emp;
rollback;
-- �޿��� 1000���� �̻��� ��� �����ϱ�
delete from c4emp where sale >= 1000;
-- MGR�� 1008, 1003�� ��� �����ϱ�
delete from c4emp where mgr in ( 1008, 1003 );
-- �达, �̾��� ����� �����ϰ� ��� �����ϱ�
delete from c4emp where not( ename like '��%' or ename like '��%' );
-- ���ʽ��� 100���� �̻��� ��� �����ϱ�
delete from c4emp where comm >= 100;
-- deptno�� 10, 20�� ��� �����ϱ�
delete from c4emp where deptno in ( 10,  20);

drop table emp;
create table emp as select * from c4emp;

select * from emp;

update emp set sale = sale + 500 where job='����';
commit;
rollback;
select * from dept;

insert into emp ( deptno ) values ( 40 ); --  0~100 �Ҽ��� X 500

--- ���� ���� ��� ���� : �����ͺ��̽��� ����� �� �������� ������ �����ϱ� ���ؼ� 
-- �����ͺ��̽� ��ųʸ��� ���Ͽ� �������ǿ� ���� �÷� ������ ����
desc user_constraints;
-- �����ͺ��̽� ��ųʸ��� ���Ͽ� ���������� �������Ǹ�, �������� Ÿ��, ���̺���� ����
-- �ʿ��� �÷��鸸 �����ؼ� ����
select constraint_name, constraint_type, table_name from user_constraints ;
-- ��ü �������ǿ� ���õ� �÷��� ����
select * from user_constraints ;
-- contraint_type  P-primary key, R-foreign key, U-unique, C-check �Ǵ� not null

-- �� ���������� �����-> ����->����
-- ����� ���̺� ������ �� ���������� �����. 1)not null
create table emp03(
   empno number(4) not null,
   ename varchar2(10) not null,
   job varchar2(10),
   deptno number(2)
);
select constraint_name, constraint_type, table_name, search_condition
      from user_constraints
      where table_name in ('EMP03');
drop table emp03;

-- unique ���� ���� : null �ߺ��ؼ� ��� �� �� �ִ�. ��, ������ �����Ͱ� ���� �ȵȴ�. 
create table emp03(
   empno number(4) unique,
   ename varchar2(10) unique,
   job varchar2(10),
   deptno number(2)
);
-- �����ϱ�
-- �������� �����ϱ�
insert into emp03 values( 1001, 'ȫ�浿', '����', 10); 
-- empno�ڷḦ �Է����� �ʰ� �����ϱ� 
insert into emp03( ename, job, deptno )  values ( '�̼���','�λ���',10);
-- ename �Է����� �ʰ� �����ϱ�
insert into emp03( empno, job, deptno) values( 1002, '���', 20);
-- �������� �����ϱ�
-- 1) empno���� ���� ����� ������ ������ �������� ������ ������ ��
insert into emp03 values(1001, '�ڹ���', '����', 10); -- ����
insert into emp03 values(null, '�ڹ���', '����', 10); -- ���� null �ߺ��ؼ� ���� �ȴ�. 
insert into emp03 values(1002, '�ֹ���', '����', 10); -- ���� 
-- 2) ename���� ���� �����
insert into emp03( ename, job, deptno )  values ( '�̼���','�λ���',10);
select * from emp03;

-- ���� ���Ǹ�(Constraint_name)�� ����ڰ� �����ϱ�
select * from user_constraints where table_name in ('EMP03');

create table emp03(
   empno number(4) 
        constraint emp03_empno_uk unique, -- constraint �������Ǹ� ��������, �������Ǹ��� ����� ��� : ���̺��_�÷���_�������Ǿ���
   ename varchar2(10) 
        constraint emp03_ename_uk unique,
   job varchar2(10) 
        constraint emp03_job_nn not null,
   deptno number(2) 
       constraint emp03_deptno_nn_uk not null unique
);

--  primary key �⺻Ű = not null + unique
drop table emp03;
create table emp03(
   empno number(4) 
        constraint emp03_empno_pk primary key,
   ename varchar2(10), 
   job varchar2(10), 
   deptno number(2) 
);
-- �Ǵ� 
create table emp03(
   empno number(4),
   ename varchar2(10), 
   job varchar2(10), 
   deptno number(2),
   constraint emp03_empno_pk primary key(empno)
);
-- �����Է� 2��

-- �����Է� 

-- foreign key �ܷ�Ű
drop table emp03;
-- ����� ���� �θ����̺� --> �ڽ����̺�
create table dept03(
   deptno number(4),
   dname varchar2(10),
   loc varchar2(10),
   constraint dept03_deptno_pk primary key(deptno)
); -- �θ� ���̺�
create table emp03(
   empno number(4),
   ename varchar2(20),
   deptno number(4) constraint emp03_deptpno_nn not null
                    constraint emp03_deptno_fk references dept03(deptno),
   constraint emp03_empno_pk primary key(empno)
);
-- �Ǵ� 
drop table emp03;
create table emp03(
   empno number(4),
   ename varchar2(20),
   deptno number(4) constraint emp03_deptpno_nn not null,
   foreign key( deptno ) references dept03(deptno)
); -- �ڽ� ���̺� 
-- ������ ��ųʸ��� ���ؼ� ���������� ������ ����
select * from user_constraints where  table_name in ('EMP03', 'DEPT03');
-- �Է��� �� �θ����̺� ���� �Է��ϰ� �ڽ� ���̺� �Է��ϱ�
insert into dept03 values( 10, '�渮��', '����');
insert into emp03 values( 1001, 'ȫ�浿', 30 ); -- ���� �߻� why? deptno�� 30�� �θ����̺� �����ϱ�
insert into emp03 values( 1001, 'ȫ�浿', 10 ); 

select * from emp03;
select * from dept03;

-- �θ����̺��� �����ϱ�
drop table dept03; -- ����  �ڽ����̺��� ����Ǿ� ���� ��� �θ����̺� ������ �� ����.

-- �ڽ� ���̺� ������ �θ����̺� �����ϱ�
drop table emp03;
drop table dept03;

-- check ���� ����
-- �ԷµǴ� ���� üũ�Ͽ� ������ �� �̿��� ���� ������ ����
create table emp03(
   empno number(4),
   salary number(10) check(salary between 500 and 5000), -- ���� ���Ǹ��� ������� �ʾ����Ƿ� SYS ~~ �⺻ �������Ǹ�  
   comm number(10) constraint emp03_comm_ck check( comm between 10 and 1000) 
);
select * from user_constraints where  table_name in ('EMP03');
-- �����Է�
insert into emp03 values( 1001, 800, 20);
-- �����Է�
insert into emp03 values( 1001, 8000, 50);
insert into emp03 values( 1001, 5000, 0);

-- ���� ����� 
-- ���� ����, ���� 

-- ����Ű 2���̻� �÷��� ���ļ� �⺻Ű�� ���� �� ��) �ڵ��� 4�ڸ� + �̸�

drop table emp03;
create table emp03(
   ephone number(4),
   ename varchar2(20),
   job varchar2(20),
   constraint emp03_ephone_ename_pk primary key(ephone, ename)
);
insert into emp03 values( 3334, 'ȫ�浿', '���');
insert into emp03 values( 3334, '�̱浿', '���');
insert into emp03 values( 3344, 'ȫ�浿', '���');
insert into emp03 values( 3334, 'ȫ�浿', '���'); -- ���� ����Ű�� �����߱⶧���� ������ ���ڵ� �Է� �ȵ�

-- ���� ���� �߰��ϱ�
drop table emp03;
create table emp03(
   empno number(4),
   ename varchar2(20),
   job varchar2(20),
   deptno number(4)
);
-- ���� ���� �߰��ϱ�
alter table emp03
  add constraint emp03_empno_pk primary key(empno);

select * from user_constraints where table_name in ('EMP03');
-- deptno�� �ܷ�Ű�� �����ϱ�
-- dept03 ���̺� �����
create table dept03(
   deptno number(4),
   dname varchar2(20),
   loc varchar2(20)
);
-- deptno primary key �������� �߰��ϱ�
alter table dept03
   add constraint dept03_deptno_pk primary key (deptno);
--emp03���̺��� �÷�deptno�� �ܷ�Ű�� �����ϱ�
alter table emp03
   add constraint emp03_deptno_fk foreign key(deptno) references dept03(deptno);
select * from dept03;

-- dname loc�� ����Ű�� �������� �߰��ϱ�
alter table dept03
   add constraint dept03_dname_loc_pk primary key( dname, loc );
   
-- dept03, emp03�����ϱ�
drop table emp03;
drop table dept03;
create table dept03(
   deptno number(4),
   dname varchar2(20),
   loc varchar2(20)
);
create table emp03(
   empno number(4),
   ename varchar2(20),
   job varchar2(20),
   deptno number(4)
);
-- dname  not null�� ���� ������ ���� ���� modify ~ �� �ֳĸ�? not null�� �������� ������ �ڵ����� null�� ��
alter table dept03
   modify dname constraint dept03_dname_nn not null;
-- ename  not null�� ���� ������ �����ϱ�
alter table emp03
  modify ename constraint emp03_ename_nn not null;
  
-- ���� ������ �����ϱ�
-- dept03.deptno�� �⺻Ű�� �������� �߰��ϱ�
alter table dept03
   add constraint dept03_deptno_pk primary key(deptno); -- �̹� primary key �־��???
-- dept03 ���� ���� ���� ����
select * from user_constraints where table_name in ('DEPT03');
-- emp03.empno�� �⺻Ű�� �������� �߰��ϱ�
alter table emp03
  add constraint emp03_empno_pk primary key(empno);
alter table dept03
  drop constraint dept03_dname_loc_pk; -- ���1) �������Ǹ����� �����ϱ� add constraint�� �߰��� �� �����ϱ� 
-- emp03 primaryŰ�� ���������� �����ϱ�
-- ���2) primary key ��� ������ �����ϱ�
alter table emp03
  drop primary key;
select * from user_constraints where table_name in ('EMP03','DEPT03');

-- primary key, forgien key, check�� ���������� �߰��ϱ� add constraint ~
-- primary key, forgien key, check�� ���������� �����ϱ� drop constraint ~, drop primary key 
-- not null ���� ������ �����ϱ� modify constraint  ~

-- cascade ����
-- �θ����̺��� �ڷḦ �����ϸ� �ڽĵ� ���� ������ �� �� �ְ� ���������� ����� �ִ� ��.
-- �θ����̺��� �ڷḦ �����ϸ� �ڽĵ� ���� �����Ƕ� 
drop table emp03;
drop table dept03;

create table dept03(
   deptno number(2),
   dname varchar2(10),
   loc varchar2(10),
   constraint dept03_deptno primary key(deptno)
);

create table emp03(
   empno number(4),
   ename varchar2(10)
   constraint emp03_ename_nn not null,
   job varchar2(10),
   deptno number(2),
   constraint emp03_empno_pk primary key(deptno),
   constraint emp03_job_uk unique(job),
   constraint emp03_deptno_fk foreign key(deptno) references dept03(deptno)
);


-- ���� ���� Ȯ���ϱ�
select * from user_constraints where table_name in ('EMP03', 'DEPT03');
-- �����͸� ������ �� ���� �θ��ڷ�->�ڽ��ڷ�
insert into emp03 values(1000, 'ȫ�浿','���', 50); -- ���� �߻� ��? �ܷ�Ű�����̱� ������ 
-- ���� ������ ���ִ� ��� 1) �θ��ڷ� �ְ� �ڽ� �ڷ� ������ �ȴ�. 2) ���������� �ӽ÷� ��Ȱ��ȭ(disable constraint)�ϱ�
alter table emp03
   disable constraint emp03_deptno_fk; -- ����� ���� 
-- ��Ȱ��ȭ�� ���������� �ٽ� Ȱ��ȭ�Ϸ���
alter table emp03
   enable constraint emp03_deptno_fk;
delete  from emp03;

-- cascade �ɼ�
alter table dept03
  disable primary key cascade;
  
alter table dept03
  enable primary key;
  
alter table emp03 
  enable constraint  emp03_deptno_fk;
  
select * from user_constraints where table_name in ('EMP03', 'DEPT03');

insert into emp03 values( 1000, 'ȫ�浿','���', 50);
