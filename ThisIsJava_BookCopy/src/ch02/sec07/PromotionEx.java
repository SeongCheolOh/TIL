package ch02.sec07;

public class PromotionEx {

	public static void main(String[] args) {
		// �ڵ�Ÿ�Ժ�ȯ
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println(intValue);//'��'�� �ڵ����� intŸ������ ��ȯ
		
		intValue = 50;
		long longValue = intValue;
		System.out.println(longValue);//50�� longŸ������ ��ȯ
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println(floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println(doubleValue);
		

	}

}
