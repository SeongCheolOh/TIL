package ch05.sec05;

public class StringExtractEx {

	public static void main(String[] args) {
		// 문자열 추출
		String ssn = "000101-204561";
		char sex = ssn.charAt(7);
		System.out.println(sex);
		switch(sex) {
		case '1':
		case '3': System.out.println("male");break;
		case '2':
		case '4': System.out.println("female");break;
		}
		

	}

}
