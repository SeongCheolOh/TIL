package javaCh17.check;

import java.util.Arrays;
import java.util.List;

public class Q6 {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(new Member("ȫ�浿", 30),
											new Member("�ſ��", 40),
											new Member("���ڹ�", 26));
		double avg = list.stream()
							.mapToInt(s->s.getAge())
							.average()
							.getAsDouble();
				
		System.out.println("��� ���� : " + avg);
		
	}

}
