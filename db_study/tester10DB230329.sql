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
--삽입, 삭제, 수정 등은 바로 데이터베이스에 적용되지 않고 트랜젝션이라는 공간에서 작업이 이루어진다
--작업공간인 트랜젝션에 자료를 더 이상 변경하지 않아도 된다면 db로 입력한다
COMMIT;
select * from dept;
select * from emp;
select * from salgrade;

--부서 번호가 10번인 부서의 사람 중 사원번호, 이름, 급여를 출력하라
select empno 사원번호, ename 이름, sal 급여 from emp where deptno =10;
--사원번호가 7639인 사람 중 이름, 입사일자, 부서번호를 출력하라.
select ename 이름, hiredate 입사일자, deptno 부서번호 from emp where empno=7369;
--이름이 ALLEN인 사람의 모든 정보를 출력하라.
select * from emp where ename='ALLEN';
--입사일자가 83/01/12인 사원의 이름, 부서 번호, 급여를 출력하라.
select ename 이름, deptno 부서번호, sal 급여 from emp where hiredate='83/01/12';
--직업이 MANAGER가 아닌 사람의 모든 정보를 출력하라.
select * from emp where not  job = 'MANAGER';
--입사일자가 81/04/02 이후에 입사한 사원의 정보를 출력하라.
select * from emp where hiredate>='81/04/02';
--급여가 $800이상인 사람의 이름, 급여, 부서 번호를 출력하라.
select ename 이름, sal 급여, deptno 부서번호 from emp where sal>=800;
--부서번호가 20번 이상인 사원의 모든 정보를 출력하라.
select * from emp where deptno>=20;

--성명이 K로 시작하는 사람보다 높은 이름을 가진 사람의 모든 정보를 출력하라.
select * from emp where ename between 'A%' and 'K%'  order by ename asc;

--입사일자가 81/12/09 보다 먼저 입사한 사람들의 모든 정보를 출력하라
select * from emp where hiredate<'81/12/09';
--입사번호가 7698 보다 작거나 같은 사람들의 입사번호와 이름을 출력하라.
select empno 입사번호, ename 이름 from emp where empno<=7698;
--입사일자가 81/04/02 보다 늦고 82/12/09 보다 빠른 사원의 이름, 월급, 부서 번호를 출력하라.
select ename 이름, sal 월급, deptno 부서번호 from emp where hiredate between '81/04/02' and '82/12/09';
--급여가 1,600 보다 크고 $3,000보다 작은 사람은 이름, 직무, 급여를 출력하라.
select ename 이름, job 직무, sal 급여 from emp where 1600<=sal and sal<3000;/*between은 이상이하관계라 안 씀*/
--사원번호가 7654와 7782 사이 이외의 사원의 모든 정보를 출력하라.
select * from emp where not empno between 7654 and 7782;
--이름이 B와 J 사이의 모든 사원의 정보를 출력하라.
select * from emp where ename between 'B%' and 'J%';
--입사일자가 81년 이외에 입사한 사람의 모든 정보를 출력하라.
select * from emp where not hiredate between '81/01/01' and '81/12/31';

select * from emp where extract(year from hiredate)='81';

--직무가 MANAGER와 SALESMAN인 사람의 모든 정보를 출력하라.
select * from emp where job in('MANAGER' ,  'SALESMAN');
select * from emp where job='MANAGER' or job='SALESMAN';
--부서 번호와 20,30번을 제외한 모든 사람의 이름, 사원번호, 부서 번호를 출력하라.
select ename 이름, empno 사원번호, deptno 부서번호 from emp where deptno not in(20,30);
--이름이 S로 시작하는 사원의 사원번호, 이름, 입사일자, 부서번호를 출력하라.
select empno 사원번호, ename 이름, hiredate 입사일자, deptno 부서번호 from emp where ename like 'S%';

--입사일자가 81년도인 사람의 모든 정보를 출력하라.
select * from emp where select year(hiredate)='81';

--이름 중 S자가 들어가 있는 사람만 모든 정보를 출력하라.
select *from emp where ename like '%S%';
--이름이 S로 시작하고 마지막 글자가 T인 사람의 모든 정보를 출력하라 (단, 이름은 전체 5자리이다.>>
select * from emp where ename like 'S___T';
--첫 번째 문자는 관계없고 두 번째 문자가 A인 사람의 정보를 출력하라.
select * from emp where ename like '_A%';
--커미션이 NULL인 사람의 정보를 출력하라.
select * from emp where comm is null;
--커미션이 NULL이 아닌 사람의 모든 정보를 출력하라.
select * from emp where comm is not null;
--부서가 30번 부서이고 급여가 $1,500 이상인 사람의 이름, 부서, 월급을 출력하라.
select ename 이름, deptno 부서, sal 월급 from emp where deptno=30 and sal>=1500;
--이름의 첫 글자가 K로 시작하거나 부서 번호가 30인 사람의 사원번호, 이름, 부서 번호를 출력하라.
select empno 사원번호 , ename 이름, deptno 부서번호 from emp where ename like 'K%' or deptno=30;
--급여가 $1,500이상이고 부서 번호가 30번인 사워 중 직업이 MANAGER인 사람의 정보를 출력하라.
select * from emp where sal>=1500 and deptno=30 and job='MANAGER';
--부서 번호가 30인 사람 중 사원번호를 SORT 하라.
select * 