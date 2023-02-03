package javaMid6.p376;

public class CarEx {
	
		public static void main(String[] args) {
			//자동차 객체 생성
			Car myCar = new Car();
			
			//run()메소드 실행
			myCar.run();
			System.out.println("---");
			
			//타이어 객체 교체
			myCar.tire1 = new KumhoTire();
			myCar.run();
			System.out.println("---");
			myCar.tire1 = new HankookTire();
			myCar.tire2 = new HankookTire();
			myCar.run();
		}

}
