package treeMap;

import java.util.Set;
import java.util.TreeMap;

public class Ex03Main {

	public static void main(String[] args) {
		
		
		TreeMap<Ex03Key, Ex03Value> tm = new TreeMap<Ex03Key, Ex03Value>(new Ex03Comparator());

		tm.put(new Ex03Key("���ﺻ��","���Ͽ���"), new Ex03Value("���ﺻ��", "��ȭ��", 4460));
		tm.put(new Ex03Key("���ﺻ��","��������"), new Ex03Value("���ﺻ��", "���θ�", 6860));
		tm.put(new Ex03Key("���ﺻ��","��������"), new Ex03Value("���ﺻ��", "��ȭ��", 5560));
		tm.put(new Ex03Key("���ﺻ��","��������"), new Ex03Value("���ﺻ��", "���θ�", 3560));
		
		//1) �����μ� �� ����ǥ ��ü ���
		Set<Ex03Key> a1 = tm.keySet();
		for( Ex03Key a : a1) {
			System.out.println(a.get�μ���() + " " + a.get�Ҽ�()+ " " + tm.get(a).get�Ҽ�() +" "+ tm.get(a).get��������() +" "+ tm.get(a).get�ǸŽ���());
		}
		
		//2) ���� ���
		
		//3) ���Ͽ����� �Է��ϸ� ���� ��ġ�� �Ҽ��� ����ϼ���
		
		//4) ��� �������� �ǸŽ����� �հ踦 ���ϼ���
		
		//5) �ǸŽ����� ���� ���� �����Ҹ� ����ϼ���
		
	}

}
