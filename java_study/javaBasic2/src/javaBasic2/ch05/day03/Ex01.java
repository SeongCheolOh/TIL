package javaBasic2.ch05.day03;

public class Ex01 {

	public static void main(String[] args) {
		// null,NullPointerException
		Student st = null;//변수 "st"에는 참조값이 들어있지 않다(주소가 없다)
		//참조변수는 힙메모리의 주소를 가지고 있는 변수
		//null = 힙메모리의 주소를 아직 넣지 않았다라는 의미
		System.out.println(st);
		
		Student s1 = new Student();
		s1.setName("홍길동");
		System.out.println(s1.name);
		System.out.println(s1.getName());
		s1.setPhone("010-1234-5678");
		System.out.println(s1.phone);
		System.out.println(s1.getPhone());
		s1.setKor(92);
		System.out.println(s1.kor + "점");
		System.out.println(s1.getKor()+"점");
	}

}
class Student{
	String name;//학생명 필드
	String phone;//전화번호 필드
	int kor;//국어점수
	
	void setName(String name) {
		this.name = name;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	void setKor(int kor) {
		this.kor = kor;
	}
	
	String getName(){
		return this.name;
	}String getPhone(){
		return this.phone;
	}int getKor(){
		return this.kor;
	}
	
}