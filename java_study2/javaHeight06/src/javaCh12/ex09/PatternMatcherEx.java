package javaCh12.ex09;

import java.util.regex.Pattern;

public class PatternMatcherEx {

	public static void main(String[] args) {
		// 확인문제 17번
		//정규표현식 이용
		//첫번째는 알파벳, 두번째부터 숫자와 알파벳으로 구성된 8~12자 사이의 id값인지 검사하고픔
		//알파벳은 대소문자 모두 허용
		
		String id = "Anger1004";
		String redExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		boolean isMatch = Pattern.matches(redExp, id);
		if(isMatch) {
			System.out.println("id로 사용할 수 있습니다");
		}else {
			System.out.println("id로 사용할 수 없습니다");
		}

	}

}
