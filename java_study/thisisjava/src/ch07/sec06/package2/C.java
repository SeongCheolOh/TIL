package ch07.sec06.package2; // 접근제한자 protected

import ch07.sec06.package1.A;

public class C {
	//메소드 선언
	public void method() {
	/*	A a = new A();
		a.field = "value";
		a.method(); 
		다른 패키지에 있기때문에 protected 된 A를 생성/호출할 수 없다 */
	}
}
