package javaCh16.p706;

public class MethodReferenceEx {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		//�����޼ҵ��� ���
		//�͸��� ����Ŭ������ ���� �Ű����� ó��
		p1.action(new InterEx01() {
			
			@Override
			public double c(double x, double y) {
				return(Computer.sM(x, y));
			}
		});
		

		//���ٽ� 1����
		p1.action( (double x, double y)-> {return Computer.sM(x, y);} );

		//���ٽ� 2����
		p1.action((x, y)-> Computer.sM(x, y));
		
		//�޼ҵ� ����
		p1.action(Computer::sM);
		
		//�� �ڵ尡 ���� ���� ����
		
		//�͸��� ����Ŭ�������� �������� �޼ҵ带 �����ϰ� �ڵ� ����
		Computer com = new Computer();
		p1.action(new InterEx01() {
			
			@Override
			public double c(double x, double y) {
				return com.iM(x, y);
			}
		});
		
		//���ٽ� 1��
		p1.action((double x, double y)->{return com.iM(x, y); } );
		//���ٽ� 2��
		p1.action((x, y)-> com.iM(x, y));
		//�޼ҵ� ����
		p1.action(com :: iM);
	}

}
