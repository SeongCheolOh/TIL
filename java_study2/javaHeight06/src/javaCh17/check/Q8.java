package javaCh17.check;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q8 {

	public static void main(String[] args) {
		List<Member1> list = Arrays.asList(new Member1("ȫ�浿", "������"),
				new Member1("�ſ��", "�����̳�"),
				new Member1("���ڹ�", "������"));
		
		Map<String, List<Member1>>groupingMap = list.stream()
				.collect(Collectors.groupingBy(m->m.getJob()));
		System.out.println("������");
		groupingMap.get("������").stream().forEach(m->System.out.println(m));
		
		System.out.println();
		System.out.println("�����̳�");
		groupingMap.get("�����̳�").stream().forEach(m->System.out.println(m));
	}

}
