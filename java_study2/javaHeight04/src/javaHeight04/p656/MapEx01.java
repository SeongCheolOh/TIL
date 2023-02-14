package javaHeight04.p656;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("��ǻ��", 200);
		map1.put("������", 50);
		map1.put("������", 210);
		map1.put("��������", 170);
		
		System.out.println(map1.get("��ǻ��"));
		System.out.println(map1.get("������"));

		//���忡 ����� �ֳ���?
		
		if(map1.containsKey("�����")) System.out.println("������ �ֽ��ϴ�");
		else System.out.println("����� �����ϴ�");
		if(map1.containsKey("������")) System.out.println("�����ʹ� �ֽ��ϴ�");
		else System.out.println("�����Ͱ� �����ϴ�");
		

		//��� Ű�� �Է¹޾� �ݾ��� ���� �� ���ǹ����� ���ϱ�
		Set<String> keys = map1.keySet();
		//Ű�� ���ؼ� ����غ���
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Ű�� �Է��Ͽ� �ݾ� ���غ���
		it = keys.iterator();
		while(it.hasNext()) {
			Integer value =  map1.get(it.next());
			System.out.println("���� ? " + value);
		}
		//�ݾ��� 150���� �̻��� ���� ǰ���� ����ϱ�
		it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(150 <= map1.get(key)) {
				System.out.println(key + " - " + map1.get(key));
			}
		}
		
		//�ݾ��� 170¥���� �ִ°�
		if(map1.containsValue(170)) {
			System.out.println("�� �ֽ��ϴ�");
		};
	}

}
