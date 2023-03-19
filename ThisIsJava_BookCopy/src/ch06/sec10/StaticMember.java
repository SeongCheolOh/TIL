package ch06.sec10;

public class StaticMember {
	//정적 멤버
	//자바는 클래스 로더를 이용해서 클래스를 메소드 영역에 저장하고 사용한다
	//정적 멤버란 메소드 영역의 클래스에 고정적으로 위치하는 멤버를 말한다.
	//때문에 객체생성 없이 사용 가능하다
	
	//정적 필드 선언 >> static 타입 필드 [= 초기값];
	//정적 메소드 선언 >> static 리턴타입 메소드(매개변수,~~~){~~~}
	
	//객체마다 가지고 있을 필요성이 있는 공통적인 필드나 메소드는 static으로 선언하는게 좋다
	//외부에서 주어진 매개값들을 처리하는 메소드는 정적메소드
	//인스턴스 필드를 변경하는 메소드는 인스턴스 메소드로 선언해야 함
	
	//정적 멤버 사용 >> 클래스명.(필드명 or 메소드명)
	
	static double pi = 3.141592;
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y; 
	}
	

}
