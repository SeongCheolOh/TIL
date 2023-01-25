package javaBasic4.day01;

public class StaticEx03 {
	
	static boolean a = true;
	static float b = 2.56f;
	static double c = 78.56;
	
	String city = "Seoul";
	int age = 20;

	public static void main(String[] args) {
		//모두 출력하세요
		System.out.println(a + " " + b + " " + c);
		
		StaticEx03 s1 = new StaticEx03();
		System.out.println(s1.city + " " + s1.age);
		
		System.out.println();
		s1.printA();
	}
	
	public void printA() {//인스턴스 메소드
		//이곳을 통해서 모두 출력해보세요
		System.out.println(a + " " + b + " " + c);
		System.out.println(city + " " + age);
	}

}
