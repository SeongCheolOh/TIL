package ch03.sec05;

public class InfinityAndNaNCheckEx {

	public static void main(String[] args) {
		// ������ ���� �� NaN�� Infinity ó��
		
		// ������(/) �Ǵ� ������(%)���꿡��
		// ���� �ǿ����ڰ� �����̰� ���� �ǿ����ڰ� 0�� ��� ArithmeticExeption ���ܰ� �߻��Ѵ�
		int x = 5;
		int y = 0;
//		System.out.println(x/y);
		// ���� �ǿ����ڰ� �Ǽ��̰ų� ���� �ǿ����ڰ� 0.0 �Ǵ� 0.0f�̸� ���ܰ� �߻����� �ʰ�
		// ������ ����� 
		double z = 0.0;
		System.out.println(x/z);
		// Infinity(���Ѵ�) �Ǵ� NaN(Not a Number)�� �ȴ�
		// �׷��� ������ /�� %������ ����� Infinity or NaN���� ���� Ȯ�� ��
		// ���� �ܰ��� ������ �����ϴ°� ����
		boolean result1 = Double.isInfinite(x/z);
		boolean result2 = Double.isNaN(x/z);
		System.out.println(result1 + " " + result2);
		
		if(Double.isInfinite(x/z)||Double.isNaN(x/z)) {
			System.out.println("�� ���� �Ұ�");
		}else {System.out.println(z+2);
		}
	}

}
