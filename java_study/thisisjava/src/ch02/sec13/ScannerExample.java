package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		//키보드 입력 데이터를 변수에 저장
	/*	      <<생성된 Scanner를 변수에 대입<<
	  ★	Scanner scanner = new Scanner(System.in);
	    Scanner 변수 선언     Scanner 객체 생성
	    ----------------------------------
	       <<읽은 문자열을 String 변수에 저장<<		
	  ★ String inputData = scanner.nextLine();
	    String 변수 선언       Enter키로 문자열 입력    */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x값 입력: "); // 출력
		String strX = scanner.nextLine(); // 임의로 x에 대입할 수를 입력 = strX에 대입
		int x = Integer.parseInt(strX); // 문자열을 기본타입으로 변환
		
		System.out.println("y값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y; // 기본타입으로 변환된 x,y라 이제 연산 가능
		System.out.println("x+y: " + result);
		System.out.println();
		
		while(true) { // 중괄호 안을 무한히 반복 실행
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) { // 입력된 문자가 q라면 반복 중지, (data=q);는 문자열이라서 불가능
				break;
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
	}

}
