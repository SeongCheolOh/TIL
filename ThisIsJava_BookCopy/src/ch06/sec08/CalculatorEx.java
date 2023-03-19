package ch06.sec08;

public class CalculatorEx {

	public static void main(String[] args) {
		// 메소드 호출 p.233
		// class파일에서 메소드를 선언했다고 바로 호출할 순 없고
		// 메소드는 객체의 동작이므로 객체 선언 후 사용 가능하다
		
		//객체 선언
		Calculator c1 = new Calculator();
		//리턴값이 없는 메소드 호출
		c1.powerOn();
		c1.powerOff();
		//리턴값이 있는 메소드 호출
		// 바로 출력을 해도 되고
		System.out.println(c1.plus(5, 6));
		//변수에 받는거도 가능
		int result = c1.plus(6, 5);
		System.out.println(result);
		//매개값을 지정 후 변수만 대입도 가능
		int x = 10;
		int y = 20;
		System.out.println(c1.plus(x, y));
		
	}

}
