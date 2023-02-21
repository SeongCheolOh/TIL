package javaCh12.ex01;

import java.io.IOException;

public class BaseEx01 {

	public static void main(String[] args) throws IOException {
		
		try {//예외처리
			System.out.println("출력할 내용");
			System.err.println("에러나면 빨간색으로 출력");
			int value = Integer.parseInt(/*"1oo" */"100");
			System.out.println(value);
			
			while(true) {
			
			int readData = System.in.read();
			System.out.println(readData);
			if(readData==78 || readData==110) {
				System.out.println("프로세스 종료");
				System.exit(0);
			}			
			System.out.println("출력할 내용");
			
			}
		}catch(NumberFormatException e) {
			System.err.println(e.getMessage());	
		}
	
	}

}
