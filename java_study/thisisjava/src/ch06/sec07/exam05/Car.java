package ch06.sec07.exam05;

public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 선언
	Car(String model){//1번 생성자
		this(model, "은색", 250);
		System.out.println("1");
	}
	
	Car(String model, String color){//2번 생성자
		this(model, color, 250);
		System.out.println("2");
	}
	
	Car(String model, String color, int maxSpeed){//3번 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("3");
	}

}
