package ch06.sec07;

public class KoreanEx {

	public static void main(String[] args) {
		// 객체 생성
		Korean k1 = new Korean("박자바", "012345-1234567");
		// 읽기
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println();
		
		// 다른 객체 생성
		Korean k2 = new Korean("김자바", "098765-2345678");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);

	}

}
