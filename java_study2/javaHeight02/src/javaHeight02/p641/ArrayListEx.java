package javaHeight02.p641;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("ȫ�浿");//0�� �ε���
		list1.add("�̼���");//1�� �ε���
		list1.add("������");//2�� �ε���
		list1.add(1, "�ֿ�");//1�� �ε����� "~"�Է��ض� >> 1���� �����ϴ°� �ƴ� 0��~1�� ���� ���� �����̴�
		
		for(int i = 0 ; i < list1.size() ; i++) {
			System.out.println(list1.get(i));	
		}
		
		//�츮�ݿ� ȫ�浿�� �ֽ��ϱ�?
		System.out.println(list1.contains("ȫ�浿"));
		
		//���� �� �ֿ� ����
		list1.remove(1);
		list1.remove("�ֿ�");
		//�� �� �����ϴ�
		System.out.println("-----------------");
		for(int i = 0 ; i < list1.size() ; i++) {
			System.out.println(list1.get(i));	
		}
		
		//������ �����
		list1.remove(2);
		list1.remove("������");
		System.out.println("------------------");
		for(int i = 0 ; i < list1.size() ; i++) {
			System.out.println(list1.get(i));	
		}
		
		//���� �� �����
		list1.clear();
		System.out.println("------------------");
		for(int i = 0 ; i < list1.size() ; i++) {
			System.out.println(list1.get(i));	
		}
		System.out.println(list1.isEmpty());
		
	}

}
