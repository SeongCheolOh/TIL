package ch06.sec09;

public class Car {
	//p.242 �ν��Ͻ� ��� ���� �� ���

	//�ʵ� ����
	String model;
	int speed;
	
	//������ ����
	public Car(String model) {
		this.model = model;
	}

	//�޼ҵ� ����
	void setSpeed(int speed) {
		this.speed = speed;
	}//�Ű������� �ʵ忡 ���� >> this ���� �Ұ�
	
	

	void run() {
		/*this.*/setSpeed(100);
		System.out.println(/*this.*/model+"�� �޸��ϴ�. �ü� "+/*this.*/speed+"km/h");
	}//this ���� ����
}
