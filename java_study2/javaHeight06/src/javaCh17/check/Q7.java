package javaCh17.check;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q7 {

	public static void main(String[] args) {
		List<Member1> list = Arrays.asList(new Member1("ȫ�浿", "������"),
				new Member1("�ſ��", "�����̳�"),
				new Member1("���ڹ�", "������"));

		List<Member1> developers = list.stream()
				.filter(s->s.getJob().equals("������"))
				.collect(Collectors.toList());
		
		developers.stream()
					.forEach(s->System.out.println(s.getName()));
	}

}
