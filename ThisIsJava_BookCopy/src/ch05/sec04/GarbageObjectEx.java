package ch05.sec04;

public class GarbageObjectEx {

	public static void main(String[] args) {
		// � ���������� �������� �ʴ� ��ü�� �����Ǹ�
		// �ڹٴ� �� ��ü�� ������� ����ϰ�
		// �ڵ����� ������ �����⸦ ����, �����͸� ���� �Ѵ�.
		
		String hobby = "����";
		hobby = null; // "����"�� ������ ��ü�� ��
		
		String car1 = "�ڵ���";
		String car2 = car1;
		car1 = null;//car1�� �ش��ϴ� "�ڵ���" ��ü�� ������ ����������
		//car2�� ������ "�ڵ���"�� �����ϰ� �ֱ� ������ ������ ������� �ʴ´�

	}

}
