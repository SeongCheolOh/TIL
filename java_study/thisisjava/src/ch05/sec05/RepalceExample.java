package ch05.sec05;

public class RepalceExample {

	public static void main(String[] args) {
		// 문자열 대체 메소드 .replace()
		
		 String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다";
		 String newStr = oldStr.replace("자바","Java");

		 System.out.println(oldStr);
		 System.out.println(newStr);
	}

}
