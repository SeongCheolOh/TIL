-- tester1 ����ڿ��� view ���� ������ �ֱ� 
grant    create view   to    tester1;

-- ������ �ο��Ѵ�.
-- ���� grant ���Ѹ� to ����ڸ�;
grant create session to tester20;

-- �ڹ� ���翡 �ִ�  ���̺� 903��
-- ����� ���� ���̺�
create table users(
    userid varchar2(50) primary key,
    username varchar2(50) not null,
    userpassword varchar2(50) not null,
    userage number(3) not null,
    useremail varchar2(50) not null
);

-- �Խù� ���� ���̺�
create table boards(
   bno number primary key,
   btitle varchar2(100) not null,
   bcontent clob not null,  --  clob �������� ū�뷮 ����������
   bwriter varchar2(50) not null,
   bdate date default sysdate,
   bfilename varchar2(50) null,
   bfiledata blob null  -- blob ���̳ʸ�(����, �̹���, �Ҹ�, ������) ������ ū�뷮 ������ ����
);

insert into boards(bno, btitle, bcontent, bwriter)  values( 1000, '�Խ�������1', '�Խ��ǳ���1', 'ȫ�浿1');
select * from boards;

-- bno �÷� �ڵ� ������ ����
create sequence seq_bno nocache;

-- �������� ���̺�
create table accounts(
   ano varchar2(20) primary key,
   owner varchar2(20) not null,
   balance number not null
);

insert into accounts(ano, owner, balance) 
        values( '111-111-1111','�Ͽ���',1000000);

insert into accounts(ano, owner, balance) 
        values( '222-222-2222','�Ѱܿ�',0);
        
select * from accounts;

commit;
select * from users;

---------- ���ν��� : �ܹ��� sql���� �����Ͽ��� ���������� ó���ϰ� ����� SQL���α׷� 
create or replace procedure user_create(
    a_userid in users.userid%type, -- a_userid��� ������, in �Էº���,  users.userid%type users���̺��� userid�÷��� �ڷ������� �Ѵ�. 
    a_username  in users.username%type,
    a_userpassword in users.userpassword%type,
    a_userage  in users.userage%type,
    a_useremail in users.useremail%type,
    a_rows  out pls_integer
 )
 is
 begin
    insert into  users(  userid, username, userpassword, userage, useremail)
                 values(  a_userid, a_username, a_userpassword, a_userage,  a_useremail );  --���ڵ带 �����ϱ�  �ܹ�1 ����
    a_rows := sql%rowcount;
    -- �ٷ� ������ �ߴ� SQL���� ���� ���� ��� ��ȯ���ϱ�  ���� ���� ��� a_rows ������ �־��ֱ�   �ܹ�2 ����
    commit; -- Ʈ����� �ݿ��ϱ� �ܹ�3����
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
    -- a_rows := sql%rowcount; -- ���� ���� ��� a_rows ������ �־��ֱ�   �ܹ�2 ����
    commit; -- Ʈ����� �ݿ��ϱ� �ܹ�3����
 end;
 /

select  count(userid) from users;
select * from users;
-- user_login�Լ� �����
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


-- boards�� �ִ� ��� ���ڵ带 �����ϱ�  'snow.jpg',   'c:/temp/snow.jpg'  ,   bfilename,    bfiledata
delete from boards;
select * from boards;

select seq_bno.nextval from dual;

insert into boards( bno,             btitle,    bcontent, bwriter,   bdate, bfilename )
         values( seq_bno.nextval,  '����1', '����1',    '�ۼ���1',sysdate, 'snow.jpg');


select * from boards;     

commit;

update boards set btitle='�����', bcontent='������ ���� ���', bfilename='snowman.jpg' where bno=8;


select * from users;
update users set username='�ѿ���', userpassword='7777' where userid='winter';


select userid, username, userpassword, userage, useremail from users where userid='user1';

insert into users  values('user1', '����ڸ�1', '1234', 25, 'user1@naver.com');
commit;


select userid, username, userpassword, userage, useremail from users;

select * from boards;

select bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata from boards;

update boards set bfilename='snow4.jpg' where  bno=11;
update boards set bfilename='snow5.jpg' where  bno=12;
commit;