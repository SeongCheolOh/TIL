package javaHeight04.p656;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("컴퓨터", 200);
		map1.put("프린터", 50);
		map1.put("아이폰", 210);
		map1.put("갤럭시탭", 170);
		
		System.out.println(map1.get("컴퓨터"));
		System.out.println(map1.get("아이폰"));

		//매장에 냉장고가 있나요?
		
		if(map1.containsKey("냉장고")) System.out.println("냉장고는 있습니다");
		else System.out.println("냉장고가 없습니다");
		if(map1.containsKey("프린터")) System.out.println("프린터는 있습니다");
		else System.out.println("프린터가 없습니다");
		

		//모든 키를 입력받아 금액을 구한 후 조건문으로 비교하기
		Set<String> keys = map1.keySet();
		//키를 구해서 출력해보기
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//키를 입력하여 금액 구해보기
		it = keys.iterator();
		while(it.hasNext()) {
			Integer value =  map1.get(it.next());
			System.out.println("값은 ? " + value);
		}
		//금액이 150만원 이상인 것의 품목을 출력하기
		it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(150 <= map1.get(key)) {
				System.out.println(key + " - " + map1.get(key));
			}
		}
		
		//금액이 170짜리가 있는가
		if(map1.containsValue(170)) {
			System.out.println("네 있습니다");
		};
	}

}
