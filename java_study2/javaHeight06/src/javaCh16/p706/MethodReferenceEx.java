package javaCh16.p706;

public class MethodReferenceEx {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		//정적메소드일 경우
		//익명형 구현클래스인 경우로 매개변수 처리
		p1.action(new InterEx01() {
			
			@Override
			public double c(double x, double y) {
				return(Computer.sM(x, y));
			}
		});
		

		//람다식 1차로
		p1.action( (double x, double y)-> {return Computer.sM(x, y);} );

		//람다식 2차로
		p1.action((x, y)-> Computer.sM(x, y));
		
		//메소드 참조
		p1.action(Computer::sM);
		
		//위 코드가 전부 같은 내용
		
		//익명형 구현클래스에서 참조변수 메소드를 리턴하게 코드 구현
		Computer com = new Computer();
		p1.action(new InterEx01() {
			
			@Override
			public double c(double x, double y) {
				return com.iM(x, y);
			}
		});
		
		//람다식 1차
		p1.action((double x, double y)->{return com.iM(x, y); } );
		//람다식 2차
		p1.action((x, y)-> com.iM(x, y));
		//메소드 참조
		p1.action(com :: iM);
	}

}
