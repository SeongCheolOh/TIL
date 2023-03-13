package ch02.sec12;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// 키보드 입력 데이터를 변수에 저장
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 > ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y값 입력 > ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);

		System.out.println(x+y);
		System.out.println();
		
		while(true) {//반복문
			System.out.print("입력 문자열 : ");
			String data = sc.nextLine();
			if(data.equals("q")) {
				System.out.println("종료합니다");
				break;//입력된 값이 q라면 while문 중지
			}
			System.out.println("출력 문자열 : " + data);
			System.out.println("반복합니다");
		}

	}

}
