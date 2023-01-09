package ch02.sec01;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// 각종 코드를 테스트해보는 페이지
		/* Scanner sc = new Scanner(System.in);
		
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
		String name = null;
		while(cnt<=3) {	
			System.out.println("학생 이름은 ==>");
			name = sc.next();
			System.out.println(name);
			cnt++;*/
		
		Scanner Scr = new Scanner(System.in);
		System.out.print("숫자 1을 입력==>");
		int number1=Scr.nextInt();//   3 2 2
		System.out.print("숫자 2을 입력==>");
		int number2=Scr.nextInt();//   2 3 1
		System.out.print("숫자 3을 입력==>");
		int number3=Scr.nextInt();//   1 1 3
		
		int middleNumber = (number1>=number2)? number1:number2;
		middleNumber = (number3>=middleNumber)? number1:number3;
		middleNumber = (number2>=middleNumber)? number2:number3;
		System.out.println(middleNumber);
		}
	

	}

