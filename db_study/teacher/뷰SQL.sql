create table c5emp as select  *  from emp;

select * from c5emp;

create view  viewEmp  as select * from c5emp;

-- 복잡한 서브쿼리문을 빈번히 사용할 경우  뷰로 만들어 두면 간단하게 쿼리문을 수행할 수 있다.

create view venameMgr  as
    select member.ename 사원이름, manager.ename 직속상관이름
       from emp member left outer join emp manager
       on member.mgr = manager.empno;
       
select *  from  venameMgr where 사원이름='김수환';  

select * from student;
select * from course;

--빈번하게 사용되는 조인문
-- 코스가 모바일인 사람의  코스번호, 코스명, 선생님명, 학생번호, 학생명을 검색하세요.
select   c.cou_id, c.cou_name, c.tea_name, s.stu_id, s.stu_name  from course c, student s where c.cou_id = s.cou_id;

-- 뷰로 만들기
-- 형식 create view  뷰이름 as 쿼리문
create view  vStudentCourse  as 
       select   c.cou_id, c.cou_name, c.tea_name, s.stu_id, s.stu_name  from course c, student s where c.cou_id = s.cou_id;
       
-- 뷰를 검색하기
select  * from  vStudentCourse;

select  * from  vStudentCourse where cou_id = 10;
select  * from  vStudentCourse where cou_id in (10, 20) order by cou_id asc;

-- 뷰는 논리적인 가상 테이블
-- 사용하는 이유? 복잡하고 긴 쿼리문을 빈번하게 사용할 경우 뷰로 만들어 두면 간단해 진다.
--                        보안때문에

-- 뷰의 내부구조와 user_views 데이터 딕셔너리
desc user_views;
select * from user_views;

insert into vStudentCourse( cou_id, cou_name, tea_name, stu_id, stu_name)
                      values( 50, '자바', '홍길동', 120, '최주영' ) ; -- 원래 테이블의 자료가 연결될 때 오류가 발생해서 입력 잘 안됨
                      
create table login(
     id varchar2(20),
     password varchar2(20)
);

create table member(
    phone varchar2(20)
); 

-- 두개 컬럼을 모두 합친 뷰를 만들기
select  *  from login, member;

-- 뷰로 만들기
create view  vLogin as select  *  from login;

select * from vLogin;

-- 뷰안에 데이터를 삽입하면 물리적테이블로 데이터가 삽입된다. 단 조건: 조인한 뷰는 안된다. 한개의 테이블을 뷰로 만든 것은 삽입할 수 있다.
insert  into  vLogin  
                values ( '1000','1234') ;
                
-- 뷰에 있는 것 검색
select  *  from vLogin;

--테이블에 있는 것 검색
select  * from login;

-- 테이블안에 데이터 삽입하기
insert   into  login values( '2000', '4321');

-- 뷰안에 데이터 수정하기 물리적테이블, 가상뷰 모두 수정할 수 있다.  단 조건: 조인한 뷰는 안된다
update  vLogin set password='7896' where id='1000';
update login   set password='9632' where id='2000';

-- 뷰안에 데이터 삭제하기  물리적테이블, 가상뷰 모두 삭제할 수 있다.  단 조건: 조인한 뷰는 안된다
delete  from vLogin  where id='1000';
delete from login where id='2000';

-- 뷰를 삭제하기  drop view  뷰명 <-> create view  뷰명
drop view venamemgr;
drop view viewemp;

-- 현재 데이터베이스에서 뷰가 어떻게 되어 있는지 데이터 딕셔너리로 확인하기
select  *  from user_views;

-- vlogin뷰가 없으면 만들고 있으면 새로운 구조로 다시 만들기
create or replace view vlogin   as  select  id  from  login;
create  or replace  view vvlogin as  select id, password   from login where id like '11%';

-- force옵션  없는 테이블을 뷰로 만들면 에러가 난다, 그런데 force를 쓰면 경고창은 뜨지만 에러는 없다. 
create or replace force view  vMember  as select * from kMember;

-- view를 view 만들 수  있나요? 예 
create or replace view  v3Login as  select * from vlogin;

-- 급여가 800이상인 사람만 뷰를 만들어 주세요.  뷰명 vSal800 
create or replace view vSal800 as
     select * from emp where sale>=800;
-- vSal800 뷰의 급여를 50% 인상하세요
update  vSal800  set  sale = sale +  sale*0.5 ;

select * from vSal800;

-- 뷰에서 dml( insert , update, delete) 안되게 하고 싶다. 
create or replace view vSal800 as
     select * from emp where sale>=800  with read only;
update  vSal800  set  sale = sale +  sale*0.5 ;   -- 오류남 왜? with read only 
delete from vSal800; --  오류남 왜? with read only 
select * from vSal800; -- 검색만 된다.

-- with check option : where 절의 컬럼을 변경하는 것을 막아주는 것 

create or replace view vDept30 as
     select * from emp where deptno=50  with check option;
update  vDept30  set  deptno=10 ;   -- 오류남 왜? with check option
delete from vDept30; --  에러없음
select * from vDept30; -- 검색만 된다.

-- 뷰에서 dml( insert , update, delete) 안되게 하고 싶다. 
create or replace view vSal18_60 as
     select * from emp where  sale  between 500 and 800  with  check option;
select * from vSal18_60;
-- update하는데 1800~6000사이 범위를 벗어나게 바꾸기
update  vSal18_60  set  sale = 8000-sale ; -- 에러
-- update하는데 1800~6000사이 범위를 벗어나지 않게 바꾸기
update  vSal18_60  set  sale = sale + 10 ;  -- 정상
-- update하는데 1800~6000사이 범위를 일부분만 벗어나게 바꾸기 전체다 안됨
update  vSal18_60  set  sale = sale + 500 ;  -- 전체다 업데이트가 안된다. noting 

select * from emp where sale is not null order by sale desc;

select ename, sale  from emp where sale is not null order by sale desc;

-- rownum 처음에 테이블의 입력되는 순서를 기억하는 컬럼, 입력되는 시점에서 결정되고 바뀌지 않는다.
select rownum,  ename, sale  from emp where sale is not null order by sale desc;

-- 회사에서 급여를 제일 많이 받는 사람을 검색하기
select rownum, ename, sale from (  select rownum,  ename, sale  from emp where sale is not null order by sale desc ) 
     where  rownum <= 5;

-- 원래 있는 student 테이블을 oldStudent 테이블로 이름 변경함
rename student to oldStudent;
     
 -- 뷰문제 풀기 1414 부분 보시고 문제 풀어 보세요
 
----------------- 13장 시퀀스 개념
-- 시퀀스 생성하기
create sequence  dept_deptno_seq
    start with 10
    increment by 10;
    
--   시퀀스 데이터 딕셔너리 보기
desc user_sequences; -- 구조보기
select * from user_sequences;

-- 시퀀스의 현재값 currval
select dept_deptno_seq.currval  from dual;  -- 처음이것부터 수행하니깐? 에러, nextval 포인트(가르키는 위치)위치 값를 보여준다 
-- 시퀀스의 다음값 nextval
select dept_deptno_seq.nextval  from dual;  -- 증가값 만큼 위치를 이동해서 값을 보여준다.


drop sequence dept_deptno_seq;

-- 시퀀스를 실제 테이블에서 어떻게 사용할 까?
create sequence emp_seq
      start with 1
      increment by 1 
      maxvalue 1000;
      
create  table seqEmp(
     empno number(4), -- 자동으로 번호 증가되게
     name varchar2(20), -- 직접 입력
     beginDate date -- 자동으로 오늘 날짜가 입력되게
);

drop table seqEmp;

insert into seqEmp values( emp_seq.nextval,  '홍길동', sysdate) ;
insert into seqEmp values( emp_seq.nextval,  '홍길동1', sysdate) ;
insert into seqEmp values( emp_seq.nextval,  '홍길동2', sysdate) ;
insert into seqEmp values( emp_seq.nextval,  '홍길동3', sysdate) ;
insert into seqEmp values( emp_seq.nextval,  '홍길동4', sysdate) ;
select * from seqEmp;

-- sequence 수정하기
alter sequence emp_seq
     increment by 10
     maxvalue 100
     cycle
     cache 2;

insert into seqEmp values( emp_seq.nextval,  '홍길동', sysdate) ;
insert into seqEmp values( emp_seq.nextval,  '홍길동1', sysdate) ;
insert into seqEmp values( emp_seq.nextval,  '홍길동2', sysdate) ;
insert into seqEmp values( emp_seq.nextval,  '홍길동3', sysdate) ;
insert into seqEmp values( emp_seq.nextval,  '홍길동4', sysdate) ;  
insert into seqEmp values( emp_seq.nextval,  '홍길동', sysdate) ;
insert into seqEmp values( emp_seq.nextval,  '홍길동1', sysdate) ;
insert into seqEmp values( emp_seq.nextval,  '홍길동2', sysdate) ;
insert into seqEmp values( emp_seq.nextval,  '홍길동3', sysdate) ;
insert into seqEmp values( emp_seq.nextval,  '홍길동4', sysdate) ;    

select * from seqEmp;

-------- 인덱스 정보
select * from user_ind_columns; -- 테이블을 만들때 primary key는 자동으로 인덱스 처리됨

-- 이름으로 검색하는 것이 빈번하다 빠르게 검색이 되게 하고 싶다.
-- 해결책 이름을 인덱스로 만들어 주세요
create index idx_emp_ename 
         on  emp(ename);
         
set  timing on;

select * from emp;
select * from emp where job='사원'; -- 테이블 검색 결과 
select * from emp where ename='김사랑'; -- 인덱스 검색 결과 

-- 인덱스 제거하기
drop index idx_emp_ename;

---- 인덱스를 해야하는 경우
--테이블에 행의 수가 많을 때
--where문에 해당 컬럼이 많이 사용될 때
--검색결과가 전체 데이터의 2%~4%정도일 때
--join에 자주 사용되는 컬럼이나 null을 포함하는 컬럼이 많은 경우

-- 인덱스하면 안 좋은 경우
--테이블에 행의 수가 적을 때
--where문에 해당 컬럼이 적게 사용될 때
--검색결과가 전체데이터의 10%~15%정도일때
--테이블에 DML(insert, update, delete)작업이 많을 때 



