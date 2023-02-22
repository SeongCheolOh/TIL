package javaMid6.p395;

public class A {

	class B{
		B(){
			System.out.println("B클래스의 기본생성자");
		}
		void bMethod() {
			System.out.println("B클래스의 메소드");
		}
	}
	
	//A클래스는 B를 독점하기때문에
	//아무렇게나 B를 쓸 수 있다
	
//	B field = new B();
	
	A(){
		System.out.println("A클래스의 기본생성자");
		B b = new B();
	}
	
	void method() {
		System.out.println("A클래스의 메소드");
		B b = new B();
	}
}
