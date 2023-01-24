package ch06.sec08.exam01;

public class Calculator {

	 void powerOn() {//리턴값이 없는 메소드 선언(void) 
		 
		 System.out.println("전원을 켭니다.");
	}
	 
	 void powerOff() {//리턴값이 없는 메소드 선언(void) 
		 
		 System.out.println("전원을 끕니다.");
	 }
	 
	 //호출 시 두 정수 값을 전달받고,
	 //호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	 int plus(int x, int y) {
		 int result =  x+y; //리턴값 지정;
		 return result;
	 }
	 
	 //호출 시 두 정수 값을 전달받고,
	 //호출한 곳으로 결과값 double을 리턴하는 메소드 선언
	 double divine(int x, int y) {
		 double result = (double)x/y;
		 return result;
	 }

}
