/* 데이터 조회*/
select * from emp;
/* 특정 데이터만 조회*/
select  empno, ename from emp;
/* as로 컬럼에 별칭 부여하기*/
select empno as 사원번호, ename as 사원명 from emp;
/* 컬럼명 바꾸기 */
alter table emp rename column sal to sale;
/* as는 생략 가능 */
select empno 사원번호, sale 급여, sale*12  연봉 from emp;
-- 세금은 연봉의 12%로 책정된다
select ename 사원명,sale 급여, sale*12 연봉, sale*12*0.12 세금 from emp;
-- comm 보너스의 20%는 세금입니다.
select comm*0.2 보너스세금 from emp;
--총 지급액은 연봉+보너스*5-연봉*0.12-보너스*0.2
select sale+comm*5-sale*0.12-comm*0.2 총지급액 from emp;

--데이터 조회
select * from dept;

-- 데이터 삽입
-- 1009 유영수 null 1005 98/10/10 700 0 null
insert into emp values(1009, '유영수' ,null,1005,'98/10/10',700,0,10);
-- 1010 김수환 null 1004 98/12/04 250 0 null
insert into emp values(1010,'김수환',null,1004,'98/12/04',700,0,20);

select *from emp;

select ename, comm, sale*12+comm, nvl(comm, 0), sale*12+nvl(comm,0) from emp;

-- 원하는 컬럼만 조회
select job from emp;
-- nvl ( 컬럼명, 컬럼이 null이면 처리할 값)
select nvl(job, '미지정') from emp;
-- 미지정 문자 null 숫자미지정 0
select nvl(comm, 0), sale*12+nvl(comm, 0) "총지급액" from emp;
--select nvl(comm, 0), sale*12+nvl(comm, 0) '총지급액' from emp; 에러남 

-- " || (Concatenation) "연산자를 통해 여러개의 컬럼과 문자열을 연결 가능
select ename  || '님 입사하신 것을 환영합니다' from emp;
select ename || '님 ' || sale || '만원을 월 단위로 지급합니다' from emp;

--" distinct "를 통한 중복요소 제거
--회사의 부서 번호(deptno)를 출력(중복 제거)
select distinct deptno from emp;
--회사에서 직급(job)의 종류를 출력(중복 제거)
select distinct job from emp;

--null은 '미배정' 출력하기
select distinct nvl(job, '미배정') from emp;

--where을 이용하여 조건문 만들기
--(select 출력) where (컬럼명) (조건절);
--급여가 500이상인 사원 출력
select * from emp where sale>500;
--입사일 00년도 이후만 출력
select *from emp where hiredate>='00/01/01';
--부서번호가 10인 사람의 이름과 부서번호를 출력
select ename, deptno from emp where deptno=10;
--부서번호가 10이거나 30이고, 입사일이 05년 이전만 출력
select * from emp where deptno= 10 or  deptno=30 and hiredate<'05/01/01';
select * from emp where deptno in (10,30) and hiredate<'05/01/01';  /*똑같음*/
--매니저가 1008인 사람의 이름과 부서 매니저번호 출력하기
select ename 이름, deptno 부서번호, mgr 매니저 from emp where mgr=1008;
--empno가 짝수인 사람의 사원번호와 이름 출력
select empno 사원번호, ename 이름 from emp where mod(empno,2)=0; /* mod = 나머지 출력하는 함수 */
--job이 사원, 대리, 과장인 사람은 급여의 300%를 보너스로 주고, 출력은 이름 직급 급여 보너스
select ename 이름,  job 직급, sale 급여, sale*3 보너스 from emp where job in('사원', '대리', '과장');
--성이 '김'씨인 사람만 출력
select * from emp where ename like '김%';

insert into emp values(1011,'파래김','이사장',null,null,null,null,null);
/* [%] >> 붙은 방향으로 아무렇게나 붙어도 상관없음 */
select * from emp where ename like '%김%';
/* [ _ ] >> 붙은 방향으로 [ _ ] 갯수만큼 문자열 갯수 제한 */
--2번째 글자에 '지'가 있는 사람 출력
select *from emp where ename like '_지_';
--직급이 장급인 사람 출력
select *from emp where job like '%장';
select * from emp where job like '%장%';
select *from emp where job like '_장';
select * from emp where job like '_장_';
--직급이 장급이 아닌 사람 출력
select * from emp where job not like '%장';
--입사일이 03년도~06년도 사이인 사람 출력
select * from emp where '03/01/01'<=hiredate and hiredate<'07/01/01';
select * from emp where hiredate between '03/01/01' and '06/12/31';
--급여가 300~800인 사람, 아닌사람 출력
select * from emp where sale between 300 and 800;
--보너스가 없는 사람
select * from emp where comm =0 or comm is null;
--매니저가 없는 사람
select * from emp where mgr=0 or mgr is null;
--매니저가 null이 아닌 사람
select * from emp where not mgr is null; /*null을 검색 후 아닌 데이터를 검색>> 모든 데이터를 한번씩 검색한다 */
select * from emp where mgr is not null; /* 애초에 null이 아닌 데이터만 검색한다 >> 효율이 더 좋다 */

-- 오름차순 내림차순
--(출력) where 조건절  [ order by ] 컬럼명 ASC(오름차순) or DESC(내림차순)
--급여 내림차순
select * from emp order by sale desc;
--부서번호 20, 30인 사람의 급여 내림차순 출력
select * from emp where deptno in(20,30) order by sale desc;
--직무가 부장, 과장인 사람의 입사일 내림차순
select * from emp where job in('부장', '과장') order by hiredate asc;
--부서번호가 20, 30인 사람의 급여 내림차순, 보너스 오름차순으로 출력
select * from emp where deptno in(20,30) order by sale desc, comm asc;
--부서번호가 20, 30인 사람의 급여 내림차순, 사원번호 오름차순
select * from emp where deptno in(20, 30) order by sale desc, empno asc;

select *from emp;

--새로운 테이블 as ~로써 select * from dept 테이블의 출력결과와 동일하게 만들기
create table cdept as select * from dept;
create table cemp as select empno, ename, deptno from emp;
create table ccemp as select empno, ename, deptno from emp where deptno=20;
select *from ccemp
--이름이 '이', '김'씨인 사람만 empno, ename, deptno 출력
select empno, ename, deptno from emp where ename like '김%' or ename like '이%';
 --이름이 '이', '김'씨인 사람만 empno, ename, deptno  컬럼을 c2emp 테이블로 만들기
 create table c2emp as select empno, ename, deptno from emp where ename like '김%' or ename like '이%';
 select * from c2emp
 
 --합집합
 select * from ccemp
 union all
 select *from c2emp;
 -- 중복요소 제거 후 합
 select * from ccemp
 union
 select * from c2emp;
 --교집합
 select * from ccemp intersect select * from c2emp;
 --차집합
 select * from ccemp minus select * from c2emp;
 
 use dba;
 --사용자 만들기 비밀번호 1234
