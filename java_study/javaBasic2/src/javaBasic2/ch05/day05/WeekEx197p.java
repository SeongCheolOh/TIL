package javaBasic2.ch05.day05;

import java.util.Calendar;

public class WeekEx197p {

	public static void main(String[] args) {
		// p.197 열거형 사용법 학습
		Week today = null;
		Calendar cal = Calendar.getInstance(); // 달력에 관련된 클래스를 사용할 수 있다.
		int week = cal.get(Calendar.DAY_OF_WEEK); // 오늘 날짜의 요일을 숫자로 리턴(반환).
		System.out.println(week);// 일요일부터 당일까지 세는 코드(일-1, 월-2, 화-3, ... , 일-7)
		
		today = Week.SUNDAY;
		System.out.println(today);
		
		today = Week.WEDNESDAY;
		System.out.println(today);
		
		if(week==4) {
			today = Week.WEDNESDAY;
			System.out.println(today);

		}
		
		//토요일 - 저녁식사
		if(week==7) {
			today = Week.SATURDAY;
			System.out.println("저녁 같이 먹기");
		}
		
		today = Week.SATURDAY;
		if(today== Week.SATURDAY) {
			System.out.println(today);
		}
		
		//
		
		LoginResult loginR = null;
		loginR = LoginResult.login_succes;
		loginR = LoginResult.login_failed;
	/*	loginR = LoginResult.logging; // logging은 열거하지 않았기 때문에 에러*/ 
		
		//확인문제 6,7,8,9
		//6) 실행결과를 작성해보세요
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		System.out.println(array.length);// 3
		System.out.println(array[2].length); // 5
		System.out.println();
		
		//7) 주어진 배열 항목에서 최대값을 출력하는 코드 작성
		int[]array1 = {1,5,3,8,2};
		int max = 0;
		for(int i = 0; i<array1.length; i++) {
			if(max < array1[i] ) {
				max = array1[i];
			}
		}
		System.out.println("최댓값은 " + max + "입니다");		
		
		//8) 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드 작성(for-for 이용)
		int[][]array2 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int avg = 0;
		int cnt = 0;
		int sum = 0;
		for(int i = 0; i<array2.length ; i++) { // 행 반복(i<행의 갯수)
			for(int j = 0; j<array2[i].length; j++) { // 열 반복(j<i행의 열 갯수)
				sum = sum+array2[i][j];
				cnt++; // 평균 구할 때 나누는 값 구하기
			}
		}
		System.out.println("총 합은 " + sum + "입니다");
		cnt = array2[0].length + array2[1].length + array2[2].length;
		avg = sum/cnt;
		System.out.println("평균은 " + avg + "입니다");

	}//end class

}//end main
