package ch03.sec11;

public class ConditionalOperationEx {

	public static void main(String[] args) {
		// 삼항연산자
		
		//조건식1(피연산자1) ? 값or연산식(피연산자2) : 값or연산식(피연산자3)
		//A ? B : C
		//A가 true면 B, false면 C라는 뜻
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80)? 'B' : 'C');
		System.out.println(grade);

	}

}
