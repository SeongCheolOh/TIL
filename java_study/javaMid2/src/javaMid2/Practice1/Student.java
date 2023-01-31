package javaMid2.Practice1;

public class Student extends Person{
	
	public void study() {
		
	}
	
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("말을 줄임");
	}

	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("파스타, 피자");
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("늦게 자고 늦게 일어남");
		
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("걷는걸 싫어함");
	}
	String a = "공부하기";
}
