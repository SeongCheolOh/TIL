package ch02.sec07;

public class PromotionEx {
	public static void main(String[] args) {
		//�ڵ� Ÿ�� ��ȯ
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ� : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		floatValue = 100.5f;
		double dV = floatValue;
		System.out.println("doubleValue : " + dV);
	}
}
