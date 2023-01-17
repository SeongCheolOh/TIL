package ch05.sec05;

public class indexOfExample {

	public static void main(String[] args) {
		// 문자열 찾기 메소드
		
		//.indexOf(); 
		// >> ("문자열")입력 후 찾으면 인덱스 첫번째, 못찾으면 -1을 리턴
		// 정수를 출력하기때문에 타입 int 변수2 = 변수1.indexOf();
		
		//.contains();
		// >> ("문자열")입력 후 찾으면 true, 못 찾으면 false
		//그래서 타입 boolean 변수2 = 변수1.contains();
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련 없는 책이군요");
		}
	}

}
