package javaBasic2.ch05.day02;

public class ClassEx153p {

	public static void main(String[] args) {
		// p.153~165
		String name = "홍길동이순신정현희";
		String name1 = "홍길동";

		String name2 = new String("홍길동");
		String name3 = new String("홍길동");
		
		//문자 추출
		char c0 = name.charAt(3);
		System.out.println(c0);

		//문자열 길이
		int len = name.length();
		System.out.println("길이는 "+ len);
		
		//문자열 대체
		String ChangeWord = name.replace("정현희","오성철");
		System.out.println(ChangeWord);
		
		//문자열 잘라내기
		String a = "880812-123456";
		//8 8 0 8 1 2 - 1  2  3  4  5  6
		//0 1 2 3 4 5 6 7  8  9 10 11 12 인덱싱
		String firstNum = a.substring(0, 7);//index 시작숫자부터 끝숫자까지
		String secondNum = a.substring(7);//index 시작숫자부터 끝까지 
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		//문자열 찾기
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else{
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요");
		}else {
				System.out.println("자바와 관련 없는 책이군요");
			}
		
		
		
	}

}
