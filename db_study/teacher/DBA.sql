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
-- select  * from emp ;  일반 SQL문
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

  
 
 
 
 
 
 
 
 
         
         
         