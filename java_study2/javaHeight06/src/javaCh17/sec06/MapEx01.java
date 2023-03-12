package javaCh17.sec06;

import java.util.ArrayList;
import java.util.List;

public class MapEx01 {

	public static void main(String[] args) {
		// p.740
		
		//list �÷��� ����
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("ȫ�浿1", 85));
		studentList.add(new Student("ȫ�浿2", 92));
		studentList.add(new Student("ȫ�浿3", 87));
		
		studentList.add(new Student("ȫ�浿4", 85, 2.5));
		studentList.add(new Student("ȫ�浿5", 92, 1.5));
		studentList.add(new Student("ȫ�浿6", 87, 0.5));
		
		
		//Student�� score��Ʈ������ ��ȯ
		studentList.stream()
				   .mapToInt(s->s.getScore())
				   .forEach(score->System.out.println(score));
		System.out.println();
		
		//�÷��� ������
		studentList.stream()
					.mapToDouble(s->s.getSee())
					.forEach(s->System.out.println(s));
		System.out.println();
		
		//�̸� ������
		studentList.stream().map(s->s.getName()).forEach(s->System.out.println(s));
		
	}

}
