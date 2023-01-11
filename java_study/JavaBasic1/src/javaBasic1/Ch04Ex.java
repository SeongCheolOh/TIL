package javaBasic1;

import java.util.Scanner;

public class Ch04Ex {

	public static void main(String[] args) {
		// 확인문제 풀기
		
		//문제)주사위 숫자 2개를 랜덤뽑은 합이 5면 그만 던지기
		while(true) {
		int a1 = ((int)(Math.random()*6)+1);
		int a2 = ((int)(Math.random()*6)+1);
		
		if((a1+a2)==5) {System.out.println("("+ a1 + "," + a2 + ")"); break;
		}
		}
		
		//문제)
		for(int x=1 ; x<=10 ; x++) {
			for(int y=1 ; y<=10; y++) {
				if(4 * x + 5 * y == 60) System.out.println("(" + x + "," + y + ")");
			}
		}
		
		//문제)
	/*	*
		**
		***
		****
		*****가 출력되도록 코드 작성 */
		
		//hint) syso("*");를 반복한다
		for(int i= 1 ; i<=5 ; i++) {
			for(int j = 1; j<=i ; j++) {//1째줄일때 1번, 2째줄 2번, ... , 6째줄에 6번 반복
				System.out.print("*");
				}
			System.out.println(); 
		}
		System.out.println("\n-------------------");
		
		//문제)while문과 Scanner의 next()를 이용하여 다음과 같이 만들어보세요.
		// -------------------------------
		// 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
		// -------------------------------
		// 1을 치면 예끔 2를 치면 출금 3을 치면 잔고 4를 치면 종료
		
		Scanner scr = new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("은행 거래 프로그램");
		System.out.println("-----------------------");
		String num = null;
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.println("선택> ");
			num = scr.nextLine();
			switch(num) {
			case "1": System.out.println("1. 예금");
			case "2": System.out.println("2. 출금");
			case "3": System.out.println("3. 잔고");
			case "4": System.out.println("4. 종료");break;
			default : 
			}
			//여긴 while 속
			break;
		}
		
		
		
	}//end main

}//end class
