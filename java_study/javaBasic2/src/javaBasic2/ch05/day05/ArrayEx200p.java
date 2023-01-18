package javaBasic2.ch05.day05;

import java.util.Scanner;

public class ArrayEx200p {

	public static void main(String[] args) {
		// p.200 확인문제
		//9) 학생들의 점수 분석하는 프로그램 만들기
		//각 학생들의 점수를 입력받고, while과 nextLine()메소드 이용해서 최고 및 평균점수 출력하는 코드 작성
		
	/* ----------------------------------------------
	 * 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
	 * ----------------------------------------------
	 * 선택>1
	 * 학생수>3
	 */
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("번호를 선택하세요 > ");
			String choice = sc.nextLine();
			
			switch(choice) {
			case "1": cnt(); break;
			case "2": input(); break;
			case "3": list(); break;
			case "4": analyze(); break;
			case "5": flag = false; break;
			default : System.out.println("입력이 잘못되었습니다 (1~5 중 선택하세요");
			}
			
		}

		
	}//end main
	
	private static void cnt() {
		// 학생수 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수 > ");
		int sutdent = sc.nextInt();

	}
	private static void input() {
		// 점수 입력
		Scanner sc = new Scanner(System.in);
		int[] score = new int[3];
		for(int i=0; i<score.length; i++) {
		System.out.print("["+ i + "]번 학생 점수 > ");
		int score1 = sc.nextInt();
		}
		
	}
	private static void list() {
		// 점수 리스트
		
		
	}
	private static void analyze() {
		// 분석 
		// 최고 점수
		int sum = 0;
		int max = 0;
		int[] score = {85,95,93};
		for(int i=0; i<score.length; i++) {
			sum = sum + score[i];
			if(max<score[i]) {
				max = score[i];
			}else {
			}
		}
		System.out.println("최고 점수 = " + max);	
		// 평균 점수
		double avg = (double)sum/score.length;
		System.out.println("평균 점수 = " + avg);
	}

}//end class
