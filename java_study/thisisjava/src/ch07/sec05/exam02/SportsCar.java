package ch07.sec05.exam02; // final 메소드

public class SportsCar extends Car{
	
	@Override
	public void speedUp() {
		speed +=10;
	}
	
	//stop 메소드는 final이 달려서 오버라이딩 불가능
	
}
