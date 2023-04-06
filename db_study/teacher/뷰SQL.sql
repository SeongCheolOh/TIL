create table c5emp as select  *  from emp;

select * from c5emp;

create view  viewEmp  as select * from c5emp;

-- ������ ������������ ����� ����� ���  ��� ����� �θ� �����ϰ� �������� ������ �� �ִ�.

create view venameMgr  as
    select member.ename ����̸�, manager.ename ���ӻ���̸�
       from emp member left outer join emp manager
       on member.mgr = manager.empno;
       
select *  from  venameMgr where ����̸�='���ȯ';  

select * from student;
select * from course;

--����ϰ� ���Ǵ� ���ι�
-- �ڽ��� ������� �����  �ڽ���ȣ, �ڽ���, �����Ը�, �л���ȣ, �л����� �˻��ϼ���.
select   c.cou_id, c.cou_name, c.tea_name, s.stu_id, s.stu_name  from course c, student s where c.cou_id = s.cou_id;

-- ��� �����
-- ���� create view  ���̸� as ������
create view  vStudentCourse  as 
       select   c.cou_id, c.cou_name, c.tea_name, s.stu_id, s.stu_name  from course c, student s where c.cou_id = s.cou_id;
       
-- �並 �˻��ϱ�
select  * from  vStudentCourse;

select  * from  vStudentCourse where cou_id = 10;
select  * from  vStudentCourse where cou_id in (10, 20) order by cou_id asc;

-- ��� ������ ���� ���̺�
-- ����ϴ� ����? �����ϰ� �� �������� ����ϰ� ����� ��� ��� ����� �θ� ������ ����.
--                        ���ȶ�����

-- ���� ���α����� user_views ������ ��ųʸ�
desc user_views;
select * from user_views;

insert into vStudentCourse( cou_id, cou_name, tea_name, stu_id, stu_name)
                      values( 50, '�ڹ�', 'ȫ�浿', 120, '���ֿ�' ) ; -- ���� ���̺��� �ڷᰡ ����� �� ������ �߻��ؼ� �Է� �� �ȵ�
                      
create table login(
     id varchar2(20),
     password varchar2(20)
);

create table member(
    phone varchar2(20)
); 

-- �ΰ� �÷��� ��� ��ģ �並 �����
select  *  from login, member;

-- ��� �����
create view  vLogin as select  *  from login;

select * from vLogin;

-- ��ȿ� �����͸� �����ϸ� ���������̺�� �����Ͱ� ���Եȴ�. �� ����: ������ ��� �ȵȴ�. �Ѱ��� ���̺��� ��� ���� ���� ������ �� �ִ�.
insert  into  vLogin  
                values ( '1000','1234') ;
                
-- �信 �ִ� �� �˻�
select  *  from vLogin;

--���̺� �ִ� �� �˻�
select  * from login;

-- ���̺�ȿ� ������ �����ϱ�
insert   into  login values( '2000', '4321');

-- ��ȿ� ������ �����ϱ� ���������̺�, ����� ��� ������ �� �ִ�.  �� ����: ������ ��� �ȵȴ�
update  vLogin set password='7896' where id='1000';
update login   set password='9632' where id='2000';

-- ��ȿ� ������ �����ϱ�  ���������̺�, ����� ��� ������ �� �ִ�.  �� ����: ������ ��� �ȵȴ�
delete  from vLogin  where id='1000';
delete from login where id='2000';

-- �並 �����ϱ�  drop view  ��� <-> create view  ���
drop view venamemgr;
drop view viewemp;

-- ���� �����ͺ��̽����� �䰡 ��� �Ǿ� �ִ��� ������ ��ųʸ��� Ȯ���ϱ�
select  *  from user_views;

-- vlogin�䰡 ������ ����� ������ ���ο� ������ �ٽ� �����
create or replace view vlogin   as  select  id  from  login;
create  or replace  view vvlogin as  select id, password   from login where id like '11%';

-- force�ɼ�  ���� ���̺��� ��� ����� ������ ����, �׷��� force�� ���� ���â�� ������ ������ ����. 
create or replace force view  vMember  as select * from kMember;

-- view�� view ���� ��  �ֳ���? �� 
create or replace view  v3Login as  select * from vlogin;

-- �޿��� 800�̻��� ����� �並 ����� �ּ���.  ��� vSal800 
create or replace view vSal800 as
     select * from emp where sale>=800;
-- vSal800 ���� �޿��� 50% �λ��ϼ���
update  vSal800  set  sale = sale +  sale*0.5 ;

select * from vSal800;

-- �信�� dml( insert , update, delete) �ȵǰ� �ϰ� �ʹ�. 
create or replace view vSal800 as
     select * from emp where sale>=800  with read only;
update  vSal800  set  sale = sale +  sale*0.5 ;   -- ������ ��? with read only 
delete from vSal800; --  ������ ��? with read only 
select * from vSal800; -- �˻��� �ȴ�.

-- with check option : where ���� �÷��� �����ϴ� ���� �����ִ� �� 

create or replace view vDept30 as
     select * from emp where deptno=30  with check option;
update  vDept30  set  deptno=50 ;   -- ������ ��? with check option
delete from vDept30; --  ��������
select * from vDept30; -- �˻��� �ȴ�.

-- �信�� dml( insert , update, delete) �ȵǰ� �ϰ� �ʹ�. 
create or replace view vSal18_60 as
     select * from emp where  sale  between 1800 and 6000  with  check option;
select * from vSal18_60;
-- update�ϴµ� 1800~6000���� ������ ����� �ٲٱ�
update  vSal18_60  set  sale = 8000-sale ; -- ����
-- update�ϴµ� 1800~6000���� ������ ����� �ʰ� �ٲٱ�
update  vSal18_60  set  sale = sale + 500 ;  -- ����
-- update�ϴµ� 1800~6000���� ������ �Ϻκи� ����� �ٲٱ� ��ü�� �ȵ�
update  vSal18_60  set  sale = sale + 500 ;  -- ��ü�� ������Ʈ�� �ȵȴ�. noting 

select * from emp where sale is not null order by sale desc;

select ename, sale  from emp where sale is not null order by sale desc;

-- rownum ó���� ���̺��� �ԷµǴ� ������ ����ϴ� �÷�, �ԷµǴ� �������� �����ǰ� �ٲ��� �ʴ´�.
select rownum,  ename, sale  from emp where sale is not null order by sale desc;

-- ȸ�翡�� �޿��� ���� ���� �޴� ����� �˻��ϱ�
select rownum, ename, sale from (  select rownum,  ename, sale  from emp where sale is not null order by sale desc ) 
     where  rownum <= 5;

-- ���� �ִ� student ���̺��� oldStudent ���̺�� �̸� ������
rename student to oldStudent;
     
 -- �乮�� Ǯ�� 1414 �κ� ���ð� ���� Ǯ�� ������
 
------------------13�� ������
create sequence dept_deptno_seq
    start with 10
    increment by 10;
--������ ������ ��ųʸ� ����
desc user_sequences;--(���� Ȯ��)
select * from user_sequences;
--������ ���� �� >> currval
select dept_deptno_seq.currval from dual; --ó������ currval ���� ����
--������ ���� �� >> nextval
select dept_deptno_seq.nextval from dual;
--������ ���
drop sequence dept_deptno_seq;

--���� ��� ����
create sequence emp_seq
    start with 1
    increment by 1
    maxvalue 1000;
create table seqEmp(
    empno number(4), -- �ڵ����� ��ȣ �����ǰ�
    name varchar2(20), -- ���� �Է�
    beginDate date); -- ���� ��¥ �ڵ� �Է�
    
insert into seqEmp values(emp_seq.nextval, 'ȫ�浿', sysdate);
insert into seqEmp values(emp_seq.nextval, '��浿', sysdate);
insert into seqEmp values(emp_seq.nextval, '���浿', sysdate);
insert into seqEmp values(emp_seq.nextval, '�ٱ浿', sysdate);
insert into seqEmp values(emp_seq.nextval, '��浿', sysdate);
select * from seqEmp;
--sequence ����
alter sequence emp_seq
    --start with 1001 �������� ��ĥ �� �����ϴ�
    increment by 10
    maxvalue 80
    cycle cache 2;
--������ ����
insert into seqEmp values(emp_seq.nextval, 'ȫ�浿', sysdate);
insert into seqEmp values(emp_seq.nextval, '��浿', sysdate);
insert into seqEmp values(emp_seq.nextval, '���浿', sysdate);
insert into seqEmp values(emp_seq.nextval, '�ٱ浿', sysdate);
insert into seqEmp values(emp_seq.nextval, '��浿', sysdate);
insert into seqEmp values(emp_seq.nextval, '���浿', sysdate);
insert into seqEmp values(emp_seq.nextval, '�ڱ浿', sysdate);
insert into seqEmp values(emp_seq.nextval, '�ű浿', sysdate);
insert into seqEmp values(emp_seq.nextval, '�̱浿', sysdate);
insert into seqEmp values(emp_seq.nextval, '���浿', sysdate);
--�ڷ� �˻� �� ���� ����ϴ� �÷����� �ε��� �ϴ°� ������ �� ����ȴ�
create index idx_emp_ename
    on emp(ename);
    
set timing on;

select * from emp;
select * from emp where job='���';
select  * from emp where ename= '����';
--�ε��� ����
drop index idx_emp_ename;
--�ε����� ����ϴ� ���
--���̺��� �� ������ ���� ��
--where���� �ش� �÷��� ���� ���� ��
--�˻� ����� ��ü�������� 2~4%������ ��
--join�� ���� ���Ǵ� �÷��̳� null�� �����ϴ� �÷��� ���� ���

--�ε��� ������� �ʴ� ���
--���̺� �� ���� ���� ��
--where�� �ش� �÷��� ���� ���� ��
--�˻� ����� ��ü �������� 10% �̻��� ��
--���̺� DML(insert, update, delete)�۾��� ���� ��