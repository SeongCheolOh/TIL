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

---------- ���ν��� : �ܹ��� sql���� �����Ͽ��� ���������� ó���ϰ� ����� ���α׷� 
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
    a_rows := sql%rowcount; -- ���� ���� ��� a_rows ������ �־��ֱ�   �ܹ�2 ����
    commit; -- Ʈ����� �ݿ��ϱ� �ܹ�3����
 end;
 /


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
         
         
 ---- 15�� pl/sql��
 
 set serveroutput on --����� �ִ� ������ ȭ�鿡 �����ش�. ����Ŭ���� ������ �ִ� ���ν����� ������ ����� �ִ� ��ɾ�
 
Begin
    DBMS_OUTPUT.PUT_LINE('Hello PL/SQL');
end;
/
 
-- ���� �����ϱ�
vempno number(4);
vename varchar2(10);
-- ���Թ� �ֱ�
vempno := 1001;
vename := '����';

-- �����ȿ� ���־ ����ϱ�
declare
    vempno number(4);
    vename varchar2(10);
begin
   vempno := 1001;
   vename := '����';
   DBMS_OUTPUT.PUT_LINE(' ���       �̸�');
   DBMS_OUTPUT.PUT_LINE('------------');
   DBMS_OUTPUT.PUT_LINE(vempno || '    '  || vename); 
end;
/
 
-- ���� ���� : ��Į�󺯼�, ���۷��� ����
-- 1) ��Į�� ����
  vempno number(4);
  vename varchar2(10);
-- 2)  ���۷��� ����
  vempno emp.empno%type;
  vename  emp.ename%type;
-- 2-1) ���۷��� �����ε� �ο���� �����ϴ� 
  vemp emp%rowtype;
  
-- select��
-- select  * from emp ;  �Ϲ� SQL��
select ename into vename  from emp; -- emp���̺��� �÷� ename�� vename ������ �־� �ֱ�

-- emp���̺��� �����ȣ�� �̸��� ��ȸ�ϱ� PL/SQL������ �����
declare
    vempno emp.empno%type;
    vename  emp.ename%type;
begin
   select empno, ename into vempno, vename from emp where ename='����';
    DBMS_OUTPUT.PUT_LINE(' ���       �̸�');
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
      vdname :='�渮��';
   elsif (vdeptno = 20) then
      vdname := '�λ��';
   elsif (vdeptno = 30) then
      vdname := '������';   
   else 
       vdname := '�����';
   end if;    
   
    DBMS_OUTPUT.PUT_LINE(' ���       �̸�     �μ���ȣ      �μ���');
    DBMS_OUTPUT.PUT_LINE('------------------------------');
    DBMS_OUTPUT.PUT_LINE(vempno || '     '  || vename || '      '  ||  vdeptno || '      ' || vdname); 
end;
/

-- �ݺ��� loop
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

-- �ݺ��� for
declare
  
begin 
  for n in 1..5 loop
       dbms_output.put_line(n);
  end loop ;
end;
/

-- �ݺ��� while
declare
  n number := 1;
begin 
  while n<=5 loop
       dbms_output.put_line(n);
       n := n+1;
  end loop ;
end;
/

  
 
 
 
 
 
 
 
 
         
         
         