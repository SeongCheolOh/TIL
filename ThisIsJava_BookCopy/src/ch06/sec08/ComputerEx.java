package ch06.sec08;

public class ComputerEx {

	public static void main(String[] args) {
		//p.235
		//Computer ��ü ����
		Computer c1 = new Computer();
		//sum()�޼ҵ� ȣ�� �� �Ű��� 1,2,3 �� �ְ� ������ ����
		int result1 = c1.sum(1,2,3);
		System.out.println(result1);
		//�ٸ� ������ �Ű��� 1,2,3,4,5 ����
		int result2 = c1.sum(1,2,3,4,5);
		System.out.println(result2);
		//sum()�޼ҵ� ȣ�� �� �迭�� �����ϰ�
		//�ջ� ����� ���Ϲ޾� result3 ������ ����
		int[] values = {1,2,3,4,5};
		int result3 = c1.sum(values);
		System.out.println(result3);
		//sum()�޼ҵ� ȣ�� �� �迭�� �����ϰ�
		//�ջ� ����� ���Ϲ޾� result4 ������ ����
		int result4 = c1.sum(new int[] {1,2,3,4,5});
		System.out.println(result4);

	}

}
