package ch07.sec07.exam02; // 타입변환 - 자동타입변환

public class Child extends Parent{
	
	//메소드 오버라이딩
	@Override
	public void method2() {
		System.out.println("자식 메소드2");
	}
	
	//메소드 선언

	public void method3() {
		System.out.println("자식 메소드3");
	}

	
}
