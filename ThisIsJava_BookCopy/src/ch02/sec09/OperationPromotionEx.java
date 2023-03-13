package ch02.sec09;

public class OperationPromotionEx {

	public static void main(String[] args) {
		// 연산식에서 자동 타입 변환
		byte result1 = 10+20;
		System.out.println(result1);
		
		// 정수값을 받은 변수가 피연산자로 사용된 경우엔 자동으로 int타입 변환
		byte v1 = 10;
		byte v2 = 20;
//		byte result2 = v1+v2; 컴파일 에러
		int result2 = v1 + v2;
		System.out.println(result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000l;
		long result3 = v3 + v4 + v5;
		System.out.println(result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println(result4);
		
		int v8 = 10;
		int result5 = v8/4;
		System.out.println(result5);
		
		int v9 = 10;
		double result6 = v9/4.0;
		System.out.println(result6);
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double)v10/v11;
		System.out.println(result7);
		
	}

}
