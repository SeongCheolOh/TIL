package javaBasic2.ch05;

import java.util.Scanner;

public class RefEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		Person1 p1 = new Person1();
		s1.stName = "홍길동";
		s1.age = 20;
		s1.m1();
		System.out.println("이곳은 main()"+s1.stName);
		s1.m1();
		s1.m2();
		System.out.println();
		p1.address = "하남시";
		p1.point = 301.3;
		p1.getAdderss();
		p1.getPoint();
		p1.getAll();
		
		//메소드를 이용하여 변수 값을 전달하기
		p1.setAddress("하남시");
		p1.setPoint(301.3);
		p1.setAll("강동구", 40.2);
		p1.setEx(5, true, "홍길동", 5.8);
		
	}//end main

}//end class

class Person1{
	String address;//필드
	double point;//필드
	//멤버필드
	
	void getAdderss() {
		System.out.println(address);
	}
	void getPoint() {
		System.out.println(point);
	}
	void getAll() {
		System.out.println(address + " " + point);
	}
	void setAddress(String a/*하남시를 받아줄 변수 사용 */) {
		this.address = address;
		System.out.println("이곳은 Person1 class의 메소드임 " + address);
	}
	void setPoint(double point/*301.3을 받아줄 변수 사용 */) {
		this.point = point;
		System.out.println(point);
	}
	void setAll(String c, double d/* 301.3과 "강동구"를 받을 변수 사용 */) {
		this.address = address; // class 속의 필드를 표현 할 때 this.~~~
		this.point = point;
		System.out.println(address + " " + point);
		
	}
	void setEx(int e, boolean f, String g, double h) {
		
	}
}
class Teacher1{
	String dept;
	boolean gender;
}

class Student1{
	String stName;
	int age;
	// 메소드(동작)
	// 메소드 형식 
	// 리턴타입 메소드명(메소드가 호출될 때 넣어주는 값){처리할 내용들}
	void m1() {
		System.out.println("이곳은 Student1 클래스의 m1메소드 입니다");
		}
	void m2() {
		System.out.println(age + " " + stName + "이곳은 Student1 클래스 입니다");
	 	}
}