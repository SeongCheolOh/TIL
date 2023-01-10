package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		//콘솔로 변수값을 출력
		
		//printIn(); = 출력 후 줄바꿈
		//print(); = 출력
		//printf("형식문자열" + blah); = 형식문자열에 맞춰 blah를 출력
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		//형식화된 문자열
	/*	정수) %d   >> 정수                >>  123
	★		 %6d  >> 6자리 정수, 왼쪽 공백   >> 	___123
	★		 %-6d >> 6자리 정수, 오른쪽 공백 >>  123___
	★		 %06d >> 6자리 정수, 왼쪽빈자리 0>>  000123
	★	실수) %10.2f  >> 정수 7자리 + 소수점 2자리, 왼쪽 빈자리 공백  >> ____123.45
	★		 %-10.2f >> 정수 7자리 + 소수점 2자리, 오른쪽 빈자리 공백 >> 123.45____
	★		 %010.2f >> 정수 7자리 + 소수점 2자리, 왼쪽 빈자리 0    >> 0000123.45
	★	문자열) %s   >> 문자열                     >> abc
	★		  %6s  >> 6자리 문자열, 왼쪽 빈자리 공백  >> ___abc
	★		  %-6s >> 6자리 문자열, 오른쪽 빈자리 공백 >> abc___
	★	특수문자) \t >> 탭(tab)만큼 띄움
	★			\n >> 줄바꿈
	★			%% >> %     */
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		
	}

}
