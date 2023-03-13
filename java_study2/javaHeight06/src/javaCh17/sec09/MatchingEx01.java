package javaCh17.sec09;

import java.util.Arrays;

public class MatchingEx01 {

	public static void main(String[] args) {
		// p.750
		//��� �����ؾ� �ϴ� ��(and����) = allMatch()
		//�ϳ��� ����(or����) = anyMatch
		//��� �����̸� �� = noneMatch
		
		int[] intArr = {2,4,6,5};
		//��� 2�� ����̸� �� ���
		boolean result = Arrays.stream(intArr)
								.allMatch(a->a%2==0);
		System.out.println(result);
		
		//2�� ����� �ϳ��� ������ �� ���
		result = Arrays.stream(intArr)
				.anyMatch(a->a%2==0);
		System.out.println(result);
		
		//2�� ����� ������ �� ���
		result = Arrays.stream(intArr)
				.noneMatch(a->a%7==0);
		System.out.println(result);
		
		Student[] stdArr = {new Student("ȫ�浿",100),
							new Student("ȫ�浿",80),
							new Student("ȫ�浿",60),
							new Student("ȫ�浿",70)};
		
		//��� 60������ true
		if(Arrays.stream(stdArr).allMatch(n->n.getScore()>=60))
			System.out.println("��� 60�� �̻��Դϴ�");
		
		//�ϳ��� 80���� ������ true
		result = Arrays.stream(stdArr).anyMatch(n->n.getScore()>=80);
		System.out.println(result);
		
		//��� 100�� �̻��̸� false
		result = Arrays.stream(stdArr).noneMatch(n->n.getScore()>=100);
		System.out.println(result);
	}

}
