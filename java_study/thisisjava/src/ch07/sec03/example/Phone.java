package ch07.sec03.example;

public class Phone {

	
	public String model;
	public String color;
	
	//생성자 선언
	public Phone(String model, String color){
		this.model = model;
		this.color = color;
		//생성자에 매개변수를 넣으면 자식생성자의 super에도 동일형태로 넣어야함
		System.out.println("Phone(String model, String color)생성자 실행");
	}
}
