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
select  * from emp ;  --�Ϲ� SQL��
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
---------------------------------------------------
  insert into dept( deptno, dname, loc) 
          values( 10, '�渮��', '����');
insert into dept( dname, loc, deptno)
          values( '�λ��', '��õ', 20);
insert into dept values( 30, '������', '����'); -- dept( deptno, dname, loc)  ���̺��� �÷� ���� ������� 
-- insert into dept values( '�����', '����', 40 ); -- �ȵ�
insert into dept values( 40, '�����', '����' );
 -----------------------------------------------------------------
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1001, '����', '���', 1013, '2007/03/10',  300, 0,20);   
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1002, '�ѿ���', '�븮', 1005, '2007/04/02',  250, 6,30);                       
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1003, '����ȣ', '����', 1005, '2005/02/10',  500, 100,30);                     
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1004, '�̺���', '����', 1008, '2003/09/02',  600, 0,20);                        
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1005, '�ŵ���', '����', 1005, '2005/04/07',  450, 200,30);   
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1006, '�嵿��', '����', 1008, '2004/01/08',  520, 0,20);                         
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1007, '��켺', '����', 1008, '2005/03/08',  500, 0,30);                    
INSERT INTO  emp ( empno, ename,  job, mgr, hiredate, sale, comm, deptno )
                       VALUES (1008, '�ȼ���', '����', 0, '1996/04/07',  1000, 0,30); 
-----------------------------------------------------------------------------
--16�� ���� ���ν���
drop table emp01;
create table emp01
as
select * from emp;
select * from emp01;
-- ó���ܰ� 
-- 1�� : ���ν��� �����ϱ� -> 2�� ������ -> 3�� ����
create or replace procedure del_all
is
begin
    delete from emp01;
    commit;
end;
/
-- 3�� �����ϱ�
execute del_all;
desc user_source;
select name, type, line, text from user_source; -- ���� �����ͺ��̽� �� ���ν���, �Լ�, Ʈ���� ���� ������ �� �� �ִ�
-- �̾� ���� ���� ����� �����ϴ� ���ν��� �����
create or replace procedure del_name(vename emp01.ename%type)
is
begin
    delete from emp01 where ename like vename;
    commit;
end;
/
execute del_name('��%'); -- ���μ�, �ǸŰ�����, �Ķ���Ͱ� ������ �Ҹ�
select * from emp01;
-- in, out, inout �Ű�����
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
-- ���ν����� ����
-- ���� Ŭ���̾�Ʈ�� ���� ��Ģ�� ������ �� �ִ�
-- �������� �̸� ������ �������� �����ΰ�, Ŭ���̾�Ʈ�� ���๮�� �� �Ű����� ������ �Ǳ⶧���� �ӵ��� ������
-- ���ȼ��� ����ϴ�

--�����Լ�
--Ư¡ : ���ν����� �ٸ����� �������� �ǵ������� �� �ִ�
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
-- �Լ� ȣ��
variable var_res number;
execute :var_res := call_bonus(1001);
print var_res;
-- Ŀ��
select * from emp;
--�����ͺ��̽����� �� �κ��� �ڵ�
create or replace procedure cursor_sample01
is
    vdept dept%rowtype;
    cursor c1 -- 1�ܰ� - Ŀ�� ����
    is
    select * from dept;
begin
    dbms_output.put_line('�μ���ȣ   �μ���   ������');
    dbms_output.put_line('-------------------------------------');
    open c1; -- 2�ܰ� - Ŀ�� ����
    loop
        fetch c1 into vdept.deptno, vdept.dname, vdept.loc; -- 3�ܰ� - fetch
        exit when c1%notfound; -- 4�ܰ� - ������ ������ �� ���� �ݺ�
        dbms_output.put_line(vdept.deptno || '  ' || vdept.dname || '  ' || vdept.loc);
    end loop;
    close c1; -- 5�ܰ�
end;
/
-- ���� >> �ڹ��ʿ��� �� �κ��� �ڵ�
set serveroutput on
    execute cursor_sample01;

-- Ʈ����
-- ���Ի���� ������ �߰��� �� '���� ����� �Ի��߽��ϴ�' ��� ����ϱ�
drop table emp02;
create table emp02(
    empno number(4) primary key,
    ename varchar2(20),
    job varchar2(20));
-- Ʈ���� ����
create or replace trigger tgr_01
    after insert
    on emp02
    begin
        dbms_output.put_line('���� ����� �Ի��߽��ϴ�');
    end;
    /
-- ����
insert into emp02 values(1001, '���缮', '���');
insert into emp02 values(1002, '�豤��', '���');
select * from emp02;
update emp02 set ename = 'ȫ�浿' where empno = 1001;

-- �޿� ������ �ڵ����� �߰��ϴ� Ʈ���� �ۼ�
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
    
insert into emp02 values(1003, '�ϵ���', '���');
delete emp02 where empno=1004; 
insert into emp02 values(1004, '��ȣ��', '���');
select *from emp02;
select * from sal01;

-- �޿� ������ �ڵ� �����ϴ� Ʈ���� �ۼ�
-- ��Ȳ) ����� ����ߴ�. �޿� ���̺��� �����ϰ�, ��� ���̺��� �����ϱ�
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
-- ���� >> emp02 ���̺��� ������ Ʈ���� ���� �� :old.empno�� emp���̺��� 1004 