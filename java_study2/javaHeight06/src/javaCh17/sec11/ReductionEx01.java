package javaCh17.sec11;

import java.util.Arrays;
import java.util.List;

import javaCh17.sec10.Student;

public class ReductionEx01 {

	public static void main(String[] args) {
		// p.758
		
		List<Student> stdList =
				Arrays.asList(new Student("ȫ�浿", 92),
				new Student("�ſ��", 95),
				new Student("���ڹ�", 88));

		//�հ� ���ϱ�
		int sum = stdList.stream().mapToInt(n->n.getScore()).sum();
		System.out.println(sum);
		
		//���2
		sum = stdList.stream().map(Student::getScore)//92 95 88
						.reduce(0,(a,b)->a+b);
		System.out.println(sum);
		
		//
		sum = stdList.stream().map(Student::getScore)// 92 95 88
								.reduce(0, (a,b)-> a+b-20); // 0+92-20 72+95-20 147+88-20
		System.out.println(sum);
		
		//����ִ� ��Ʈ���� ����� �ڵ� ����
		List<Student> stdList1 = Arrays.asList();
		sum = stdList1.stream().map(Student::getScore)//������ ����
								.reduce(0, (a,b) -> a+b-20);//�⺻�� 0�� ��µ�
		System.out.println(sum);
	}

}
