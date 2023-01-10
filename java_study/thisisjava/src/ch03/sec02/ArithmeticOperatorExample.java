package ch03.sec02;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// 산술 연산
		// 기본 연산들 +-*/에 %(나눗셈의 나머지 산출)
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1+v2; // 모든 피연산자는 int로 변환
		System.out.println("result1: "+result1);
		
		long result2 = v1+v2+v4; // 가장 큰 long으로 변환
		System.out.println("v1+v2+v4: " + result2);

		double result3 = (double)v1/v2; // 결과가 실수이므로 double로 사용 , 우항도 (double)강제변환
		System.out.println("result3: " + result3);
		
		int result4 = v1%v2;
		System.out.println("result4: " + result4);
		
	}

}
