package javaMid10.p470;

public class B {
	void b1() throws ClassNotFoundException, ArithmeticException{
		b2();
	}
	void b2() throws ClassNotFoundException , ArithmeticException{
		b3();
		int b = 10/0;
	}
	void b3() throws ClassNotFoundException{
		b4();
		Class.forName("java.lang.String");
	}
	void b4() {
	}

}
