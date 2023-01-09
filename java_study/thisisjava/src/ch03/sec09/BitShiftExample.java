package ch03.sec09;

public class BitShiftExample {

	public static void main(String[] args) {
		// 비트 이동 연산자
		// a << b = 정수 a의 각 비트를 b만큼 왼쪽으로 이동, 오른쪽 빈자리는 0으로 채움
		// 8 << 3 = 0b1000을 왼쪽으로 3만큼 = 0b1000000 = 64
		int num1 = 1;
		int result1 = num1 <<3;
		int result2 = num1*(int)Math.pow(2, 3);//Math.pow는 2^3 연산, double값으로 산출
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int)Math.pow(2, 3);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);



	}

}
