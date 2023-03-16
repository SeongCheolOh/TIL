package ch06.sec07;

public class Car01 {
	
	String company = "hyundai";
	String model;
	String color;
	int maxSpeed;

	//생성자.1
	public Car01(String model) {
		//21라인 생성자 호출
		this(model,"은색",250);
	}
	//생성자.2
	public Car01(String model, String color) {
		//21라인 생성자 호출
		this(model,color,250);
	}
	//생성자.3
	public Car01(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	

}
