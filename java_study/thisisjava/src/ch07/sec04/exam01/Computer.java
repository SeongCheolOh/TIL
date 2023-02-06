package ch07.sec04.exam01; // 메소드 재정의(오버라이딩)

public class Computer extends Calculator{
	
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
