package javaHeight01.p640;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx01 {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		List list1 = new ArrayList();
		
		int[]n1 = new int[3];
		//���� 3���� �־��µ� ���� 2�� �� �־��־�� ��
		//���1) �迭5�� ���� �� �ٿ��ֱ�
		//�迭�� ������ �߰��ϰų� �߰��� �� ��쿡�� ������ ��, �޸� ȿ���� ��������
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("a");
		list1.add(10);
		
		System.out.println(list1.get(3));
		System.out.println("����ִ� ������ " + list1.size());
		//"k"��� �ڷ�� �ֳ���? >> �����ϴ�
		
		if(list1.contains("k"))System.out.println("�ֽ��ϴ�");
		else System.out.println("�����ϴ�");
	}

}
