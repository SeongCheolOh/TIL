--tester1 ����ڿ��� view ���� ������ �ֱ�
grant create view to tester1;

create user tester20 identified by 1234;
grant create session to tester20;
create user tester30 identified by 1234;
create user tester40 identified by 1234;
--����(session) ���� �ֱ�
grant create session to tester30;
grant create session to tester40;
--���̺� ���� ���� �ֱ�
grant create table to tester20;
--���̺� ������ ��뷮 �ֱ�
alter user (����ڸ�) quota (�뷮) on system;
--�ٸ� ����ڷ� �ű� ��
conn (����ڸ�)/(��й�ȣ);
--���� �����
create roll (���Ҹ�);
--���� ���Ҹ� ���� �ֱ�
grant (���Ѹ�1) (���Ѹ�2) ...to (���Ҹ�);
--user ����
drop user (����ڸ�);

--ex) �����(a)�� �����(b)�� ���� ���̺�(dept)�� �˻��ϱ�
--dept�� ���� ������ b�� system�� �����ִ�
--a�� dept���̺��� �˻��Ϸ��� b �Ǵ� system���� ������ �ο��޾ƾ� �Ѵ�
grant (���Ѹ�) on (���̺��) to (���� �ο����� ����ڸ�);
--ex2) a���� select �� �� (��Ű�� ����)
--��Ű���� ?? >> ��ü�� ������ ����ڸ� ��
select * from (���̺��) -- ����
select * from (������ ����ڸ�.���̺��) -- >> ��Ű�� �ۼ� �ʿ�
--ex3) a���� insert �� �� ���� b�κ��� insert ������ �޾ƿ;� �Ѵ�
grant (���Ѹ�) on (���̺��) to (���� �ο����� ����ڸ�);
conn a/1234;
insert into a.dept values (~~~) -->>���� ��Ű�� �ۼ� �ʿ�
--ex4) ���̺� �� ������ �����ϱ�
--���� ���̺� �����ڷ� �Űܰ��� delete ������ ����ڿ��� �ο��ϰ� �۾� ����
delete from (�����ڸ�.���̺��) where (����);

--���� ȸ���ϱ�
--���� �����Ѱ� >> ������(system, sys), �����(���̺�(��ü) ����) 
revoke (���Ѹ�) on (���̺��) from (����ڸ�); --> �����ڿ��� ���� ȸ�� ��ɾ�
revoke (���Ѹ�) on (�����ڸ�.���̺��) from (����ڸ�); --> system���� ���� ȸ�� ��ɾ�


--cmd ����ϱ�
sqlplus
(����ڸ�) (��й�ȣ) �Է�
1)�⺻ >> system, 1234
���⼭ ����� ����, ���� �ο� �� ����
2) ������ �����