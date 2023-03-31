select * from emp;
select empno, ename from emp;
select empno as �����ȣ, ename as ����� from emp;
select ename �����,sale �޿�, sale*12 ���� from emp; 
-- ������ ������ 12%�� ����.
select ename �����,sale �޿�, sale*12 ����, sale*12*0.12 ���� from emp; 
-- comm ���ʽ��� 20%�� �����Դϴ�.
select comm * 0.2 ���ʽ����� from emp;
-- �� ���޾� = ���� + ���ʽ� * 5 - ����*0.12 - ���ʽ� *0.2 
select sale + comm * 5 - sale*0.12 - comm * 0.2 �����޾� from emp;

select * from dept;
--  1009 ������ null 1005 98/10/10 700 0 10
insert into emp values( 1009,'������',null,1005,'98/10/10',700, 0,10);   
--  1010 ���ȯ null 1004 98/12/04 250 0 20
insert into emp values( 1010,'���ȯ',null,1004,'98/12/04',700, 0,20);

select * from emp;

select ename, comm, sale*12+comm, nvl(comm, 0), sale*12+nvl(comm, 0) from emp;

select job from emp;
-- nvl( �÷���, �÷��� null�̸� ó���� ��) 
select nvl(job, '������') from emp;
-- ������ ���� null ���ڹ����� 0 

select nvl(comm, 0), sale*12+nvl(comm, 0) "�����޾�" from emp;
-- select nvl(comm, 0), sale*12+nvl(comm, 0) '�����޾�' from emp; ������


-- ������
-- �޿��� 500�̻��� ��� ����ϱ�
select * from emp where sale >= 500;
-- �Ի����� 98�⵵ ������ ����� �����ȣ�� �̸� �Ի��� ����ϱ�
select  empno, ename, hiredate  from emp where hiredate >= '98/10/30';
-- �μ���ȣ�� 10�� ����� �̸��� �μ���ȣ�� ����ϼ���
select  ename, deptno from emp where deptno = 10;
select * from emp where deptno=30;
-- �μ���ȣ�� 10�̰ų� 30�̰� �Ի����� 2005�� ���� �Ի��� ��� ��ü �÷� ����ϱ�
select  * from emp where deptno = 10 or deptno = 30 and hiredate <= '05/01/01' ;
select * from emp where deptno in ( 10,30 ) and hiredate <= '05/01/01' ;
-- �Ŵ����� 1008�� ����� �̸��� �μ� �Ŵ��� ��ȣ ����ϱ�
select deptno, mgr from emp where mgr=1008;
-- empno�� ¦���� ����� �����ȣ�� �̸��� ����� ������
select empno, ename from emp where mod( empno, 2 ) = 0;
-- job�� ����̰ų� �븮�̰ų� ������ ����� �޿��� 300%�� ���ʽ��� �ְ� ����� �̸� ���� �޿� ���ʽ� ���ּ���
select ename, job,  sale, sale * 3 ���ʽ� from emp where job in ( '���','�븮','����');
-- �̸� �达�� ����� ����ϱ� 
select * from emp where ename in ( '����','��켺', '���ȯ');
select * from emp where ename like '��%'; -- % ��ü ����ϴ� ���� 
-- �̸� 2��° ���ڿ� '��'�� �ִ� ��� ã�� '_' �ѱ��ڸ� ����ϴ� ����
select * from emp where ename like '_��_';
-- job�� ������ ���ڿ� '��'���� ������ ��� ã��
select * from emp where job like '_��';
-- '��'�� �ƴ� ��� ����ϱ�
select * from emp where  not (  job like '_��' );
select * from emp where  not   job like '_��' ;
-- �Ի����� '03/01/01~06/12/31'���̿� �Ի��� ���
select * from emp where hiredate >= '03/01/01' and  hiredate <= '06/12/31';
select * from emp where  hiredate  between  '03/01/01'  and '06/12/31';
-- �޿��� 300~800������ ���
select * from emp where sale >= 300 and sale <= 800;
select * from emp where sale between 300 and 800;
-- �޿��� 300~800���̰� �ƴ� ���
select * from emp where  not   sale between 300 and 800;
select * from emp where not sale >= 300 and sale <= 800;
-- ���ʽ��� ���� ���
select * from emp where comm = 0;
-- �Ŵ����� ���� ���
select * from emp where mgr=0;
-- job�� ���� ���
select * from emp where job = null; -- ����� �ȵ�
select * from emp where job is null;
-- job�� �ִ� ���
select * from emp where job != null; -- ����� �ȵ�
select * from emp where not job is null; -- null �� �� �̰� �ݴ�� �ٽ� �̱�
select * from emp where  job  is not null; -- ȿ������ ����. null�ƴ� �� �̱�

select * from emp;
-- �޿��� ���� �޴� ��� ������� ����ϰ� �ʹ�.
select * from emp order by sale desc;
-- �μ���ȣ�� 20, 30�� ����� �޿������� ����ϱ�
select * from emp where deptno in ( 20, 30 ) order by sale desc;
-- ������ ����,������ ����� �Ի��� ������ ����ϱ�
select * from emp where job in ('����','����') order by hiredate asc;
-- �μ���ȣ�� 20, 30�� ����� �޿�����, ���ʽ��������� ����ϱ� order by ó����������,  �ι�°�������� 
select * from emp where deptno in ( 20, 30 ) order by sale desc,  comm desc ;
-- �μ���ȣ�� 20, 30�� ����� �μ���, �����ȣ�� ����ϱ�
select * from emp where deptno in (20,30) order by deptno asc, empno asc;
-- job������ �����ϱ�
select * from emp order by job asc; -- �������� �����ϸ� null�� ���� �������� ���´�.
select * from emp order by job desc; -- �������� �����ϸ� null�� ���� ó���� ���´�.

-- select������ ���ο� ���̺� �����
-- ���� create table ���̺�� as select�� 

select * from dept;

-- ���ο� ���̺��� ����µ� as ~�ν� select * from dept ���̺��� ��°���� �����ϰ� ����� 
create table cdept as select * from dept;
create table cemp as select empno, ename, deptno from emp;
select * from cemp;
create table ccemp as select empno, ename, deptno from emp where deptno = 20;
select * from ccemp;

-- �̸� '��''��'���� ����� empno, ename, deptno �÷��� c2emp ���̺�� �����
create table c2emp as select empno, ename, deptno from emp where ename  like '��%' or ename like '��%';
select * from c2emp;


-- ����Ŭ �ֿ� �Լ� 
select round(85/3) from dual;
select * from dual;
select abs(-90) ���밪, trunc(34.5678, 2), mod( 90, 8)   from dual;
-- ���� ó�� �Լ�
select 'Welcome to Oracle', upper( 'Welcome to Oracle'), lower('Welcome to Oracle'), initCap('WELCOME TO ORACLE')
  from dual;

select length('ȫ�浿') from dual;  -- ������ ���� ���
select lengthb('ȫ�浿') from dual;   -- 'ȫ' - 3����Ʈ ������ ����Ʈ�� ���

select substr( 'Welcome To Oracle', 4, 3) from dual;
-- TO cem
select  substr( 'Welcome To Oracle', 9, 1) || substr( 'Welcome To Oracle', 12, 1) ||
               substr( 'Welcome To Oracle', 8, 1)|| substr( 'Welcome To Oracle', 4, 1)||
               substr( 'Welcome To Oracle', 7, 1)|| substr( 'Welcome To Oracle', 6, 1)
         from dual;

select * from student;
-- �������л��� �̸��Ͽ��� @�� ����ϱ�
-- �������� �̸����� ����ϱ� 
select stu_email from student where stu_name='������'; 
-- ���� select���� Ȱ���ؼ� @�� ����
select    substr( stu_email, 5, 1 )     from student where stu_name='������'; 
-- �л����̵𿡼� 2��° 3��° ���ڸ� �̱� ��� ���ڵ� ��� 01 02 ... 16 
select substr(stu_id, 2, 2) as "�Ϸù�ȣ" from student;

-- instr
select instr('�����ͺ��̽�', '��') from dual;
select instr('�л����̵� �л����̵�', '��', 1, 2) from dual;
select instr('���±��ڴ� ��� ������? 0�� ���´�.','��') from dual;
select * from student;

-- stu_id�� 116�� �ֳ�? 
select instr(stu_id, 116), stu_id  from student; 

select lpad('ȫ�浿', 20, '#') from dual;
select rpad('ȫ�浿', 20, '#') from dual;

select sysdate, to_char( sysdate, 'YYYY/MM/DD AM HH:MI:SS')  from dual;
select to_char(123000, 'L99,999') from dual; -- #######��µ� ��? 9�� ������ 5���̰� ���� �ڷ��� 6�� 
select to_char(123000, 'L999,999') from dual;
select to_char(123000, 'L9,999,999') from dual; -- w123,000  9�� �ڷᰡ ������ �ڷ� ǥ�� �ȵ����� �������� ǥ��
select to_char(12, 'L99,999') from dual;
select to_char(123000, 'L000,000') from dual;
select to_char(123000, 'L0,000,000') from dual; -- w0,123,000  0�� �ڷᰡ ������ �ڷ� ǥ�� �ȵ����� 0���� ǥ��
select to_char(12.3456, 'L00,000.00') from dual; -- w00,012.35 
select to_char(12.3456, 'L00,000.000000') from dual;

select * from emp;

insert into emp 
    values(1011, '�ڼ���', null, 1003, to_date(230329, 'YY/MM/DD' ) , 850, 0, 10);

-- �Ʒ��� ���� �����͸� �����ϱ�    
1012, '������', null, 1005, '220515', 740, 0, 10

insert into emp 
    values( 1012, '������', null, 1005, to_date('220515', 'yy/mm/dd') , 740, 0, 10 );

-- 2007�� 4�� 2�Ͽ� �Ի��� ��� �˻��ϱ�
select * from emp where hiredate = '07/04/02';
-- �Ի����� 4������ ����� �˻��ϱ�
select * from emp where to_char( hiredate, 'MM')='04';
-- �Ի��� �⵵�� 07���� ����� �˻��ϱ�
select * from emp where to_char( hiredate, 'YY')='07';
-- MGR�� ���ڸ� 1013 --> ��¥ ó�� �ٲٱ� 10/13
select mgr,  to_date( mgr, 'mm/dd') from emp where mgr != 0;
-- �Ի��� ��¥--> ���ڷ� ���弼�� 
-- select to_number('070310', '999999')+5000 from dual; 
-- ��¥ --> ���� --> ���� 
select to_number( to_char( hiredate,'yyyymmdd'), '99999999' ) from emp;
-- 1�ܰ� ��¥->����
select  to_char( hiredate,'yyyymmdd') from emp; 
-- ���ڴ� ���ʿ��� ���������� ���ϴ�. �׷��� ���� ������ ��ó�� ����
-- 2�ܰ� ����-> ����
select to_number( to_char( hiredate,'yyyymmdd'), '99999999' ) from emp; 
-- ���ڴ� �����ʿ��� �������� ���ϴ�. �׷��� ������ ������ ��ó�� ����
-- ��¥�Լ�
-- ���� ��¥ 
select sysdate from dual;
--���� ���ڸ� �������� ������ ���� ��¥ ����ϱ�
select to_char( sysdate -1, 'yyyy/mm/dd') ����,
       to_char( sysdate, 'yyyy/mm/dd') ����,
       to_char( sysdate + 1, 'yyyy/mm/dd') 
       from dual;
-- ��������  ������  ���� �ݳ��� 14�� ����
select to_char(sysdate, 'yyyy/mm/dd') ������,
       to_char(sysdate + 14, 'yyyy/mm/dd') �ݳ���
       from dual;
-- Round
select round( to_date('2023/06/16', 'yyyy/mm/dd'), 'MM') from dual;
-- �Ի����� ���� ù���� �����ϱ�
select to_char( hiredate, 'yyyy/mm/dd') �Ի���,
       to_char( trunc(hiredate, 'MONTH'), 'yyyy/mm/dd') ���ް����,  -- Ư���� ��¥�� ���� �������� ������
       to_char( trunc(hiredate, 'YEAR'), 'yyyy') �Ի��ѳ⵵
       from emp;
-- �γ�¥ ������ ������ ���ϴ� Months_between �Լ�
-- ���� Months_between(date1, date2) ;
-- 2023/12/31 2023/03/30 ��� ���� ����?
select trunc( months_between( '2023/12/31', sysdate ) ) 
       from dual;
-- ���ó�¥ - �Ի��� = ���
select ename,trunc( months_between( sysdate, hiredate ) ) �ٹ�������
       from emp;
-- �Ի��Ͽ��� 5���� ��¥���
select hiredate �Ի��� , add_months( hiredate, 60 ) as "5����"
       from emp;       
-- �ش������ ���� ����� ��¥�� ��ȯ�ϴ� next_day�Լ�
-- next_day(��¥, ����);
-- �̹��� �Ͽ��� ��¥?
select next_day( sysdate, 1 ) from dual;
-- �̹��� ������ ��¥��?
select last_day( sysdate ) from dual;
-- �Ի����� ������ ��¥��?
select last_day( hiredate) from emp;
-- NVL �Լ� 
-- ������ ��� �Է��� ���ϸ� null���� ������ ��� �Է��� ���Ͽ� null�� ��¥�� ��� �Է��� ���ϸ� null���� ��
--  nvl( �÷���, �⺻��) �÷��� ���� ������ �÷����� ��� null�̸� �⺻�� ���
-- �����ϱ� �Ի����� 0�� ��� �����ϱ�
select * from emp;
insert into emp( empno, ename, mgr, sale, deptno )
            values( 1013, '������', 1005, 400, 10) ; 
-- �����ϱ� 1003�� comm�� 0���� sale-100 �����ϱ�
update emp set comm = 0 where empno=1003;
update emp set sale=sale-100  where empno=1003;
-- job null�� ��� �������
select job, nvl( job, '�������') from emp;
-- update���� �̿��ؼ� job null�� ��� ��������̶�� �����ϱ�
update emp set job = nvl( job, '����'); 
select * from emp;
-- �Ի����� null���� ���� ��¥�� ������Ʈ ��Ű����.
update emp set hiredate = nvl( hiredate, sysdate );
-- comm null�� ��� 50���� �⺻���� ������Ʈ ��Ű����
update emp set comm = nvl( comm, 50);

create table  c3emp as select * from emp;

-- NULLIF�Լ��� ��ǥ������ ���Ͽ� ������ ��쿡�� NULL�� ��ȯ�ϰ�, �ƴϸ� ù��° ǥ������ ��ȯ�մϴ�.
select nullif( 'a','a' ) from dual; -- 'a','a' �����ϹǷ� null��ȯ
select nullif( 'a','b' ) from dual;

-- coalesce( comm, sale, 0) �Լ�
-- 1) ���  0 300 -> 0  2) 100 null -> 100 3) null 400 -> 400 4) null null -> 0
select ename, sale, comm, coalesce( comm, sale, 0) from emp;
insert into emp( empno, ename, mgr, sale, deptno )
            values( 1014, '�����', 1005, 400, 10) ;
insert into emp( empno, ename, mgr, sale, deptno )
            values( 1015, '�ڼ���', 1005, 600, 10) ;    
insert into emp( empno, ename, mgr, comm, deptno )
            values( 1016, '������', 1005, 100, 10) ;  
insert into emp( empno, ename, mgr, deptno )
            values( 1017, 'ȫ����', 1005, 10) ;             
select * from emp;

-- DECODE�Լ� switch~case�� ����Ŭ������ ����ϴ� �Լ� 
-- ���� decode( ǥ����, ���ǽ�1,  ���1,
--                     ���ǽ�2, ���2,
--                     ���ǽ�3, ���3,
--                      �⺻��� ); 
select ename, deptno, decode( deptno, 10, '�渮��', 20,'�λ��', 30,'������', 40, '�����', '�̹�ġ') �μ���
       from emp order by deptno asc;
select * from dept;
-- loc ����-�Ե�Ÿ�� ��õ-���̵� ����-�������� ����-������   �÷����� ������
select loc, decode( loc, '����', '�Ե�Ÿ��', '��õ','���̵�', '����','��������','����','������') ������ from dept;
-- dept�� �������� �÷� �߰� �÷����� tourism �ڷ����� varchar2(20)���� �ϼ���
alter table dept add tourism varchar2(20);
-- �׸��� ������Ʈ ��Ű����.
update dept set tourism = decode( loc, '����', '�Ե�Ÿ��', '��õ','���̵�', '����','��������','����','������'); 
     
-- CASE�Լ�
-- ����
--  case when ���ǽ�1 then ���1
--       when ���ǽ�2 then ���2
--       else ���� ������ ��� �ƴ� ��� ó���� ���n
--  end    
select * from student;
--1) ���� �ڵ�(cou_id)�� 10�̸� '�ڹ�'���� 20�̸� '�ڹٽ�ũ��Ʈ'���� 30�̸� '�����ͺ��̽�'���� 40�̸� '������'���� �ܴ̿� '�⺻'����
select distinct cou_id,
    case when cou_id=10 then '�ڹ�'
        when cou_id=20 then '�ڹٽ�ũ��Ʈ'
        when cou_id=30 then '�����ͺ��̽�'
        when cou_id=40 then '������'
        else '�⺻'
    end ������
from student order by cou_id;

--2) �̸��� '��'���̰� ���̰� 25�� �̻��� ����� 'A���ǽǷ� ������' '��'���̰� ���̰� 25�� �����̸� 'B���ǽǷ� ������'
--  �ٸ� �е��� '���� ���ŵ� �˴ϴ�'
select stu_name,
    case when (stu_name like '��%' and age >= 25) then 'A���ǽǷ� ������'
        when (stu_name like '��%' and age <= 25) then 'B���ǽǷ� ������'
        else '���� ���ŵ� �˴ϴ�'
    end ���ǽ�
from student;
--3) ����(sex)�� ����(M)�̸� '����ȭ����� 1��' ����('F')�̸� '����ȭ����� 2,3��'�� ����ϱ�
select distinct sex,
    case when (sex = 'M') then '����ȭ����� 1��'
         when (sex = 'F') then '����ȭ����� 2,3��'
    end ȭ���
from student;

-----------------------------------
-- �׷��Լ�

select * from emp; -- 17�� 
select count(comm) from emp; -- 14 null�� �� ���� �ʴ´�.
select count(*) from emp; -- 17 �ο츦 ����
-- �޿� �հ�, ���, �ִ밪, �ּҰ�, ǥ������, �л� ���ϱ�
select sum(sale), avg(sale), max(sale), min(sale), stddev(sale), variance(sale) from emp;
select sum(sale), avg(sale), max(sale), min(sale), stddev(sale), variance(sale) from emp;
-- ���� �׷��Լ��� �Ϲ� �÷� ���� ���� �ȵ�  select ename-17���� �̸�, sum(sale)-1�� �հ谪 from emp; ���� �߻�

-- ���� ������ ������? ���, �븮, ����, ����, ����, ����, ���� �� 7��
select count( distinct job ) from emp;
-- ��� �޿�(561)���� ���� �޴� �����  �̸�, �޿��� ����Ͻÿ�
select ename, sale from emp where sale >= 561;
-- ��� �޿� ���ϱ� 
select round( avg(sale) ) from emp;
-- 
select ename, sale from emp where sale >= ( select round( avg(sale) ) from emp ) ;

select * from student;
-- ��� ���̺��� ���� ����� stu_id, stu_name, age ����� �ּ���.
-- 1�ܰ� ��� ���̸� ���� ���Ѵ�.
select round( avg( age ) )  from student;
-- 2�ܰ� 1�ܰ� ��� ���̸� ���ǹ����� ����Ѵ�.
select stu_id, stu_name, age from student where age < 26;
-- 3�ܰ� 1�ܰ� + 2�ܰ� ��ģ��
select stu_id, stu_name, age from student where age < ( select round( avg( age ) )  from student );

select * from emp;
-- ������� ��ü �޿�����?
select sum(sale) from emp;
-- �׷캰�� ���� ���ϱ� 
-- �μ��� �޿��� �հ��? 
select deptno from emp group by deptno order by deptno asc;
select deptno �μ���ȣ, sum(sale) �μ����޿��� from emp group by deptno;
-- �г⺰ �����? 
select * from student;
-- �ڽ�(cou_id)���� ������ ���, �ִ� ���̸� ���ϱ�
select cou_id, trunc(avg(age)), max(age) from student group by cou_id order by cou_id asc;

select * from emp order by deptno;
-- �Ŵ���(MGR) ���� �����ϴ� �ο�����?
select mgr, count( empno ) from emp group by mgr order by mgr asc;
-- job �������� �޿��� ��հ� ���ʽ� ����� ���ϼ���.
select job, avg(sale), avg(comm) from emp group by job order by job asc;
-- ù��° �׷� - �μ��� �ι�° �׷�-������ 
select deptno, job, avg(sale) from emp group by deptno, job  order by deptno asc;
-- �μ��� �޿� ����� 600�̻��� �μ��� ����ϼ���
select deptno, avg(sale) from emp group by deptno having avg(sale) >= 600 ;

-- ����� �����ϰ� �޿� �Ѿ��� 800�̻��� ���޺� �޿� �Ѿ� ���ϱ�
-- ����� �����ϰ� �޿� �Ѿ��� 800�̻�(����)�� ���޺�-�׷� �޿� �Ѿ� ���ϱ�
select job, sum(sale) from emp where job != '���' group by job having sum(sale) > 800 order by job asc;
--���� ����   5               1           2                  3                4            6
select * from emp where job != '���';

-- 1) ��� ����� �޿��ְ��, ������, �Ѿ� �� ��� �޿��� ����Ͻÿ�.   ��տ� ���ؼ��� ������ �ݿø��Ͻÿ�
select max(sale), min(sale), sum(sale), round( avg(sale) ) from emp;
-- 2) �� ��� ���� �������� �޿� �ְ��, ������, �Ѿ� �� ��վ��� ����Ͻÿ�. 
select job, max(sale), min(sale), sum(sale), round( avg(sale) ) from emp group by job;
-- 3) count(*)�Լ��� �̿��Ͽ� ��� ������ ������� ����Ͻÿ�
select job, count(job) from emp where job is not null group by job;
-- 4) ���� ���� �����Ͻÿ�
select job, count(job) from emp group by job having  job='����';
-- select job, count(job)  from emp where job='����';�ȵ�
-- 5) �޿� �ְ��, �޿� �������� ������ ����Ͻÿ�.
select  max(sale), min(sale), max( sale) - min( sale ) ���� from emp;
-- 6) ���޺� ���� �޿��� ����Ͻÿ�. 
--    ���� �޿��� 500�̸��� �׷��� ���ܽ�Ű��, ����� �޿��� ���� ������������ �����Ͽ� ����Ͻÿ�
select job, min(sale) from emp group by job having  not ( min(sale) < 500 ) order by min(sale) desc;
-- 7) �� �μ��� ���� �μ���ȣ, �����, �μ����� ��� ��� ��� �޿��� ����Ͻÿ�. ��� �޿��� �Ҽ��� ��°�ڸ��� �ݿø��Ͻÿ�
select deptno, count( deptno),round( avg(sale), 2)   from emp group by deptno order by deptno;
-- 8) �� �μ��� ���� �μ���ȣ, �μ��̸�, ������, �����, �μ� ���� ��� ����� ��� �޿��� ����Ͻÿ�. ��� �޿��� ������ �Ҽ��� ��° �ڸ��� �ݿø��Ͻÿ�. 
select * from dept;  10 �渮�� ���� 2 600
select deptno �μ��ڵ�, 
       decode( deptno, 10,'�渮��', 20,'�λ��', 30,'������', 40, '�����' ) �μ���,
       decode( deptno, 10,'����', 20,'��õ', 30,'����', 40, '����' ) ������,
       count( deptno ) �μ��ο���,
       round( avg(sale), 2 ) ��ձ޿�
       from emp
       group by deptno
       order by deptno asc;
       

