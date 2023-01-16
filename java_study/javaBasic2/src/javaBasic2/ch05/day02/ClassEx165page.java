package javaBasic2.ch05.day02;

public class ClassEx165page {

	public static void main(String[] args) {
		// 주민번호에서 7번째 자리는 성별입니다
		//1,3이면 남자, 2,4이면 여자인지 판단하기
		//생년월일을 잘라서 년도 구하기, 월 구하기, 일 구하기
		
		String ssn = "880815-1234567";
		String year = ssn.substring(0,2);
		String month = ssn.substring(2, 4);
		String day = ssn.substring(4, 6);
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		String gender = ssn.substring(7,8);
		//"1" >> 1
		int gValue = Integer.parseInt(gender);
		if(gValue==1 || gValue==3) {
			System.out.println("남자 입니다");
		}
		if(gValue==2 || gValue==4) {
			System.out.println("여자 입니다");
		}
		
		if(gender.equals("1") || gender.equals("3"))System.out.println("남자");
		
		
		

	}

}
