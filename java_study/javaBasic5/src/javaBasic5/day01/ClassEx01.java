package javaBasic5.day01;

import dao.BookDao;

public class ClassEx01 {//230125 복습

	public static void main(String[] args) {
		
		// 정적(static)메소드 호출하기 클래스명.메소드명();
		Ex01.a(); 
		
		// 인스턴스 메소드 호출하기 객체생성 후 참조변수명.메소드명();
		Ex01 ex01 = new Ex01();
		ex01.b(); 
		
		// 패키지, 클래스 만들기 controller/dao/dto 등등
		
		// 다른 패키지의 클래스를 사용
	/*	~is a = ~은 ~이다. (상속관계) 
	    ex)고양이는 동물이다
		>> extends, implements */
	/*	//~has a = ~은 ~을 가지고 있다 or 사용한다 (집합관계)
	    ex)ClassEx01은 BookDao를 사용한다.
		>> import */
		
		// 감춘 것(정보 은닉)
		// 감출건 감추고, 노출할건 노출하기(캡슐화)
		BookDao bookdao = new BookDao();
		bookdao.setName("홍길동"); 
		// 접근제한자 - public protected, default(package) - 아무것도 안 쓴 것, private
		// 싱글톤 - 

	}

}

class Ex01{
	
	static int k = 100;
	int s = 200; //static이 안붙어있는 인스턴스들은 메소드 x heap에 올라감, 객체생성 후 사용가능
	static void a() {
		k = k+200;
	//	s = s+k; 사용 불가
	}
	void b() {
		s = s+100;
		k = k+300;
	}
}