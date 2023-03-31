-- 7�� ���̺� ���� ����, ����, �����ϴ� DDL (Database Define Language)-������ ���Ǿ�
-- ��ǥ ���̺� ����� ���� ����
-- ��Ű�� ??
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

