package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		// 메인메소드가 있으면
		// 객체를 만드는 설계도보다는 단순 실행용
		
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다");
		
		Student s2 = new Student();
		//sec04 - Student 클래스가 생성되어있어서 여기서 클래스생성 따로 안해도 됨
	}

}
