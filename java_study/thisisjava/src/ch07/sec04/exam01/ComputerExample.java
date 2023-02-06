package ch07.sec04.exam01; // 메소드 재정의(오버라이딩)

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원의 면적 : " + calculator.areaCircle(r));
		System.out.println();

	}

}
