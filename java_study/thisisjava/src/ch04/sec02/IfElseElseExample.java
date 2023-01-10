package ch04.sec02;

public class IfElseElseExample {

	public static void main(String[] args) {
		// if else else
		int score = 75;
		
		if(score>= 90) {
			System.out.println("90점 이상입니다");
			System.out.println("등급은 a입니다");
		}else if(score >=80) {
			System.out.println("80~89점 입니다");
			System.out.println("등급은 b입니다");
		}else if(score >=70) {
			System.out.println("70~79점 입니다");
			System.out.println("등급은 c입니다");
		}else {
			System.out.println("70점 미만입니다");
			System.out.println("등급은 d입니다");
		}

	}

}
