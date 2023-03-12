package javaCh17.sec06;

import java.util.ArrayList;
import java.util.List;

public class MapEx01 {

	public static void main(String[] args) {
		// p.740
		
		//list 컬렉션 생성
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("홍길동1", 85));
		studentList.add(new Student("홍길동2", 92));
		studentList.add(new Student("홍길동3", 87));
		
		studentList.add(new Student("홍길동4", 85, 2.5));
		studentList.add(new Student("홍길동5", 92, 1.5));
		studentList.add(new Student("홍길동6", 87, 0.5));
		
		
		//Student를 score스트림으로 변환
		studentList.stream()
				   .mapToInt(s->s.getScore())
				   .forEach(score->System.out.println(score));
		System.out.println();
		
		//시력이 나오게
		studentList.stream()
					.mapToDouble(s->s.getSee())
					.forEach(s->System.out.println(s));
		System.out.println();
		
		//이름 나오게
		studentList.stream().map(s->s.getName()).forEach(s->System.out.println(s));
		
	}

}
