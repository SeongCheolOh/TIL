package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// 삼항(조건)연산자
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80) ? 'B' : 'C'); // a?b:c에서 참이면 b, 거짓이면 c 
		System.out.println(score + "점은" + grade+ "등급입니다.");
	}

}
