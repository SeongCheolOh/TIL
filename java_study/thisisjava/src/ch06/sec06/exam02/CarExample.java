package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car car = new Car();

		//객체의 필드값 읽기
		System.out.println(car.color);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);
		System.out.println(car.speed);
		
		//Car 객체의 필드값 변경
		car.speed = 60;
		System.out.println(car.speed);
	}

}
