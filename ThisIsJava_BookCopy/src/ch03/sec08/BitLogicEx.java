package ch03.sec08;

public class BitLogicEx {

	public static void main(String[] args) {
		// 비트 논리 연산자
		// 2진수로 변환 후 값들을 비교
		System.out.println("45 & 23 = " + (45 & 25)); // 곱연산 >> 둘 다 1이어야 1
		System.out.println("45 | 23 = " + (45 | 25)); // 합연산 >> 둘 중 하나라도 1이면 1
		System.out.println("45 ^ 23 = " + (45 ^ 25)); // 배타적 >> 둘 중 하나만 1이어야 1
		System.out.println("-45 = " + (-45));
		System.out.println("--------------");
		byte receiveData = -120;
		//방법1) 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		//방법2) 자바API를 이용하여 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		System.out.println("----------------");
		int test = 136;
		byte btest = (byte)test;
		System.out.println(btest);

	}

}
