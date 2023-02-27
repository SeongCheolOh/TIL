package ideaTest;

import java.time.LocalDateTime;
import java.util.Date;

public class DateEx {
	
	public static void main(String[]args) {
		//현재 자기가 속한 달에 날짜만큼 배열을 생성하고
		//출석할 때 마다 그 날의 인덱스값을 1로 수정하려고 한다
		LocalDateTime now = LocalDateTime.now();
		Date date = new Date();
		int monthSize = now.getDayOfMonth();
		System.out.println(monthSize);//해당하는 달의 일 갯수
		System.out.println(date.getDate());
		
		int[] attPer = new int[monthSize];//오늘 날짜만큼 배열 생성 >> 기본값은 0
		//if(xxx가 출석했으면){
		//	a번째 인덱스의 값을 1로 수정
		
		System.out.println(attPer.length);
		
	//	for(int i = 0; i<a; i++) {}
	}//end main

}//end class

class ListEx{
	
	
	
}
