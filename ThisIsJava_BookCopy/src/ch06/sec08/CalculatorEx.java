package ch06.sec08;

public class CalculatorEx {

	public static void main(String[] args) {
		// �޼ҵ� ȣ�� p.233
		// class���Ͽ��� �޼ҵ带 �����ߴٰ� �ٷ� ȣ���� �� ����
		// �޼ҵ�� ��ü�� �����̹Ƿ� ��ü ���� �� ��� �����ϴ�
		
		//��ü ����
		Calculator c1 = new Calculator();
		//���ϰ��� ���� �޼ҵ� ȣ��
		c1.powerOn();
		c1.powerOff();
		//���ϰ��� �ִ� �޼ҵ� ȣ��
		// �ٷ� ����� �ص� �ǰ�
		System.out.println(c1.plus(5, 6));
		//������ �޴°ŵ� ����
		int result = c1.plus(6, 5);
		System.out.println(result);
		//�Ű����� ���� �� ������ ���Ե� ����
		int x = 10;
		int y = 20;
		System.out.println(c1.plus(x, y));
		
	}

}
