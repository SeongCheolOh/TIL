package javaCh17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineEx01 {

	public static void main(String[] args) {
		// p.727 �߰� ó���� ���� ó��
		// �÷��� or �迭-> �������� ��Ʈ�� -> [�߰� ��Ʈ�� - ���� ����] -> ���� ��Ʈ��
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("ȫ�浿", 10));
		list.add(new Student("�ſ��", 20));
		list.add(new Student("���̼�", 30));
		
		List<Student> list1 = Arrays.asList(new Student("ȫ�浿", 10), new Student("�ſ��", 20), new Student("���̼�", 30));
		Stream<Student> stream = list.stream();
		IntStream is = stream.mapToInt(s->s.getScore());
		OptionalDouble od = is.average();
		double avg = od.getAsDouble();
		System.out.println(avg);
		
		double avg1 = list.stream()//Student Ŭ������ ��ü����������
						  .mapToInt(s->s.getScore())//10, 20, 30
						  .average()//��� ���ϰ�
						  .getAsDouble();//�⺻�� double Ÿ������ �ٲ۴�
		System.out.println(avg1);
		
		OptionalDouble avg2 = list.stream()//Student Ŭ������ ��ü����������
				  .mapToInt(s->s.getScore())//10, 20, 30
				  .average();//��� ���ϰ�
		System.out.println(avg2);
		
		//������ �հ� ���ϱ�
		int avg3 = list.stream()//Student Ŭ������ ��ü����������
				  .mapToInt(s->s.getScore())//10, 20, 30
				  .sum();
		System.out.println(avg3);
		
		//������ �ִ�;
		OptionalInt avg4 = list1.stream()//Student Ŭ������ ��ü����������
				  .mapToInt(s->s.getScore())//10, 20, 30
				  .max();
		System.out.println(avg4);
	}

}
