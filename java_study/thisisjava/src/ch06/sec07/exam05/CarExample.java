package ch06.sec07.exam05;

public class CarExample {

	public static void main(String[] args) {
		// 객체 생성
		
		Car c2 = new Car("자가용");
		Car c3 = new Car("자가용","빨강");
		Car c4 = new Car("택시","검정",200);

		
		System.out.println("c2의 compoany : " + c2.company);
		System.out.println("c2의 model : " + c2.model);
		System.out.println("c2의 color : " + c2.color);
		System.out.println();

		System.out.println("c3의 compoany : " + c3.company);
		System.out.println("c3의 model" + c3.model);
		System.out.println("c3의 color" + c3.color);
		System.out.println("c3의 maxSpeed" + c3.maxSpeed);
		System.out.println();
		
		System.out.println("c4의 compoany : " + c4.company);
		System.out.println("c4의 model" + c4.model);
		System.out.println("c4의 color" + c4.color);
		System.out.println("c4의 maxSpeed" + c4.maxSpeed);
		System.out.println();
		
	}

}
