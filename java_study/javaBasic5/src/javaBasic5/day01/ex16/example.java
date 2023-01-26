package javaBasic5.day01.ex16;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
		// 컴파일 에러를 잡으세요
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
		// Printer의 메소드들을 static으로 바꾸면 가능
	}

}
