package my_application_1.app;

import my_lib.pack1.A;
import my_lib.pack2.B;

public class Main {

	public static void main(String[] args) {
		//라이브러리에서 가져온 A클래스 사용
		A a = new A();
		a.method();
		
		//라이브러리에서 가져온 B클래스 사용
		B b = new B();
		b.method();

	}
	
	//의존성, 자동주입

}