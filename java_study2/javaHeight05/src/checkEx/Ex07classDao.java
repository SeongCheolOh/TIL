package checkEx;

import java.util.ArrayList;
import java.util.List;

public class Ex07classDao {
	
//	List<Ex07class> list = dao.getEx07classList(); //Board�ڷḦ List�� �־��ְ� List�� �ּҸ� ����
	
	List<Ex07class> getEx07classesList(){
		List<Ex07class> list1 = new ArrayList<Ex07class>();
		list1.add(new Ex07class("����1", "����1"));
		list1.add(new Ex07class("����2", "����2"));
		list1.add(new Ex07class("����3", "����3"));
		return list1;
	}
	
}
