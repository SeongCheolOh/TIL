package javaBasic1;

import java.util.Scanner;

public class ContinueEx2 {

	public static void main(String[] args) {
		// 1~100까지 for문으로
		for(int i=1 ; i<=100 ; i++) {
			System.out.print(i + " ");
		}
	
	//문제) 1~100을 10번 찍고싶다
	for(int i=1 ; i<=10 ; i++) {
		for(int j=1 ; j<=100 ; j++) {
			System.out.print(j + " ");//" "= 띄우기
		}
		System.out.println();
		}
	
	//문제) 홍길동을 20번 출력
	for(int i=1 ; i <=20 ; i++) {
		System.out.print("홍길동" + " ");
	}
	System.out.println("\n--------------------");
	
	//문제) 홍길동 20번 출력한 줄을 5번 반복하세요
	for(int i=1 ; i<=5 ; i++) {
		for(int j = 1 ; j <=20 ; j++) {
			System.out.print("홍길동"+ " ");
		}
		System.out.println();
	}
	System.out.println("\n------------------");
	
	//문제) 1~50 출력하고, 총 합을 구하기 // 합이 500이상이 되는 순간 i 값은 얼마인가?
	int sum = 0;
	int i = 1;
	for( ; i <=50 ; i++) {
		System.out.print(i+ " ");
		sum = sum + i;
		if(sum>=500) break;
	}
	System.out.println("\n sum=" + sum + " i="+ i);
	System.out.println("------------------");
	
	//문제) 1~100까지 반복하여 출력하고, 55번째 합일때 break 반복 탈출하기
	for(i = 1 ; i<=100 ; i++) {
		System.out.print(i + " ");
		sum = sum+i;
		if(i>=55) break;
	}
	System.out.println("\n" + sum);
	
	//Q) 10, 20, 30, ... 1000까지 반복하면서 갯수가 20번째일때 탈출, 출력
	int cnt= 0;
	for(i=10 ; i<=1000; i=i+10/* i=필수 */) {
		cnt=cnt+1;
		if(cnt>=20) break;
		System.out.print(i + " "); 
	} 
	System.out.println("----------------");
	
	//Q) while문 이용하여
	//정수로 입력을 계속 받다가 0이 입력되면 반복문 끝나기
 	Scanner sc = new Scanner(System.in); 
	System.out.println("숫자를 입력하세요==> ");
	while(true) {
		int number = sc.nextInt();
		if(number==0) break;
	}System.out.println("종료");
	System.out.println("----------------------");
	
	//Q) do-while문 이용하여
	//문자로 단어를 계속 입력받다가 no 또는 NO가 입력되면 반복문 끝나기
	System.out.println("숫자를 입력하세요==> ");
	do{
		String word = sc.next();
		if(word/*.toLowerCase()*/.equals("no") ||word/*.toUpperCase()*/.equals("NO")) break;
	}
	while(true); //true면 계속 반복한다는 의미
	System.out.println("종료");
	System.out.println("--------------------------");
	
	}//end main
}//end class
