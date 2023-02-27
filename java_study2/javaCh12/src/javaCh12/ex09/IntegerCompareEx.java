package javaCh12.ex09;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class IntegerCompareEx {

	public static void main(String[] args) {
		// 확인문제 12번
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);//true
		System.out.println(obj3.equals(obj4));//false
		//왜 false?? >> -128 ~ 127까지는 값으로 비교
		// 이 범위 이외에는 번지로 비교
		//값만 비교할 수 있도록 코드 수정하기
		
		// 확인문제 13번
		System.out.println(Math.ceil(5.3));
		System.out.println(Math.floor(5.3));
		System.out.println(Math.max(5.3, 2.5));
		System.out.println(Math.round(5.7)); //6.0이 아닌 6
		
		// 확인문제 15번
		// SimpleDateFormat 사용해 올해 말일까지 몇일 남았는지 계산 
		//1. 오늘 날짜 구하기 / 2. 2023 12 31 날짜형식 / 3. until( , );
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime lastDay = LocalDateTime.of(2023, 12, 31, 23, 59);
		System.out.println(today);
		System.out.println(lastDay);
		long remainDay = today.until(lastDay, ChronoUnit.DAYS);
		System.out.println(remainDay);
		
		// 확인문제 16번
		// 현재를 xxxx년 xx월 xx일 x요일 xx시 xx분 형태로 출력
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
//		String a = sdf.format(date);
		System.out.println(sdf.format(date));

	}

}
