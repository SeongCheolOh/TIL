package ch05.sec05;

public class StringSearchEx {

	public static void main(String[] args) {
		// 문자열 찾기
		// 변수.indexOf("문자열"); >> 주어진 문자열이 시작되는 인덱스 번호 리턴
		// 변수.substring(숫자); >> 주어진 숫자 이후의 인덱스 잘라내어 리턴
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");// 주어진 문자열이 시작되는 인덱스 리턴
		System.out.println(location);
		String subStr = subject.substring(location);// 3 이후로의 인덱스를 리턴
		System.out.println(subStr);
		
		location = subject.indexOf("자바"); // 주어진 문자열이 시작되는 인덱스 리턴
		System.out.println(location);
		if(location==0) {
			System.out.println("자바와 관련됨");
		}else {
			System.out.println("자바와 관련 없음");
		}System.out.println("----------------");

		// 변수.contains("문자열"); >> 단순히 포함되어있는지를 조사 후 true/ false 리턴
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련됨");
		}else {
			System.out.println("자바와 관련 없음");
		}
	}

}
