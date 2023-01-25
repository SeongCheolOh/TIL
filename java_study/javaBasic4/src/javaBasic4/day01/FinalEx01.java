package javaBasic4.day01;

public class FinalEx01 {
	
	//상수 선언(항상 그대로인 수)  항상 대문자
	static final double PI = 3.14;

	public static void main(String[] args) {
		// final - 끝 마지막
		int a = 10;
		a = a+100;
		
		final int b = 100; // 변수 b는 값이 100으로 고정된다
	/*	b = b+200; 컴파일 에러*/ 
		System.out.println(b+200);
		
		System.out.println(Math.PI);


	}

}
