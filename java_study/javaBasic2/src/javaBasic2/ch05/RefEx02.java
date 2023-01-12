package javaBasic2.ch05;

public class RefEx02 {

	public static void main(String[] args) {
		// test
		Car car = new Car();
		//carName이란 변수는 Car이란 클래스 안에 
		car.carName = "sonata";
		car.carPrice = 3500;
		System.out.println(car.carName + " " + car.carPrice);
		
		Car car1 = new Car();
		car1.carName = "grandeur";
		car1.carPrice = 5000;
		System.out.println(car1.carName + " " + car.carPrice);
		
		City city = new City();
		City city1 = new City();
		city.cityName = "하남시";
		city.cityLocation = "경기도";
		city.cityTax = 0.125;
		city.cityCondition = true;
		city1.cityName = "강동구";
		city1.cityLocation = "서울시";
		city1.cityTax = 0.134;
		city1.cityCondition = true;
		System.out.println(city.cityName + " " +city.cityLocation + " " +city.cityTax + " " +city.cityCondition);
		System.out.println(city1.cityName + " " +city1.cityLocation + " " +city1.cityTax + " " +city1.cityCondition);
		
		
		
		
	}

}

class Car{// 필드(변수)
	String carName;
	int carPrice;
	
	}

class City{
	String cityName;
	String cityLocation;
	double cityTax;
	boolean cityCondition;
}