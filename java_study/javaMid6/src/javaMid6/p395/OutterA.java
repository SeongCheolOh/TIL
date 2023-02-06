package javaMid6.p395;

public class OutterA {
	
	int a = 100;
	
	void aMethod() {
/*		ia = ia+300; 
		iaMethod(); 바깥클래스는 중첩클래스 내부 사용 불가능 */
		InnerA ina = new InnerA();
		ina.ia = ina.ia+300;
		ina.iaMethod();
		System.out.println("외부클래스 OutterA");
		//객체화 후 사용은 가능!!
	}
	
	public OutterA() {
		
	}
	
	class InnerA{
		int ia = 200;
		void iaMethod() {
	//		a = a+400;//바깥클래스의 필드 사용가능
	//		aMethod();//바깥클래스의 메소드 사용 가능
			System.out.println("내부클래스 InnerA");
		}

		public InnerA() {
			
		}
	}

}
