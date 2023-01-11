package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		// grade에 따라 스위치 된 점수를 scroe에 반영하는 예제
		
		String grade = "B";
		
		//java 11 이전 문법
		int score1 = 0;
		switch(grade) {
		case "A" : score1 = 100;
		break;
		case "B" : 
			int result = 100-20; // 이건 왜 넣은걸까... 그냥 score1 = 80;으로 해도 됐을껀데
			score1 = result;
		break;
		default : score1 = 60;
		}
		System.out.println("score1 : " + score1);
		
		/*java 12부터
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100-20;
		
		 
		
		// java 13부터
		 yield result;
		 }
		 default -> 60;
		 };
		 syso("score2 : " + score2);
		 */
	}

}
