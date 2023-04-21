package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;

@SpringBootTest
class SbbApplicationTests {
	
// [질문]
	@Autowired
	private QuestionRepository questionRepository;
	
//	데이터 삽입
//	@Test
    void insertData() {        
        Question q1 = new Question();
        q1.setSubject("sbb가 무엇입니까?");
        q1.setContent("Sbb에 대해서 알고 싶습니다.");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);  // 첫번째 질문 저장

        Question q2 = new Question();
        q2.setSubject("스프링부트 모델 질문입니다.");
        q2.setContent("id는 자동으로 생성되나요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);  // 두번째 질문 저장
    }
    
//	데이터 조회하기
//	@Test 
	void findAll() {
		// 전체 데이터 갯수 비교
		List<Question> all = this.questionRepository.findAll();
		assertEquals(2, all.size());
		// 전체 중 0번 인덱스(1번째) 데이터와 비교
		Question q = all.get(0);
		assertEquals("sbb가 무엇입니까?", q.getSubject());
	}

//	데이터 id를 통해 조회
//	@Test 
	void findById() {
		// findById의 리턴타입은 Questions이 아닌 Optional!!!
		Optional<Question> oq = this.questionRepository.findById(1);
		if(oq.isPresent()) {
			Question q = oq.get();
			assertEquals("sbb가 무엇입니까?", q.getSubject());
		}
	}
	
//	subject를 통해서도 조회하고싶지만 아쉽게도 findBySubject와 같은 메소드를 기본적으로 제공하지 않는다.
//	>> QuestionRepository 인터페이스에서 메소드 선언을 하고 오시오
//	@Test
	void findBySubject() {
		Question q = this.questionRepository.findBySubject("sbb가 무엇입니까?");
		assertEquals(1, q.getId());
	}
	
//	@Test
	void findBySubjectAndContent() {
		Question q = this.questionRepository
				.findBySubjectAndContent("sbb가 무엇입니까?","Sbb에 대해서 알고 싶습니다.");
		assertEquals(1, q.getId());
	}
// and를 제외하고도 or, between, lessthan 등 다양한 메소드로 결합할 수 있는데
//여러개의 값을 리턴받을 땐 Question이 아닌 List<Question>으로 받는다 
//https://wikidocs.net/160890
//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	
//	데이터 특정 텍스트를 포함하여 조회
//	@Test
	void findBySubjectLike() {
		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
		Question q = qList.get(0);
		assertEquals("sbb가 무엇입니까?", q.getSubject());
	}
//	데이터 수정
//	@Test
	void updateData() {
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());//값이 true인지 테스트
		Question q = oq.get();
		q.setSubject("수정된 제목");
		this.questionRepository.save(q);
	}

//	데이터 삭제
//	@Test
	void deleteData() {
        assertEquals(2, this.questionRepository.count()); //총 데이터 갯수 리턴
        Optional<Question> oq = this.questionRepository.findById(1);//id가 1인 데이터를 oq에 담음
        assertTrue(oq.isPresent());//oq가 존재하니? = true
        Question q = oq.get();
        this.questionRepository.delete(q); //삭제
        assertEquals(1, this.questionRepository.count()); //삭제 후 데이터갯수 조회
    }
	
//	[답변]
	@Autowired
	private AnswerRepository answerRepository;
//	데이터 생성
//	@Test
	@Transactional
	void insertDataAns() {
		Optional<Question> oq = this.questionRepository.findById(2);//id가 2인 question 데이터를 oq에 담음
		assertTrue(oq.isPresent());//oq가 존재하니? = true
		Question q = oq.get();
		
		//질문 객체로부터 답변 리스트 구하기
		List<Answer> answerList = q.getAnswerList();
		assertEquals(1, answerList.size());
		assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
		
		Answer a = new Answer();
		a.setContent("네 자동으로 생성됩니다.");
		a.setQuestion(q);// 어떤 질문의 답변인지 알기위해 question객체 필요
		a.setCreateDate(LocalDateTime.now());
		this.answerRepository.save(a);
	}

//	데이터 조회
	@Test
	void selectDataAns() {
		Optional<Answer> oa = this.answerRepository.findById(1);//id가 1인 답변 조회
		assertTrue(oa.isPresent());
		Answer a = oa.get();
		assertEquals(2, a.getQuestion().getId());//그 답변의 질문 id가 2인지 조회
	}
	
}
