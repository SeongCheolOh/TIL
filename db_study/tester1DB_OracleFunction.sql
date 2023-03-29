-- 오라클 주요 함수
select 85/3 from dual;
select * from dual;
select round(85/3) 반올림 from dual;
select abs(-90) 절대값, trunc(34.5678,2), mod(90,8) 나머지 from dual;
--문자 처리 함수
select 'Welcome to Oracle', upper('Welcome to Oracle') 대문자 , lower('Welcome to Oracle') 소문자, initCap('WELCOME TO ORAGLE') 첫글자만_대문자 from dual;
select length('홍길동') from dual; -- 문자 길이
select lengthb('홍길동') from dual; -- 문자 바이트 수

select substr('Welcome To Oracle', 4, 3) 문자열4번째_3개까지 from dual;
--TO cem 출력
select substr('Welcome To Oracle', 9,1)||
            substr('Welcome To Oracle', 12,1)||
            substr('Welcome To Oracle', 8,1)||
            substr('Welcome To Oracle', 4,1)|| 
            substr('Welcome To Oracle', 2,1)|| 
            substr('Welcome To Oracle', 6,1) 
            from dual;
            
select * from student;
--제용석 학생의 이메일 출력하기
select stu_email from student where stu_name='제용석';
--제용석 학생의 이메일에서 @을 출력하기
select substr(stu_email,6,1) from student where stu_name='제용석';
--학생 아이디에서 2번째 3번째 숫자를 뽑기 모든 레코드
select stu_id from student;
select substr(stu_id,2,2) 일렬번호 from student;
--email 앞 아이디만 자르기
select substr(stu_email,1,instr(stu_email,'@')-1) from student;

--instr 실습
select instr('데이터베이스', '이')from dual;
select instr('데이터베이스', '이', 4,1) from dual;--4번째 인덱스부터 찾는데 1번째로 '이'가 나오는 위치
select instr('학생아이디 학생아이디', '아', 1, 2) from dual;-- 1번째 인덱스부터 찾는데 2번째로 '아'가 나오는 위치
select instr('없는 글자는 어떻게 나올까?', '박') from dual;

select * from student;
--stu_id에 110이 존재하나?
select instr(stu_id,110),stu_id from student;

select lpad('홍길동', 20, '#') from dual;
select rpad('홍길동',20,'#') from dual;

--형변환 함수
select sysdate from dual; --컴퓨터 상 날짜
select sysdate, to_char(sysdate, 'yy"년 "mm"월 "dd"일" am hh"시" mi"분" ss"초"') from dual;
select to_char(123000, 'L999,999') from dual;
select to_char(123000, 'L000,000') from dual;
select to_char(12, 'L99,999') from dual; --자릿수가 남아도 채우지 않음
select to_char(123000, 'L0,000,000') from dual; --자릿수가 남으면 0으로 채움
select to_char(123000, 'L00,000') from dual; --자릿수가 모자라면 전부 ######가 됨
select to_char(12.3456, 'L00,000.00') from dual; --남는데는 0으로 채우고, 모자란데는 올림
select to_char(12.3456, 'L00,000.000000') from dual;

select * from emp;
-- insert 된 date타입의 데이터를 형변환해서 입력
--emp테이블에 (1012, '박수민', null, 1003, 230329, 850, 0, 10);
insert into emp values(1012, '박수민', null, 1003, 230329, 850, 0, 10); --날짜가 number타입이라 오류
insert into emp values(1012, '박수민', null, 1003, to_date(230329,'yy/mm/dd'), 850, 0, 10);
--(1013, '차영주', null, 1005, '220515', 740, 0, 10); 삽입
insert into emp values(1013, '차영주', null, 1005, to_date(220515, 'yy/mm/dd'), 740, 0, 10);
--2007년 4월2일 입사한 사람 검색
select * from emp where hiredate='070402';

select * from emp where hiredate like '%/04/%'; --04월 입사자만 검색
select * from emp where to_char(hiredate, 'yy')='07'; --07년도 입사자만 검색
--mgr의 숫자를 날짜로 바꾸기
select mgr, to_date(mgr, 'mm/dd') from emp where mgr != 0;
--입사일 날짜 >> 숫자로 바꾸기
select hiredate, to_number( to_char(hiredate, 'yyyymmdd'),99999999) from emp;
select hiredate, to_number(hiredate, '99999999') from emp;
select * from emp;