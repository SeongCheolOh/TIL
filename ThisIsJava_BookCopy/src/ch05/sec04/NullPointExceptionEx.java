package ch05.sec04;

public class NullPointExceptionEx {

	public static void main(String[] args) {
		// ������ ���� null�� ��
		// ����.�޼ҵ�()�� ȣ���ϸ� ������ ��ü�� �����Ƿ�
		// NullPointException�� �߻��Ѵ�
		
		int[]arr1 = null;//��ü�� �������� ���� ���¿���
		arr1[0] = 10;//�����͸� �����ϹǷ� ���� �߻�
		
		String str = null;//������ �����Ͱ� ���µ�
		System.out.println(str.length());//���ڼ��� ���϶�� �ϴ� �翬�� ���� �߻�

	}

}
