package ch07.sec04.exam01; // 메소드 재정의(오버라이딩)

public class Calculator {

	public double areaCircle(double r) {
		System.out.println("Caculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}