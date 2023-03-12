package javaCh16.p694;

public class LamdaEx01 {

	public static void main(String[] args) {
		//���1) �������̽��� ����Ŭ������ ����� c()�߻�޼ҵ带 ������ �� ���
		CalcuImpl c1 = new CalcuImpl();
		c1.c();
		
		//���2) �������̽��� �͸��� ����Ŭ������ �����, c()�߻�޼ҵ带 ������ �� ���
		Calculable c2 = new Calculable() {
			
			@Override
			public void c() {
				System.out.println("�͸��� ���� Ŭ���� �Դϴ�.");
				
			}
		};
		c2.c();
		
		//���3) ���ٽ� ǥ��
		Calculable c3 = ()->{System.out.println("���ٽ� ǥ��");};
		c3.c();
		
		//���2)
		InterEx01 i1 = new InterEx01() {
			
			@Override
			public void cc() {
				System.out.println(3000); //�߻�޼ҵ忡 �ڵ带 �ۼ��� ��
				
			}
		};
		//�޼ҵ� ȣ��
		i1.cc();
		//���ٽ�
		InterEx01 i2=()->{System.out.println(5000);};
		i2.cc();
		
		//���2)
		InterEx02 iEx1 = new InterEx02() {
			
			@Override
			public void ccc(int c1, double c2) {
				System.out.println(c1 + " " + c2);
				
			}
		};
		iEx1.ccc(400, 3.14);
		
		//���3)
		InterEx02 iEx2 =(a,b)->System.out.println(a+ " "+b);
		iEx2.ccc(369, 3.333);
		
		//���2)
		InterEx03 iEx3 = new InterEx03() {
			
			@Override
			public int bb(int a, boolean b, int c) {
				System.out.println(b+" "+a+" "+c);
				return a+c;
			}
		};
		int result = iEx3.bb(4, false, 8);
		
		//���3)
//		InterEx03 iEx4 = (int a, boolean b, int c)->{System.out.println(a+c+" "+b);return a+c;};
		//ó���ϴ� ������ 1���� �� {}�� return ��������
		InterEx03 iEx4 = (a, b, c)->a+c;
		result = iEx4.bb(10, false, 20);
		System.out.println(result);
	}
	
}
