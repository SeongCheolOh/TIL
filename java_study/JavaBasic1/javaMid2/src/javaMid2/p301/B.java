package javaMid2.p301;

public class B {

	void m() {
	A a = new A();
	a.value = 300;//value는 protected지만 같은 패키지라서 사용 가능(상속 필요 x)
	}
}
