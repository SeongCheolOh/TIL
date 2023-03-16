package ch06.sec07;

public class Overloading {
	
	String company = "hyundai";
	String model;
	String color;
	int maxSpeed;
	//持失切.1
	public Overloading() {
	}
	//持失切.2
	public Overloading(String model) {
		this.model = model;
	}
	//持失切.3
	public Overloading(String model, String color) {
		this.model = model;
		this.color = color;
	}
	//持失切.4
	public Overloading(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
