package ch02.sec07;

public class PromotionEx {

	public static void main(String[] args) {
		// 자동타입변환
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);//'가'가 자동으로 int타입으로 변환
		
		intValue = 50;
		long longValue = intValue;
		System.out.println(longValue);//50이 long타입으로 변환
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println(floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println(doubleValue);
		

	}

}
