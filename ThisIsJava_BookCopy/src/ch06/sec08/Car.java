package ch06.sec08;

public class Car {
	//return ����
	//�޼ҵ��� ������ ���������ϰ� ȣ���� ������ ���ư��� ��� �ǹ�
	//���� Ÿ���� ���� ��쿡�� return �� �ڿ� ���ϰ��� �߰��� �����ؾ� �Ѵ�
	
	int gas;
	
	//���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ尪�� ����
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�");
			return false;
		}else {
			System.out.println("gas�� ���ҽ��ϴ�");
			return true;
		}
		
	}
	
	//���ϰ��� ���� �޼ҵ�� gas �ʵ尪�� 0�̸� return ������ �޼ҵ带 ����
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("������ "+gas+"��ŭ ���ҽ��ϴ�");
				gas -= 1;
			}else {
				System.out.println("������ "+gas+"��ŭ ���ҽ��ϴ�");
				return;
			}
		}
	}
}
