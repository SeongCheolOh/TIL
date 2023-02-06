package ch07.sec06.package1; // 접근제한자 protected

public class B {
	//메소드 선언
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
	
	//protected는 같은 패키지 내에서 사용/호출이 가능하다
}
