package javaMid4.p368;

public class Main {

	public static void main(String[] args) {
		//객체생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//다형성
		B b1 = new D();
		C c1 = new E();
		A a1 = new B();
		A a2 = new D();
		A a3 = new C();
		A a4 = new E();
		
		//a3 변수를 통해서 C클래스의 메소드를 호출하고싶다 >> down casting
		C c2 = (C) a3;
		c2.c1();
		
		//a4 변수를 통해서 E클래스의 메소드를 호출하고싶다
		//e4.printAll(); 형태로 출력
		E e4 = (E) a4;
		e4.printAll();
		
		//override를 통해서 출력하기
		c1.printAll();
	}

}
