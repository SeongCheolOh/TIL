package ch07.sec08.exam01; // 다형성

public class Hankook extends Tire{
	//메소드 재정의
	@Override
	public void roll() {
		System.out.println("한국타이어가 회전합니다");
	}

}
