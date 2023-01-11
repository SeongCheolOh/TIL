package ch04.sec03;

public class SwitchExpressionsExample {

	public static void main(String[] args) {
		// java 12 이후로 expression(표현식)을 사용 가능해졌다
		// switchChar 예제를 다시 작성한 것
		// 지금은 java 11버전이라 사용 불가능

		char grade = 'B';
		
		switch(grade){
			case 'A' ://이거나
			case 'a' ://일땐
				System.out.println("우수 회원입니다");//라고 출력해라
				break;//탈출
			case 'B' : 
			case 'b' :
				System.out.println("일반 회원입니다");
				break;
			default :
				System.out.println("손님 입니다");
		}
		System.out.println("--------------------------");
		
	/*	switch(grade) {
		case 'A', 'a' -> System.out.println("우수 회원입니다");
		case 'B', 'b' -> System.out.println("일반 회원입니다");
		default -> System.out.println("손님 입니다"); 
		}*/
	}

}
