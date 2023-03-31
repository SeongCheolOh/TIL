-- ķ����� ���̺� �����
create table campingEqu(
  equiCode varchar2(10) not null,
  itemName varchar2(30) not null,
  price number(8),
  count number(4),
  primary key(equiCode)
);
drop table campingEqu;
-- �� ���̺� �����
create table custom(
  customId varchar2(10) not null,
  name varchar2(30) not null,
  phone varchar2(20) not null,
  address varchar2(50),
  primary key(customId)
); 
-- �뿩 ���̺� �����
create table lent(
  lentId varchar2(10) not null,
  equiCode varchar2(10) not null,
  customId varchar2(10) not null,
  lentDate date not null,
  lentAmount number(8),
  primary key(lentId),
  foreign key(equiCode) references campingEqu(equiCode),
  foreign key(customId) references custom(customId)
);
create table return(
  returnId varchar2(10) not null,
  lentId varchar2(10) not null,
  returnDate date not null,
  overdueAmount number(8) not null,
  primary key(returnId),
  foreign key( lentId ) references lent(lentId)  
);

-- 3�� 50�б��� �ٸ� ������Ʈ�� ���̺����� ���� 
-- ���̺� ����� �ּ���

-- ���̺�ȿ� �����͸� �����ϱ�
insert into campingequ 
      values( 'T-100','��Ʈ',100000, 30); 
insert into campingequ 
      values( 'C-200','����',10000, 100);
insert into campingequ 
      values( 'F-300','�׸�',50000, 70);      
-- ��ü ���ڵ� �˻��ϱ�
select * from campingequ;
-- ���ǿ� �����ϴ� ���ڵ带 �����ϱ�
delete from campingequ where itemName='�׸�';

insert into custom 
      values( 'C-100', 'ȫ�浿', '01012345678', '����� ������');
insert into custom 
      values( 'C-101', '�̼���', '01087654321', '��⵵ �ϳ���');
insert into custom 
      values( 'C-102', '�ּ���', '01055557777', '��⵵ �ϳ���');
select * from custom;    
-- ��⵵ �ϳ��� �ּ��� �ּҸ� �����ϱ�
update custom set address = '��⵵ ������' where customId = 'C-102';

insert into lent
       values( 'L-001', 'T-100','C-100', '2023-03-28', 2);
insert into lent
       values( 'L-002', 'F-300','C-102', '2023-03-29', 5);
insert into lent
       values( 'L-003', 'T-100','C-102', '2023-03-29', 1); 
select * from lent;     

insert into return
       values( 'R-001', 'L-001','2023-04-07', 0);

insert into return
       values( 'R-002', 'L-003','2023-04-10', 50000);       

select * from return;

-- �����ϱ� ����
insert into ���̺��
    values( '���ڵ�����', ���ڵ�����,'���ڵ���Ÿ');
-- �����ϱ� ����
delete from ���̺�� where �����÷��� = '�������������';
-- �����ϱ� ����
update ���̺�� set �÷��� = �����һ��ο��ڷ� where �������÷��� = ã���ڷ�;

-- �ݳ��� ����� �̸��� ����� �ּ��� ���� ȫ�浿 �ּ���

-- 3�� 28�� �뿩�� ����� �̸��� �ּҸ� ����� �ּ���.

-- ��������, ������� ���� ������Ʈ�ȿ� ���� �����͸� �����ϱ�


