package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		// 비트 논리 연산자
		// 좌우를 2진법화 후 비교하는데
		// & = 둘 다 1인 경우만 산출(좌 그리고 우)
		// | = 어느 한쪽이라도 1인경우에는 산출(좌 또는 우)
		// ^ = 어느 한쪽만 1인경우에 산출
		// 
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
