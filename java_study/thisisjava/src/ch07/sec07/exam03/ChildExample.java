package ch07.sec07.exam03; // 타입변환 - 자동타입변환

public class ChildExample {

	public static void main(String[] args) {
		
		//객체생성 및 자동타입변환
		Parent parent = new Child();
		
		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";
//		parent.method3();  			사용 불가능
		
		//강제 타입 변환 후 사용 가능
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
	}

}
