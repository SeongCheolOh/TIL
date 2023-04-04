-- 부서 테이블 생성하기
CREATE TABLE DEPT(
DEPTNO NUMBER(2) CONSTRAINT PK_DEPT PRIMARY KEY,
DNAME VARCHAR2(14),
LOC VARCHAR2(13) ) ;

-- 사원 테이블 생성하기
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
-- 급여 테이블 생성하기
CREATE TABLE SALGRADE(
GRADE NUMBER,
LOSAL NUMBER,
HISAL NUMBER );
?
-- 사원 테이블에 샘플 데이터 추가하기
INSERT INTO DEPT VALUES(10, '경리부', '서울');
INSERT INTO DEPT VALUES(20, '인사부', '인천');
INSERT INTO DEPT VALUES(30, '영업부', '용인'); 
INSERT INTO DEPT VALUES(40, '전산부', '수원');

-- 부서 테이블에 샘플 데이터 추가하기
INSERT INTO EMP VALUES(1001, '김사랑', '사원', 1013, to_date('2007-03-01','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1002, '한예슬', '대리', 1005, to_date('2007-04-02','yyyy-mm-dd'), 250, 80, 30);
INSERT INTO EMP VALUES(1003, '오지호', '과장', 1005, to_date('2005-02-10','yyyy-mm-dd'), 500, 100, 30);
INSERT INTO EMP VALUES(1004, '이병헌', '부장', 1008, to_date('2003-09-02','yyyy-mm-dd'), 600, NULL, 20);
INSERT INTO EMP VALUES(1005, '신동협', '과장', 1005, to_date('2005-04-07','yyyy-mm-dd'), 450, 200, 30);
INSERT INTO EMP VALUES(1006, '장동건', '부장', 1008, to_date('2003-10-09','yyyy-mm-dd'), 480, NULL, 30);
INSERT INTO EMP VALUES(1007, '이문세', '부장', 1008, to_date('2004-01-08','yyyy-mm-dd'), 520, NULL, 10);
INSERT INTO EMP VALUES(1008, '감우성', '차장', 1003, to_date('2004-03-08','yyyy-mm-dd'), 500, 0, 30);
INSERT INTO EMP VALUES(1009, '안성기', '사장', NULL, to_date('1996-10-04','yyyy-mm-dd'),1000, NULL, 20);
INSERT INTO EMP VALUES(1010, '이병헌', '과장', 1003, to_date('2005-04-07','yyyy-mm-dd'), 500, NULL, 10);
INSERT INTO EMP VALUES(1011, '조향기', '사원', 1007, to_date('2007-03-01','yyyy-mm-dd'), 280, NULL, 30);
INSERT INTO EMP VALUES(1012, '강혜정', '사원', 1006, to_date('2007-08-09','yyyy-mm-dd'), 300, NULL, 20);
INSERT INTO EMP VALUES(1013, '박중훈', '부장', 1003, to_date('2002-10-09','yyyy-mm-dd'), 560, NULL, 20);
INSERT INTO EMP VALUES(1014, '조인성', '사원', 1006, to_date('2007-11-09','yyyy-mm-dd'), 250, NULL, 10);

-- 급여 테이블에 샘플 데이터 추가하기
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
--2. 경리부에서 근무하는 사원의 이름과 입사일을 출력하기 
select e.ename 사원명, e.hiredate 입사일, d.dname 부서명
    from emp e, dept d
    where e.deptno= d.deptno and d.dname = '경리부';
--3. ANSI JOIN을 사용하여 인천에서 근무하는 사원이름과 급여을 출력하기
select e.ename 사원명, e.sal 급여, d.loc 근무지 from 
    emp e left outer join dept d
    on e.deptno = d.deptno and d.loc = '인천' and d.loc is not null;
--4. 사원 테이블과 부서 테이블을 조인하여 사원이름과 부서번호, 부서명을 출력하시오
 select e.ename 사원명, e.deptno 부서번호, d.dname 부서명
    from emp e, dept d
    where e.deptno = d.deptno
    order by d.deptno asc;
--5. 경리부 부서 소속 사원의 이름과 입사일을 출력하시오
select e.ename 사원명, e.hiredate 입사일, d.dname 부서명
    from emp e, dept d
    where e.deptno= d.deptno and d.dname = '경리부';
--6. 직급이 과장인 사원이 이름, 부서명을 출력하시오
select e.ename 사원명, d.dname 부서명, e.job 직급
    from emp e, dept d
    where e.deptno = d.deptno and e.job = '과장';
--7. 직속상관이 감우성인 사원들의 이름과 직급을 출력하시오
select * from dept;
select * from emp;
select * from salgrade;
select e2.ename 직속상관, e1.ename 사원명, e1.job 직급
    from emp e1, emp e2
    where e1.empno = e2.mgr and e2.ename = '감우성';
--8. 감우성과 동일한 근무지에서 근무하는 사원의 이름을 출력하시오
--1) 감우성씨의 근무지 뽑아내기
select d.loc 근무지
from emp e, dept d
where e.deptno = d.deptno and e.ename = '감우성';
--2) 
select e.ename 근무자, d.loc 근무지, d.deptno 부서번호
    from emp e, dept d
    where e.deptno= d.deptno and d.loc =
        (select d.loc 근무지
            from emp e, dept d
            where e.deptno = d.deptno and e.ename = '감우성') and
            e.ename != '감우성';
            
--11장 서브쿼리
select dname from dept
where deptno = (select deptno from emp where ename = '이문세');
--평균급여보다 더 많은 사원 출력
--1) 평균급여
select avg(sal) from emp;
--2)
select ename, sal from emp 
    where sal>=(select avg(sal) from emp);
--급여가 500을 초과하는 사원과 같은 부서에 근무하는 사원 구하기
--1)급여가 500 초과하는 사원
select ename, deptno from emp where sal > 500;
--2) 해당 부서 사람들 검색
select ename, deptno from emp where deptno in (10,20);
select ename, deptno from emp
    where deptno in (select deptno from emp where sal > 500);
--30번 부서의 최대급여보다 많은 급여를 받는 사람 출력
--1) 30번부서의 최대 급여
select max( sal) from emp where deptno = 30; -- 500
select sal from emp where deptno = 30; -- 250 500 450 480 500 280
--2)
select * from emp where sal > (select max(sal) from emp where deptno = 30);
select * from emp where sal > all (select sal from emp where deptno = 30);
select * from emp where sal > any (select sal from emp where deptno = 30);
select * from emp where sal > some (select sal from emp where deptno = 30);
select * from emp where exists (select * from emp where deptno = 100);
--테이블 생성
create table emp02 as select * from emp where deptno in (10, 20);
select * from emp02;
--테이블 구조만 생성( 단, 제약조건은 만들어지지 않는다 )
create table emp03 as select * from emp where deptno in (10000);
select * from emp03;
--emp 테이블의 제약조건 보기
select * from user_constraints where table_name in ('EMP');
--emp03 테이블의 제약조건 보기
select * from user_constraints where table_name in ('EMP03');

--update문에 서브쿼리
--ex) deptno=20인 지역명을 deptno=40의 지역명으로 변경하시오
select * from dept; -- 20=인천 / 40 = 수원
update dept set loc = (select loc from dept where deptno = 40) where deptno = 20;
--
use tester1DB;
select * from emp;
--ex)장동건의 급여(480)를 부장들 중 가장 높은 급여(600)로 변경하기
update emp set sal=(select max(sal) from emp where job='부장') where ename='장동건';
--ex) 수원에서 근무하는 직원 중 제일 먼저 입사한 사람의 이름과 입사일은?
--1) 수원에 근무하는 직원들 출력
select * from emp e, dept d where e.deptno = d.deptno and d.loc = '수원';
--2) 가장 먼저 입사한 사람
select ename, hiredate from emp 
    where hiredate = (select min(e.hiredate) from emp e, dept d where e.deptno = d.deptno and d.loc = '수원');
--ex) 수원 사는 사람중에 입사일 가장 오래된 사람 삭제 ( 단, 사장님은 제외 )
delete from emp 
where ename = (select ename from emp
                                    where hiredate = (select min(e.hiredate) from emp e, dept d
                                                                        where e.deptno = d.deptno and d.loc = '수원' and e.job !='사장'));
--cafe - 데이터베이스 - 게시물 번호 1412 서브쿼리
select * from emp;
select * from dept;
--1.영업부에서 근무하는 모든 사원의 이름과 급여을 출력하라.
select ename, sal from emp where deptno in(
    select deptno from dept where  dname = '영업부');
-- 2. emp06에 emp테이블의 모든 데이터를 추가합니다.
create table emp06 as select * from emp;
select * from emp06;?
-- 3. emp06테이블에 저장된 사원 정보 중
--과장들의 min(sal)보다 많은 급여을 받는 직원들의 이름과 급여과 직급을 출력하되
--과장은 출력하지 않기
--1) 과장들 급여 중 가장 작은거
select sal from emp06 where sal = (select min(sal) from emp where job = '과장'); --450
--2) 직원들 월급이랑 비교
select ename, job, sal from emp06 where job != '과장' and sal>(select sal from emp06 where sal = (select min(sal) from emp where job = '과장'));
-- 4. emp06 테이블에 저장된 사원 정보 중
--인천에 위치한 부서에 소속된 사원들의 급여를 100 인상하기
update dept set loc='인천' where deptno=20;
select deptno from dept where loc = '인천';
select ename, sal+100 from emp
    where deptno = (select deptno from dept
        where loc = '인천');
--5. emp06테이블에서 경리부에 소속된 사원들만 삭제
delete from emp06
    where ename in (select ename from emp06
        where deptno = (select deptno from dept
            where dname ='경리부'));
select * from emp06;
rollback;
--6. '이문세'와 같은 부서에 근무하는 사원의 이름과 부서번호를 출력하기
select ename, deptno from emp06
    where 

?

7. '이문세'와 동일한 직급을 가진 사원을 출력하는 SQL문을 완성하시오.

?

8. '이문세'의 급여와 동일하거나 더 많이 받는 사원명과 급여을 출력하는 SQL문을 완성하시오

?

9. '인천'에서 근무하는 사원의 이름, 부서번호를 출력하는 SQL문을 완성하시오.

?

10. 직속상관이 감우성인 사원의 이름과 급여을 출력하는 SQL문을 완성하시오

?

11. 부서별로 가장 급여를 많이 받는 사원의 정보(사원번호, 사원이름, 급여, 부서번호)를 출력하는 SQL문을 완성하시오.

?

12. 직급(JOB)이 과장인 사원이 속한 부서의 부서번호와 부서명, 지역을 출력하시오

?

13. 과장보다 급여을 많이 받은 사원들의 이름과 급여와 직급을 출력하되 과장은 출력하지 않는 SQL문을 완성하시오