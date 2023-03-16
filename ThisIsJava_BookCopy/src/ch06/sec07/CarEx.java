package ch06.sec07;

public class CarEx {

	public static void main(String[] args) {
		// 생성자 선언과 호출
		
		//new 연산자는 객체를 생성한 후 연이어 생성자를 호출해서
		//객체를 초기화하는 역할을 한다
		//객체 초기화란 필드를 초기화하거나 메소드를 호출해서 객체를 사용할 준비를 하는 것
		//클래스 변수 = new 클래스();
		//			 ~~~~~~~~~~~~ >> 생성자 호출
		Car car = new Car("그랜저", "검정", 250);

	}

}
