package javaHeight05;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableSet;

public class TreeMapEx02 {

	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<String, String>();

		tm.put("����ȣ", "������");
		tm.put("�谭��", "ȫ����");
		tm.put("�迵��", "��ȹ��");
		
		//����ϱ�
		System.out.println(tm); //1
		System.out.println();
		Set< Entry<String, String>> et = tm.entrySet();
		for(Entry<String, String>e : et) {
			System.out.println(e.getKey() + "=" + e.getValue()); //2
		}
		
		//���� ����ϱ�
		System.out.println(tm.descendingKeySet()); //1
		NavigableSet<String>ns = tm.descendingKeySet();
		for(String key : ns) {
			System.out.println(key + " - " + tm.get(key)); //2
		}
	}

}
