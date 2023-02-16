package javaHeight05;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableSet;

public class TreeMapEx02 {

	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<String, String>();

		tm.put("강정호", "영업부");
		tm.put("김강인", "홍보부");
		tm.put("김영자", "기획부");
		
		//출력하기
		System.out.println(tm); //1
		System.out.println();
		Set< Entry<String, String>> et = tm.entrySet();
		for(Entry<String, String>e : et) {
			System.out.println(e.getKey() + "=" + e.getValue()); //2
		}
		
		//역순 출력하기
		System.out.println(tm.descendingKeySet()); //1
		NavigableSet<String>ns = tm.descendingKeySet();
		for(String key : ns) {
			System.out.println(key + " - " + tm.get(key)); //2
		}
	}

}
