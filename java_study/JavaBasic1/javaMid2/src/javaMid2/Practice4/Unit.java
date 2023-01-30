package javaMid2.Practice4;

import java.util.Scanner;

public class Unit {
	
	String job = null;
	int x,y;
	
	public void move (int x, int y) {
		Scanner sc = new Scanner(System.in);
		System.out.println(job + "의 현재 위치는 ("+x+","+y+") 입니다");
		System.out.println("움직일 좌표 위치를 입력하세요 > ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("("+x+","+y+") 위치로 이동합니다");
		
	}

}
