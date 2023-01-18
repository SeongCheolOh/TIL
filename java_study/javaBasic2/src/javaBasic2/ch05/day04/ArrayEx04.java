package javaBasic2.ch05.day04;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 영화관 예매프로그램 만들기
		
		//1줄 입력 - 실제 구매액 계산 >> 2,3줄 반복 >> 출력 >> 반복문 사용
		//3칸짜리 배열 사용
		
		Movie[] m = new Movie[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<m.length; i++) { // i = 0,1,2
			m[i] = new Movie();
			
			System.out.println((i+1 + " 번째 레코드(줄) >>"));
			
			System.out.print("영화명 = ");
			String movieName = sc.next();//영화명 입력
			
			System.out.print("티켓 금액 = ");
			int moviePrice = sc.nextInt();//금액 입력
			
			System.out.print("시청자 연령 = ");
			int age = sc.nextInt();//나이 입력
			
			System.out.print("구매 방법 = ");
			String type = sc.next();//구매방법 입력
			
			m[i].setMovieName(movieName);
			m[i].setMoviePrice(moviePrice);
			m[i].setAge(age);
			m[i].setType(type);
			
			m[i].priceCalc();//구매금액 계산 메소드
		}
		
		System.out.printf("%10s %10s %10s %10s", "영화명", "금액", "나이", "실구매액 \n");
		for(int i=0; i<m.length; i++) {
			System.out.printf("%10s %10d %10d %10d \n",  m[i].getMovieName(), m[i].getMoviePrice(), m[i].getAge(), m[i].getPrice());
		}

	}//end main

}//end class

class Movie{
	String movieName; // 영화명
	int moviePrice; // 원금
	int age; // 나이
	String type; // 구매방법 인터넷 현장 쿠폰
	double rate; // 할인률
	int price; // 실구매금액
	
	//실제 구매액 계산 메소드
	
	public int priceCalc() {
		if(age<20) {
			rate = 0.25;
		}else if(age>+20 && age<30) {
			rate = 0.2;
		}else {
			rate = 0.15;
		}
		
		if(type.equals("인터넷")) {
			rate = rate+0.05;
		}else if(type.equals("쿠폰")) {
			rate = rate+0.1;
		}//현장구매는 할인 없으므로 작성 필요 x
		
		price = (int)(moviePrice *(1-rate));
		
		return price;
	}
	
	//getter-setter
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMoviePrice() {
		return moviePrice;
	}
	public void setMoviePrice(int moviePrice) {
		this.moviePrice = moviePrice;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}