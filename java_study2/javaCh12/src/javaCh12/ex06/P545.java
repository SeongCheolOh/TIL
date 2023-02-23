package javaCh12.ex06;

import java.util.regex.Pattern;

public class P545 {

	public static void main(String[] args) {
		// 정규표현식 - 형식 언어
		String regExp1 = "\\d{6}\\-[1-4]\\d{6}"; //주민등록번호 정규표현식
		
		if(Pattern.matches(regExp1, "851213-1028519")) {
			System.out.println("주민등록 번호가 맞습니다");
		}else {
			System.out.println("주민등록 번호 형식이 아닙니다");
		}
		
		String regExp2 = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; //이메일 정규표현식
		if(Pattern.matches(regExp2, "osc0904@naver.com")) {
			System.out.println("이메일 형식이 맞습니다");
		}else {
			System.out.println("이메일 형식이 아닙니다");
		}
	}

}
