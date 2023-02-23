package javaCh12.ex05;

import java.util.Calendar;	
import java.util.TimeZone;

public class CalendarClass {

	public static void main(String[] args) {
		// p.533 Calendar Ŭ����
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year+"��");
		int month = now.get(Calendar.MONTH)+1;
		System.out.println(month+"��");//month�� 0���� ���۵Ǳ⶧���� +1�� ���ش�
		int day = now.get(Calendar.DATE);
		System.out.println(day+"��");
		int day1 = now.get(Calendar.DAY_OF_MONTH);//1�� �� ���° ��
		System.out.println(day1+"��");
		int day2 = now.get(Calendar.DAY_OF_WEEK);//1�� �� ���° �� [�� ���� ������ �Ͽ����Դϴ�]
		System.out.println(day2+"��° ����");
		
		String strWeek = null;
		switch(day2) {
		case 1 : strWeek = "�Ͽ���"; break;
		case 2 : strWeek = "������"; break;
		case 3 : strWeek = "ȭ����"; break;
		case 4 : strWeek = "������"; break;
		case 5 : strWeek = "�����"; break;
		case 6 : strWeek = "�ݿ���"; break;
		case 7 : strWeek = "�����"; break;
		}
		System.out.println(strWeek);
		
		//p.536
		//google - [�ڹ� Ÿ���� ���]�˻�
		TimeZone LA = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar LAnow = Calendar.getInstance(LA);
		int amPm = LAnow.get(Calendar.AM_PM);
		if(amPm == Calendar.AM) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
	
		//p.537 Ÿ���� ��� ��ü ���
		String[] avaiId = TimeZone.getAvailableIDs();
		for(String s: avaiId) {
			System.out.println(s);
		}
		
		
	}

}
