package ch02.sec01;

import java.util.Scanner;

public class VarEx3 {

	public static void main(String[] args) {
		/*아래와 같이 입력합니다
		이름 ==> 홍길동
		국어점수 ==> 100
		영어점수 ==> 80
		수학점수 ==> 90
		
		출력화면
		
		----------------------
		  이젠 학교 성적표
		----------------------
		홍길동 100 80 90 270 90 1등
		----------------------*/
		
		//키보드 입력하는 스캐너 객체를 사용합니다	
	  Scanner sc = new Scanner(System.in);


	    
	  /*  //입력하기
		System.out.print("이름은==>");
		String name=sc.next();
		System.out.print("국어점수==>");
		String name1=sc.next();
		System.out.print("영어점수==>");
		String name2=sc.next();
		System.out.print("수학점수==>");
		String name3=sc.next();
		
		
	    
		System.out.println("-------------------");
		System.out.println("이젠 학교 성적표");
		System.out.println("-------------------");
		
	    System.out.print(name);
	    System.out.print(name1);
		System.out.print(name2);
		System.out.print(name3);
		
		int x = sc.nextInt();
        System.out.print(name1);
	    int y = sc.nextInt();
	    System.out.print(name2);
	    int z = sc.nextInt();
	    System.out.print(name3);
	    
		System.out.print(x+y+z);
		System.out.print((x+y+z)/3);

	    
		System.out.print(x+y+z);
		System.out.print((x+y+z)/3);

		System.out.print("1등"); */
		
		//답안
		Scanner Sc = new Scanner(System.in);
		//입력하기
		System.out.print("이름은==>");
		String name = sc.next();
		System.out.print("국어점수==>");
		int kor = sc.nextInt();
		System.out.print("국어점수==>");
		int eng = sc.nextInt();
		System.out.print("국어점수==>");
		int mat = sc.nextInt();
		//합계
		int total = kor + eng + mat;
		System.out.println(total);
		//평균
		int avg = total/3;
		System.out.println(avg);
		/* 평균 소수점 2째자리까지
		double avg = total/3;
		System.out.println(avg);
		-----------
		 int- 정수형
		 double - 실수형
		 ----------->>73.666나와야하는데 74나옴
		 정수/정수=정수가 나옴
		 [total/3]을 [total]/3.0]으로 하던지
		 합계의 [int total]을 [double total]로 하던지
		 ----------->>73.6666~~ 나옴
		 소수점 둘째자리까지는
		 syso.printf("%.2f",avg);
		 %=형식
		 .2f=소수점 둘째자리
		 */
	    System.out.println("-------------");
	    System.out.println("이젠 학원");
	    System.out.println("-------------");
	    System.out.println(name + " "+ kor+ " "+eng+" "+mat+" "+total+" "+avg+" "+"1등");
		
		
		
		
		
		

	}

}
