package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
		// String 변수에는 빈 문자열을 대입할 수도 있다
		// 빈 문자열 " "도 객체로 생성되기 때문에 .equals() 메소드를 사용해야한다
		String hobby = " ";
		if(hobby.equals(" ")) {
			System.out.println("hobby 변수 >> 참조는 String, 객체는 빈 문자열");
		}
	}

}
