-- ����Ŭ �ֿ� �Լ�
select 85/3 from dual;
select * from dual;
select round(85/3) �ݿø� from dual;
select abs(-90) ���밪, trunc(34.5678,2), mod(90,8) ������ from dual;
--���� ó�� �Լ�
select 'Welcome to Oracle', upper('Welcome to Oracle') �빮�� , lower('Welcome to Oracle') �ҹ���, initCap('WELCOME TO ORAGLE') ù���ڸ�_�빮�� from dual;
select length('ȫ�浿') from dual; -- ���� ����
select lengthb('ȫ�浿') from dual; -- ���� ����Ʈ ��

select substr('Welcome To Oracle', 4, 3) ���ڿ�4��°_3������ from dual;
--TO cem ���
select substr('Welcome To Oracle', 9,1)||
            substr('Welcome To Oracle', 12,1)||
            substr('Welcome To Oracle', 8,1)||
            substr('Welcome To Oracle', 4,1)|| 
            substr('Welcome To Oracle', 2,1)|| 
            substr('Welcome To Oracle', 6,1) 
            from dual;
            
select * from student;
--���뼮 �л��� �̸��� ����ϱ�
select stu_email from student where stu_name='���뼮';
--���뼮 �л��� �̸��Ͽ��� @�� ����ϱ�
select substr(stu_email,6,1) from student where stu_name='���뼮';
--�л� ���̵𿡼� 2��° 3��° ���ڸ� �̱� ��� ���ڵ�
select stu_id from student;
select substr(stu_id,2,2) �ϷĹ�ȣ from student;
--email �� ���̵� �ڸ���
select substr(stu_email,1,instr(stu_email,'@')-1) from student;

--instr �ǽ�
select instr('�����ͺ��̽�', '��')from dual;
select instr('�����ͺ��̽�', '��', 4,1) from dual;--4��° �ε������� ã�µ� 1��°�� '��'�� ������ ��ġ
select instr('�л����̵� �л����̵�', '��', 1, 2) from dual;-- 1��° �ε������� ã�µ� 2��°�� '��'�� ������ ��ġ
select instr('���� ���ڴ� ��� ���ñ�?', '��') from dual;

select * from student;
--stu_id�� 110�� �����ϳ�?
select instr(stu_id,110),stu_id from student;

select lpad('ȫ�浿', 20, '#') from dual;
select rpad('ȫ�浿',20,'#') from dual;

--����ȯ �Լ�
select sysdate from dual; --��ǻ�� �� ��¥
select sysdate, to_char(sysdate, 'yy"�� "mm"�� "dd"��" am hh"��" mi"��" ss"��"') from dual;
select to_char(123000, 'L999,999') from dual;
select to_char(123000, 'L000,000') from dual;
select to_char(12, 'L99,999') from dual; --�ڸ����� ���Ƶ� ä���� ����
select to_char(123000, 'L0,000,000') from dual; --�ڸ����� ������ 0���� ä��
select to_char(123000, 'L00,000') from dual; --�ڸ����� ���ڶ�� ���� ######�� ��
select to_char(12.3456, 'L00,000.00') from dual; --���µ��� 0���� ä���, ���ڶ����� �ø�
select to_char(12.3456, 'L00,000.000000') from dual;

select * from emp;
-- insert �� dateŸ���� �����͸� ����ȯ�ؼ� �Է�
--emp���̺� (1012, '�ڼ���', null, 1003, 230329, 850, 0, 10);
insert into emp values(1012, '�ڼ���', null, 1003, 230329, 850, 0, 10); --��¥�� numberŸ���̶� ����
insert into emp values(1012, '�ڼ���', null, 1003, to_date(230329,'yy/mm/dd'), 850, 0, 10);
--(1013, '������', null, 1005, '220515', 740, 0, 10); ����
insert into emp values(1013, '������', null, 1005, to_date(220515, 'yy/mm/dd'), 740, 0, 10);
--2007�� 4��2�� �Ի��� ��� �˻�
select * from emp where hiredate='070402';

select * from emp where hiredate like '%/04/%'; --04�� �Ի��ڸ� �˻�
select * from emp where to_char(hiredate, 'yy')='07'; --07�⵵ �Ի��ڸ� �˻�
--mgr�� ���ڸ� ��¥�� �ٲٱ�
select mgr, to_date(mgr, 'mm/dd') from emp where mgr != 0;
--�Ի��� ��¥ >> ���ڷ� �ٲٱ�
select hiredate, to_number( to_char(hiredate, 'yyyymmdd'),99999999) from emp;
select hiredate, to_number(hiredate, '99999999') from emp;
select * from emp;