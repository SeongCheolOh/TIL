package javaCh12.ex08;

public class Annotation {

	public static void main(String[] args) {
		// p.554 @ 실행정보를 주는 것
		@An1(prop1="홍길동") String name;
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