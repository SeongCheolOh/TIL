package javaHeight05;


import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		
		ts1.add(4);
		ts1.add(7);
		ts1.add(4);
		ts1.add(0);
		ts1.add(8);
		ts1.add(9);
		ts1.add(2);
	
		System.out.println("Ʈ���� ��� ���� = " + ts1.size());
		System.out.println("���� ���� ��ü = " + ts1.first());
		System.out.println("���� ���� ��ü = " + ts1.last());
		System.out.println("7 �ؿ� �ִ� ��ü = " + ts1.lower(7));
		System.out.println("2 ���� �ִ� ��ü = " + ts1.higher(2));
	
		//p.665 �����Ͽ� ���α׷� �ۼ��غ���
		
		System.out.println("�Է��Ѱ� ��ü�� ������ ���, ������ ���� ��ü ��� = " + ts1.floor(3));
		System.out.println("�Է��Ѱ� ��ü�� ������ ���, ������ ���� ��ü ��� = " + ts1.ceiling(3));
		System.out.println("���� ���� ��ü �������� �÷��ǿ��� ���� = " + ts1.pollFirst());
		System.out.println("���� ���� ��ü �������� �÷��ǿ��� ���� = " + ts1.pollLast());
		System.out.println("������������ ���ĵ� Iterator�� ���� = " + ts1.descendingIterator());
		System.out.println("������������ ���ĵ� NavigableSet�� ���� = " + ts1.descendingSet());
		System.out.println("Ʈ���� ��� ���� = " + ts1.size());

		//��� ��带 �� ����ϱ�
		Iterator<Integer> it = ts1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("��ü�� ����ϱ�");
		for(Integer i : ts1) {
			System.out.println(i);
		}
		
		//������������ ���ĵ� Iterator ����
		System.out.println("������������ ���ĵ�=====");
		Iterator<Integer> dit = ts1.descendingIterator();
		while(dit.hasNext()) {
			System.out.println(dit.next());
		}
		
		//NavigableSet���� ���ĵ�
		System.out.println("NavigableSet���� ���ĵ�=====");
		NavigableSet<Integer> ns = ts1.descendingSet();
		for(Integer n : ns) {
			System.out.println(n);
		}
		System.out.println("���� �̸����� �����ؼ� ����غ��� - ����ȯ�� ���̵��");
		System.out.println(ts1.first());
		System.out.println(ts1.floor(3));
		
		System.out.println("8���� ���� ����=====");
		SortedSet<Integer> ss = ts1.headSet(8);
		for(Integer s : ss) {
			System.out.println(s);
		}
		System.out.println("4���� ���� ����=====");
		SortedSet<Integer> ss2 = ts1.tailSet(4,false);
		for(Integer s : ss2) {
			System.out.println(s);
		}
		System.out.println("4�̻� 7���� ����=====");
		SortedSet<Integer> ss3 = ts1.subSet(4,true, 7, true);
		for(Integer s : ss3) {
			System.out.println(s);
		}
	}
}
