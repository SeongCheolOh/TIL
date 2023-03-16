package ch06.sec07;

public class CarEx01 {

	public static void main(String[] args) {

		Car01 c1 = new Car01("자가용");
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println();
		Car01 c2 = new Car01("자가용","빨강");
		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println();
		Car01 c3 = new Car01("택시","검정",200);
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxSpeed);
	}

}
