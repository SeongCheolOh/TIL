package javaMid6.p376;

public class HankookTire implements Tire{
	//추상메소드 재정의
	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다");
	}
}
