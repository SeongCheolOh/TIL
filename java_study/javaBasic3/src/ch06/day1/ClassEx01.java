package ch06.day1;

public class ClassEx01 {

	public static void main(String[] args) {
		// 사용관계
		Car car = new Car();
		
		//생성자는 객체가 생성될 때만 수행됨
		//생성자의 용도는 객체가 생성될때 처음으로 넣을 값을 지정한다
		
		Car car1 = new Car("그랜저");
		Car car2 = new Car("k5", 4000);
		Car car3 = new Car("Model Y", 10000, "테슬라");
		
		System.out.println(car.getCarName());
		System.out.println(car.getCarPrice());
		System.out.println(car.getCarBrand());
		
		System.out.println(car1.getCarName());
		System.out.println(car1.getCarPrice());
		System.out.println(car1.getCarBrand());
		
		System.out.println(car2.getCarName());
		System.out.println(car2.getCarPrice());
		System.out.println(car2.getCarBrand());
		
		System.out.println(car3.getCarName());
		System.out.println(car3.getCarPrice());
		System.out.println(car3.getCarBrand());
				
		
	}

}
