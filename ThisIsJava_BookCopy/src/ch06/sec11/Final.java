package ch06.sec11;

public class Final {	
	//Final 필드와 상수
	//인스턴스와 정적 필드는 언제든지 값을 변경할 수 있다
	//경우에 따라 수정 불가능하게 >> final 필드와 상수를 선언해서 사용
	
	final String nation = "대한민국";
	final String ssn;
	String name;

	public Final(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
}
