package ch04.sec05;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// for�� ������ Ƚ����ŭ �ݺ��Ѵٸ�
		// while�� (���ǽ�)���� false�� �Ǳ� �������� ���ѹݺ�
		int i = 1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}System.out.println();
		
		//1���� 100���� ��
		int sum = 0;
		i=1;
		while(i<=100) {
			sum += i;
			i++;
		}System.out.println(sum);
		
		//(���ǽ�)�� ���� true�� ����ϸ� ���ѹݺ�
		//1=���� /2=���� / 3=����
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		while(run) {
			System.out.println("--------------------\n|1. ����|2. ����|3. ����|\n--------------------\n���� > ");
			i = sc.nextInt();
			if(i==1) {
				speed++;
				System.out.println("����ӵ� = "+speed);
			}else if(i==2) {
				speed--;
				System.out.println("����ӵ� = "+speed);
			}else if(i==3) {
				System.out.println("�����մϴ�");
				run = false;
			}
		}

	}

}
