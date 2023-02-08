package app;

import pack1.A;
//import pack2.B; 은닉되어 사용불가능
import pack3.C;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		a.method();
		
//		B b = new B();
//		b.method();
		
		C c = new C();
		c.method();
		
		C result = a.getC();
		result.method();
	}

}
