package javaBasic2.ch05.day05;

import java.util.Scanner;

public class ArrayEx200p_answer {

	static Scanner sc = new Scanner(System.in);
	
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
		boolean flag = true;
		int student = 0;
		int[] scores = null;
		
		while(flag) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("번호를 선택하세요 > ");
			String choice = sc.nextLine();
			
			switch(choice) {
			case "1": student = cnt(); break;
			case "2": scores =input(student); break;
			case "3": list(scores); break;
			case "4": analyze(scores); break;
			case "5": flag = false; break;
			default : System.out.println("입력이 잘못되었습니다 (1~5 중 선택하세요");
			}
			
		}

		
	}//end main
	
	private static int cnt() {
		// 학생수 입력
		System.out.print("학생수 > ");
		int student = sc.nextInt();
		sc.nextLine();
		return student;

	}
	private static int[] input(int student) {
		// 점수 입력
		int[]scores = new int[student];
		for(int i=0; i<student; i++) {
		System.out.print("["+ i + "]번 학생 점수 > ");
		scores[i] = sc.nextInt();
		sc.nextLine();
		}
		return scores;
	}
	private static void list(int[] scores) {
		// 점수 리스트
		for(int i=0; i<scores.length; i++) {
			System.out.println("["+ i + "]번 학생 점수 > " + scores[i]);
		}
		
		
	}
	private static void analyze(int[] scores) {
		// 분석 
		int sum = 0;// 합계 점수
		int max = 0;// 최고 점수
		for(int i=0; i<scores.length; i++) {
			sum = sum + scores[i];
			if(max<scores[i]) {
				max = scores[i];
			}
		}
		System.out.println("최고 점수 = " + max);	
		double avg = (double)sum/scores.length;// 평균 점수
		System.out.println("평균 점수 = " + avg);
	}

}//end class
