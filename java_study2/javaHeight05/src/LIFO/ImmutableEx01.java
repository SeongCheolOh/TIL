package LIFO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ImmutableEx01 {

	public static void main(String[] args) {
		//������ �� ���� �÷���
		List<String> immutableList1 = List.of("A", "B", "C");
		
		//immutableList.add("D"); 
		//immutableList1.remove("B"); ������ �߰��� �� �� ����
		System.out.println(immutableList1.size());
		
		for(String i : immutableList1) {
			System.out.println(i);
		}//��µ��� ����
		
		Set<String> iS = Set.of("1","2","3");
		System.out.println(iS.size());
		if(iS.contains("2")) {
			System.out.println("2�� �ֽ��ϴ�");
		}else {
			System.out.println("�����ϴ�");
		}
		
		Map<Integer, String> mof = Map.of(1,"A",2,"B",3,"C");
		//key�� ���ϱ�
		Set<Integer> keys = mof.keySet();
		Iterator<Integer> k = keys.iterator();
		while(k.hasNext()) {
			Integer k1 = k.next();
			System.out.println(k1 + "-" + mof.get(k1));
		}
		
		//mof.put(4, "D");  ���� �Ұ�
		
		Map<String, Integer> studentMap = new HashMap<String, Integer>();
		studentMap.put("�̼���1", 100);
		studentMap.put("�̼���2", 50);
		studentMap.put("�̼���3", 70);
		studentMap.put("�̼���4", 80);
		studentMap.put("�̼���5", 65);
		
		studentMap.remove("�̼���1");
		//������ �� ���� ���������� �����
		Map<String, Integer> imMap2 = Map.copyOf(studentMap);
//		imMap2.remove("�̼���");
		
		//��ü���
		Set<Entry<String,Integer>> imSet2 = imMap2.entrySet();
		for(Entry<String, Integer> i : imSet2) {
			System.out.println(i.getKey()+ " " +i.getValue());
		}
	}

}
