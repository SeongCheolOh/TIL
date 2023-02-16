package javaHeight05;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx01 {

	public static void main(String[] args) {
		//p.670
		
		TreeMap<String, Integer> tM = new TreeMap<String, Integer>();
		tM.put("apple", 10);
		tM.put("forever", 60);
		tM.put("description", 40);
		tM.put("ever", 50);
		tM.put("zoo", 80);
		tM.put("base", 20);
		tM.put("guess", 70);
		tM.put("cherry", 30);
		
		//전체 출력
		System.out.print(tM); // 1
		System.out.println();
		Set< Entry<String, Integer> > entrySet = tM.entrySet();
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> i = it.next();
			System.out.println(i.getKey()+ " " + i.getValue());
		}
		
		//특정 키에 대한 값 가져오기
		Entry<String, Integer> entry = null;
		entry = tM.firstEntry();
		System.out.println("제일 앞 단어는 = " + entry.getKey() + " - " + entry.getValue());
		entry = tM.lastEntry();
		System.out.println("제일 뒤 단어는 = " + entry.getKey() + " - " + entry.getValue());
		entry = tM.lowerEntry("ever");
		System.out.println("ever 앞 단어 = " + entry.getKey() + " - " + entry.getValue());
		entry = tM.higherEntry("cherry");
		System.out.println("cherry 뒤 단어는 = " + entry.getKey() + " - " + entry.getValue());
		System.out.println("--------------");
		
		//내림차순으로 정렬
		NavigableMap<String, Integer> dM =  tM.descendingMap();
		Set< Entry<String, Integer>> des = dM.entrySet();
		for(Entry<String, Integer> d : des) {
			System.out.println(d.getKey()+ " - " + d.getValue()); //1
		}
		NavigableSet<String> ns = tM.descendingKeySet();
		for(String n : ns) {
			System.out.println(n + "-" + tM.get(n)); //2
		}
		System.out.println(tM.descendingMap()); //3
		System.out.println("---------------");
		
		//c~h사이의 단어 검색하기
		System.out.print("c~h사이의 단어는? = ");
		System.out.println(tM.subMap("c", true, "h", true)); //1
		NavigableMap<String, Integer> sm = tM.subMap("c",true,"h",true);
		System.out.println(sm); //2
		for( Entry<String, Integer> e : sm.entrySet()) {
			System.out.println(e.getKey()+ " - " + e.getValue()); //3
		}
		
	}

}
