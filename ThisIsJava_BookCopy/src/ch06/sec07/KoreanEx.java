package ch06.sec07;

public class KoreanEx {

	public static void main(String[] args) {
		// ��ü ����
		Korean k1 = new Korean("���ڹ�", "012345-1234567");
		// �б�
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println();
		
		// �ٸ� ��ü ����
		Korean k2 = new Korean("���ڹ�", "098765-2345678");
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);

	}

}
