package javaHeight02.p642;

import java.util.ArrayList;

import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<Integer> list2 = new ArrayList<Integer>();
		
		//1~10���� �Է�
		for(int i = 1; i <= 10 ; i++) {
			list2.add(i);
		}
		
		//5�� �ε��� ��ġ�� ���� 50���� �����ϱ�
		list2.set(5, 50);
		
		//��ü ����ϱ�
		for(int i = 0; i < 10 ; i++) {
			System.out.println(list2.get(i));
		}
		
	}

}
