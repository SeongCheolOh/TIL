package javaHeight02.practice;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a,b,c,d;
		System.out.println("4개의 과목 이름을 순서대로 입력하세요 > ");
		a = sc.next();
		b = sc.next();
		c = sc.next();
		d = sc.next();
		System.out.println(a+" "+b+" "+c+" "+d);
		System.out.println("각 과목의 점수를 순서대로 입력하세요 > ");
		
		int []score = new int[4];
		int sum = 0;
		double avg = 0;
		for(int i = 0; i<score.length ; i++) {
			score[i] = sc.nextInt();
			sum = sum + score[i];
		}
		avg = (double)sum/score.length;
		System.out.println("총 합은 " + sum);
		System.out.println("평균점수는 " + avg);
		
		
	}

}
