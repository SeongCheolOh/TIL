package ch05.sec05;

public class StringLengthEx {

	public static void main(String[] args) {
		// 문자열 길이
		String a= "9451626897465";
		int length = a.length();
		if(length==13) {
			System.out.println("주민등록번호o");
		}else {
			System.out.println("주민등록번호x");
		}

	}

}
