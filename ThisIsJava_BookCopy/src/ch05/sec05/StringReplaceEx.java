package ch05.sec05;

public class StringReplaceEx {

	public static void main(String[] args) {
		// 문자열 대체
		String oldStr = "불변의 자바 문자열";
		String newStr = oldStr.replace("불변", "변화무쌍");
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
