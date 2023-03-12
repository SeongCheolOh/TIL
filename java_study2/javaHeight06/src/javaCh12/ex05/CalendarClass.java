package javaCh12.ex05;

import java.util.Calendar;	
import java.util.TimeZone;

public class CalendarClass {

	public static void main(String[] args) {
		// p.533 Calendar 클래스
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year+"년");
		int month = now.get(Calendar.MONTH)+1;
		System.out.println(month+"월");//month는 0부터 시작되기때문에 +1을 해준다
		int day = now.get(Calendar.DATE);
		System.out.println(day+"일");
		int day1 = now.get(Calendar.DAY_OF_MONTH);//1달 중 몇번째 일
		System.out.println(day1+"일");
		int day2 = now.get(Calendar.DAY_OF_WEEK);//1주 중 몇번째 일 [한 주의 시작은 일요일입니다]
		System.out.println(day2+"번째 요일");
		
		String strWeek = null;
		switch(day2) {
		case 1 : strWeek = "일요일"; break;
		case 2 : strWeek = "월요일"; break;
		case 3 : strWeek = "화요일"; break;
		case 4 : strWeek = "수요일"; break;
		case 5 : strWeek = "목요일"; break;
		case 6 : strWeek = "금요일"; break;
		case 7 : strWeek = "토요일"; break;
		}
		System.out.println(strWeek);
		
		//p.536
		//google - [자바 타임존 목록]검색
		TimeZone LA = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar LAnow = Calendar.getInstance(LA);
		int amPm = LAnow.get(Calendar.AM_PM);
		if(amPm == Calendar.AM) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
	
		//p.537 타임존 목록 전체 출력
		String[] avaiId = TimeZone.getAvailableIDs();
		for(String s: avaiId) {
			System.out.println(s);
		}
		
		
	}

}
