package ch05.sec05;

public class StringCutEx {

	public static void main(String[] args) {
		// ���ڿ� �߶󳻱�
		// Ư�� ������ �߶󳻱� >> ������.substring(�ε���1, �ε���2);
		// Ư�� ���� ���ķ� ǥ��>> ������.substring(�ε���);
		String ssn = "960123-1234567";
		String a = ssn.substring(0);
		String b = ssn.substring(1);
		System.out.println(a);
		System.out.println(b);
		String c = ssn.substring(0,6); // 0�� �ε��� ~ 6�� �ε��� �ձ��� ǥ��
		String d = ssn.substring(7,14);
		String e = ssn.substring(7);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

}
