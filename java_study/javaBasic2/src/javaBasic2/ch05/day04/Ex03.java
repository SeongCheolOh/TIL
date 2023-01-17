package javaBasic2.ch05.day04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//2.  배열을 먼저 만들어두고 나중에 값을 넣기
		
		int[] a = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int b : a) {
			System.out.println(b + " ");
		}System.out.println();
		
		//키보드로 정수 5개 입력받고, 합 구하고 출력
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int[]b = new int[5] ;
		for(int i=0; i<b.length; i++) {
			System.out.println((i+1)+"번째 숫자 입력>>");
			b[i] = sc.nextInt();
			sum = sum+b[i];
		}
		System.out.println("총 합 = "+ sum);
	
		//입력받은 숫자 중 가장 큰 숫자
		int max = 0;
		for(int i=0; i<b.length; i++);{
		}if(b[0]> max) {
			max = b[0];
		}if(b[1]> max) {
			max = b[1];
		}if(b[2]> max) {
			max = b[2];
		}if(b[3]> max) {
			max = b[3];
		}if(b[4]> max) {
			max = b[4];
		}
		System.out.println("가장 큰 숫자는 >> " + max);
		
		//입력받은 숫자 중 가장 작은 숫자
		int min = 999;
		for(int i=0; i<b.length; i++);{
		}if(b[0]< min) {
			min = b[0];
		}if(b[1]< min) {
			min = b[1];
		}if(b[2]< min) {
			min = b[2];
		}if(b[3]< min) {
			min = b[3];
		}if(b[4]< min) {
			min = b[4];
		}
		System.out.println("가장 작은 숫자는 >> " + min);
	}//end main

}//end class
