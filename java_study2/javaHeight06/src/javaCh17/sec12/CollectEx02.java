package javaCh17.sec12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEx02 {

	public static void main(String[] args) {
		// 
		
		List<Student> totalList = new ArrayList<Student>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("김자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));
		
		Map<String, Double>map = 
				totalList.stream()
						.collect(Collectors.groupingBy
								(s->s.getSex(),
										Collectors.averagingDouble(s->s.getScore())));
		System.out.println(map);

		List<Student1> totalList1 = new ArrayList<Student1>();
		totalList1.add(new Student1("1학년", "홍길동", "남", 92));
		totalList1.add(new Student1("2학년", "김수영", "여", 87));
		totalList1.add(new Student1("1학년", "김자바", "남", 95));
		totalList1.add(new Student1("3학년", "오혜영", "여", 93));
		totalList1.add(new Student1("3학년", "김혜영", "여", 93));
		totalList1.add(new Student1("3학년", "박혜영", "여", 93));

		//학년별로 인원수 구하기
//		Map<String, Double>map1 = totalList1.stream()
//				.collect(Collectors
//						.groupingBy(s->s.getGrade(),Collectors
//								.counting(s->s.getGrade())));
//		System.out.println(map1);
	}

}
