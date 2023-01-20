package ch06.day1;

public class ClassEx02 {

	public static void main(String[] args) {
		// 생성자 오버로딩 공부
		
		Student a = new Student();
		
		Student a1 = new Student("홍길동");
		Student a2 = new Student("010-1234-5678", 100);
		Student a3 = new Student(85, "010-9876-5432");
		Student a4 = new Student("홍길동", 100, "9999-8888");
		Student a5 = new Student("010-555-6666");
		
	}

}

class Student{
	String name;
	String phone;
	int scores;
	
	//Student 기본생성자를 만들어보세요
	
	public Student() {
		System.out.println("Student 클래스의 기본 생성 부분");
	}

	public Student(String name) {
		this.name = name;
	}
	public Student(String phone, int scores) {
		this.phone = phone;
		this.scores = scores;
	}
	public Student(int scores, String phone) {
		this.scores = scores;
		this.phone = phone;
	}
	public Student(String name, int scores, String phone) {
		this.name = name;
		this.scores = scores;
		this.phone = phone;
	}
//----------------------------------------------------------------//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getScores() {
		return scores;
	}

	public void setScores(int scores) {
		this.scores = scores;
	}
	
	
}