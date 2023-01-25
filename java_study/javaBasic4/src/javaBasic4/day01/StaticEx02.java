package javaBasic4.day01;

public class StaticEx02 {
	
	//프로그램 생명 주기(life cycle)   생성-활동-소멸
	//정적변수 static이 붙어있는것은 프로그램이 시작될 때 부터 끝날 때 까지 계속 메모리에 남아있음
	//때문에 신중히 사용해야 함
	static int a = 100;
	static double b = 3.14;
	static String name = "홍길동";
	
	//인스턴스 변수(동적변수)는 객체 생성 시 같이 생성됨
	//해당 클래스를 벗어나면 소멸됨
	int c = 200;
	double d = 5.5;
	String addr = "하남시";
	
	public static void main(String[] args) {

		System.out.println(a + " " + b + " " + name);
		 
	/*	System.out.println(c + " " + d + " " + addr); 
	 * 메모리에 올려지지않은 필드라서 컴파일 에러 발생 */
		
		StaticEx02 s1 = new StaticEx02();
		System.out.println(s1.c + " " + s1.d + " " + s1.addr);
	}

}
