package ch02.sec12;

public class PrintEx {

	public static void main(String[] args) {
		// �ַܼ� �������� ���
		// ����ȭ�� ���ڿ�
		// ������ �� �� �ܿ�ڴ�, p.69 ��������
		//printf("���Ĺ��ڿ�",��1,��2,---); >> ���Ĺ��ڿ��� ���� ���� ���� ����ض�
		
		int value = 12345;
		System.out.printf("��ǰ�� ���� : %d��\n",value); // %d = ���� �״�� ���, \n = �ٹٲ�
		System.out.printf("��ǰ�� ���� : %7d��\n",value); // %?d = ?�ڸ� ���·� ���, ���� �ڸ��� ���� ����
		System.out.printf("��ǰ�� ���� : %-7d��\n",value); // %-?d = ?�ڸ� ���·� ���, ���� �ڸ��� ������ ����
		System.out.printf("��ǰ�� ���� : %07d��\n",value); // %?d = ?�ڸ���ŭ ���, ���� �ڸ��� 0���� ä��
		
		double area = 3.141592 *10 *10;
		System.out.printf("�������� %d�� ���� ���� : %10.2f\n",10,area);
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

	}

}
