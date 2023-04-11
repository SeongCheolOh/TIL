package sample.spring.yse;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {//저장소 역할을 하는 클래스

	//필드 선언
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	//메소드 삽입에 관련 역할을 하는 메소드 insert - (username)
	public int insert ( Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("book.insert", map);
	}
}
