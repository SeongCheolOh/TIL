package ch11.p466;

public class ExceptionHandlingEx2 {

	public static void main(String[] args) {
		//예외처리 코드 추가
		System.out.println("프로그램 시작");
		printLength("ThisIsJava");
		printLength(null); 
		System.out.println("프로그램 종료");
	}
	
	public static void printLength(String data) {
		try{
			System.out.println("문자 수 : " + data.length());
		}catch(NullPointerException e) {//예외 정보를 얻는 3가지 방법
			System.out.println(e.getMessage());//방법1 이유만 리턴
			System.out.println(e.toString());//방법2 이유 + 예외의 종류
//			e.printStackTrace();//방법3 이유 + 예외의 종류 + 발생 위치 추적
		}finally {
			System.out.println("마무리 실행");
		}
	}

}
