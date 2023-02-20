package checkEx;

import java.util.HashSet;
import java.util.Set;

public class Ex08 {
	
	public static void main(String[] args) {
		
		//학번이 같으면 동일한 학생이라 가정하고 중복 저장 되지않게끔 class를 수정
		
		Set<Ex08Class> set = new HashSet<Ex08Class>();
		
		set.add(new Ex08Class(1, "홍길동"));
		set.add(new Ex08Class(2, "신용권"));
		set.add(new Ex08Class(1, "조민우"));
		
		System.out.println("저장된 객체 수 : " + set.size());
		for(Ex08Class ex : set) {
			System.out.println(ex.studentNum + " : " + ex.name);
		}
	}

}
