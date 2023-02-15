package javaHeight04.p659;

import java.util.HashMap;
import java.util.Map;

public class MapEx02 {

	public static void main(String[] args) {
		//��ȭ��ȣ�� key�� �Է�, ����Ʈ�� �ּҸ� value
		Map<String, Data1>shopMap1 =  new HashMap<String, Data1>();
		
		Shop shop1 = new Shop("1111", new Data1(100, "�̻�1��"));
		Shop shop2 = new Shop("2222", new Data1(200, "�̻�2��"));
		Shop shop3 = new Shop("3333", new Data1(300, "�̻�3��"));
		Shop shop4 = new Shop("4444", new Data1(400, "�̻�4��"));
		Shop shop5 = new Shop("5555", new Data1(500, "�̻�5��"));
		
		shopMap1.put(shop1.getPhone(), shop1.getData1());
		shopMap1.put(shop2.getPhone(), shop2.getData1());
		shopMap1.put(shop3.getPhone(), shop3.getData1());
		shopMap1.put(shop4.getPhone(), shop4.getData1());
		shopMap1.put(shop5.getPhone(), shop5.getData1());

		Data1 shop1Addr = shopMap1.get(shop1.getPhone());
		System.out.println("�� �ڵ��� ��ȣ " + shop1.getPhone());
		System.out.println("���� ����Ʈ�� " +shop1Addr.getPoint());
		System.out.println("���� �ּҴ� " + shop1Addr.getAddress());
		
		Data1 shop4Addr = shopMap1.get(shop4.getPhone());
		System.out.println("�� �ڵ��� ��ȣ " + shop4.getPhone());
		System.out.println("���� ����Ʈ�� " +shop4Addr.getPoint());
		System.out.println("���� �ּҴ� " + shop4Addr.getAddress());
	}

}
