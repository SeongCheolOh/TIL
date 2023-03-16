package ch06.sec07;

public class OverloadingEx {

	public static void main(String[] args) {
		// 생성자 오버로딩
		//매개값으로 객체의 필드를 다양하게 초기화하려면 생성자 오버로딩이 필요하다
		//매개변수를 달리하는 생성자를 여러 개 선언하는 것을 의미
		
		//생성자.1 호출
		Overloading car1 = new Overloading();
		System.out.println(car1.company);
		System.out.println();
		//생성자.2 호출
		Overloading car2 = new Overloading("자가용");
		//주어진 데이터의 타입과 갯수에 따라 호출 될 생성자가 자동 결정된다
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println();
		//생성자.3 호출
		Overloading car3 = new Overloading("자가용","빨강");
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println();
		//생성자.4 호출
		Overloading car4 = new Overloading("택시","검정",200);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
		System.out.println();
		//생성자.1의 model은 매개변수에 없기때문에 null로 표현된다
		System.out.println(car1.model);
	}

}
