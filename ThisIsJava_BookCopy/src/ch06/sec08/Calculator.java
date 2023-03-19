package ch06.sec08;

public class Calculator {
	//메소드 선언과 호출 p.230
	
	//리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	//2
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	//호출 시 두 정수 값을 받아 int값을 리턴
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	//호출 시 두 정수값을 받아 double로 리턴
	double divide(int x, int y) {
		double result = (double)x/y;
		return result;
	}
	
}
