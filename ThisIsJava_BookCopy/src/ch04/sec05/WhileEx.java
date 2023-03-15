package ch04.sec05;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// for이 정해진 횟수만큼 반복한다면
		// while은 (조건식)값이 false가 되기 전까지는 무한반복
		int i = 1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}System.out.println();
		
		//1부터 100까지 합
		int sum = 0;
		i=1;
		while(i<=100) {
			sum += i;
			i++;
		}System.out.println(sum);
		
		//(조건식)에 직접 true를 사용하면 무한반복
		//1=가속 /2=감속 / 3=정지
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		while(run) {
			System.out.println("--------------------\n|1. 증속|2. 감속|3. 중지|\n--------------------\n선택 > ");
			i = sc.nextInt();
			if(i==1) {
				speed++;
				System.out.println("현재속도 = "+speed);
			}else if(i==2) {
				speed--;
				System.out.println("현재속도 = "+speed);
			}else if(i==3) {
				System.out.println("종료합니다");
				run = false;
			}
		}

	}

}
