package ch02.sec04;

public class FloatDoubleEx {

	public static void main(String[] args) {
		//float�� double�� ���е� Ȯ��
		
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		System.out.println(var1);
		System.out.println(var2);//�� 2�������� ��ȿ�ڸ���
		
		double var3 = 3e6;
		float var4 = 3e6f;
		double var5 = 2e-3;
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5); 
	}

}