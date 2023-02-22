package javaMid6.p395.example;

public class OA1 {

	int a = 10;
	static int sa = 20;
	
	void m1() {
		//a랑 sa 둘 다 사용 가능
	}
	static void sm1() {
		//static은 이미 메모리에 올라가있어서 sa는 사용 가능
		//a는 사용 불가능
		//new 해서 힙메모리에 올려줘야 사용 가능
		OA1 oa1 = new OA1();
		oa1.a = oa1.a+ sa;
		}
	public OA1() {//생성자에서는
		/* a
		 * sa
		 * m1();
		 * sm1();
		 * 전부 사용 가능
		 */
	}
	
	class IA{// static class가 아닌데
		int iaa = 20;
	/*	static*/ int isa = 20; //필드에서 static을 붙이면 컴파일에러 발생
		
		void iaaM() {
			a = a + 20;
			sa = sa + 50;
			m1();
			sm1();
		}
	/*	static*/ void isaM() {
			
		}
	}
}
