package ch04.sec02;

public class IfElseExample {

	public static void main(String[] args) {
		// if else문
		int score = 85;
		
		if(score>= 90) {
			System.out.println("90점 이상입니다");
			System.out.println("등급은 a입니다");
		}else /* else 자체가 '나머지'라는 의미를 지녀서 안써줘도 됨 */ {
			System.out.println("90점 미만입니다");
			System.out.println("등급은 b입니다");
		}

	}

}
