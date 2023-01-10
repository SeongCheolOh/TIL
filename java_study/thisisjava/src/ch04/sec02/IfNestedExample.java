package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		// if(if)문
		
		//문제) 81<=...<=100 중 하나의 점수를 뽑아
		//바깥if문은 90점과 80점 기준으로 조건 작성
		//중첩if문은 95점과 85점 기준으로 작성하여 A+, A, B+, B, C를 출력
		int score = (int)(Math.random()*20+81);
		System.out.println("점수 : " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}
			else if(score>=80) {
				if(score>=85) {
					grade = "B+";
				}
				else {
					grade = "B";
				}
		}else {
			grade = "C";
		}
		System.out.println("등급 : " + grade);

	}

}
