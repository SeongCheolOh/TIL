package ch06.sec11;

public class FinalEx {

	public static void main(String[] args) {
		// p.254
		Final f1 = new Final("123456-1234567","���ڹ�");
		System.out.println(f1.nation);
		System.out.println(f1.ssn);
		System.out.println(f1.name);
		
		//final �ʵ�� ���� ���� �� �� ����
//		f1.nation = "USA";
//		f1.ssn = "987654-9876543";
		f1.name = "ȫ�浿";

	}

}
