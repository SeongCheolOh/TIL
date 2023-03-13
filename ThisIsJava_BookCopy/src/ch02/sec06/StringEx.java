package ch02.sec06;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Hong-GD";
		String job = "programer";
		
		System.out.println(name +" "+ job);
		
		String str = "나는 \"자바\"를 배웁니다"; // \>>뒷 문자를 그대로 출력
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다");
	}

}
