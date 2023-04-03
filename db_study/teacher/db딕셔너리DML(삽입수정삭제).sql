-- 7장 테이블 구조 생성, 변경, 제거하는 DDL (Database Define Language)-데이터 정의어
-- 목표 테이블 만들고 수정 삭제
-- 스키마 ??
select table_name from user_tables;
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
------------------------------------
--레코드 삽입할 때 insert 문
--형식 insert into 테이블명 (컬럼명1, 컬럼명2 ...) values ('실제값'...);
--레코드 수정할 때 update문
--형식 update 테이블명 set 컬럼명 = '실제값', ... where 조건절
select * from emp;
--mgr 1005인 사람의 급여를 50만원 인상
update emp set sale = sale+50 where mgr= 1005;
--job이 사원 대리인 사람의 보너스를 30만원 인상
update emp set comm = comm+30 where job in ('사원','대리');
--입사일이 05년 이전인 사람의 급여를 100만원 인상
update emp set sale = sale+100 where hiredate<='05/01/01';
--평균 급여보다 적게 받은 직원들에게 보너스를 50만원 주세요
select avg(sale) from emp; -- 평균값 구하는 코드
update emp set comm=comm +50 where sale< (select avg(sale) from emp);
--부서별로 제일 많이 받는 사람은 급여 100만원씩 삭감하기
select deptno, max(sale) from emp group by deptno where deptno is not null; -- 불가능
select  deptno, max(sale)  from emp where deptno is not null group by deptno ; -- 부서별로 제일 많이 받는 사람(부서 없는사람 제외);
select sale from emp where sale in (select  max(sale)  from emp group by deptno);
update emp set sale = sale-100 
where sale in (select  max(sale)  from emp group by deptno);
-- job=사장 이거나 입사일 98/12/31 이전인 사람의 급여 = 급여+평균급여로 수정하기
select sale,ename,deptno from emp where job='사장' or hiredate<='98/12/31';
update emp set sale = sale+(select avg(sale)from emp) where job='사장' or hiredate<='98/12/31'; 
update emp set job='수습' where job is null;
--job= 수습인 사람들을 사원으로 변경
update emp set job='사원' where job = '수습';
--delete 문
--양식 >> delete from emp where 조건문
create table c4emp as select * from emp;
select * from c4emp;
--급여가 1000만원 이상인 사람 삭제
delete from c4emp where sale>1000;
--mgr이 1008, 1003인 사람 삭제하기
delete from c4emp where mgr in(1008, 1003);
--김, 이씨 제외하고 모두 삭제
delete from c4emp where not(ename like '김%' or ename like '이%');
--보너스가 100만원 이상인 사람 삭제하기
delete from c4emp where comm>=100;
--부서가 10이거나 20인 사람 삭제하기
delete from c4emp where deptno in(10,20);
rollback;

insert into emp(deptno) values (40) ; -- 0~100 소숫점x 500
--데이터베이스 딕셔너리를 통하여 제약조건에 대한 구조 보기
desc user_constraints;
--데이터베이스 딕셔너리를 통하여 제약조건의 조건명, 타입, 테이블명을 선택해서 보기
select constraint_name, constraint_type from user_constraints;
--전체 제약조건에 관련된 컬럼들 보기
select * from user_constraints;

--각 제약조건을 만들기 -> 수정 -> 삭제
--만들기 테이블 생성할 때 제약조건을 건다
create table emp03(
empno number(4) not null,
ename varchar2(10) not null,
job varchar2(10),
deptno number(2));
--제약조건 확인
select constraint_name, constraint_type, table_name, search_condition from user_constraints where table_name in('EMP03');
drop table emp03;
--unique 제약 조건
create table emp03(
empno number(4) unique,
ename varchar2(10) unique,
job varchar2(10),
deptno number(2));
--삽입하기
--1) 정상적
insert into emp03 values (1001, '홍길동', '사장', 10);
-- empno 빼고 입력하기
insert into emp03(ename, job, deptno) values ('이순신', '부사장', 10);
--ename 빼고 입력하기
insert into emp03(empno, job, deptno) values (1002, '사원', 20);
--확인
select * from emp03;
--2)에러 >> unique 키는 유일하지 않으면 오류

--제약 조건명 (Constraint_name)을 사용자가 정의
--일단 제약조건명 없는상태인걸 확인
select * from user_constraints where table_name in ('EMP03');
drop table emp03;--지우고
create table emp03(
empno number(4) constraint emp03_empno_uk unique, -- constraint 제약조건명 제약조건
ename varchar2(10) constraint emp03_ename_uk unique,
job varchar2(10) constraint emp03_job_nn not null,
deptno number(2) constraint emp03_deptno_nn_uk not null unique);
drop table emp03;--지우고
create table emp03(
empno number(4) constraint emp03_empno_pk primary key, -- constraint 제약조건명 제약조건
ename varchar2(10) constraint emp03_ename_uk unique,
job varchar2(10) constraint emp03_job_nn not null,
deptno number(2) constraint emp03_deptno_nn_uk not null unique
--방법2)
--constraint emp03_empno_pk primary key(empno)를 여기 써도 된다
);
--foriegn(참조) key 외래키
--만드는 순서 1) 부모테이블 2) 자식테이블
drop table emp03; --지우고
--1) 부모테이블
create table dept03(
deptno number(4),
dname varchar2(10),
loc varchar2(10),
constraint dept03_deptno_pk primary key(deptno));
--2) 자식테이블
create table emp03(
empno number(4),
ename varchar2(20),
deptno number(4) constraint emp03_deptno_nn not null
                                   constraint emp03_deptno_fk references dept03(deptno),
--empno 기본키
constraint emp03_empno_pk primary key(empno) );
--또는
drop table emp03;
create table emp03(
empno number(4),
ename varchar2(20),
deptno number(4) constraint emp03_deptno_nn not null,
foreign key(deptno) reference dept03(deptno));--자식테이블
--데이터 딕셔너리를 통해서 제약조건의 내용 보기
select * from user_constraints where table_name in ('EMP03', 'DEPT03');
--입력할때도 부모 먼저
insert into dept03 values(10,'경리부', '서울');
insert into emp03 values(1001, '홍길동', 30); --에러>>부모에 30이 없어서
insert into emp03 values(1001,'홍길동',10);

drop table dept03;-- 자식테이블에 연결된 데이터가 있으면 자식 먼저 삭제해야 부모테이블도 삭제 가능

create table emp03(
empno number(4),
salary number(10) check(salary between 500 and 5000), -- 제약조건명을 명시하지 않고
comm number(10) constraint emp03_comm_ck check(comm between 10 and 1000));
select * from user_constraints where table_name in ('EMP03');
--정상 입력
insert into emp03 values(1001, 800, 20);
--오류 입력
insert into emp03 values(1001, 8000, 50);
insert into emp03 values(1001, 5000, 0);

--제약 만들기
--제약 수정, 삭제

--복합키 >> 2개 이상의 컬럼을 합쳐 기본키로 만든 것
--ex)핸드폰번호 뒷4자리 +  이름
drop table emp03;
create table emp03(
ephone number(4),
ename varchar2(20),
job varchar2(20),
constraint emp03_ephone_ename_pk primary key(ephone, ename));
insert into emp03 values (3334, '홍길동', '사원');
insert into emp03 values (3334, '이길동', '사원');
insert into emp03 values (3334, '김길동', '사원');
insert into emp03 values (3334, '홍길동', '사원');--에러 (프라이머리 키 >> 중복 불가)

drop table emp03;
create table emp03(
empno number(4),
ename varchar2(20),
job varchar2(20),
deptno number(4));
--제약 조건 추가
alter table emp03
add constraint emp03_empno_pk_ primary key(empno);
--확인
select *from user_constraints where table_name in ('EMP03');
--일단 지우고 다시 만듦
drop table dept03;
create table dept03(
deptno number(4),
dname varchar2(20),
loc varchar2(20));
--deptno primary key 제약조건 추가하기
alter table dept03
add constraint dept03_deptno_pk primary key(deptno);
--emp03 테이블의 컬럼 deptno를 외래키로 지정하기
alter table emp03 
add constraint emp03_deptno_fk foreign key(deptno) references dept03(deptno);
select * from dept03;

--dname loc를 복합키로 제약조건 추가
alter table dept03
add constraint dept03_dname_loc_pk primary key(dname, loc);

drop table emp03;
drop table dept03;

create table dept03(
deptno number(4),
dname varchar2(20),
loc varchar2(20));
create table emp03(
empno number(4),
ename varchar2(20),
job varchar2(20),
deptno number(4));
--dname not null로 제약조건을 만들 때 modefi~~
--why??>> not null로 지정하지 않으면 자동으로 null되기때문
alter table dept03
    modify dname constraint deptno03_dname_nn not null;
--ename not null로 제약 조건을 변경하기
alter table emp03
    modify ename constraint emp03_ename_nn not null;
--제약조건 제거 p.143
--dept03.deptno를 기본키로 제약조건 추가
alter table  deot03_deptno primary key(deptno);
--emp03.empno를 기본키로 제약조건 추가
alter table dept03
    drop    constraint dept03_dname_nn_; --방법1) 제약조건명 제거

--네이버 카페 1408
create table employee(
emp_no number(4),
emp_name varchar2(20),
salary number(6),
birthday date);
create table project(
pro_no number(4),
pro_content varchar2(100),
start_date date,
finish_date date);
create table specialty(
emp_no number(4),
specialty varchar2(20));
create table assign(
emp_no number(4),
pro_no number(4));
--primary key 지정
alter table employee
add constraint employee_emp_no_pk primary key(emp_no);
alter table project
add constraint project_pro_nu_pk primary key(pro_no);
alter table specialty
add constraint specialty_emp_no_specialty_pk primary key(emp_no,specialty);
alter table assign
add constraint assign_emp_no_pro_no_pk primary key(emp_no, pro_no);
--foreign key 지정
alter table specialty
add constraint emp_no_fk foreign key(emp_no) references employee(emp_no);
alter table assign
add constraint emp_no_fk foreign key(emp_no) references employee(emp_no);
alter table assign
add constraint pro_no_fk foreign key(pro_no) references project(pro_no);
--카페 보고 완성하세요!
--cascade
--부모 테이블의 자료를 변경하면 자식도 같이 변경
--부모 테이블의 자료를 삭제하면 자식도 같이 삭제
--될 수 있게 제약조건을 만들어 주는 것
drop table emp03;
drop table dept03;

create table emp03(
empno number(4),
ename varchar2(10)
    constraint emp03_ename_nn not null,
job varchar2(10),
deptno number(2),
constraint emp03_empno_pk primary key(empno),
constraint emp03_job_uk unique(job),
constraint emp03_deptno_fk foreign key(deptno) references dept03(deptno));

create table dept03(
deptno number(2),
dname varchar2(10),
loc varchar2(10),
constraint dept03_deptno_pk primary key(deptno));
--제약조건 확인
select * from user_constraints where table_name in ('EMP03', 'DEPT03');
--데이터를 삽입할 때 순서 >> 1)부모 2)자식
insert into emp03 value(1000, '홍길동', '사원', 50); --에러 발생<<외래키 관계이기 때문에
--에러 없애는 방법 1) 부모 자료 우선으로 입력하기 2) 제약조건을 임시로 비활성화(disable constraint)
alter table emp03 --비활성화 (비 권장사항)
    disable constraint emp03_deptno_fk; 
--재활성화
alter table emp03
    enbale constraint emp03_deptno_fk;
delete * from emp03;
--cascade 옵션
alter table dept03
    disable primary key cascade; 
alter table dept03
    enable primary key cascade;
alter table emp03
    enable emp03_deptno_fk;
select * from user_constraints where table_name in ('EMP03', 'DEPT03');
insert into emp03 values(1000, '홍길동', '사원', 50);
--카페 1410 Join // ppt p.144