package org.zerock.web.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.zerock.web.dao.MemberDAO;
import org.zerock.web.vo.MemberVO;

@ContextConfiguration( locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
  
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception {
		System.out.println("테스트1");
		System.out.println( dao.getTime() );
	}
	
	@Test
	public void testInsertMember() throws Exception {
		MemberVO vo = new MemberVO();
        vo.setUserid("user00");
        vo.setUserpw("1234");
        vo.setUsername("홍길동2");
        vo.setEmail("h2@naver.com");
        dao.insertMember(vo);
        System.out.println("테스트2");
	}
}
