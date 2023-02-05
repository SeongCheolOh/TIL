package ch07.sec03.example;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// 자식생성자만 호출해도, 부모생성자까지 같이 호출된다
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		System.out.println(myPhone.model);
		System.out.println(myPhone.color); 
	}

}
