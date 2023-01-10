package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동타입변환
		byte byteValue= 10 ;
		int intValue = byteValue;
		System.out.println("intValue : " + byteValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
		
		//예외
		//byte >> char 로 타입변환은 불가능하다 (char에는 음수가 존재하지 않기 때문)
		
		long longValue1 = 5000000000l;
		float floatValue1 = longValue1;
		System.out.println(floatValue1); // 5.0E9f
		double doubleValue1 = longValue1;
		System.out.println(doubleValue1); // 5.0E9
	}

}
