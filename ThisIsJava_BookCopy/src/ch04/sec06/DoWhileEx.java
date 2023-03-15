package ch04.sec06;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// 일반적인 while문에선 조건문에 따라 {}를 실행하지만
		// 경우에 따라 do를 통해 {}를 먼저 실행 후
		// while(조건문)을 판별해 반복할지 그만할지 결정하기도 한다
		
		System.out.println("메세지 입력");
		System.out.println("(종료를 원하시면 q를 입력)");
		Scanner sc = new Scanner(System.in);
		String input;
		do {
			System.out.print(">");
			input = sc.next();
			System.out.println(input);
		}while(!input.equals("q"));
		System.out.println("종료");

	}

}
