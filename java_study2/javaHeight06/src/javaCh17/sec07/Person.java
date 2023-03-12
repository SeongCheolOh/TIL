package javaCh17.sec07;

public class Person {

	private String name;
	private boolean gender;
	private double pay;
	public Person(String name, boolean gender, double pay) {
		super();
		this.name = name;
		this.gender = gender;
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public boolean isGender() {
		return gender;
	}
	public double getPay() {
		return pay;
	}
	
}
