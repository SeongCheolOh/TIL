package ch05.sec11;

public class ArrayMainStringEx {

	public static void main(String[] args) {
		// main()�޼ҵ��� String[]�Ű����� �뵵
		
		// String[]args�� �� �ʿ��ұ�?
		//�������� cmd�� ��OS�� �͹̳ο��� ���α׷��� ������ ��
		//�䱸�ϴ� ���� ���� �� �ִ�. �������
		//�� ���� �Է¹ް� ������ �����ϴ� Sum ���α׷��� ������ ���� �䱸�� �� �ִ�
		//java Sum 10 20
		//�̰� args[0] = 10; / args[1] = 20;�̶�� ���̴�
		//������ �Է��� ���� 2���� �ƴ� �� �������� �˸���, ���������ϴ� �ڵ��̴�
		if(args.length!=2) {
			System.out.println("����");
			System.exit(0);//���α׷� ���� ����
		}
		
		String num1 = args[0];
		String num2 = args[1];
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		
		int result = num3 + num4;
		System.out.println(num3+" + "+num4+" = "+ result);
		

	}

}
