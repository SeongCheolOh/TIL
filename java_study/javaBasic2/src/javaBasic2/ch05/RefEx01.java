package javaBasic2.ch05;

import java.util.Scanner;

public class RefEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10; 
		String name = "홍길동"; //name이란 변수는 "홍길동"이 들어있는 힙메모리 주소를 가지고 있다.
		Scanner sc = new Scanner(System.in);
		//타입   변수
		//
		Student st = new Student();
		//자료형  //변수명  = new 클래스명()
		//new 해당클래스를 heap 메모리에 올려서 생긴 주소를 변수형에 담고, 그 변수는 Student의 주소이다
		//타입 = heap 영역에 저장
		//변수 = stack에 저장
		//타입은 접근 불가능, 변수는 접근 가능
		
		//person 클래스를 heap 메모리에 올리세요
		new Person();//주소가 생김, 주소를 p라는 변수에 담아주세요
	/*	p = new Person(); // p라는 변수는 타입(자료형)을 연결해줘야 한다  */
		Person p = new Person();//완료
		
		//Teacher 클래스를 heap 메모리에 올리세요
		Teacher t = new Teacher();
		st.stName = "홍길동";
		//힙메모리에 있는 변수에다 값을 모두 넣어보세요
		st.age = 20;
		p.address = "경기도 하남시";
		p.point = 10.25;
		t.dept = "이과";
		t.gender = true;
		
		System.out.println(st.stName);
		
		
		
		
	}//end main

}//end class

class Student{
	String stName;
	int age;
}

class Person{
	String address;
	double point;
}

class Teacher{
	String dept;
	boolean gender;
}