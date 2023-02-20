package LIFO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ImmutableEx01 {

	public static void main(String[] args) {
		//수정할 수 없는 컬렉션
		List<String> immutableList1 = List.of("A", "B", "C");
		
		//immutableList.add("D"); 
		//immutableList1.remove("B"); 삭제나 추가를 할 수 없음
		System.out.println(immutableList1.size());
		
		for(String i : immutableList1) {
			System.out.println(i);
		}//출력들은 가능
		
		Set<String> iS = Set.of("1","2","3");
		System.out.println(iS.size());
		if(iS.contains("2")) {
			System.out.println("2가 있습니다");
		}else {
			System.out.println("없습니다");
		}
		
		Map<Integer, String> mof = Map.of(1,"A",2,"B",3,"C");
		//key만 구하기
		Set<Integer> keys = mof.keySet();
		Iterator<Integer> k = keys.iterator();
		while(k.hasNext()) {
			Integer k1 = k.next();
			System.out.println(k1 + "-" + mof.get(k1));
		}
		
		//mof.put(4, "D");  수정 불가
		
		Map<String, Integer> studentMap = new HashMap<String, Integer>();
		studentMap.put("이순신1", 100);
		studentMap.put("이순신2", 50);
		studentMap.put("이순신3", 70);
		studentMap.put("이순신4", 80);
		studentMap.put("이순신5", 65);
		
		studentMap.remove("이순신1");
		//변경할 수 없는 고정맵으로 만들기
		Map<String, Integer> imMap2 = Map.copyOf(studentMap);
//		imMap2.remove("이순신");
		
		//전체출력
		Set<Entry<String,Integer>> imSet2 = imMap2.entrySet();
		for(Entry<String, Integer> i : imSet2) {
			System.out.println(i.getKey()+ " " +i.getValue());
		}
	}

}
