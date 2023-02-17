package treeSet;

import java.util.TreeSet;

public class TreeSetEx03 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("����");
		ts.add("���");
		ts.add("���");
		ts.add("�븮");
		ts.add("�븮");
		ts.add("���");
		ts.add("����");
		ts.add("����");
		
		System.out.print("�������� ���� = ");
		System.out.print(ts);
		System.out.println();
		
		System.out.print("�������� ���� = ");
		System.out.println(ts.descendingSet());
		System.out.println();
		
		System.out.print("������ ������? = ");
		System.out.println(ts.size());
		System.out.println();
		
		System.out.print("���� �ٷ� �Ʒ���? = ");
		System.out.println(ts.lower("����"));
		System.out.println();
		
		System.out.print("�븮 �ٷ� ����? = ");
		System.out.println(ts.higher("�븮"));
		System.out.println();
	}

}
