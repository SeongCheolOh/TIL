package ch07.sec07.exam02; // 타입변환 - 자동타입변환

public class ChildExample {

	public static void main(String[] args) {
		//자식 객체 생성
		
		Child child = new Child();
		
		//자동타입변환
		Parent parent = new Child();
		
		//메소드 호출
		parent.method1();
		parent.method2();
//		parent.method3(); 호출 불가능
	}

}
