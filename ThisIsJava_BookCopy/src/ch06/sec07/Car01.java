package ch06.sec07;

public class Car01 {
	
	String company = "hyundai";
	String model;
	String color;
	int maxSpeed;

	//������.1
	public Car01(String model) {
		//21���� ������ ȣ��
		this(model,"����",250);
	}
	//������.2
	public Car01(String model, String color) {
		//21���� ������ ȣ��
		this(model,color,250);
	}
	//������.3
	public Car01(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	

}
