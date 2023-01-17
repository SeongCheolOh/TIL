package ch05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		// 문자열 길이 메소드 .length()
		String ssn = "9609401234567";
		int length = ssn.length();
		if(length==13) {
			System.out.println("자릿수 정확");
		}else {
			System.out.println("자릿수 부정확");
		}

	}

}
