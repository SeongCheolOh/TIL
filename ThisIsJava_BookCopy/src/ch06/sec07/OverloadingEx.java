package ch06.sec07;

public class OverloadingEx {

	public static void main(String[] args) {
		// ������ �����ε�
		//�Ű������� ��ü�� �ʵ带 �پ��ϰ� �ʱ�ȭ�Ϸ��� ������ �����ε��� �ʿ��ϴ�
		//�Ű������� �޸��ϴ� �����ڸ� ���� �� �����ϴ� ���� �ǹ�
		
		//������.1 ȣ��
		Overloading car1 = new Overloading();
		System.out.println(car1.company);
		System.out.println();
		//������.2 ȣ��
		Overloading car2 = new Overloading("�ڰ���");
		//�־��� �������� Ÿ�԰� ������ ���� ȣ�� �� �����ڰ� �ڵ� �����ȴ�
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println();
		//������.3 ȣ��
		Overloading car3 = new Overloading("�ڰ���","����");
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println();
		//������.4 ȣ��
		Overloading car4 = new Overloading("�ý�","����",200);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
		System.out.println();
		//������.1�� model�� �Ű������� ���⶧���� null�� ǥ���ȴ�
		System.out.println(car1.model);
	}

}
