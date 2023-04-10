-- tester1 사용자에게 view 만들 권한을 주기 
grant    create view   to    tester1;

-- 권한을 부여한다.
-- 형식 grant 권한명 to 사용자명;
grant create session to tester20;

-- 자바 교재에 있는  테이블 903쪽
-- 사용자 정보 테이블
create table users(
    userid varchar2(50) primary key,
    username varchar2(50) not null,
    userpassword varchar2(50) not null,
    userage number(3) not null,
    useremail varchar2(50) not null
);

-- 게시물 정보 테이블
create table boards(
   bno number primary key,
   btitle varchar2(100) not null,
   bcontent clob not null,  --  clob 문자형식 큰용량 데이터형식
   bwriter varchar2(50) not null,
   bdate date default sysdate,
   bfilename varchar2(50) null,
   bfiledata blob null  -- blob 바이너리(문자, 이미지, 소리, 동영상) 형식의 큰용량 데이터 형식
);

insert into boards(bno, btitle, bcontent, bwriter)  values( 1000, '게시판제목1', '게시판내용1', '홍길동1');
select * from boards;

-- bno 컬럼 자동 시퀀스 형식
create sequence seq_bno nocache;

-- 계좌정보 테이블
create table accounts(
   ano varchar2(20) primary key,
   owner varchar2(20) not null,
   balance number not null
);

insert into accounts(ano, owner, balance) 
        values( '111-111-1111','하여름',1000000);

insert into accounts(ano, owner, balance) 
        values( '222-222-2222','한겨울',0);
        
select * from accounts;

commit;

---------- 프로시저 : 단문의 sql문을 연결하여서 순차적으로 처리하게 만드는 프로그램 
create or replace procedure user_create(
    a_userid in users.userid%type, -- a_userid라는 변수는, in 입력변수,  users.userid%type users테이블의 userid컬럼의 자료형으로 한다. 
    a_username  in users.username%type,
    a_userpassword in users.userpassword%type,
    a_userage  in users.userage%type,
    a_useremail in users.useremail%type,
    a_rows  out pls_integer
 )
 is
 begin
    insert into  users(  userid, username, userpassword, userage, useremail)
                 values(  a_userid, a_username, a_userpassword, a_userage,  a_useremail );  --레코드를 삽입하기  단문1 수행
    a_rows := sql%rowcount; -- 행의 수를 세어서 a_rows 변수에 넣어주기   단문2 수행
    commit; -- 트랜잭션 반영하기 단문3수행
 end;
 /


-- user_login함수 만들기
create or replace  function  user_login (
   a_userid  users.userid%TYPE,
   a_userpassword users.userpassword%TYPE
)  return PLS_INTEGER
is
  v_userpassword users.userpassword%TYPE;
  v_result PLS_INTEGER;
BEGIN
   SELECT  userpassword INTO v_userpassword   
   FROM users
   WHERE userid = a_userid;
   
   IF  v_userpassword = a_userpassword THEN
       RETURN 0;
   ELSE
      RETURN 1;
   END IF;   
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN 2;
END;
/


-- insert into users( userid, username, userpassword, userage, useremail) values(?,?,?,?,?)


select * from users;


-- boards에 있는 모든 레코드를 삭제하기  'snow.jpg',   'c:/temp/snow.jpg'  ,   bfilename,    bfiledata
delete from boards;
select * from boards;

select seq_bno.nextval from dual;

insert into boards( bno,             btitle,    bcontent, bwriter,   bdate, bfilename )
         values( seq_bno.nextval,  '제목1', '내용1',    '작성자1',sysdate, 'snow.jpg');
         
         
 ---- 15장 pl/sql문
 
 set serveroutput on --출력해 주는 내용을 화면에 보여준다. 오라클에서 제공해 주는 프로시저의 내용을 출력해 주는 명령어
 
Begin
    DBMS_OUTPUT.PUT_LINE('Hello PL/SQL');
end;
/
 
-- 변수 선언하기
vempno number(4);
vename varchar2(10);
-- 대입문 넣기
vempno := 1001;
vename := '김사랑';

-- 변수안에 값넣어서 출력하기
declare
    vempno number(4);
    vename varchar2(10);
begin
   vempno := 1001;
   vename := '김사랑';
   DBMS_OUTPUT.PUT_LINE(' 사번       이름');
   DBMS_OUTPUT.PUT_LINE('------------');
   DBMS_OUTPUT.PUT_LINE(vempno || '    '  || vename); 
end;
/
-- 변수 종류 : 스칼라변수, 레퍼런스 변수
-- 1) 스칼라 변수
  vempno number(4);
  vename varchar2(10);
-- 2)  레퍼런스 변수
  vempno emp.empno%type;
  vename  emp.ename%type;
-- 2-1) 래퍼런스 변수인데 로우단위 참조하는 
  vemp emp%rowtype;
  
-- select문
select  * from emp ;  --일반 SQL문
select ename into vename  from emp; -- emp테이블의 컬럼 ename을 vename 변수로 넣어 주기

-- emp테이블에서 사원번호와 이름을 조회하기 PL/SQL문으로 만들기
declare
    vempno emp.empno%type;
    vename  emp.ename%type;
begin
   select empno, ename into vempno, vename from emp where ename='김사랑';
    DBMS_OUTPUT.PUT_LINE(' 사번       이름');
    DBMS_OUTPUT.PUT_LINE('------------');
    DBMS_OUTPUT.PUT_LINE(vempno || '    '  || vename); 
end;
/
select * from dept;
-- if~then~end if
declare
    vempno emp.empno%type;
    vename  emp.ename%type;
    vdeptno emp.deptno%type;
    vdname varchar2(20) := NULL; 
begin
   select empno, ename, deptno
   into  vempno, vename, vdeptno
   from emp
   where empno = 1001;
   
   if( vdeptno = 10 ) then
      vdname :='경리부';
   elsif (vdeptno = 20) then
      vdname := '인사부';
   elsif (vdeptno = 30) then
      vdname := '영업부';   
   else 
       vdname := '전산부';
   end if;    
    DBMS_OUTPUT.PUT_LINE(' 사번       이름     부서번호      부서명');
    DBMS_OUTPUT.PUT_LINE('------------------------------');
    DBMS_OUTPUT.PUT_LINE(vempno || '     '  || vename || '      '  ||  vdeptno || '      ' || vdname); 
end;
/

-- 반복문 loop
declare
   n number := 1;
begin
  loop
     dbms_output.put_line(n);
     n := n+1;
     if n>5 then
        exit;
     end if;   
  end loop;
end;
/

-- 반복문 for
declare
  
begin 
  for n in 1..5 loop
       dbms_output.put_line(n);
  end loop ;
end;
/

-- 반복문 while
declare
  n number := 1;
begin 
  while n<=5 loop
       dbms_output.put_line(n);
       n := n+1;
  end loop ;
end;
/
---------------------------------------------------
  insert into dept( deptno, dname, loc) 
          values( 10, '경리부', '서울');
insert into dept( dname, loc, deptno)
          values( '인사부', '인천', 20);
insert into dept values( 30, '영업부', '용인'); -- dept( deptno, dname, loc)  테이블의 컬럼 구조 순서대로 
-- insert into dept values( '전산부', '수원', 40 ); -- 안됨
insert into dept values( 40, '전산부', '수원' );
 -----------------------------------------------------------------
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1001, '김사랑', '사원', 1013, '2007/03/10',  300, 0,20);   
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1002, '한예슬', '대리', 1005, '2007/04/02',  250, 6,30);                       
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1003, '오지호', '과장', 1005, '2005/02/10',  500, 100,30);                     
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1004, '이병헌', '부장', 1008, '2003/09/02',  600, 0,20);                        
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1005, '신동엽', '과장', 1005, '2005/04/07',  450, 200,30);   
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1006, '장동건', '부장', 1008, '2004/01/08',  520, 0,20);                         
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1007, '김우성', '차장', 1008, '2005/03/08',  500, 0,30);                    
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1008, '안성기', '사장', 0, '1996/04/07',  1000, 0,30); 
-----------------------------------------------------------------------------
--16장 저장 프로시저
drop table emp01;
create table emp01
as
select * from emp;
select * from emp01;
-- 처리단계 
-- 1차 : 프로시저 구현하기 -> 2차 컴파일 -> 3차 실행
create or replace procedure del_all
is
begin
    delete from emp01;
    commit;
end;
/
-- 3차 실행하기
execute del_all;
desc user_source;
select name, type, line, text from user_source; -- 현재 데이터베이스 안 프로시저, 함수, 트리거 등의 정보를 볼 수 있다
-- 이씨 성을 가진 사람만 삭제하는 프로시저 만들기
create or replace procedure del_name(vename emp01.ename%type)
is
begin
    delete from emp01 where ename like vename;
    commit;
end;
/
execute del_name('이%'); -- 실인수, 실매개변수, 파라미터값 등으로 불림
select * from emp01;
-- in, out, inout 매개변수
create or replace procedure sal_empno
(
    vempno in emp.empno%type,
    vename out emp.ename%type,
    vsal out emp.sal%type,
    vjob out emp.job%type
)
is begin 
    select ename, sal,job into vename, vsal, vjob from emp where empno = vempno;
end;
/

variable var_name varchar2(15);
variable var_sal number;
variable var_job varchar2(15);
execute sal_empno(1001,:var_name,:var_sal,:var_job);
print var_name;
print var_sal;
print var_job;
-- 프로시저의 장점
-- 여러 클라이언트의 업무 규칙을 공유할 수 있다
-- 서버에는 미리 복잡한 쿼리문을 만들어두고, 클라이언트는 실행문에 실 매개값만 보내면 되기때문에 속도가 빠르다
-- 보안성이 우수하다

--저장함수
--특징 : 프로시저와 다른점은 실행결과를 되돌려받을 수 있다
create or replace function call_bonus(
    vempno in emp.empno%type
)return number
is
    vsal number(7);
begin
    select sale into vsal from emp where empno = vempno;
    return (vsal + 200);
end;
/
-- 함수 호출
variable var_res number;
execute :var_res := call_bonus(1001);
print var_res;
-- 커서
select * from emp;
--데이터베이스에선 이 부분을 코드
create or replace procedure cursor_sample01
is
    vdept dept%rowtype;
    cursor c1 -- 1단계 - 커서 선언
    is
    select * from dept;
begin
    dbms_output.put_line('부서번호   부서명   지역명');
    dbms_output.put_line('-------------------------------------');
    open c1; -- 2단계 - 커서 열기
    loop
        fetch c1 into vdept.deptno, vdept.dname, vdept.loc; -- 3단계 - fetch
        exit when c1%notfound; -- 4단계 - 조건이 만족할 때 까지 반복
        dbms_output.put_line(vdept.deptno || '  ' || vdept.dname || '  ' || vdept.loc);
    end loop;
    close c1; -- 5단계
end;
/
-- 실행 >> 자바쪽에서 이 부분을 코드
set serveroutput on
    execute cursor_sample01;

-- 트리거
-- 신입사원의 정보를 추가할 때 '신입 사원이 입사했습니다' 라고 출력하기
drop table emp02;
create table emp02(
    empno number(4) primary key,
    ename varchar2(20),
    job varchar2(20));
-- 트리거 생성
create or replace trigger tgr_01
    after insert
    on emp02
    begin
        dbms_output.put_line('신입 사원이 입사했습니다');
    end;
    /
-- 삽입
insert into emp02 values(1001, '유재석', '사원');
insert into emp02 values(1002, '김광석', '사원');
select * from emp02;
update emp02 set ename = '홍길동' where empno = 1001;

-- 급여 정보를 자동으로 추가하는 트리거 작성
create table sal01(
    salno number(4) primary key,
    sal number(7),
    empno number(4) references emp02(empno));
    
create sequence sal01_salno_seq;

create or replace trigger trg_02
    after insert
    on emp02
    for each row
    begin
        insert into sal01 values(sal01_salno_seq.nextval, 100,  :new.empno);
    end;
    /
drop trigger trg_02;
    
insert into emp02 values(1003, '하동훈', '사원');
delete emp02 where empno=1004; 
insert into emp02 values(1004, '강호동', '사원');
select *from emp02;
select * from sal01;

-- 급여 정보를 자동 삭제하는 트리거 작성
-- 상황) 사원이 퇴사했다. 급여 테이블을 삭제하고, 사원 테이블을 삭제하기
create or replace trigger trg_03
    after delete
    on emp02
    for each row
    begin
        delete from sal01 where empno = :old.empno;
    end;
    /
    delete emp02 where empno=1004;
select * from emp02;
select * from sal01;
-- 설명 >> emp02 테이블의 삭제는 트리거 수행 후 :old.empno는 emp테이블의 1004 