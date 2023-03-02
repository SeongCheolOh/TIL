package javaCh16.p694;

public class LamdaEx01 {

	public static void main(String[] args) {
		//방법1) 인터페이스를 구현클래스로 만들고 c()추상메소드를 재정의 후 사용
		CalcuImpl c1 = new CalcuImpl();
		c1.c();
		
		//방법2) 인터페이스를 익명형 구현클래스로 만들고, c()추상메소드를 재정의 후 사용
		Calculable c2 = new Calculable() {
			
			@Override
			public void c() {
				System.out.println("익명형 구현 클래스 입니다.");
				
			}
		};
		c2.c();
		
		//방법3) 람다식 표현
		Calculable c3 = ()->{System.out.println("람다식 표현");};
		c3.c();
		
		//방법2)
		InterEx01 i1 = new InterEx01() {
			
			@Override
			public void cc() {
				System.out.println(3000); //추상메소드에 코드를 작성한 것
				
			}
		};
		//메소드 호출
		i1.cc();
		//람다식
		InterEx01 i2=()->{System.out.println(5000);};
		i2.cc();
		
		//방법2)
		InterEx02 iEx1 = new InterEx02() {
			
			@Override
			public void ccc(int c1, double c2) {
				System.out.println(c1 + " " + c2);
				
			}
		};
		iEx1.ccc(400, 3.14);
		
		//방법3)
		InterEx02 iEx2 =(a,b)->System.out.println(a+ " "+b);
		iEx2.ccc(369, 3.333);
		
		//방법2)
		InterEx03 iEx3 = new InterEx03() {
			
			@Override
			public int bb(int a, boolean b, int c) {
				System.out.println(b+" "+a+" "+c);
				return a+c;
			}
		};
		int result = iEx3.bb(4, false, 8);
		
		//방법3)
//		InterEx03 iEx4 = (int a, boolean b, int c)->{System.out.println(a+c+" "+b);return a+c;};
		//처리하는 내용이 1개일 때 {}와 return 생략가능
		InterEx03 iEx4 = (a, b, c)->a+c;
		result = iEx4.bb(10, false, 20);
		System.out.println(result);
	}
	
}
