package checkEx;

import java.util.List;

public class Ex07 {

	public static void main(String[] args) {
		Ex07classDao dao = new Ex07classDao();
		
		List<Ex07class> list = dao.getEx07classesList();//Board�ڷḦ List�� �־��ְ� List�� �ּҸ� ����
		
		for(Ex07class ec : list) {
			System.out.println(ec.getTitle() + " " + ec.getContent());
		}

	}

}
