package ch06.sec08;

public class CarEx {

	public static void main(String[] args) {
		//p.238
		// Car ��ü ����
		Car c1 = new Car();
		
		//���ϰ��� ���� setGas() ȣ��
		c1.setGas(5);
		
		//isLeftGas()�޼ҵ带 ȣ���ؼ� ���� ���ϰ��� true�̸� if��� ����
		if(c1.isLeftGas()) {
			System.out.println("����մϴ�");
			
			//���ϰ��� ���� run()ȣ��
			c1.run();
		}
		System.out.println("gas�� �����ϼ���");

	}

}
