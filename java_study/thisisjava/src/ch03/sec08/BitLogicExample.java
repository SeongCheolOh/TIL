package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		// 비트 논리 연산자
		
		// bit 단위로 논리연산을 수행
		// 0과 1이 피연산자 >> 2진수 >> 정수타입만 피연산자
		// 실수타입은 피연산자 될 수 없음
		
		// 1=true, 0=false로 간주
		// 논리곱 & = 피연산자 모두 1인 경우
		// 논리합 | = 피연산자 중 한쪽이라도 1인 경우
		// 배타적 논리합 ^ = 피연산자 중 어느 한쪽만 1인 경우
		// 논리 부정 ~
	
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("-45 = " + (-45));
		System.out.println("------------------");
		
		byte receiveData = -128;
		
		//방법1 : 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignInt1 = receiveData & 255;
		System.out.println(unsignInt1);
		
		//방법2 : 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignInt2);
		
		int test = 136;
		byte btest = (byte)test;
		System.out.println(btest);
		

	}

}
