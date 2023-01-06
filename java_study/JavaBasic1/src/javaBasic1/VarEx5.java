package javaBasic1;

import java.util.Scanner;

public class VarEx5 {

	public static void main(String[] args) {
		System.out.println("-----------------");
		System.out.println("체질량 지수를 구하는 코드");
		System.out.println("-----------------");
		//키보드입력받는 객체 Scanner 사용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 몸무게(kg)는==>");
		double weight = sc.nextDouble();//sc와 next의 역할이 뭔지, Double = 실수형
		
		System.out.println("당신의 키는(cm)==>");
		double height = sc.nextDouble(); //next 뒤의 in = 는 정수형
		
		System.out.println("당신의 성별(남자면 true, 여자면 false)을 입력하세요");
		boolean gender = sc.hasNextBoolean(); // boolean = 불린형
		if(gender)
			System.out.println("남자");
	    else
	    	System.out.println("여자");
		
		
		System.out.println(weight+" "+height+" "+gender);
		
		//체질량지수는 자신의 몸무게(kg)를 키(cm를 m로 치환)를 제곱으로 나눈다
		double bmi=weight/(height*height/10000.0); // 10000뒤에 .0을 붙이는 이유는 
		System.out.println(bmi);
		
		/*  if( bmi < 18.5)
			System.out.println("저체중");
			if( 18.5 <= bmi && bmi < 23) // && = 그리고 라는 의미
			System.out.println("정상 체중");
			if( 23<= bmi && bmi < 25)
			System.out.println("과체중");
			if( 25<= bmi)
			System.out.println("비만"); */
		if( bmi < 18.5)
			System.out.println("저체중");
		else if( 18.5 <= bmi && bmi < 23) // && = 그리고 라는 의미
			System.out.println("정상 체중");
		else if( 23<= bmi && bmi < 25)
			System.out.println("과체중");
		else if( 25<= bmi)
			System.out.println("비만");
		//else의 유무와 관계없이 값은 정상으로 나온다
		//위와의 차이점은
		// if로만 작성하면, 참이든 거짓이든 작성부 모두 실행하는데
		// else를 쓰면 참이 나오는 순간 멈춰버린다 >> 더 효율적임
	}

}
