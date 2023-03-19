package ch06.sec08;

public class Computer {
	//가변길이 매개변수
	//만약 메소드가 가변길이 매개변수를 가지고 있다면
	//매개변수의 개수와 상관없이 매개값을 줄 수 있다.
	
	//가변길이 매개변수를 갖는 메소드 선언
	int sum(int ... value) {//>>가변길이 매개변수 선언
		//sum 변수 선언
		int sum = 0;
	//value는 배열타입의 변수처럼 사용
		for(int i = 0; i<value.length; i++) {
			sum += value[i];
		}
	//합산결과 리턴
	return sum;
	}

}
