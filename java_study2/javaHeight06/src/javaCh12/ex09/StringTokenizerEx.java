package javaCh12.ex09;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// Ȯ�ι��� 11��
		// ���̵�,�̸�,�н����� �и���Ű��
		String a = "���̵�,�̸�,�н�����";
		StringTokenizer b = new StringTokenizer(a,",");
		while(b.hasMoreTokens()) {
			String c = b.nextToken();
			System.out.println(c);
		}System.out.println("-----------");
		
		//StringTokenizer �� ���� �и��ϱ�
		//String split(",");
		String[] s = a.split(",");
		for(String s1 : s) {
			System.out.println(s1);
		}

	}

}
