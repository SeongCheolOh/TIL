-- 사용자 만들기
create user tester1 identified by 1234;
-- 역할(권한) 주기
grant connect, resource to tester1;
-- stmanager 사용자의 DB만들기
create user stmanager identified by 1234;
-- 역할(권한) 주기
grant connect, resource to stmanager

-- 1단계 DataBase 만들기
-- 2단계 권한 부여받기
-- 3단계 테이블 만들기
-- 3-1 구조만들기
create table course(
    cou_id number(4) not null,
    cou_name varchar(20) null,
    Tea_name varchar(20) null,
    primary key(cou_id) --표를 나타낼 때 대표값(기본 키)
);
create table student(
    stu_id number(4) not null,
    stu_name varchar(20) null,
    age number(3) null,
    stu_email varchar2(20) null,
    cou_id number(4) not null,
    sex char(1) default 'M',
    primary key(stu_id),
    foreign key(cou_id) references course(cou_id)
);

--데이터 삽입
insert into course values (10,'모바일','성윤정');
insert into course values (20,'모바일','성윤정');
insert into course values (30,'윈도우','황연주');
insert into course values (40,'웹표준','전혜영');

insert into student value(101, '문종헌', 24,'moon@naver.com',10,'M');
insert into student value(102, '오한솔', 22,'fiveone@naver.com',40,'M');
INSERT INTO STUDENT VALUES(103,'제용석', 22,'again@nate.com',20,'M');
INSERT INTO STUDENT VALUES(104,'정국철', 22,'cook@nate.com',20,'M');
INSERT INTO STUDENT VALUES(105,'박홍진', 24,'red@nate.com',10,'M');
INSERT INTO STUDENT VALUES(106,'김현우', 21,'kim@nate.com',20,'M');
INSERT INTO STUDENT VALUES(107,'박시준', 22,'season@nate.com',20,'M');
INSERT INTO STUDENT VALUES(108,'김준형', 27,'brother@nate.com',10,'M');
INSERT INTO STUDENT VALUES(109,'문혜진', 22, NULL,20,'F');
INSERT INTO STUDENT VALUES(110,'박기석', 34,'flag@nate.com',10,'M');
INSERT INTO STUDENT VALUES(111,'윤효선', 24,'od@nate.com',30,'F');
INSERT INTO STUDENT VALUES(112,'안창범', 34,'window@nate.com',30,'M');
INSERT INTO STUDENT VALUES(113,'공지훈', 28, NULL, 10,'M');
INSERT INTO STUDENT VALUES(114,'이봉림', 29,'bbong@nate.com',10,'M');
INSERT INTO STUDENT VALUES(115,'안창범', 24,'chang@nate.com',30,'M');
INSERT INTO STUDENT VALUES(116,'장희성', 34,'shine@nate.com',10,'M');

--데이터 검색
select * from course;
select * from student;
--테이블 안에 레코드=로우=행(한줄 데이터) 모두 삭제하기
truncate table student;
select *from student;

--테이블 생성
create table dept01(
    deptno number(4),
    dname varchar2(10),
    loc varchar2(9)
);
--구조 변경
alter table dept01
modify(dname varchar2(30));
--구조 추가
alter table dept01
add(etc varchar2(50));
--구조 삭제
alter table depth01
drop(etc);
--테이블 이름 변경하기
rename dept01 to dept02;
--테이블의 레코드와 구조를 모두 삭제하기
drop table student
--구조 확인
desc dept01;
desc dept02;
--사용자 생성
create user tester2 identified by 1234;
create user orauser1 identified by 1234;
--권한 부여
grant create session to orauser1;--세션 생성 권한
--권한 제거 (부여한 곳에서만 제거 가능하다)
revoke create session from orauser1;
--사용자 제거
drop user tester2;
drop user orauser1;

create user tester02 identified by tester021234;
create user tester03 identified by tester031234;
grant connect, resource to tester02, tester03;