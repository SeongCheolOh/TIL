package checkEx;

import java.util.ArrayList;
import java.util.List;

public class Ex07classDao {
	
//	List<Ex07class> list = dao.getEx07classList(); //Board자료를 List에 넣어주고 List의 주소를 리턴
	
	List<Ex07class> getEx07classesList(){
		List<Ex07class> list1 = new ArrayList<Ex07class>();
		list1.add(new Ex07class("제목1", "내용1"));
		list1.add(new Ex07class("제목2", "내용2"));
		list1.add(new Ex07class("제목3", "내용3"));
		return list1;
	}
	
}
