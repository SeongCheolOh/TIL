package ch04.sec03;

public class SwitchCharExample {

	public static void main(String[] args) {
		// switch에는 정수타입과 문자열타입 변수를 사용할 수 있다
		// char을 이용하여 영어 대소문자에 관계없이 똑같이 처리하는 예제
		
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

	}// end main

}// end class
