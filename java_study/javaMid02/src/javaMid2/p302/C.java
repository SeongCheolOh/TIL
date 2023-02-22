package javaMid2.p302;

import javaMid2.p301.A;

public class C {
	
	void m() {
		A a = new A();
	//	a.value = 500; // value가 protected이고, 자식클래스도 아니라서 컴파일 에러
	}
}
