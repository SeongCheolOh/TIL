package example;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Method l = new Method();
		
		System.out.println("---------------------------");
		System.out.println("판매량 관리 프로젝트");
		System.out.println("---------------------------");
		System.out.println("1.입력  2.출력  3.종료");
		System.out.print("번호를 입력하세요 >");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 : l.inputMethod();
		case 2 : l.outputMethod();
		case 3 : ;
		}
	}

}
