package ch06.sec08;

public class Calculator {
	//�޼ҵ� ����� ȣ�� p.230
	
	//���ϰ��� ���� �޼ҵ� ����
	void powerOn() {
		System.out.println("������ �մϴ�");
	}
	
	//2
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}
	
	//ȣ�� �� �� ���� ���� �޾� int���� ����
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	//ȣ�� �� �� �������� �޾� double�� ����
	double divide(int x, int y) {
		double result = (double)x/y;
		return result;
	}
	
}
