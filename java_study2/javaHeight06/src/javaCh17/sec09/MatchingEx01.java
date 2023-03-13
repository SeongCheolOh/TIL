package javaCh17.sec09;

import java.util.Arrays;

public class MatchingEx01 {

	public static void main(String[] args) {
		// p.750
		//모두 만족해야 하는 것(and연산) = allMatch()
		//하나라도 만족(or연산) = anyMatch
		//모두 거짓이면 참 = noneMatch
		
		int[] intArr = {2,4,6,5};
		//모두 2의 배수이면 참 출력
		boolean result = Arrays.stream(intArr)
								.allMatch(a->a%2==0);
		System.out.println(result);
		
		//2의 배수가 하나라도 있으면 참 출력
		result = Arrays.stream(intArr)
				.anyMatch(a->a%2==0);
		System.out.println(result);
		
		//2의 배수가 없으면 참 출력
		result = Arrays.stream(intArr)
				.noneMatch(a->a%7==0);
		System.out.println(result);
		
		Student[] stdArr = {new Student("홍길동",100),
							new Student("홍길동",80),
							new Student("홍길동",60),
							new Student("홍길동",70)};
		
		//모두 60넘으면 true
		if(Arrays.stream(stdArr).allMatch(n->n.getScore()>=60))
			System.out.println("모두 60점 이상입니다");
		
		//하나라도 80점이 넘으면 true
		result = Arrays.stream(stdArr).anyMatch(n->n.getScore()>=80);
		System.out.println(result);
		
		//모두 100점 이상이면 false
		result = Arrays.stream(stdArr).noneMatch(n->n.getScore()>=100);
		System.out.println(result);
	}

}
