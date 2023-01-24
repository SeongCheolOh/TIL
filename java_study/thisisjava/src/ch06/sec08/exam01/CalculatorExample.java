package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// Calculator 객체 생성
		Calculator cal = new Calculator();
		
		// 리턴값이 없는 powerOn() 메소드 호출
		cal.powerOn();
		
		// plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
		//덧셈 결과를 리턴받아 result1 변수에 대입
		
		int result1 = cal.plus(5, 6);
		System.out.println("result1 = "+result1);
		
		int x = 10;
		int y = 4;
		//divine() 메소드 호출 시 변수 x와 y의 값을 매개값으로 제공하고,
		//나눗셈 결과를 리턴받아 result2변수에 대입
		
		double result2 = cal.divine(x, y);
		System.out.println("result2 = "+result2);
		
		//리턴값이 없는 powerOff() 메소드 호출
		cal.powerOff();
		
	}//end main

}//end class
