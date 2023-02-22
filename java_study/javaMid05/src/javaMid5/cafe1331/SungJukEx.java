package javaMid5.cafe1331;

import java.util.Scanner;

public class SungJukEx {
	static Scanner sc = null; // 전역 변수
	static SungJukBusiness sb;
	public static void main(String[] args) {
		//다형성
		SungJuk e1 = new EliStudent();
		SungJuk m1 = new MidStudent();
		SungJuk h1 = new HighStudent();
		//객체생성
		sb = new SungJukBusiness();
		sc = new Scanner(System.in);
		boolean end = false;
		int menu = 0;
		do {
			System.out.println("------------------------------");
			System.out.println("1.초등학교 2.중학교 3.고등학교 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택 > ");
			menu = sc.nextInt();
			switch(menu) {
			case 1 : EliStudent(e1); break;
			case 2 : MidStudent(m1); break;
			case 3 : HighStudent(h1); break;
			case 4 : end = true;
			default : System.out.println("잘못 선택하였습니다 다시 입력하여주세요");
			}
		}while(!end); 
	}


	private static void EliStudentEx(SungJuk e1) {
	}
	private static void MidStudentEx(SungJuk m1) {
	}
	private static void HighStudentEx(SungJuk h1) {
	}

	
	private static void HighStudent(SungJuk h1) {
		int menu;
		boolean end = false;
		System.out.println("------------------------------");
		System.out.println("고등학교 성적관리 프로그램");
		System.out.println("------------------------------");
		System.out.println("1.입력 2.출력 3.메인으로 돌아가기");
		System.out.println();
		System.out.println("선택 > ");
		menu = sc.nextInt();
		switch(menu) {
		case 1 : sb.input(h1); break;
		case 2 : sb.output(h1); break;
		case 3 : end = true; break ;
		}while(!end);
	}

	private static void MidStudent(SungJuk m1) {
		int menu;
		boolean end = false;
		System.out.println("------------------------------");
		System.out.println("중학교 성적관리 프로그램");
		System.out.println("------------------------------");
		System.out.println("1.입력 2.출력 3.메인으로 돌아가기");
		System.out.println();
		System.out.println("선택 > ");
		menu = sc.nextInt();
		switch(menu) {
		case 1 : sb.input(m1); break;
		case 2 : sb.output(m1); break;
		case 3 : end = true; break ;
		}while(!end);
	}

	private static void EliStudent(SungJuk e1) {
		// 메뉴를 띄우고 입력받기
		int menu;
		boolean end = false;
		System.out.println("------------------------------");
		System.out.println("초등학교 성적관리 프로그램");
		System.out.println("------------------------------");
		System.out.println("1.입력 2.출력 3.메인으로 돌아가기");
		System.out.println();
		System.out.print("선택 > ");
		menu = sc.nextInt();
		switch(menu) {
		case 1 : sb.input(e1); break;
		case 2 : sb.output(e1); break;
		case 3 : end = true; break;
		}while(!end);
	}

}
/*
1. 기본설계
  부모클래스 : 과목명, 점수, 중간고사, 기말고사, 수행평가
  자식클래스 : 초등학생 - 부모클래스 그대로 상속
            중학생 - 부모클래스 상속, 담당교사, 출석점수, 봉사점수
            고등학생 - 부모클래스 중학생 상속, 표준편차
  비즈니스 클래스 : 입력받기, 점수 합산하기, 출력하기
  메인 클래스 : 비즈니스 클래스 호출하기, 시작 메뉴 화면 만들기, 비즈니스 클래스 메소드 호출하기

2. 상세설계
   SungJuk.java : subject,score, midtermExam, finals, performanceEvalution
   ElementaryStudent.java - 초등학생
   MiddleSchooler - 중학생 teacher 담당교사, attendance - 출석, service-봉사 
   HighSchoolStudent - 고등학생 standardDeviation - 표준편차
   
   -------------------------------
   1.초등학교 2.중학교 3.고등학교 4.종료
   -------------------------------
   선택>1
   
   -----------------------
   초등학교 성적관리 프로그램
   -----------------------
   1.입력 2.출력 3.메인으로 돌아가기
   선택>1
*/