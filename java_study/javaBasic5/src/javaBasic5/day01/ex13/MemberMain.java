package javaBasic5.day01.ex13;

import javaBasic5.day01.ex16.Printer;

public class MemberMain {

	public static void main(String[] args) {
		Member user1 = new Member("홍길동","hong");

		MemberService memberService = new MemberService();
		memberService.login("hong", "12345");
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다");
			memberService.logout("hong");
		}else {
				System.out.println("id 또는 password가 올바르지 않습니다");
			}

		
	}//

}//
