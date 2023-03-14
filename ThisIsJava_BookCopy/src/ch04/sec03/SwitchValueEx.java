package ch04.sec03;

public class SwitchValueEx {

	public static void main(String[] args) {
		// 스위치 된 값을 변수에 바로 대입
		
		String grade = "B";
		
		int score1 = 0;
		switch(grade) {
		case "A": score1 = 1; break;
		case "B": int result = 100-20;
					score1 = result; break;
		default : score1 = 60;
		}
		System.out.println(score1);
	}

}
