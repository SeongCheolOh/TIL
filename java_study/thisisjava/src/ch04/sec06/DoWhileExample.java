package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// do-while 문
		
		// 일반 while문 = true면 반복실행, false면 종료
		// do-while문
		// 1. do의 실행문을 실행
		// 2. while이 true면 조건문 실행
		// 3. 다시 do로 올라와서 반복
		// 4. ...while이 false면 종료
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc = new Scanner(System.in); // Scanner 생성
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		}while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}//end main

}//end class
