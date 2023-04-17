package org.zerock.web.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.web.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
  
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.zerock.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("org.zerock.mapper.MemberMapper.getTime");
	}
	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert("org.zerock.mapper.MemberMapper.insertMember", vo);
	}
}
