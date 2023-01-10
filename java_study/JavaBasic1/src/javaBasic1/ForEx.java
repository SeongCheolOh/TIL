package javaBasic1;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		/*형식
		 * for( 변수 초기값 ; 조건식 ; 증감값 ){
		 * 		반복할 내용
		 * 		}
		 */	
		for(int i=1; i<=10; i++) {//i=1 >> "10이하" 가 참이면 >> 1++을 하고 다시 조건이랑 비교한다
			System.out.print(i + " ");//"10 이하"가 거짓이면 탈출
		}//for를 벗어나는 지점, 변수가 사라짐
		
		for(int i=10; i>=0; i--) {//i=10 >> "0 이상"이 참이면 >> i--
			System.out.print(i + " ");
		}
		
		//문제1) 10 20 30 ... 90 100 출력하기
		System.out.println(); // 줄바꾸기
		for(int i= 10; i<=100 ; i=i+10) {
			System.out.print(i + " ");
		}
		
		//문제2) 1~100까지 합 구하기
		System.out.println();
		int sum = 0;// {}안에선 계속 반복되기때문에 바깥으로 꺼냄
		for(int i= 1; i<=100 ; i++) {
			sum = sum+i;
		}
		System.out.println("1~100까지의 합은: " + sum);
		
		//문제3) 0~100까지 홀수의 합 구하기, 홀수의 갯수 구하기
		int oddSum=0;//홀수의 합
		int oddCnt=0;//홀수의 갯수
		for(int odd = 1; odd <100 ; odd=odd+2) {
			oddSum = oddSum+ odd;
			oddCnt = oddCnt + 1;
		}System.out.println("1~100까지 홀수의 합은 : "+ oddSum);
		System.out.println("1~100까지 홀수의 갯수는 : " + oddCnt);
		
		
		//문제4) 1~100까지 출력하되 1줄에 10개씩 출력하기

		int cnt = 0;
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
			cnt++;
//			방법1) 10일때 줄바꿈과 cnt가 0으로 변환하는 두 작업을 수행해야 한다
//			if(cnt==10) {
//				System.out.println();
//				cnt=0;}
		
//		방법2) 10의 배수일때 줄바꿈 해라
//		System.out.println();
//		int k=14;
//		System.out.println(k%10 == 0); >> 나머지 값을 이용
		if(i%10 == 0) {
			System.out.println();
		}
		}
		/*for(int a=1; a<=10; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		for(int a=11; a<=20; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();

		for(int a=21; a<=30; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();

		for(int a=31; a<=40; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();

		for(int a=41; a<=50; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();

		for(int a=51; a<=60; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();

		for(int a=61; a<=70; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();

		for(int a=71; a<=80; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();

		for(int a=81; a<=90; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();

		for(int a=91; a<=100; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();   내가 짠 코드 >> 너무 비효율적 */
		
		//문5) while을 써서 아래와 같이 출력해보세요. (12345)를 입력한 것
		/*결과화면
		숫자를 입력하세요(예:12345) >> 12345
		sum= 5 number = 12345  // 12345를 쓰면 5가 나오게 하란 뜻
		sum= 9 number = 1234
		sum= 12 number = 123
		sum= 14 number = 12
		sum= 15 number = 1
		각 자리수의 합 : 15 */
		System.out.println("결과화면");
		Scanner sc = new Scanner(System.in); // >> 입력 준비 (단축키 없다)
		System.out.print("숫자를 입력하세요(예:12345) >> 12345");
		int number = sc.nextInt(); // Scanner이랑 세트 (역시 단축키 없다)
		int number1 = 0; // 맨 뒷자리 숫자를 얻기위해 1234를 만든다
		int number2 = 0;
		int number3= 0;
		while(number>=1) {
			number1 = number/10;//1234
			number2 = number1*10;//12340
			number3 = number3 +number-number2;//5
			System.out.println("sum = " + number3 + " number = " + number);
			number = number1; // 1234
		}
		
		//변수 sum에 5를 넣어주기  //  12345 - 12340 = 5 
		//어떻게하면 12340을? // 1234*10
		//어떻게하면 1234를 ? //12345/10 // 정수의 연산이라 정수만 나온다
		
/*		System.out.println(number); // 12345
		int number1=number/10; // 1234
		// int temp = number*10;
		// syso(temp); >> 12340
		// int s = number - temp; >> 12345 - 12340
		// syso(s); >> 5
		// syso("sum = " +s + "number = " + number);
		//
		int number2=number1*10;//12340
		int number3=12345-number2;//5
		
		//1234를 입력해서 9를 구하기 >> num3 + 4
		//4를 구하기 = 1234-1230
		int number4 = number1/10; // 123
		int number5 = number4*10; // 1230
		int number6 = number1-number5; // 4
		System.out.println(number6);
	*/
		
		
		
		//문) do-while을 사용하여 숫자를 계속 입력받는다
		//0을 입력하면 지금까지 입력한 숫자를 모두 더한 것을 출력한다.
		//합계를 구할 숫자를 입력한다.
		/* 100//(입력수)
		 * 200//(입력수)
		 * 300//(입력수)
		 * 400//(입력수)
		 * 0//(입력수)
		 * 합계:1000//(출력)
		 */
		
		int n6;//4
		int sum6=0;//5
		do {System.out.println("문제 6번 숫자를 입력하세요");//1
			n6=sc.nextInt();//숫자를 입력받으면//2
			sum6=sum6+n6;//6
		}while(n6!=0); //참이면 올라가서 다시, 거짓이면 탈출
		System.out.println("합계: " + sum6);//3
		
	}//end main

}//end class
