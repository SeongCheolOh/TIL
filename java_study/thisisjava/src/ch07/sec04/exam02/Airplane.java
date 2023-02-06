package ch07.sec04.exam02; // 메소드 재정의(오버라이딩) - 부모메소드 호출

public class Airplane {
	
	//메소드 선언
	
	public void land() {
		System.out.println("착륙합니다");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다");
	}

	public void takeOff() {
		System.out.println("이륙합니다");
	}
}
