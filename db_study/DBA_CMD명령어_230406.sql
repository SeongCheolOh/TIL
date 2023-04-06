--tester1 사용자에게 view 만들 권한을 주기
grant create view to tester1;

create user tester20 identified by 1234;
grant create session to tester20;
create user tester30 identified by 1234;
create user tester40 identified by 1234;
--접속(session) 권한 주기
grant create session to tester30;
grant create session to tester40;
--테이블 생성 권한 주기
grant create table to tester20;
--테이블 데이터 사용량 주기
alter user (사용자명) quota (용량) on system;
--다른 사용자로 옮길 때
conn (사용자명)/(비밀번호);
--역할 만들기
create roll (역할명);
--만든 역할명에 권한 주기
grant (권한명1) (권한명2) ...to (역할명);
--user 삭제
drop user (사용자명);

--ex) 사용자(a)가 사용자(b)가 만든 테이블(dept)을 검색하기
--dept에 관한 권한은 b와 system이 갖고있다
--a는 dept테이블을 검색하려면 b 또는 system에게 권한을 부여받아야 한다
grant (권한명) on (테이블명) to (권한 부여받을 사용자명);
--ex2) a에서 select 할 때 (스키마 예시)
--스키마란 ?? >> 객체를 소유한 사용자를 뜻
select * from (테이블명) -- 오류
select * from (생성한 사용자명.테이블명) -- >> 스키마 작성 필요
--ex3) a에서 insert 할 때 역시 b로부터 insert 권한을 받아와야 한다
grant (권한명) on (테이블명) to (권한 부여받을 사용자명);
conn a/1234;
insert into a.dept values (~~~) -->>역시 스키마 작성 필요
--ex4) 테이블 내 데이터 삭제하기
--역시 테이블 생성자로 옮겨가서 delete 권한을 사용자에게 부여하고 작업 진행
delete from (생성자명.테이블명) where (조건);

--권한 회수하기
--누가 가능한가 >> 관리자(system, sys), 사용자(테이블(객체) 주인) 
revoke (권한명) on (테이블명) from (사용자명); --> 생성자에서 권한 회수 명령어
revoke (권한명) on (생성자명.테이블명) from (사용자명); --> system에서 권한 회수 명령어


--cmd 사용하기
sqlplus
(사용자명) (비밀번호) 입력
1)기본 >> system, 1234
여기서 사용자 생성, 권한 부여 등 가능
2) 생성한 사용자