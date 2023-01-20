package ch06.day1;

public class Car {

	String carName; // 자동차 이름
	int carPrice; // 자동차 가격
	String carBrand; // 자동차 브랜드
	
	//생성자 constructor
	//생성자가 하나도 없으면 컴파일러가 자동으로 기본 생성자를 만든다
	//사용자 생성자를 만들었다면, 컴파일러는 생성자를 안 만든다
	
	public Car() {//생성자 >> class이름과 같다, 리턴 타입이 없다
		System.out.println("이 곳은 생성자 입니다. 언제 처리될까요?");
		carName = "소나타";
		carPrice = 5000;
		carBrand = "현대";
		
	}
	public Car(String carName) {
		this.carName = carName;
	}
	
	public Car(String carName, int carPrice) {
		this.carName = carName;
		this.carPrice = carPrice;
	}
	
	public Car(String carName, int carPrice, String carBrand) {
		this.carName = carName;
		this.carPrice = carPrice;
		this.carBrand = carBrand;
	}
	
	//오버로딩 Overloading
	//생성자 Car는 같아도 (매개변수 타입)내용이 다르면 다른 생성자이다
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}//end main
		
}//end class
