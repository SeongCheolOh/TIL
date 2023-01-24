package ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		// Korean 객체 생성
		
		Korean k1 = new Korean("김자바","801234-1234567");
		Korean k2 = new Korean("박자바","901234-1234567");
		
		//k1데이터 읽기
		System.out.println("k1의 거주국가 = " + k1.nation);
		System.out.println("k1의 이름 = " + k1.name);
		System.out.println("k1의 주민번호 = " + k1.ssn);
		
		//k2데이터 읽기
		System.out.println("k2의 거주국가 = " + k2.nation);
		System.out.println("k2의 이름 = " + k2.name);
		System.out.println("k2의 주민번호 = " + k2.ssn);

	}

}
