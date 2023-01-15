package ch04;

public class TestPage {

	public static void main(String[] args) {
		// 확인문제
		
		//for문을 이용ㄹ해서 1~100 정수 중 3 배수의 합을 구하시오
		int sum = 0;
		for (int i=1; i<=100; i++) {
			if (i%3==0) {
				sum=sum+i;
			System.out.println(sum);
			}}

		//while문과 Math.random()을 이용하여(눈1,눈2)형태로 출력하고
		//둘의 합이 5가 아니면 계속 던지고, 5가 나오면 멈추는것 작성
		while(true) {
		int a = (int)(Math.random()*6)+1;
		int b = (int)(Math.random()*6)+1;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		if (a+b==5) {
			System.out.println("눈" + a + ", 눈"+b);
			break;
		}
		}System.out.println("종료합니다");
		
		//for-for을 이용하여 4x+5y=60의 모든 해를 구하고, (x,y)형태로 출력
		//단 x와 y는 10 이하의 자연수
		for(int x=1; x<=10; x++)
			for(int y=1; y<=10; y++)
				if(4*x+5*y==60) {
					System.out.println("("+x+","+y+")");
				}
		
		//for문을 사용하여 다음과 같은 결과가 나오도록
		/* *
		 * **
		 * ***
		 * ****
		 * ***** */
		for(int c=1; c<=5; c++) {
			for(int d=1; d<=5; d++) {
				if(d<=c) {
					System.out.print("*");
					}
				}System.out.println();
				}
		
	}//end main

}//end class
