package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {
		/* char = 유니코드 = 2byte = 16bit >> 0~65535
		 * 세계 각국의 문자를 0~65535 숫자로 매핑한 국제표준규약
		 */
		char var1 = 'A'; // 'A'와 매핑되는 숫자 : 65로 대입
		char var3 = '가'; // '가'와 매핑되는 숫자 : 44032로 대입
		
		System.out.println(var1);
		System.out.println(var3);
		
		//유니코드가 정수이므로 char타입도 정수타입 >> 대입값에 ''를 안쓰고 유니코드 정수로 대입 가능
		char c = 65; // 10진수 65와 매핑되는 'A'
		char d = 0x0041; // 16진수 0x0041과 매핑되는 'A'
		
		System.out.println(c);
		System.out.println(d);
		
		
		char c1 = 'a'; // 문자 저장
		char c2 = 65; // 유니코드 직접 저장
		
		char c3 = '가'; // 문자 저장
		char c4 = 44032; // 유니코드 직접 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		/* 단순히 초기화할 목적으로 빈 문자를 대입할 때
		 * '';이렇게 달아붙이지 말고 ' '사이를 띄워줘라 >> 유니코드 32
		 * char c=''; >> 에러 */
		 char e=' ';
		
		 
		
		
	}

}
