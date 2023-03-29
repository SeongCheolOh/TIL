/* ������ ��ȸ*/
select * from emp;
/* Ư�� �����͸� ��ȸ*/
select  empno, ename from emp;
/* as�� �÷��� ��Ī �ο��ϱ�*/
select empno as �����ȣ, ename as ����� from emp;
/* �÷��� �ٲٱ� */
alter table emp rename column sal to sale;
/* as�� ���� ���� */
select empno �����ȣ, sale �޿�, sale*12  ���� from emp;
-- ������ ������ 12%�� å���ȴ�
select ename �����,sale �޿�, sale*12 ����, sale*12*0.12 ���� from emp;
-- comm ���ʽ��� 20%�� �����Դϴ�.
select comm*0.2 ���ʽ����� from emp;
--�� ���޾��� ����+���ʽ�*5-����*0.12-���ʽ�*0.2
select sale+comm*5-sale*0.12-comm*0.2 �����޾� from emp;

--������ ��ȸ
select * from dept;

-- ������ ����
-- 1009 ������ null 1005 98/10/10 700 0 null
insert into emp values(1009, '������' ,null,1005,'98/10/10',700,0,10);
-- 1010 ���ȯ null 1004 98/12/04 250 0 null
insert into emp values(1010,'���ȯ',null,1004,'98/12/04',700,0,20);

select *from emp;

select ename, comm, sale*12+comm, nvl(comm, 0), sale*12+nvl(comm,0) from emp;

-- ���ϴ� �÷��� ��ȸ
select job from emp;
-- nvl ( �÷���, �÷��� null�̸� ó���� ��)
select nvl(job, '������') from emp;
-- ������ ���� null ���ڹ����� 0
select nvl(comm, 0), sale*12+nvl(comm, 0) "�����޾�" from emp;
--select nvl(comm, 0), sale*12+nvl(comm, 0) '�����޾�' from emp; ������ 

-- " || (Concatenation) "�����ڸ� ���� �������� �÷��� ���ڿ��� ���� ����
select ename  || '�� �Ի��Ͻ� ���� ȯ���մϴ�' from emp;
select ename || '�� ' || sale || '������ �� ������ �����մϴ�' from emp;

--" distinct "�� ���� �ߺ���� ����
--ȸ���� �μ� ��ȣ(deptno)�� ���(�ߺ� ����)
select distinct deptno from emp;
--ȸ�翡�� ����(job)�� ������ ���(�ߺ� ����)
select distinct job from emp;

--null�� '�̹���' ����ϱ�
select distinct nvl(job, '�̹���') from emp;

--where�� �̿��Ͽ� ���ǹ� �����
--(select ���) where (�÷���) (������);
--�޿��� 500�̻��� ��� ���
select * from emp where sale>500;
--�Ի��� 00�⵵ ���ĸ� ���
select *from emp where hiredate>='00/01/01';
--�μ���ȣ�� 10�� ����� �̸��� �μ���ȣ�� ���
select ename, deptno from emp where deptno=10;
--�μ���ȣ�� 10�̰ų� 30�̰�, �Ի����� 05�� ������ ���
select * from emp where deptno= 10 or  deptno=30 and hiredate<'05/01/01';
select * from emp where deptno in (10,30) and hiredate<'05/01/01';  /*�Ȱ���*/
--�Ŵ����� 1008�� ����� �̸��� �μ� �Ŵ�����ȣ ����ϱ�
select ename �̸�, deptno �μ���ȣ, mgr �Ŵ��� from emp where mgr=1008;
--empno�� ¦���� ����� �����ȣ�� �̸� ���
select empno �����ȣ, ename �̸� from emp where mod(empno,2)=0; /* mod = ������ ����ϴ� �Լ� */
--job�� ���, �븮, ������ ����� �޿��� 300%�� ���ʽ��� �ְ�, ����� �̸� ���� �޿� ���ʽ�
select ename �̸�,  job ����, sale �޿�, sale*3 ���ʽ� from emp where job in('���', '�븮', '����');
--���� '��'���� ����� ���
select * from emp where ename like '��%';

insert into emp values(1011,'�ķ���','�̻���',null,null,null,null,null);
/* [%] >> ���� �������� �ƹ����Գ� �پ ������� */
select * from emp where ename like '%��%';
/* [ _ ] >> ���� �������� [ _ ] ������ŭ ���ڿ� ���� ���� */
--2��° ���ڿ� '��'�� �ִ� ��� ���
select *from emp where ename like '_��_';
--������ ����� ��� ���
select *from emp where job like '%��';
select * from emp where job like '%��%';
select *from emp where job like '_��';
select * from emp where job like '_��_';
--������ ����� �ƴ� ��� ���
select * from emp where job not like '%��';
--�Ի����� 03�⵵~06�⵵ ������ ��� ���
select * from emp where '03/01/01'<=hiredate and hiredate<'07/01/01';
select * from emp where hiredate between '03/01/01' and '06/12/31';
--�޿��� 300~800�� ���, �ƴѻ�� ���
select * from emp where sale between 300 and 800;
--���ʽ��� ���� ���
select * from emp where comm =0 or comm is null;
--�Ŵ����� ���� ���
select * from emp where mgr=0 or mgr is null;
--�Ŵ����� null�� �ƴ� ���
select * from emp where not mgr is null; /*null�� �˻� �� �ƴ� �����͸� �˻�>> ��� �����͸� �ѹ��� �˻��Ѵ� */
select * from emp where mgr is not null; /* ���ʿ� null�� �ƴ� �����͸� �˻��Ѵ� >> ȿ���� �� ���� */

-- �������� ��������
--(���) where ������  [ order by ] �÷��� ASC(��������) or DESC(��������)
--�޿� ��������
select * from emp order by sale desc;
--�μ���ȣ 20, 30�� ����� �޿� �������� ���
select * from emp where deptno in(20,30) order by sale desc;
--������ ����, ������ ����� �Ի��� ��������
select * from emp where job in('����', '����') order by hiredate asc;
--�μ���ȣ�� 20, 30�� ����� �޿� ��������, ���ʽ� ������������ ���
select * from emp where deptno in(20,30) order by sale desc, comm asc;
--�μ���ȣ�� 20, 30�� ����� �޿� ��������, �����ȣ ��������
select * from emp where deptno in(20, 30) order by sale desc, empno asc;

select *from emp;

--���ο� ���̺� as ~�ν� select * from dept ���̺��� ��°���� �����ϰ� �����
create table cdept as select * from dept;
create table cemp as select empno, ename, deptno from emp;
create table ccemp as select empno, ename, deptno from emp where deptno=20;
select *from ccemp
--�̸��� '��', '��'���� ����� empno, ename, deptno ���
select empno, ename, deptno from emp where ename like '��%' or ename like '��%';
 --�̸��� '��', '��'���� ����� empno, ename, deptno  �÷��� c2emp ���̺�� �����
 create table c2emp as select empno, ename, deptno from emp where ename like '��%' or ename like '��%';
 select * from c2emp
 
 --������
 select * from ccemp
 union all
 select *from c2emp;
 -- �ߺ���� ���� �� ��
 select * from ccemp
 union
 select * from c2emp;
 --������
 select * from ccemp intersect select * from c2emp;
 --������
 select * from ccemp minus select * from c2emp;
 
 use dba;
 --����� ����� ��й�ȣ 1234
