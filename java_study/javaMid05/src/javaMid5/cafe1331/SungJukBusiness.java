package javaMid5.cafe1331;

import java.util.Scanner;

public class SungJukBusiness {
	//입력메소드
	void input(SungJuk sj) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과목명은 > ");
		sj.setSubject(sc.next());
		sc.nextLine();//입력후 엔터 처리
		System.out.println("시험점수를 입력하세요");
		System.out.print("중간고사의 점수 > ");
		sj.setMidExam(sc.nextInt());
		sc.nextLine();//입력후 엔터 처리
		System.out.print("기말고사의 점수 > ");
		sj.setFinExam(sc.nextInt());
		sc.nextLine();//입력후 엔터 처리
		System.out.print("수행평가 점수 > ");
		sj.setPerformEvalution(sc.nextInt());
		sc.nextLine();//입력후 엔터 처리
		sj.setScore(sj.getMidExam() + sj.getFinExam() + sj.getPerformEvalution());
		System.out.println("총점 > " + sj.getScore());
		
		
		if(sj instanceof EliStudent) {
			calc(sj);
		}else if(sj instanceof MidStudent) {
			MidStudent ms = (MidStudent) sj;
			System.out.print("담당교사는 > ");
			ms.setTeacher(sc.next());
			sc.nextLine();
			System.out.print("출석점수는 > ");
			ms.setTeacher(sc.next());
			sc.nextLine();
			System.out.print("봉사점수는 > ");
			ms.setTeacher(sc.next());
			sc.nextLine();
			
			calc(sj); // ? + 출석점수 + 봉사점수
		}else if(sj instanceof HighStudent) {
			HighStudent hs = (HighStudent) sj;
			System.out.println("담당교사는 > ");
			hs.setTeacher(sc.next());
			sc.nextLine();
			System.out.println("출석점수는 > ");
			hs.setTeacher(sc.next());
			sc.nextLine();
			System.out.println("봉사점수는 > ");
			hs.setTeacher(sc.next());
			sc.nextLine();
			System.out.println("표준편차는 > ");
			
			calc(sj); // ? + 출석점수 + 봉사점수
		}

	}
	
	//출력메소드
	void output(SungJuk e1) {
		e1.printAll();
		
	}
	
	//점수메소드
	void calc(SungJuk e1) {
		if(e1 instanceof EliStudent) {
			e1.setScore(e1.getMidExam() + e1.getFinExam() + e1.getPerformEvalution());	
		}else if(e1 instanceof HighStudent) {
			HighStudent hs = (HighStudent)e1;
			hs.setScore(hs.getMidExam() + hs.getFinExam() + hs.getPerformEvalution() + hs.getDayCheck() + hs.getService());
			hs.setStandardDeviation(hs.getScore()*0.253);
		}else if(e1 instanceof MidStudent) {
			MidStudent ms = (MidStudent)e1;
			ms.setScore(ms.getMidExam() + ms.getFinExam() + ms.getPerformEvalution() + ms.getDayCheck() + ms.getService());
		}
		
	}
}

