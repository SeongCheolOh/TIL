package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		// 문자 추출
		// 문자열에서 특정 위치의 문자를 얻고싶다면 charAt()메소드를 사용
		// ()에 주어진 자리 인덱스 문자를 리턴한다
		String ssn = "9609041234567";
		char sex = ssn.charAt(6);
		switch(sex) {
		case '1':
		case '3':
		System.out.println("남자입니다");
		break;
		case '2':
		case '4':
		System.out.println("여자입니다");
		break;
		}
	}

}
