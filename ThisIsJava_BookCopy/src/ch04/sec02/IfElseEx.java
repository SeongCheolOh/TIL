package ch04.sec02;

public class IfElseEx {

	public static void main(String[] args) {
		int score1 = 93;
		if(score1>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다");
		}else{
			System.out.println("점수<90");
			System.out.println("B등급");
		}System.out.println("-----------");
		
		int score2 = 75;
		
		if(score2>=90) {
			System.out.println("점수>=90");
			System.out.println("A등급");
		}else if(score2>=80) {
			System.out.println("90>=점수>=80");
			System.out.println("B등급");
		}else {
			System.out.println("점수<80");
			System.out.println("C등급");
		}

	}

}
