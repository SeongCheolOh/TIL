package ch07.sec06.package2;  // 접근제한자 protected

import ch07.sec06.package1.A;

public class D extends A{ //상속 받은 다음에 자식생성자에서 super을 사용하여 호출 가능
	//생성자 선언
	public D() {
		//A()생성자 호출
		super(); 
	}
	
	//메소드 선언
	public void method1() {
		//A필드값 변경
		this.field = "value";
		//A메소드 호출
		this.method();
	}
	
	//메소드 선언
	public void method2() {
	/*	A a = new A();
		a.field = "value";
		a.method(); 
		직접 객체생성해서 사용하는것은 안 됨 */
	}
}
