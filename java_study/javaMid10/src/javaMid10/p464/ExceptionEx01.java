package javaMid10.p464;//예외와 예외클래스

public class ExceptionEx01 {

	public static void main(String[] args) {
		try {
		System.out.println(10/0);//예외코드
		}catch( ArithmeticException e ){
			//예외 발생 시 처리할 코드 작성
			System.out.println(e.getMessage());
			System.out.println("예외 발생");
		}finally {
			//예외와 상관없이 무조건 실행
			System.out.println("DB 닫기/종료하기");
		}
		
	}

}
