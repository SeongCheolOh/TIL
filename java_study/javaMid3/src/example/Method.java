package example;

import java.util.Scanner;

public class Method extends Product{
	Scanner sc = new Scanner(System.in);
	String a;
	
	public void inputMethod() {
		System.out.println("지사는?");
		System.out.println("1.서울지사, 2.경인지사, 3.강원지사 4.제주지사");
		System.out.print("지역을 번호로 선택하여주십시오 >");
		a = sc.next();
		System.out.print("제품명을 입력해주십시오 >");
		name = sc.next();
		System.out.print("판매량을 입력해주십시오 >");
		sellCnt = sc.nextInt();
		System.out.println(sellCnt);
		System.out.println("계속 입력하시겠습니까? > (y/n)");
		if(sc.next().equals("y")) {
		}
	}
	
	public void outputMethod() {
		System.out.println("----------------------");
		System.out.println("각 지사별 판매 현황");
		System.out.println("----------------------");
		System.out.println("지사명 제품명 제품가 판매현황 매출현황");
		
	}

}
