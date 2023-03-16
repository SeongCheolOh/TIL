package ch05.sec12;

public enum Week {
	
	//데이터 중에는 몇 가지 한정된 값을 갖는 경우가 있다
	//ex) 요일, 계절 등
	//사용하려면 열거타입으로 파일 생성, 값을 코드로 정의해야한다
	//열거 상수는 모두 대문자인 알파벳으로 정의하는게 관례이다.
	//여러 단어일 경우, 언더바(_) 활용
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
	//열거 타입도 하나의 데이터 타입이므로 변수를 선언하고 사용해야 한다.

}
