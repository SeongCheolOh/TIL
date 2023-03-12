package javaCh12.ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class LocalDateTimeClass {

	public static void main(String[] args) {
		//p.537
		//대출일 - 오늘날짜 반납일 2주 후
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("대출일 = " + now.format(dtf));
		
		LocalDateTime returnDate = now.plusWeeks(2);//2주 뒤
		System.out.println("반납일 = " + returnDate.format(dtf));

		//급여일 오늘부터 20일 후에
		LocalDateTime getMoney = now.plusDays(20);
		System.out.println("월급 지급일 = " + getMoney.format(dtf));
		
		//알람 - 5시간10분 후 알람 울리기
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH시 mm분");
		LocalDateTime alarmH = now.plusHours(5);
		LocalDateTime alarmM = alarmH.plusMinutes(10);
		System.out.println(alarmM.format(dtf1)+"에 알람이 울립니다");
		
		//미래 나의 자산 상태
		LocalDateTime myBank = now.plusYears(12);
		System.out.println("100억 부자가 되는 해는 " + myBank.format(dtf));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime sdt = LocalDateTime.of(2023,2,23,9,37,20);
		System.out.println("시작일 = " + sdt.format(dtf2));
		
		LocalDateTime edt = LocalDateTime.of(2023,12,31,23,59,59);
		System.out.println("종료일 = " + edt.format(dtf2));
		System.out.println("---------------");
		// 세일기간 : 23.03.01 00:00:00 ~ 23.04.30 23:59:59
		// 날짜1 : 23.03.15 "세일기간" 이라고 출력하기
		// 날짜2 : 23.02.20 "세일기간 전"
		// 날짜3 : 23.05.03 "세일이 끝났습니다"
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MM월 dd일");
		LocalDateTime startSail = LocalDateTime.of(2023, 03, 01, 00, 00, 00);
		LocalDateTime endSail = LocalDateTime.of(2023, 04, 30, 23, 59, 59);
		System.out.println("세일기간 : " + startSail.format(dtf3)+ " ~ "+ endSail.format(dtf3));
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 > ");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요 > ");
		int month = sc.nextInt();
		System.out.print("일을 입력하세요 > ");
		int day = sc.nextInt();
		LocalDateTime a = LocalDateTime.of(year, month, day, 00, 00);
//		LocalDateTime b = LocalDateTime.of(23, 02, 20, 00, 00);
//		LocalDateTime c = LocalDateTime.of(23, 05, 03, 00, 00);
		if(a.isAfter(startSail) && a.isBefore(endSail)) {
			System.out.println(a.format(dtf4)+"은 세일기간 입니다");
		}else if(a.isBefore(startSail)) {
			System.out.println(a.format(dtf4)+"은 세일기간 전 입니다");
		}else if(a.isAfter(endSail)) {
			System.out.println(a.format(dtf4)+"은 세일이 끝난 후 입니다");
		}
/*		if(b.isAfter(startSail) && b.isBefore(endSail)) {
			System.out.println(b.format(dtf4)+"은 세일기간 입니다");
		}else if(b.isBefore(startSail)) {
			System.out.println(b.format(dtf4)+"은 세일기간 전 입니다");
		}else if(b.isAfter(endSail)) {
			System.out.println(b.format(dtf4)+"은 세일이 끝난 후 입니다");
		}
		if(c.isAfter(startSail) && c.isBefore(endSail)) {
			System.out.println(c.format(dtf4)+"은 세일기간 입니다");
		}else if(c.isBefore(startSail)) {
			System.out.println(c.format(dtf4)+"은 세일기간 전 입니다");
		}else if(c.isAfter(endSail)) {
			System.out.println(c.format(dtf4)+"은 세일이 끝난 후 입니다");
		} */
	}

}
