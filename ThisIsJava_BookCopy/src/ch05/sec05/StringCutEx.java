package ch05.sec05;

public class StringCutEx {

	public static void main(String[] args) {
		// 문자열 잘라내기
		// 특정 구역을 잘라내기 >> 변수명.substring(인덱스1, 인덱스2);
		// 특정 구역 이후로 표기>> 변수명.substring(인덱스);
		String ssn = "960123-1234567";
		String a = ssn.substring(0);
		String b = ssn.substring(1);
		System.out.println(a);
		System.out.println(b);
		String c = ssn.substring(0,6); // 0번 인덱스 ~ 6번 인덱스 앞까지 표시
		String d = ssn.substring(7,14);
		String e = ssn.substring(7);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

}
