package javaCh17.sec12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEx02 {

	public static void main(String[] args) {
		// 
		
		List<Student> totalList = new ArrayList<Student>();
		totalList.add(new Student("ȫ�浿", "��", 92));
		totalList.add(new Student("�����", "��", 87));
		totalList.add(new Student("���ڹ�", "��", 95));
		totalList.add(new Student("���ؿ�", "��", 93));
		
		Map<String, Double>map = 
				totalList.stream()
						.collect(Collectors.groupingBy
								(s->s.getSex(),
										Collectors.averagingDouble(s->s.getScore())));
		System.out.println(map);

		List<Student1> totalList1 = new ArrayList<Student1>();
		totalList1.add(new Student1("1�г�", "ȫ�浿", "��", 92));
		totalList1.add(new Student1("2�г�", "�����", "��", 87));
		totalList1.add(new Student1("1�г�", "���ڹ�", "��", 95));
		totalList1.add(new Student1("3�г�", "������", "��", 93));
		totalList1.add(new Student1("3�г�", "������", "��", 93));
		totalList1.add(new Student1("3�г�", "������", "��", 93));

		//�г⺰�� �ο��� ���ϱ�
//		Map<String, Double>map1 = totalList1.stream()
//				.collect(Collectors
//						.groupingBy(s->s.getGrade(),Collectors
//								.counting(s->s.getGrade())));
//		System.out.println(map1);
	}

}
