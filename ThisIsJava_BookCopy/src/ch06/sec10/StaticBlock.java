package ch06.sec10;

public class StaticBlock {
	//정적 블록
	//정적 필드는 필드선언과 동시에 초기값을 주는게 일반적이다
	//하지만 복잡한 초기화 작업이 필요하다면
	//정적 블록을 이용해야한다 >> static{~~~}
	//클래스가 메모리로 로딩될 때 자동으로 실행된다. 여러개일 경우 차례대로 실행
	
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	static {
		info = company+" - "+model;
	}
}
