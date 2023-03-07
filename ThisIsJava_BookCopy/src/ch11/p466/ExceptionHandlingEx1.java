package ch11.p466;

public class ExceptionHandlingEx1 {

	public static void main(String[] args) {
		//예외가 생기는 예시
		System.out.println("프로그램 시작");
		printLength("ThisIsJava");
//		printLength(null); 문자열 대신 null을 주면 NullPointerException 발생
		System.out.println("프로그램 종료");
	}
	
	public static void printLength(String data) {
		System.out.println("문자 수 : " + data.length());
	}

}
