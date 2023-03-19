package ch06.sec08;

public class CarEx {

	public static void main(String[] args) {
		//p.238
		// Car 객체 생성
		Car c1 = new Car();
		
		//리턴값이 없는 setGas() 호출
		c1.setGas(5);
		
		//isLeftGas()메소드를 호출해서 받은 리턴값이 true이면 if블록 실행
		if(c1.isLeftGas()) {
			System.out.println("출발합니다");
			
			//리턴값이 없는 run()호출
			c1.run();
		}
		System.out.println("gas를 주입하세요");

	}

}
