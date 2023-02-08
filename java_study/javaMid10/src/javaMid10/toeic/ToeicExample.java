package javaMid10.toeic;

import java.util.Scanner;

public class ToeicExample {

	public static void main(String[] args) {
		
		Toeic toeic = new Toeic();
		Scanner sc = new Scanner(System.in);
		
		boolean a= true;
		while(a) {
			System.out.print("당신의 토익 점수를 입력하세요 > ");
			toeic.setNum(sc.nextInt());
			try {
				toeic.result(toeic.getNum());
			} catch (InsufficientException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.print("계속하시겠습니까? > ");
			sc.next();
		}
		

	}

}
