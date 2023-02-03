package javaMid6.p376.example8;

public class Example {


	public static void main(String[] args) {
		action(new B());
		action(new C());

	}
	public static void action(A a) {
		a.method1();
		if(a instanceof C) {//instanceof >> 참조한다
			C c = (C)a; // 다운캐스팅>>공부 필요
			c.method2();
		}
	}
}
