package javaBasic1;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// 카페 자바 - 제어문 참조
		
		//while문
	/*	int n=5;
		while(n<=10) {
			//위의 조건이 참이면 이곳을 수행
			//거짓이면 아래 출력문에 반복되지 않고 그냥 탈출해버림
			System.out.println(n); // 5 6 7 8 9 10
			n++; // n=n+1; >> 6 7 8 9 10 11
		}//end while */
		
		int a=10;
		while(a >= 5) {//참 , 계속 반복재생
			System.out.print(a + " ");//5
			//조건이 끝나야하니 언젠가는 거짓이 되게 만들어야 한다
			a--;
		}
		
		//문제)정수 1~10까지 나오는 코드 짜기
		int b = 1;
		while (b<=10) {
			System.out.print(b + " ");
			b++;}
		
		//문제) 0 5 10 15 20 ... 100
		int c = 0;
		while (c<=100) {
			System.out.print(c + "\t");
			c =c+5;
		}
		//문제) -100 -50 0 50 100
		int d=-100;
		while (d<=100) {
			System.out.print(d + " ");
			d=d+50;
		}
		
		//문제) ABCD~...Z까지 A유니코드 '65'
		char e = 65; // 또는 'A'
		while (e<='Z') {
			System.out.println(e + " ");  // ?? 
			e++; // e=e+1은 왜 불가능?>>문자에서 정수타입으로 바뀌고, 정수는 다시 char e에는 대입이 안 된다
		}
		
		//문제) 학생 이름을 3번 반복해서 입력 받고 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 이름은 ==>");
		String name = sc.next();
		System.out.println(name);
		 
		System.out.println("학생 이름은 ==>");
		name = sc.next();
		System.out.println(name);
		 
		System.out.println("학생 이름은 ==>");
		name = sc.next();
		System.out.println(name);
		 
		//이것을 반복문으로 고치려면 1회 처리한 것을 세어주는 변수(cnt)가 필요함
		//1) 조건문을 무엇으로 할까?? >> cnt 변수를 3으로
		//2) 처리할 내용은?
		
		int cnt=1;//갯수 세는 변수
		int banCnt=14;//반 인원수
		String name1 = null;
		while(cnt<=3) {	
			System.out.println("학생 이름은 ==>");
			name1 = sc.next();
			System.out.println(name1);
		}

}//end main()
	}//end class
