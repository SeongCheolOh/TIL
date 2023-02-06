package ch07.sec08.exam01; // 다형성

public class CarExample {

	public static void main(String[] args) {
		//Car 객체생성
		Car car = new Car();
		
		//Tire 객체 생성
		car.tire = new Tire();
		car.run();
		
		//한국타이어 객체 장착
		car.tire = new Hankook();
		car.run();
		
		//금호타이어 객체 장착
		car.tire = new Kumho();
		car.run();

	}

}
