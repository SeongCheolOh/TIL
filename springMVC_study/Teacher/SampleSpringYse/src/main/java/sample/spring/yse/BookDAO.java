package sample.spring.yse;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository  // 스프링이 관리한다  저장소 용도로 사용하는 클래스이다 라고 지정함
public class BookDAO {

	//필드 선언
	@Autowired  // 자동주입해라 
	SqlSessionTemplate sqlSessionTemplate;
	
	//메소드 삽입에 관련 역할을 하는 메소드 insert- username 
	public int insert( Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("book.insert", map);
	}
	
	//책 상세 DAO메서드 작성
	public  Map<String, Object>   selectDetail( Map<String, Object> map ) {
		return this.sqlSessionTemplate.selectOne("book.select_detail", map);	
	}
}
