package javaHeight04.p659;

import java.util.HashMap;
import java.util.Map;

public class MapEx02 {

	public static void main(String[] args) {
		//전화번호를 key로 입력, 포인트와 주소를 value
		Map<String, Data1>shopMap1 =  new HashMap<String, Data1>();
		
		Shop shop1 = new Shop("1111", new Data1(100, "미사1동"));
		Shop shop2 = new Shop("2222", new Data1(200, "미사2동"));
		Shop shop3 = new Shop("3333", new Data1(300, "미사3동"));
		Shop shop4 = new Shop("4444", new Data1(400, "미사4동"));
		Shop shop5 = new Shop("5555", new Data1(500, "미사5동"));
		
		shopMap1.put(shop1.getPhone(), shop1.getData1());
		shopMap1.put(shop2.getPhone(), shop2.getData1());
		shopMap1.put(shop3.getPhone(), shop3.getData1());
		shopMap1.put(shop4.getPhone(), shop4.getData1());
		shopMap1.put(shop5.getPhone(), shop5.getData1());

		Data1 shop1Addr = shopMap1.get(shop1.getPhone());
		System.out.println("고객 핸드폰 번호 " + shop1.getPhone());
		System.out.println("고객의 포인트는 " +shop1Addr.getPoint());
		System.out.println("고객의 주소는 " + shop1Addr.getAddress());
		
		Data1 shop4Addr = shopMap1.get(shop4.getPhone());
		System.out.println("고객 핸드폰 번호 " + shop4.getPhone());
		System.out.println("고객의 포인트는 " +shop4Addr.getPoint());
		System.out.println("고객의 주소는 " + shop4Addr.getAddress());
	}

}
