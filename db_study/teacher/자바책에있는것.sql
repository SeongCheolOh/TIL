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
select * from users;

---------- 프로시저 : 단문의 sql문을 연결하여서 순차적으로 처리하게 만드는 SQL프로그램 
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
    a_rows := sql%rowcount;
    -- 바로 직전에 했던 SQL문의 행의 수를 세어서 반환한하기  행의 수를 세어서 a_rows 변수에 넣어주기   단문2 수행
    commit; -- 트랜잭션 반영하기 단문3수행
 end;
 /

commit;
create or replace procedure user_select(
       a_userid in users.userid%type,
       a_rows  out pls_integer
 )
 is
 begin
    select count(userid) into a_userid from users;
    -- a_rows := sql%rowcount; -- 행의 수를 세어서 a_rows 변수에 넣어주기   단문2 수행
    commit; -- 트랜잭션 반영하기 단문3수행
 end;
 /

select  count(userid) from users;
select * from users;
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


select * from boards;     

commit;

update boards set btitle='눈사람', bcontent='눈으로 만든 사람', bfilename='snowman.jpg' where bno=8;


select * from users;
update users set username='한여름', userpassword='7777' where userid='winter';


select userid, username, userpassword, userage, useremail from users where userid='user1';

insert into users  values('user1', '사용자명1', '1234', 25, 'user1@naver.com');
commit;


select userid, username, userpassword, userage, useremail from users;

select * from boards;

select bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata from boards;

update boards set bfilename='snow4.jpg' where  bno=11;
update boards set bfilename='snow5.jpg' where  bno=12;
commit;