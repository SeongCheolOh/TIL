package javaHeight02.practice;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a,b,c,d;
		System.out.println("4���� ���� �̸��� ������� �Է��ϼ��� > ");
		a = sc.next();
		b = sc.next();
		c = sc.next();
		d = sc.next();
		System.out.println(a+" "+b+" "+c+" "+d);
		System.out.println("�� ������ ������ ������� �Է��ϼ��� > ");
		
		int []score = new int[4];
		int sum = 0;
		double avg = 0;
		for(int i = 0; i<score.length ; i++) {
			score[i] = sc.nextInt();
			sum = sum + score[i];
		}
		avg = (double)sum/score.length;
		System.out.println("�� ���� " + sum);
		System.out.println("��������� " + avg);
		
		
	}

}
