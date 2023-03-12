package javaCh17.sec07;

import java.util.Arrays;
import java.util.List;

public class SortingEx {

	public static void main(String[] args) {
		// p.745
		List<Student> sList = Arrays.asList(new Student("ȫ�浿", 30), new Student("�ſ��", 10), new Student("���̼�", 20));
		sList.stream()
			.forEach(s->System.out.println(s.getName()+" "+s.getScore()));
		System.out.println();
		
		List<Person> pl = 
				Arrays.asList(new Person("A", true, 1000.90),
						new Person("B", true, 2000.90),
						new Person("C", false, 3000.90),
						new Person("D", true, 4000.90),
						new Person("E", false, 5000.90));
		System.out.println("�޿������� ���");
		pl.stream()
			.sorted(new PersonComparator())
			.forEach(s->System.out.println(s.getName()+" "+s.getPay()));
		System.out.println("���ڸ� �޿� �������� ���");
		pl.stream()
		.filter(s->s.isGender())
		.sorted(new PersonComparator())
		.forEach(s->System.out.println(s.getName()+ " " + s.getPay()+ " " + s.isGender()));
		System.out.println("���ڵ� �޿��� �հ� ���");
		pl.stream()
		.filter(s->!(s.isGender()))
		.mapToDouble(s->s.getPay()).sum();
//		.forEach(s->System.out.println(s.getPay()));
	}

}
