package ch06.sec10;

public class StaticBlock {
	//���� ���
	//���� �ʵ�� �ʵ弱��� ���ÿ� �ʱⰪ�� �ִ°� �Ϲ����̴�
	//������ ������ �ʱ�ȭ �۾��� �ʿ��ϴٸ�
	//���� ����� �̿��ؾ��Ѵ� >> static{~~~}
	//Ŭ������ �޸𸮷� �ε��� �� �ڵ����� ����ȴ�. �������� ��� ���ʴ�� ����
	
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	static {
		info = company+" - "+model;
	}
}
