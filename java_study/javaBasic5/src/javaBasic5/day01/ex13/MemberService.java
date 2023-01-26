package javaBasic5.day01.ex13;

public class MemberService {

	boolean login(String id, String password) {
		//id가 hong이고 password가 12345면 true 리턴
		if(id.equals("hong") && password.equals("12345")) return true;
		else return false;
	}
	
	void logout(String id){
		//hong님 로그아웃 되었습니다.
	}
}
