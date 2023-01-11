package javaBasic1;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		//
		
		/* do {//반복할 내용
				
		}while(); 참이면 계속 반복, 거짓이면 탈출*/

		//문제1) 1 2 3 ... 10
		int a = 1;
		do {
			System.out.print(a+ " ");
			a++;
		}while (a<=10); //a가 10이하일때 까지 do{}를 반복해라
		
		//문제2) 100 95 90 ... 0
		int b = 100;
		do {
			System.out.print(b+" ");
			b= b-5;
		}while (0<=b);
		
		//문제3) 1+2+3+ ... +98+99 = 5050 >>출력
		int c = 0;
		int sum = 0;
		do {
			c++;
			sum = sum+c;
		}while (c<100);
		System.out.println(sum);
		
		//문제) 1~100까지 짝수의 합을 구하기
		int d = 0;
		int sum1 = 0;
		do {
			d=d+2;
			sum1 = sum1+d;
		}
		while (d<=100);
		System.out.println(sum1);
		
		//문제) 1 1 2 3 5 8 13 21 34
		int e = 1;
		int f = 1;
		int sum2 = e+f;
		System.out.print(e + " " + f + " " + sum2+" ");

		e = f; // 1
		f = sum2; // 2
		sum2 = e+f; // 3
		System.out.println(sum2 + " ");
		//이걸 34가 나올 때 까지 반복하는 방법도 있지만
		
		do {
			e = f;
			f = sum2;
			sum2 = e+f;
			System.out.println(sum2 + " ");
		}while(sum2<34);
		
		
		//문제) 이름을 계속 입력받아 출력하는데 이름이 y이면 종료하기
		Scanner sc = new Scanner(System.in);
		String name = null;
		do {
			System.out.println("이름을 입력하세요");
			name = sc.next();
			System.out.println(name);
		}while(!name.equals("y"));//"출력값이 y이면 참"의 반대

	
	
	
	}//end main

}//end class
