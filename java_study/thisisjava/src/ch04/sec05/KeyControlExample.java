package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		// while(){...} >> ()가 true면 {...}를 실행
		// while(true){...} >> {...}를 무한히 반복
		// 빠져나가는 코드가 필요하다
		
		Scanner sc = new Scanner(System.in); // Scanner 생성
		
		boolean run = true; // while()에 들어갈 변수 선언
		int speed = 0;
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------");
			System.out.println("선택: ");//메뉴 생성
		
		String strNum = sc.nextLine(); // 키보드에서 입력한 내용을 읽음
		
		if(strNum.equals("1")){
			speed++;
			System.out.println("현재속도 = " + speed);}
		else if(strNum.equals("2")) {
			speed--;
			System.out.println("현재속도 = " + speed);
		}
		else if(strNum.equals("3")) {
			run=false; // while(run)을 false로 만듦
		}
		
		}
		System.out.println("프로그램 종료");
	}

}
