package ch06.sec07;

public class Overloading {
	
	String company = "hyundai";
	String model;
	String color;
	int maxSpeed;
	//������.1
	public Overloading() {
	}
	//������.2
	public Overloading(String model) {
		this.model = model;
	}
	//������.3
	public Overloading(String model, String color) {
		this.model = model;
		this.color = color;
	}
	//������.4
	public Overloading(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
