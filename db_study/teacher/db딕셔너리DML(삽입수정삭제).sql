-- 7장 테이블 구조 생성, 변경, 제거하는 DDL (Database Define Language)-데이터 정의어
-- 목표 테이블 만들고 수정 삭제
-- 스키마 ??
create table emp01(
   empno number(4),
   ename varchar2(14),
   sal number(7,3)
);
desc emp01; -- 테이블의 구조 보기
create table emp02(
   empno number(4) default 1000,
   ename varchar2(14) default '홍길동',
   sal number(7,3)
);
insert into emp01( empno ) values ( 2000 );
insert into emp02( sal ) values ( 500 );
select * from emp01;
select * from emp02;
-- 테이블 구조를 만들기 이름 부서명 입사일-기본값으로 오늘 날짜  테이블명은 emp03
create table emp03(
   ename varchar2(20),
   deptno varchar2(20),
   hiredate date default sysdate
);
-- 데이터 삽입하기 최진영 전산부 2022/10/08  이수민 영업부 2023/03/31
insert into emp03 values( '최진영', '전산부', '2022/10/08');
-- insert into emp03 values( '이수민', '영업부' );에러 
insert into emp03 ( ename, deptno) values( '이수민', '영업부' );
select * from emp03;

-- emp01 테이블안에 birth 컬럼 추가하기
alter table emp01
  add( birth date default sysdate );
-- 테이블 구조보기
desc emp01;
-- sal 컬럼의 자료형을 number(7,3) --> number(8) 변경하기 구조와 제약조건 변경
alter table emp01
  modify( sal number(8) );
--  empno varchar2(10) ename varchar2(20) 로 변경하기 주의 : 데이터가 있으면 구조를 변경할 수 없다. 
alter table emp01
  modify( empno varchar2(10), 
          ename varchar2(20) );
          
select * from emp01;
-- empno의 값을 null로 변경하기
update emp01 set empno = null ;

select * from emp02;
-- sal 컬럼을 지우기
alter table emp02
   drop column sal; 
desc emp02;
select * from emp03;
-- deptno, hiredate 컬럼을 모두 삭제하기 주의 1개의 컬럼씩 지운다. 모든 컬럼은 다 지울 수 없다. 최소 1개는 남겨 두어야 한다. 
alter table emp03
   drop column deptno;
alter table emp03
   drop column hiredate;
alter table emp03
   drop column ename;
-- 레코드수가 아주 많은 경우에 컬럼 변경(추가, 수정, 삭제)할 경우 데이터베이스 속도가 느려집니다.  
-- 그러면 안됩니다. 삭제할 컬럼을 바로 바로 지우는게 아니라 unused로 만들어 두고 나중에 한꺼번에 삭제합니다.
select * from emp02;
alter table emp02
  set unused ( ename ); -- 사용하지 않을 컬럼을 체크하는 것
desc emp02; 
select * from emp02; -- unused된 컬럼은 검색이 되지 않는다.
alter table emp02  -- unused된 컬럼을 완전히 제거한다.
  drop unused columns;
  
-- 테이블명 변경
select * from emp01;
rename emp01 to newEmp01;
desc newEmp01;
select * from newEmp01;

-- 테이블의 구조를 제거하는 것 = 테이블 제거
drop table newEmp01;
drop table emp03;

-- 테이블 속안에 데이터(레코드)를 모두 삭제하기
create table copyEmp as select * from emp;
-- 테이블 속안에 데이터(레코드)를 모두 삭제하기 방법1) delete문으로  방법2) truncate table문  
select * from copyEmp;  
--  방법1) delete문으로 트랜잭션에서 작업이 이루어 지므로 commit 하기 전에 rollback해서 삭제를 취소할 수 있다. 
delete from copyEmp;
rollback; -- 방금전에 했던 명령을 트랜잭션( all or nothing )에서 작업하는 것들을 되돌리기 
-- 트랜잭션은 은행에서 예금 인출하는 것을 예로 들면 예금인출 100% 완료되어야지 성공, 중간에 멈추면 처음으로 되돌아 가는 것  

-- 방법2) truncate table -- 트랜잭션공간 또는 트랜잭션 시스템 구조에서 작업을 하는 것이 아니라 바로 DB테이블에서 지워버림 삭제 취소 안됨
truncate table copyEmp; -- rollback으로 되돌리기 하니깐 안됨. 


-- 데이터 딕셔너리
-- 사용자가 만드는 테이블이 아니고 데이터베이스 서버에서 자동으로 만들고 수정하여 준다. 
-- 사용자는 보기만 한다. 사용자는 데이터베이스 서버안에 들어 있는 정보를 볼때 이용한다. 
-- user_  all_  dba_
-- ~~ 쓴다 - 저장, 삭제, 수정, 삽입 내포 되어 있음
-- ~~ 읽는다 - 보기만 가능함
select table_name from user_tables;
select * from user_tables;
select table_name, max_trans from user_tables;

select * from all_tables;

-- ------------
-- DML - Data Manipulation Language  - 데이터 조작어 웹개발자가 자바코드에 명령어 써 준다. 
-- select insert update delete 
create table dept01(
  deptno number(2),
  dname varchar2(14),
  loc varchar2(13)
);

desc dept01;

insert into dept01 values( 10, '경리부', '서울') ;
-- insert into dept01 values( 20, '인사부','인천' ); 
-- insert시 뒤에 select로 나오는 결과를 차례대로 앞 테이블의 컬럼에 넣어 준다.
insert into dept01(deptno, dname, loc)  select deptno, dname, loc from dept where deptno = 20 ; 
-- select절이 여러행(4행)인 경우 4개의 행이 삽입된다.
insert into dept01(deptno, dname, loc)  select deptno, dname, loc from dept  ; 
-- select절이 여러행(4행)인 경우 4개의 행이 삽입된다.
insert into dept01(deptno, dname, loc)  select deptno, dname from dept  ;   -- error  ', loc' 때문에
insert into dept01(deptno, dname)  select deptno, dname from dept  ;  -- insert문 서브쿼리 이렇게 검색하시면 된다.  
-- 숫자 삽입, 문자 삽입, 날짜 삽입, null 삽입
-- dept01 테이블에 생일 컬럼 date 추가하기 
alter table dept01
  add birth date;
desc dept01;
-- deptno 20 or 30 인 레코드안에 오늘 날짜로 생일을 삽입 넣어 주세요
insert into dept01 ( deptno, dname, loc, birth ) 
       select  deptno, dname, loc, sysdate from dept where deptno in ( 20,30 );
select * from dept01;
-- dname 전산부인 사람의 부서, 부서명, 지역, birth을 1990/12/25로 삽입하기 


select * from dept01;

select * from dept;
-- dept테이블에서 tourism 컬럼을 삭제하기
alter table dept 
   drop column tourism;
-- deptno가 20인 레코드만 검색하기
select * from dept where deptno = 20;

