package javaCh12.ex09;

public class StringBuilderEx {

	public static void main(String[] args) {
		// Ȯ�ι��� 10��
		//1~100���� ���ڸ� �� ���ڿ��� ����� �ڵ��
		//100�� �̻��� String ��ü�� ����°��̱� ������ ���� �ڵ��� �� �� ����
		//StringBuilder�� ����ؼ� �� �� ȿ������ �ڵ�� ������
		
		//String str = "";
		StringBuilder str1 = new StringBuilder();
		for(int i = 1; i<=100; i++) {
			//str + = i;
			str1.append(i);
		}
		System.out.println(str1);
		//str�� ������ 1�� ��ü ���� ���� �����ⰴü�� ������
		//str1�� ��� ����� �����̶� �����ⰴü�� ��������� �ʴ´�
	}

}
