package ch02.sec06;

public class StringEx {

	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		String str = "나는 \"자바\"를 배웁니다";
		System.out.println(str);
		
		str = "번호\t이름\t작업"; //t만큼 띄우기
		System.out.println(str);
		
		System.out.println("나는\n");//n은 줄띄우기
		System.out.println("자바를\n");
		System.out.println("배웁니다\n");
	}

}
