package javaCh17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineEx01 {

	public static void main(String[] args) {
		// p.727 중간 처리와 최종 처리
		// 컬렉션 or 배열-> 오리지널 스트림 -> [중간 스트림 - 생략 가능] -> 최종 스트림
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 10));
		list.add(new Student("신용권", 20));
		list.add(new Student("유미선", 30));
		
		List<Student> list1 = Arrays.asList(new Student("홍길동", 10), new Student("신용권", 20), new Student("유미선", 30));
		Stream<Student> stream = list.stream();
		IntStream is = stream.mapToInt(s->s.getScore());
		OptionalDouble od = is.average();
		double avg = od.getAsDouble();
		System.out.println(avg);
		
		double avg1 = list.stream()//Student 클래스의 객체참조변수들
						  .mapToInt(s->s.getScore())//10, 20, 30
						  .average()//평균 구하고
						  .getAsDouble();//기본형 double 타입으로 바꾼다
		System.out.println(avg1);
		
		OptionalDouble avg2 = list.stream()//Student 클래스의 객체참조변수들
				  .mapToInt(s->s.getScore())//10, 20, 30
				  .average();//평균 구하고
		System.out.println(avg2);
		
		//정수의 합계 구하기
		int avg3 = list.stream()//Student 클래스의 객체참조변수들
				  .mapToInt(s->s.getScore())//10, 20, 30
				  .sum();
		System.out.println(avg3);
		
		//정수의 최댓값;
		OptionalInt avg4 = list1.stream()//Student 클래스의 객체참조변수들
				  .mapToInt(s->s.getScore())//10, 20, 30
				  .max();
		System.out.println(avg4);
	}

}
