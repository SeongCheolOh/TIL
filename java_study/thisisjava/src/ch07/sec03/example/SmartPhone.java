package ch07.sec03.example;

public class SmartPhone extends Phone{

	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone(String model, String color)생성자 실행됨");
	}
}