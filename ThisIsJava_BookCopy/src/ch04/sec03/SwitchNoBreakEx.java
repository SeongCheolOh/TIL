package ch04.sec03;

public class SwitchNoBreakEx {

	public static void main(String[] args) {
		// case 끝에 break가 없으면 다음 case가 연달아 실행되는데
		// 이 때는 case 값과는 상관없이 실행된다
		
		int time = (int)(Math.random()*4)+8;
		System.out.println(time+"시");
		
		switch(time) {
		case 8:System.out.println("출근");
		case 9:System.out.println("회의");
		case 10:System.out.println("업무");
		default :System.out.println("외근");
		}

	}

}
