package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {        
        Question q1 = new Question();
        q1.setSubject("sbb가 무엇인가요?");
        q1.setContent("sbb에 대해서 알고 싶습니다.");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);  // 첫번째 질문 저장

        Question q2 = new Question();
        q2.setSubject("스프링부트 모델 질문입니다.");
        q2.setContent("id는 자동으로 생성되나요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);  // 두번째 질문 저장
    }
    
    @Test
    void testJpa2() {
    	List<Question> all = this.questionRepository.findAll();
    	System.out.println(all.get(0).getSubject() + "test~~~~~~~~~~~");
    	System.out.println(all.get(2).getSubject());
    	assertEquals(18, all.size());//assertEquals(기댓값, 실제처리값)
    }
    @Test
    void testJpqFindById() {
    	Optional<Question> oq = this.questionRepository.findById(10);
    	if(oq.isPresent()) {
    		Question q = oq.get();
    		assertEquals("sbb subject2", q.getSubject());
    	}
    }
}