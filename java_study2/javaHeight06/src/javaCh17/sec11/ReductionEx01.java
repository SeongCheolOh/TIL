package javaCh17.sec11;

import java.util.Arrays;
import java.util.List;

import javaCh17.sec10.Student;

public class ReductionEx01 {

	public static void main(String[] args) {
		// p.758
		
		List<Student> stdList =
				Arrays.asList(new Student("홍길동", 92),
				new Student("신용권", 95),
				new Student("김자바", 88));

		//합계 구하기
		int sum = stdList.stream().mapToInt(n->n.getScore()).sum();
		System.out.println(sum);
		
		//방법2
		sum = stdList.stream().map(Student::getScore)//92 95 88
						.reduce(0,(a,b)->a+b);
		System.out.println(sum);
		
		//
		sum = stdList.stream().map(Student::getScore)// 92 95 88
								.reduce(0, (a,b)-> a+b-20); // 0+92-20 72+95-20 147+88-20
		System.out.println(sum);
		
		//비어있는 스트림을 만들어 코드 수행
		List<Student> stdList1 = Arrays.asList();
		sum = stdList1.stream().map(Student::getScore)//데이터 없음
								.reduce(0, (a,b) -> a+b-20);//기본값 0이 출력됨
		System.out.println(sum);
	}

}
