package ch04.sec02;

public class IfNestedEx {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;
		System.out.println(score);
		String grade;
		if(score>=90) {
			if(score>=95) {
				grade = "A";
			}else {
				grade = "B";
			}
		}else {
			if(score>=85) {
				grade = "C";
			}else {
				grade = "D";
			}
		}
		System.out.println(grade);

	}

}
