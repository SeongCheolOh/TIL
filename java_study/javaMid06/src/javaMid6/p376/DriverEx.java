package javaMid6.p376;

public class DriverEx {
	
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Subway subway = new Subway();
		
		driver.driver(bus);
		driver.driver(taxi);
		driver.driver(subway);
		
		driver.fare(bus);
		driver.fare(taxi);
		driver.fare(subway);
		
		System.out.println("버스 요금은 " + driver.fare(bus) + "원 입니다");
		System.out.println("택시 요금은 " + driver.fare(taxi) + "원 입니다");
		System.out.println("지하철 요금은 " + driver.fare(subway) + "원 입니다");
	}

}
