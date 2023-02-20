package checkEx;

import java.util.List;

public class Ex07 {

	public static void main(String[] args) {
		Ex07classDao dao = new Ex07classDao();
		
		List<Ex07class> list = dao.getEx07classesList();//Board자료를 List에 넣어주고 List의 주소를 리턴
		
		for(Ex07class ec : list) {
			System.out.println(ec.getTitle() + " " + ec.getContent());
		}

	}

}
