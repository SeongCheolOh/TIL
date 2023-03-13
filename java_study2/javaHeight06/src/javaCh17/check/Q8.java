package javaCh17.check;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q8 {

	public static void main(String[] args) {
		List<Member1> list = Arrays.asList(new Member1("홍길동", "개발자"),
				new Member1("신용권", "디자이너"),
				new Member1("김자바", "개발자"));
		
		Map<String, List<Member1>>groupingMap = list.stream()
				.collect(Collectors.groupingBy(m->m.getJob()));
		System.out.println("개발자");
		groupingMap.get("개발자").stream().forEach(m->System.out.println(m));
		
		System.out.println();
		System.out.println("디자이너");
		groupingMap.get("디자이너").stream().forEach(m->System.out.println(m));
	}

}
