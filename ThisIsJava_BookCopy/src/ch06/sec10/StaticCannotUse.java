package ch06.sec10;

public class StaticCannotUse {
		// ���� ������� ��ü�� ��� ����ȴٴ� Ư¡ ������
		// ����Կ� ��ü������ �ʿ��� �ν��Ͻ� �ʵ�� ��� �Ұ��� �ϴ�
		// ���� ��ü �ڽ��� ������ this�� ��� �Ұ����ϴ�
		
		int feild1;
		void method1() {}
		
		static int feild2;
		static void method2() {}
		static {
//			feild1 = 10;
//			method1(); 
//			������� ���ο��� �ν��Ͻ� ��� ��� �Ұ���
//			��ü���� �� ��� ����
			StaticCannotUse canUse = new StaticCannotUse();
			canUse.feild1=10;
			canUse.method1();
			feild2=10;
			method2();
		}

}
