package javaMid3.p318;

public class PolyMain {
		
	public static void main(String[] args) {
		CaptionTv ca = new CaptionTv();
		ca.channel = 11;
		ca.power = true;
		ca.text = "파노라마";
		ca.caption();
		ca.channelUp();
		ca.channelDown();
		
		Tv tv = new Tv();
		tv.channel = 7;
		tv.power = false;
		tv.channelDown();
		tv.channelUp();
		//부모는 자기것만
	//	tv.text = "디지털"; 컴파일 에러
		
		//다형성으로 객체화 하세요
		Tv tv1 = new CaptionTv();
		tv.channel = 7;
		tv.power = false;
		tv.channelDown();
		System.out.println("-------------");
		tv.channelUp();
//		tv.text = "디지털";
//		tv.caption();

		//자식필드와 메소드를 사용하려면
		//1. 오버라이드
		
		//2. 다운캐스트
		CaptionTv ct = (CaptionTv)tv1;
		ct.text = "디지털";
		ct.caption();
		
	}

}
