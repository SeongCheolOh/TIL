package com.mysite.sbb.question;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer>{
	//제목을 통해 데이터 조회를 하기 위한 메소드 생성
	Question findBySubject(String subject);
	//두 개의 속성을 And조건으로 조회할 때
	Question findBySubjectAndContent(String subject, String content);
	//subject에 특정 문자열이 포함되어있는지 조회 할 때
	List<Question> findBySubjectLike(String subject);
	//페이징 구현
    Page<Question> findAll(Pageable pageable);
}
