package ch07.sec08.exam02; // 매개변수 다형성

public class Driver {

	//메소드 선언(클래스 타입의 매게변수를 가지고 있음)
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
