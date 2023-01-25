package javaBasic4.day01;

public class StaticEx05 {

	public static void main(String[] args) {
		System.out.println("메인 메소드 부분");
		System.out.println(Car.a);//변수를 가져와서 출력하기 전에
		
		Car c1 = new Car();
		System.out.println(c1.ia);
	}

}
class Car{
	static int a = 100;
	int ia;//4순위 필드
	static {//1순위 static
		System.out.println("이 곳은 정적 블록");
		a = 200;
	}
	
	{//2순위 인스턴스
		System.out.println("이 곳은 인스턴스 블록");
		ia = 1000;
	}
	public Car() {//3순위 기본생성자
		System.out.println("이 곳은 기본생성자 블록");
		
	}
}