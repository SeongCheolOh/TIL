package javaBasic1;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		// 반복문(while, do-while, for)이나 조건문(if, switch-case)을 제어문이라 한다.
		// break문 - 제어문{}을 한 칸 탈출
		// continue문 - 
		
		int a = 10; {
			switch(a /*변수나 상수*/) {
			case 1: System.out.println("1 입니다"); break;
			case 5: System.out.println("5 입니다"); break;
			case 10: System.out.println("10 입니다"); break;
			default :/*1,5,10중에 없으면 디폴트로 */System.out.println("1, 5, 10을 제외한 값입니다");
			}
		}
		
		//문제) 홍길동 - 산에 삽니다 / 이순신 - 바다에 삽니다 / 강감찬 - 평지에 삽니다 / 그 외 - 집에 삽니다
		Scanner scanner = new Scanner(System.in); 
			String str = scanner.nextLine();
			switch(str) {
			case "홍길동": System.out.println("산에 삽니다"); break;
			case "이순신": System.out.println("바다에 삽니다"); break;
			case "강감찬": System.out.println("평지에 삽니다"); break;
			default : System.out.println("집에 삽니다");
			} 
		
		//문제) 숫자 3개를 입력받아서 평균을 구한 후, 90점 이상이면 A, 80점 이상이면 B, ... , F학점이라고 출력
			Scanner sc = new Scanner(System.in);
			int cnt=0; // 입력받은 점수 갯수 세어주는 변수
			int number;
			int sum=0;
			while (cnt<3) {
				System.out.println("점수는==>");
				number= sc.nextInt();
				sum=sum+number;
				cnt++;
			}
			System.out.println("\n합계는 ==>" +sum);
			System.out.println("평균은 ==>" +sum/3);
			System.out.println("과목 갯수는==>");
			int avg = (sum/3);
		/*	if (avg>=90) {
				System.out.println("A등급 입니다");
			}
			else if (avg>=80) {
				System.out.println("B등급 입니다");
			}
			else if (avg>=70) {
				System.out.println("C등급 입니다");
			}
			else if (avg>=60) {
				System.out.println("D등급 입니다");
			}
			else if (avg>=50) {
				System.out.println("E등급 입니다");
			}
			else {
				System.out.println("F등급 입니다");
			} 이렇게도 있지만 */
			// int hakjum=null;을 주고
			// 각 if마다 hakjum="등급";
			// else 탈출하고 출력 syso("학점은 ==> " + hakjum);
			String hakjum = null;
			if (avg>=90) {
				hakjum = ("A등급 입니다");
			}
			else if (avg>=80) {
				hakjum = ("B등급 입니다");
			}
			else if (avg>=70) {
				hakjum = ("C등급 입니다");
			}
			else if (avg>=60) {
				hakjum = ("D등급 입니다");
			}
			else if (avg>=50) {
				hakjum = ("E등급 입니다");
			}
			else {
				hakjum = ("F등급 입니다");
			}
			
			//switch, case 사용하여서
			switch( avg/ 10) { /* 모든 숫자를 나열하기 어려움 >> 90점대 = (정수)/10=(정수)9 이용 */
			case 10:
			case 9: hakjum = "A"; break;
			case 8: hakjum = "B"; break;
			case 7: hakjum = "C"; break;
			case 6: hakjum = "D"; break;
			case 5: hakjum = "E"; break;
			default : hakjum = "F";
			}
			System.out.println("학점(switch) ==>" + hakjum);
			
	}// end main

}// end class
