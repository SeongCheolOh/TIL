package ch03.sec09;

public class BitShiftEx01 {

	public static void main(String[] args) {
		// ��Ʈ �̵� ������
		// a << b = 2����ȭ �� a�� b��ŭ �������� �̵�, ������ ���ڸ��� 0���� ä�� >> a*2^b
		//   >>                      ������	   , ���� ���ڸ��� �ֻ��� ��ȣ�� ���� ������ ä�� >> a*2^-b
		//   >>>					 ������      , ���� ���ڸ��� 0���� ä��
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int)Math.pow(2, 3); // math.pow(a,b) = a^b�� double������ �����Ѵ�
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("-----------");
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int)Math.pow(2, 3);
		System.out.println(result3);
		System.out.println(result4);
	}

}
