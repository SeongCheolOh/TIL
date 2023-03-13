package ch03.sec08;

public class BitLogicEx {

	public static void main(String[] args) {
		// ��Ʈ �� ������
		// 2������ ��ȯ �� ������ ��
		System.out.println("45 & 23 = " + (45 & 25)); // ������ >> �� �� 1�̾�� 1
		System.out.println("45 | 23 = " + (45 | 25)); // �տ��� >> �� �� �ϳ��� 1�̸� 1
		System.out.println("45 ^ 23 = " + (45 ^ 25)); // ��Ÿ�� >> �� �� �ϳ��� 1�̾�� 1
		System.out.println("-45 = " + (-45));
		System.out.println("--------------");
		byte receiveData = -120;
		//���1) ��Ʈ ���� �������� Unsigned ���� ���
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		//���2) �ڹ�API�� �̿��Ͽ� Unsigned ���� ���
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		System.out.println("----------------");
		int test = 136;
		byte btest = (byte)test;
		System.out.println(btest);

	}

}
