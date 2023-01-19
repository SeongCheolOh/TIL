package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car car = new Car();
		
		//Car 객체의 필드값 읽기
		System.out.println("모델명 = "+ car.model);
		System.out.println("모델명 = "+ car.start);
		System.out.println("모델명 = "+ car.speed);
		
		//Car 필드에서 기본값 설정하지 않았기 때문에 각 타입의 0의 값이 출력됨
	}

}
