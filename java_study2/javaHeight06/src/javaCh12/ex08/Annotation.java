package javaCh12.ex08;

public class Annotation {

	public static void main(String[] args) {
		// p.554 @ ���������� �ִ� ��
		@An1(prop1="ȫ�浿") String name;
	}

}

class A{
	public void aMethod() {
		
	}
}
class AA extends A{
	
	@Override
	public void aMethod() {
		// TODO Auto-generated method stub
		super.aMethod();
	}
}