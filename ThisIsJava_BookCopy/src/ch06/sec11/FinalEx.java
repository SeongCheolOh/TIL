package ch06.sec11;

public class FinalEx {

	public static void main(String[] args) {
		// p.254
		Final f1 = new Final("123456-1234567","김자바");
		System.out.println(f1.nation);
		System.out.println(f1.ssn);
		System.out.println(f1.name);
		
		//final 필드는 값을 변경 할 수 없다
//		f1.nation = "USA";
//		f1.ssn = "987654-9876543";
		f1.name = "홍길동";

	}

}
