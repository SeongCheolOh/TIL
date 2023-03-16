package ch05.sec12;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		// 열거 타입 변수 선언
		Week today = null;
		
		//Calendar 얻기
		Calendar cal = Calendar.getInstance();
		//컴퓨터의 날짜 및 시간 정보를 가진 Calendar 객체를 얻고
		//번지수를 cal에 대입
		
		//오늘의 요일을 int타입으로 얻기
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(day) {
		case 1 : today = Week.SUNDAY; break;
		case 2 : today = Week.MONDAY; break;
		case 3 : today = Week.TUESDAY; break;
		case 4 : today = Week.WEDNESDAY; break;
		case 5 : today = Week.THURSDAY; break;
		case 6 : today = Week.FRIDAY; break;
		case 7 : today = Week.SATURDAY; break;
		}
		
		//출력
		System.out.println(today);
		if(today == Week.SUNDAY) {
			System.out.println("오늘은 일요일 입니다");
		}else {
			System.out.println("오늘은 일요일이 아닙니다");
		}

	}

}
