package javaBasic1;

import java.util.Scanner;

public class ContinueEx3 {

	public static void main(String[] args) {
		// continue
		
		//1부터 50까지 출력
		System.out.println("\n -----------");
		for(int i=1 ; i<=50 ; i++) {
			System.out.print(i + " ");
		}
		
		//근데 10 20 30 40 50을 빼고 출력하고싶다
		System.out.println("\n -----------");
		for(int i=1 ; i<=50 ; i++) {
			if(i% 10 != 0)
				System.out.print(i + " ");
		}
		//또는
		System.out.println("\n -----------");
		for(int i=1 ; i<=50 ; i++) {
			if(i% 10 == 0) continue;//i=10배수가 아니면 거짓>>아래로 내려가서 출력 후 반복
									//continue = 다음 문장을 수행하지 말고 끝으로 가서 재시작
				System.out.print(i + " ");
		}
		System.out.println("\n -------------------");
		
		//Q) 100부터 1까지 출력
		for(int i= 100 ; i>=1 ; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\n -------------------");
		
		//합계가 500이상인 순간 항목을 출력, 1000이상인 순간의 항목을 출력, 1500 2000 ... 5000인 순간이 몇번째인지
		int sum = 0;
		int baesu = 500; // 넘는 기준점
		int cnt = 0;
		boolean p = false; // 500이 넘는 순간 1번만 출력
		for(int i= 100  ; i>=1 ; i--) {
			sum = sum+i;
			cnt = cnt+1;
			if(baesu % 500 == 0) {// baesu/500의 나머지가 0이 참이면 p= false
				p = false;
			}
			if(sum>= baesu && !p) {
				System.out.println("합계 = " + sum + ", " + cnt + "번째");
				p=true;
				baesu = baesu+500;
			}
			

			}
		
		System.out.println("\n-------------------");
		//교재 연습문제

		//예제) 주사위의 숫자 1~6 중 하나를 랜덤으로 뽑길 원한다 >> 난수를 사용
		System.out.println(Math.random()/*=실수타입*/);
		//난수를 구하는 함수 // 범위는 0.0 <= Math.random() < 1.0
		System.out.println(Math.random()*6);
		//구해야 할 숫자의 개수 6을 곱함 // 범위는 0.0 <= Math.random()*6 < 6.0
		System.out.println((int)(Math.random()*6));
		//정수화 한다 // 범위는 0 <=(int)(math.random()) < 6  // 0,1,2,3,4,5 
		System.out.println(((int)Math.random()*6)+1);
		//각 변에 1을 더하면 //범위는 1<= ㅁㄴㅇㄹ< 7 // 1,2,3,4,5,6
		//end
		
		//문제) 반배정 1~14까지 랜덤하게 나오게 하게
		System.out.println("반 번호 ==> "+((int)(Math.random()*14)+1));
		//문제) 로또번호 1~49 랜덤하게 나오게 하기
		System.out.println("로또 번호 ==> "+((int)(Math.random()*49)+1));
		
		
		
		
		
		
		
		
		
	}// end main

}//end class
