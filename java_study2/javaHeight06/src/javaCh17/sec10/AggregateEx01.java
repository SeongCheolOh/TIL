package javaCh17.sec10;

import java.util.Arrays;

import javaCh17.sec09.Student;

public class AggregateEx01 {

	public static void main(String[] args) {
		// p.752
		
		Student[] stdArr = {new Student("ȫ�浿",100),
				new Student("ȫ�浿",80),
				new Student("ȫ�浿",60),
				new Student("ȫ�浿",70),
				new Student("ȫ�浿",50),
				new Student("ȫ�浿",40),
				new Student("ȫ�浿",60)};
		
		//ī����
		long count = Arrays.stream(stdArr).count();
		System.out.println(count);
		
		//�� ��
		int sum = Arrays.stream(stdArr).mapToInt(n->n.getScore()).sum();
		System.out.println(sum);
		
		//���
		double avg = Arrays.stream(stdArr).mapToInt(n->n.getScore()).average().getAsDouble();
		System.out.println(avg);
		System.out.println((double)sum/count);
		
		//�ִ�
		int max = Arrays.stream(stdArr).mapToInt(n->n.getScore()).max().getAsInt();
		System.out.println(max);
		
		//�ּڰ�
		int min = Arrays.stream(stdArr).mapToInt(n->n.getScore()).min().getAsInt();
		System.out.println(min);
		
		//ù��° ���
		int findFirst = Arrays.stream(stdArr).mapToInt(n->n.getScore()).findFirst().getAsInt();
		System.out.println(findFirst);
		
		//������ ��� 60�� �Ѿ��°� > true

	}

}
