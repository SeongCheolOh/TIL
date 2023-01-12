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
		// 1을 치면 예금 2를 치면 출금 3을 치면 잔고 4를 치면 종료
		
		Scanner scr = new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("은행 거래 프로그램");
		System.out.println("-----------------------");
		String num = null;
		
		int money=0; //입력 받는 돈
		int balance=0; // 잔액
		int adress=0; //계좌번호
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 이체 | 0. 종료");
			System.out.println("---------------------------------");
			System.out.println("선택> ");
			num = scr.nextLine();
			
			switch(num) {
			case "1": {System.out.println("예금액>");
						money = scr.nextInt();
						scr.nextLine();
						balance = balance + money; 
						break;}
			case "2": {System.out.println("출금액>");
						money = scr.nextInt();
						scr.nextLine();
						//잔액<출금액이면 "잔액 부족입니다"라고 출력하세요
						if(balance<money) {
							System.out.println("잔액 부족입니다");}
						else {balance = balance - money;}
						break;}
			case "3": {System.out.println("잔고액");
						System.out.println(balance);
						System.out.println();
						
						break;}
			case "4": { // 이체할 계좌번호 > 이체할 금액 > 잔액보다 작으면 00계좌로 00금액이 이체됐습니다
						System.out.println("이체해야 할 계좌번호를 입력해주세요");
						adress = scr.nextInt();
						System.out.println("잔액은 " + balance + "원 입니다");
						System.out.println("이체 할 금액을 입력해주세요");
						money = scr.nextInt();
						scr.nextLine();
						if(balance<money) {
							System.out.println("잔액 부족입니다");}
						else {balance = balance-money;
							  System.out.println(adress + "계좌로 "+ money + "원이 이체됐습니다. 잔액은" +balance + "원 입니다");}
						break;}			
			case "0": {System.out.println("0. 종료"); 
						break;}
			default : System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
			if(num.equals("0")) break;//여긴 while 속
		}
		
		
		
	}//end main

}//end class
