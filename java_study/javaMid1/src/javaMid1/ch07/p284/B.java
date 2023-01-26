package javaMid1.ch07.p284;

public class B extends A{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		
	}
	public void printN() {
		System.out.println("나이는 " + age);
		System.out.println("전화번호는 " + getPhone());
	}
	
}
