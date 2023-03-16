package ch06.sec06;

public class CarEx02 {

	public static void main(String[] args) {
		// 필드 선언과 사용
		
		Car02 car = new Car02();
		
		System.out.println(car.company);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);
		System.out.println(car.speed);
		
		car.speed = 120;
		System.out.println(car.speed);
	}

}
