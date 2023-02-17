package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx02 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(350);
		ts.add(215);
		ts.add(220);
		ts.add(270);
		ts.add(275);
		
		System.out.print("���� ���� �⺻���� = ");
		System.out.println(ts.last());
		System.out.println();
		
		System.out.print("���� ���� �⺻���� = ");
		System.out.println(ts.first());
		System.out.println();
		
		System.out.print("�⺻�� �������� = ");
		System.out.println(ts);
		System.out.print("���� for�� ��� = ");
		for(Integer s : ts) {
			System.out.print(s + " ");
		}System.out.println();
		
		System.out.print("�⺻�� �������� = ");
		Iterator<Integer> it = ts.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}System.out.println();
		System.out.println("����ȯ�� ���� ���̵��");
		System.out.println(ts.descendingIterator());
		
		System.out.print("250�̻� 350���� ���");
		System.out.println(ts.subSet(250,true, 350,true));
	}

}
