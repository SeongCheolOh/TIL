package ch04.sec03;

public class SwitchBreakCaseExample {

	public static void main(String[] args) {
		// switch문
		// 만약 break가 없다면 다음 case가 연달아 실행되는데, 이때는 case값과는 상관이 없다
		
		int time = (int)((Math.random()*4)+8); // 8부터 4개의 정수 8,9,10,11
		System.out.println("[현재 시간 : "+ time + "시]");
		
		switch(time) {
		case 8 : System.out.println("출근합니다");
		case 9 : System.out.println("회의를 합니다");
		case 10 : System.out.println("업무를 봅니다");
		default : System.out.println("외근을 나갑니다");
		}

	}

}
