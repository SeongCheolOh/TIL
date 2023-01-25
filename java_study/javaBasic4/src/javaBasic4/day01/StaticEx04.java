package javaBasic4.day01;

public class StaticEx04 {

	public static void main(String[] args) {
		
	/*	System.out.println(a +b + c);
		다른 클래스에 들어있는 메모리라 컴파일 에러 */
		System.out.println(Student.a + " " + Student.b + " " + Student.c );
		System.out.println();
		
		Student.sM();//다른 클래스의 메소드 호출
		Student.getA();
		System.out.println();
		
		Student s1 = new Student();//객체 생성하여 인스턴스 메소드도 사용 가능
		System.out.println(s1.ia + " " + s1.ib + " " + s1.ic);
		s1.iM();
		float ii = s1.getIb(); // 왜 타입과 변수명을 줘야 출력이 되는가?
		System.out.println(ii);
		System.out.println();
	}

}


class Student{
	static int a = 10;
	static float b = 1.1f;
	static double c = 5.5;
	
	int ia = 100;
	float ib = 2.2f;
	double ic = 6.6;
	
	
	
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		Student.a = a;
	}
	public static float getB() {
		return b;
	}
	public static void setB(float b) {
		Student.b = b;
	}
	public static double getC() {
		return c;
	}
	public static void setC(double c) {
		Student.c = c;
	}
	public int getIa() {
		return ia;
	}
	public void setIa(int ia) {
		this.ia = ia;
	}
	public float getIb() {
		return ib;
	}
	public void setIb(float ib) {
		this.ib = ib;
	}
	public double getIc() {
		return ic;
	}
	public void setIc(double ic) {
		this.ic = ic;
	}
	public static void sM() {
		System.out.println("이곳은 정적 메소드 " +  a + " " + b + " "+ c);
		//Person 클래스의 홍길동 출력하기
		System.out.println(Person.name);
	}
	public void iM() {
		System.out.println("이곳은 인스턴스 메소드 " + a + " " + b + " " + c + " " + ia + " " + ib + " " + ic);
	}
}

class Person{
	static String name = "홍길동";
	static String addr = "서울";
	
}