package ch02.sec10;

public class ParseEx {

	public static void main(String[] args) {
		// ���ڿ��� �⺻(����)Ÿ������ ��ȯ
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1+" "+value2+" "+value3);
		
		//�ݴ�� �⺻(����)Ÿ��>> ���ڿ� �ϱ�
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		System.out.println(str1+" "+str2+" "+str3);

	}

}