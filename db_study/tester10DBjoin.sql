-- �μ� ���̺� �����ϱ�
CREATE TABLE DEPT(
DEPTNO NUMBER(2) CONSTRAINT PK_DEPT PRIMARY KEY,
DNAME VARCHAR2(14),
LOC VARCHAR2(13) ) ;

-- ��� ���̺� �����ϱ�
CREATE TABLE EMP( 
EMPNO NUMBER(4) CONSTRAINT PK_EMP PRIMARY KEY,
ENAME VARCHAR2(10),
JOB VARCHAR2(9),
MGR NUMBER(4),
HIREDATE DATE,
SAL NUMBER(7,2),
COMM NUMBER(7,2),
DEPTNO NUMBER(2) CONSTRAINT FK_DEPTNO REFERENCES DEPT);
?
-- �޿� ���̺� �����ϱ�
CREATE TABLE SALGRADE(
GRADE NUMBER,
LOSAL NUMBER,
HISAL NUMBER );
?
-- ��� ���̺� ���� ������ �߰��ϱ�
INSERT INTO DEPT VALUES(10, '�渮��', '����');
INSERT INTO DEPT VALUES(20, '�λ��', '��õ');
INSERT INTO DEPT VALUES(30, '������', '����'); 
INSERT INTO DEPT VALUES(40, '�����', '����');

-- �μ� ���̺� ���� ������ �߰��ϱ�
INSERT INTO EMP VALUES(1001, '����', '���', 1013, to_date('2007-03-01','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1002, '�ѿ���', '�븮', 1005, to_date('2007-04-02','yyyy-mm-dd'), 250, 80, 30);
INSERT INTO EMP VALUES(1003, '����ȣ', '����', 1005, to_date('2005-02-10','yyyy-mm-dd'), 500, 100, 30);
INSERT INTO EMP VALUES(1004, '�̺���', '����', 1008, to_date('2003-09-02','yyyy-mm-dd'), 600, NULL, 20);
INSERT INTO EMP VALUES(1005, '�ŵ���', '����', 1005, to_date('2005-04-07','yyyy-mm-dd'), 450, 200, 30);
INSERT INTO EMP VALUES(1006, '�嵿��', '����', 1008, to_date('2003-10-09','yyyy-mm-dd'), 480, NULL, 30);
INSERT INTO EMP VALUES(1007, '�̹���', '����', 1008, to_date('2004-01-08','yyyy-mm-dd'), 520, NULL, 10);
INSERT INTO EMP VALUES(1008, '���켺', '����', 1003, to_date('2004-03-08','yyyy-mm-dd'), 500, 0, 30);
INSERT INTO EMP VALUES(1009, '�ȼ���', '����', NULL, to_date('1996-10-04','yyyy-mm-dd'),1000, NULL, 20);
INSERT INTO EMP VALUES(1010, '�̺���', '����', 1003, to_date('2005-04-07','yyyy-mm-dd'), 500, NULL, 10);
INSERT INTO EMP VALUES(1011, '�����', '���', 1007, to_date('2007-03-01','yyyy-mm-dd'), 280, NULL, 30);
INSERT INTO EMP VALUES(1012, '������', '���', 1006, to_date('2007-08-09','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1013, '������', '����', 1003, to_date('2002-10-09','yyyy-mm-dd'), 560, NULL, 20);
INSERT INTO EMP VALUES(1014, '���μ�', '���', 1006, to_date('2007-11-09','yyyy-mm-dd'), 250, NULL, 10);

-- �޿� ���̺� ���� ������ �߰��ϱ�
INSERT INTO SALGRADE VALUES (1, 700,1200);
INSERT INTO SALGRADE VALUES (2, 1201,1400);
INSERT INTO SALGRADE VALUES (3, 1401,2000);
INSERT INTO SALGRADE VALUES (4, 2001,3000);
INSERT INTO SALGRADE VALUES (5, 3001,9999);

COMMIT;
?
select * from dept;
select * from emp;
select * from salgrade;
--2. �渮�ο��� �ٹ��ϴ� ����� �̸��� �Ի����� ����ϱ� 
select e.ename �����, e.hiredate �Ի���, d.dname �μ���
    from emp e, dept d
    where e.deptno= d.deptno and d.dname = '�渮��';
--3. ANSI JOIN�� ����Ͽ� ��õ���� �ٹ��ϴ� ����̸��� �޿��� ����ϱ�
select e.ename �����, e.sal �޿�, d.loc �ٹ��� from 
    emp e left outer join dept d
    on e.deptno = d.deptno and d.loc = '��õ' and d.loc is not null;
--4. ��� ���̺�� �μ� ���̺��� �����Ͽ� ����̸��� �μ���ȣ, �μ����� ����Ͻÿ�
 select e.ename �����, e.deptno �μ���ȣ, d.dname �μ���
    from emp e, dept d
    where e.deptno = d.deptno
    order by d.deptno asc;
--5. �渮�� �μ� �Ҽ� ����� �̸��� �Ի����� ����Ͻÿ�
select e.ename �����, e.hiredate �Ի���, d.dname �μ���
    from emp e, dept d
    where e.deptno= d.deptno and d.dname = '�渮��';
--6. ������ ������ ����� �̸�, �μ����� ����Ͻÿ�
select e.ename �����, d.dname �μ���, e.job ����
    from emp e, dept d
    where e.deptno = d.deptno and e.job = '����';
--7. ���ӻ���� ���켺�� ������� �̸��� ������ ����Ͻÿ�
select * from dept;
select * from emp;
select * from salgrade;
select e2.ename ���ӻ��, e1.ename �����, e1.job ����
    from emp e1, emp e2
    where e1.empno = e2.mgr and e2.ename = '���켺';
--8. ���켺�� ������ �ٹ������� �ٹ��ϴ� ����� �̸��� ����Ͻÿ�
--1) ���켺���� �ٹ��� �̾Ƴ���
select d.loc �ٹ���
from emp e, dept d
where e.deptno = d.deptno and e.ename = '���켺';
--2) 
select e.ename �ٹ���, d.loc �ٹ���, d.deptno �μ���ȣ
    from emp e, dept d
    where e.deptno= d.deptno and d.loc =
        (select d.loc �ٹ���
            from emp e, dept d
            where e.deptno = d.deptno and e.ename = '���켺') and
            e.ename != '���켺';
            
--11�� ��������
select dname from dept
where deptno = (select deptno from emp where ename = '�̹���');
--��ձ޿����� �� ���� ��� ���
--1) ��ձ޿�
select avg(sal) from emp;
--2)
select ename, sal from emp 
    where sal>=(select avg(sal) from emp);
--�޿��� 500�� �ʰ��ϴ� ����� ���� �μ��� �ٹ��ϴ� ��� ���ϱ�
--1)�޿��� 500 �ʰ��ϴ� ���
select ename, deptno from emp where sal > 500;
--2) �ش� �μ� ����� �˻�
select ename, deptno from emp where deptno in (10,20);
select ename, deptno from emp
    where deptno in (select deptno from emp where sal > 500);
--30�� �μ��� �ִ�޿����� ���� �޿��� �޴� ��� ���
--1) 30���μ��� �ִ� �޿�
select max( sal) from emp where deptno = 30; -- 500
select sal from emp where deptno = 30; -- 250 500 450 480 500 280
--2)
select * from emp where sal > (select max(sal) from emp where deptno = 30);
select * from emp where sal > all (select sal from emp where deptno = 30);
select * from emp where sal > any (select sal from emp where deptno = 30);
select * from emp where sal > some (select sal from emp where deptno = 30);
select * from emp where exists (select * from emp where deptno = 100);
--���̺� ����
create table emp02 as select * from emp where deptno in (10, 20);
select * from emp02;
--���̺� ������ ����( ��, ���������� ��������� �ʴ´� )
create table emp03 as select * from emp where deptno in (10000);
select * from emp03;
--emp ���̺��� �������� ����
select * from user_constraints where table_name in ('EMP');
--emp03 ���̺��� �������� ����
select * from user_constraints where table_name in ('EMP03');

--update���� ��������
--ex) deptno=20�� �������� deptno=40�� ���������� �����Ͻÿ�
select * from dept; -- 20=��õ / 40 = ����
update dept set loc = (select loc from dept where deptno = 40) where deptno = 20;
--
use tester1DB;
select * from emp;
--ex)�嵿���� �޿�(480)�� ����� �� ���� ���� �޿�(600)�� �����ϱ�
update emp set sal=(select max(sal) from emp where job='����') where ename='�嵿��';
--ex) �������� �ٹ��ϴ� ���� �� ���� ���� �Ի��� ����� �̸��� �Ի�����?
--1) ������ �ٹ��ϴ� ������ ���
select * from emp e, dept d where e.deptno = d.deptno and d.loc = '����';
--2) ���� ���� �Ի��� ���
select ename, hiredate from emp 
    where hiredate = (select min(e.hiredate) from emp e, dept d where e.deptno = d.deptno and d.loc = '����');
--ex) ���� ��� ����߿� �Ի��� ���� ������ ��� ���� ( ��, ������� ���� )
delete from emp 
where ename = (select ename from emp
                                    where hiredate = (select min(e.hiredate) from emp e, dept d
                                                                        where e.deptno = d.deptno and d.loc = '����' and e.job !='����'));
--cafe - �����ͺ��̽� - �Խù� ��ȣ 1412 ��������
select * from emp;
select * from dept;
--1.�����ο��� �ٹ��ϴ� ��� ����� �̸��� �޿��� ����϶�.
select ename, sal from emp where deptno in(
    select deptno from dept where  dname = '������');
-- 2. emp06�� emp���̺��� ��� �����͸� �߰��մϴ�.
create table emp06 as select * from emp;
select * from emp06;?
-- 3. emp06���̺� ����� ��� ���� ��
--������� min(sal)���� ���� �޿��� �޴� �������� �̸��� �޿��� ������ ����ϵ�
--������ ������� �ʱ�
--1) ����� �޿� �� ���� ������
select sal from emp06 where sal = (select min(sal) from emp where job = '����'); --450
--2) ������ �����̶� ��
select ename, job, sal from emp06 where job != '����' and sal>(select sal from emp06 where sal = (select min(sal) from emp where job = '����'));
-- 4. emp06 ���̺� ����� ��� ���� ��
--��õ�� ��ġ�� �μ��� �Ҽӵ� ������� �޿��� 100 �λ��ϱ�
update dept set loc='��õ' where deptno=20;
select deptno from dept where loc = '��õ';
select ename, sal+100 from emp
    where deptno = (select deptno from dept
        where loc = '��õ');
--5. emp06���̺��� �渮�ο� �Ҽӵ� ����鸸 ����
delete from emp06
    where ename in (select ename from emp06
        where deptno = (select deptno from dept
            where dname ='�渮��'));
select * from emp06;
rollback;
--6. '�̹���'�� ���� �μ��� �ٹ��ϴ� ����� �̸��� �μ���ȣ�� ����ϱ�
select ename, deptno from emp06
    where 

?

7. '�̹���'�� ������ ������ ���� ����� ����ϴ� SQL���� �ϼ��Ͻÿ�.

?

8. '�̹���'�� �޿��� �����ϰų� �� ���� �޴� ������ �޿��� ����ϴ� SQL���� �ϼ��Ͻÿ�

?

9. '��õ'���� �ٹ��ϴ� ����� �̸�, �μ���ȣ�� ����ϴ� SQL���� �ϼ��Ͻÿ�.

?

10. ���ӻ���� ���켺�� ����� �̸��� �޿��� ����ϴ� SQL���� �ϼ��Ͻÿ�

?

11. �μ����� ���� �޿��� ���� �޴� ����� ����(�����ȣ, ����̸�, �޿�, �μ���ȣ)�� ����ϴ� SQL���� �ϼ��Ͻÿ�.

?

12. ����(JOB)�� ������ ����� ���� �μ��� �μ���ȣ�� �μ���, ������ ����Ͻÿ�

?

13. ���庸�� �޿��� ���� ���� ������� �̸��� �޿��� ������ ����ϵ� ������ ������� �ʴ� SQL���� �ϼ��Ͻÿ�