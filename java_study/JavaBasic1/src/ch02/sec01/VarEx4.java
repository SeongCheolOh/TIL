package ch02.sec01;

import java.util.Scanner;

public class VarEx4 {

	public static void main(String[] args) {
		/* 문제2)
		   자신의 몸무게(kg)를 키의 제곱(m)으로 나눈 값입니다.
		   입력화면
		   ------------
		   체질량 지수를 구하는 프로그램
		   ------------
		   당신의 몸무게는? 50(입력)
		   당신의 키는? 160(입력)
		   당신의 성별은? (남:true, 여:false) true
		   ------------
		   당신의 체질량 지수는? 000.00입니다
		   저체중 or 과체중 or 비만 입니다
		   저체중<18.5<정상<23<과체중<25<비만 */
		System.out.println("-----------------");
		System.out.println("체질량 지수를 구하는 코드");
		System.out.println("-----------------");
		//키보드입력받는 객체 Scanner 사용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 몸무게는==>");
		double weight = sc.nextDouble();//sc와 next의 역할이 뭔지, Double = 실수형
		
		System.out.println("당신의 키는==>");
		int height = sc.nextInt(); //next 뒤의 in = 는 정수형
		
		System.out.println("당신의 성별(남자면 true, 여자면 false)을 입력하세요");
		boolean gender = sc.hasNextBoolean(); // boolean = 불린형
		System.out.println(gender);
		if(gender)
			System.out.println("남자");
	    else
	    	System.out.println("여자");
		
		
		System.out.println(weight+" "+height+" "+gender);
		
		//체질량지수는 자신의 몸무게를 키의 제곱으로 나눈다
		double bmi=weight/(height*height/10000.0);
		System.out.println(bmi);
		
	}

}
