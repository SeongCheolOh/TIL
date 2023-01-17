package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		// 문자열 잘라내기 메소드 .substring()
		String ssn = "960904-1234567";
		
		String firstNum = ssn.substring(0, 6);//인덱스 0부터 6 앞까지
		System.out.println("주민번호 앞자리는 : " +firstNum);
		
		String secondNum = ssn.substring(7); // 인덱스 7부터 끝까지
		System.out.println("주민번호 뒷자리는 : " + secondNum);

	}

}
