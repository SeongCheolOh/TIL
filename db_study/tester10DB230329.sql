CREATE TABLE DEPT (    
              DEPTNO DECIMAL(2),
              DNAME VARCHAR(14), 
              LOC VARCHAR(13), 
              CONSTRAINT PK_DEPT PRIMARY KEY (DEPTNO));

CREATE TABLE EMP (
            EMPNO DECIMAL(4),
            ENAME VARCHAR(10),
            JOB VARCHAR(9),
            MGR DECIMAL(4),
            HIREDATE DATE,  
            SAL DECIMAL(7,2), 
            COMM DECIMAL(7,2),
            DEPTNO DECIMAL(2),
            CONSTRAINT PK_EMP PRIMARY KEY (EMPNO),
            CONSTRAINT FK_DEPTNO FOREIGN KEY (DEPTNO) REFERENCES DEPT(DEPTNO));
?
CREATE TABLE SALGRADE ( 
              GRADE number(4),   
              LOSAL number(4),    
              HISAL number(4));

INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');

INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,TO_DATE('17-12-1980','dd-mm-yy'),800,NULL,20);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,TO_DATE('20-2-1981','dd-mm-yy'),1600,300,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,TO_DATE('22-2-1981','dd-mm-yy'),1250,500,30);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,TO_DATE('2-4-1981','dd-mm-yy'),2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,TO_DATE('28-9-1981','dd-mm-yy'),1250,1400,30);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,TO_DATE('1-5-1981','dd-mm-yy'),2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,TO_DATE('9-6-1981','dd-mm-yy'),2450,NULL,10);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,TO_DATE('13-7-1987','dd-mm-yy')-85,3000,NULL,20);
INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,TO_DATE('17-11-1981','dd-mm-yy'),5000,NULL,10);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,TO_DATE('8-9-1981','dd-mm-yy'),1500,0,30);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,TO_DATE('13-7-1987','dd-mm-yy'),1100,NULL,20);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,TO_DATE('3-12-1981','dd-mm-yy'),950,NULL,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,TO_DATE('3-12-1981','dd-mm-yy'),3000,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,TO_DATE('23-1-1982','dd-mm-yy'),1300,NULL,10);

INSERT INTO SALGRADE VALUES (1,700,1200);
INSERT INTO SALGRADE VALUES (2,1201,1400);
INSERT INTO SALGRADE VALUES (3,1401,2000);
INSERT INTO SALGRADE VALUES (4,2001,3000);
INSERT INTO SALGRADE VALUES (5,3001,9999);
--����, ����, ���� ���� �ٷ� �����ͺ��̽��� ������� �ʰ� Ʈ�������̶�� �������� �۾��� �̷������
--�۾������� Ʈ�����ǿ� �ڷḦ �� �̻� �������� �ʾƵ� �ȴٸ� db�� �Է��Ѵ�
COMMIT;
select * from dept;
select * from emp;
select * from salgrade;

--�μ� ��ȣ�� 10���� �μ��� ��� �� �����ȣ, �̸�, �޿��� ����϶�
select empno �����ȣ, ename �̸�, sal �޿� from emp where deptno =10;
--�����ȣ�� 7639�� ��� �� �̸�, �Ի�����, �μ���ȣ�� ����϶�.
select ename �̸�, hiredate �Ի�����, deptno �μ���ȣ from emp where empno=7369;
--�̸��� ALLEN�� ����� ��� ������ ����϶�.
select * from emp where ename='ALLEN';
--�Ի����ڰ� 83/01/12�� ����� �̸�, �μ� ��ȣ, �޿��� ����϶�.
select ename �̸�, deptno �μ���ȣ, sal �޿� from emp where hiredate='83/01/12';
--������ MANAGER�� �ƴ� ����� ��� ������ ����϶�.
select * from emp where not  job = 'MANAGER';
--�Ի����ڰ� 81/04/02 ���Ŀ� �Ի��� ����� ������ ����϶�.
select * from emp where hiredate>='81/04/02';
--�޿��� $800�̻��� ����� �̸�, �޿�, �μ� ��ȣ�� ����϶�.
select ename �̸�, sal �޿�, deptno �μ���ȣ from emp where sal>=800;
--�μ���ȣ�� 20�� �̻��� ����� ��� ������ ����϶�.
select * from emp where deptno>=20;

--������ K�� �����ϴ� ������� ���� �̸��� ���� ����� ��� ������ ����϶�.
select * from emp where ename between 'A%' and 'K%'  order by ename asc;

--�Ի����ڰ� 81/12/09 ���� ���� �Ի��� ������� ��� ������ ����϶�
select * from emp where hiredate<'81/12/09';
--�Ի��ȣ�� 7698 ���� �۰ų� ���� ������� �Ի��ȣ�� �̸��� ����϶�.
select empno �Ի��ȣ, ename �̸� from emp where empno<=7698;
--�Ի����ڰ� 81/04/02 ���� �ʰ� 82/12/09 ���� ���� ����� �̸�, ����, �μ� ��ȣ�� ����϶�.
select ename �̸�, sal ����, deptno �μ���ȣ from emp where hiredate between '81/04/02' and '82/12/09';
--�޿��� 1,600 ���� ũ�� $3,000���� ���� ����� �̸�, ����, �޿��� ����϶�.
select ename �̸�, job ����, sal �޿� from emp where 1600<=sal and sal<3000;/*between�� �̻����ϰ���� �� ��*/
--�����ȣ�� 7654�� 7782 ���� �̿��� ����� ��� ������ ����϶�.
select * from emp where not empno between 7654 and 7782;
--�̸��� B�� J ������ ��� ����� ������ ����϶�.
select * from emp where ename between 'B%' and 'J%';
--�Ի����ڰ� 81�� �̿ܿ� �Ի��� ����� ��� ������ ����϶�.
select * from emp where not hiredate between '81/01/01' and '81/12/31';

select * from emp where extract(year from hiredate)='81';

--������ MANAGER�� SALESMAN�� ����� ��� ������ ����϶�.
select * from emp where job in('MANAGER' ,  'SALESMAN');
select * from emp where job='MANAGER' or job='SALESMAN';
--�μ� ��ȣ�� 20,30���� ������ ��� ����� �̸�, �����ȣ, �μ� ��ȣ�� ����϶�.
select ename �̸�, empno �����ȣ, deptno �μ���ȣ from emp where deptno not in(20,30);
--�̸��� S�� �����ϴ� ����� �����ȣ, �̸�, �Ի�����, �μ���ȣ�� ����϶�.
select empno �����ȣ, ename �̸�, hiredate �Ի�����, deptno �μ���ȣ from emp where ename like 'S%';

--�Ի����ڰ� 81�⵵�� ����� ��� ������ ����϶�.
select * from emp where select year(hiredate)='81';

--�̸� �� S�ڰ� �� �ִ� ����� ��� ������ ����϶�.
select *from emp where ename like '%S%';
--�̸��� S�� �����ϰ� ������ ���ڰ� T�� ����� ��� ������ ����϶� (��, �̸��� ��ü 5�ڸ��̴�.>>
select * from emp where ename like 'S___T';
--ù ��° ���ڴ� ������� �� ��° ���ڰ� A�� ����� ������ ����϶�.
select * from emp where ename like '_A%';
--Ŀ�̼��� NULL�� ����� ������ ����϶�.
select * from emp where comm is null;
--Ŀ�̼��� NULL�� �ƴ� ����� ��� ������ ����϶�.
select * from emp where comm is not null;
--�μ��� 30�� �μ��̰� �޿��� $1,500 �̻��� ����� �̸�, �μ�, ������ ����϶�.
select ename �̸�, deptno �μ�, sal ���� from emp where deptno=30 and sal>=1500;
--�̸��� ù ���ڰ� K�� �����ϰų� �μ� ��ȣ�� 30�� ����� �����ȣ, �̸�, �μ� ��ȣ�� ����϶�.
select empno �����ȣ , ename �̸�, deptno �μ���ȣ from emp where ename like 'K%' or deptno=30;
--�޿��� $1,500�̻��̰� �μ� ��ȣ�� 30���� ��� �� ������ MANAGER�� ����� ������ ����϶�.
select * from emp where sal>=1500 and deptno=30 and job='MANAGER';
--�μ� ��ȣ�� 30�� ��� �� �����ȣ�� SORT �϶�.
select * 