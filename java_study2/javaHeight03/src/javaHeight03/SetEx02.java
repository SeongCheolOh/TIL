package javaHeight03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "���","��","�ٳ���","��","��","��"
		//1. Set ������ �ֱ�
		Set<String> set2 = new HashSet<String>();
		set2.add("���");
		set2.add("��");
		set2.add("�ٳ���");
		set2.add("��");
		set2.add("��");
		set2.add("��");
		
		//2. ��ü ���
		Iterator<String> it = set2.iterator();
		while( it.hasNext()) {
			String fruit = it.next();
			System.out.println(fruit);
		}
		//3. ũ�� ���
		System.out.println(set2.size());
		
		//4. "����"�� �ִ��� �˻��ϱ�
		if(set2.contains("����"))System.out.println("���� �ֽ��ϴ�");
		else System.out.println("���� �����ϴ�");
	}

}
