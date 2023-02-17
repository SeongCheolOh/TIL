package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx02 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(350);
		ts.add(215);
		ts.add(220);
		ts.add(270);
		ts.add(275);
		
		System.out.print("가장 높은 기본급은 = ");
		System.out.println(ts.last());
		System.out.println();
		
		System.out.print("가장 낮은 기본급은 = ");
		System.out.println(ts.first());
		System.out.println();
		
		System.out.print("기본급 오름차순 = ");
		System.out.println(ts);
		System.out.print("향상된 for문 사용 = ");
		for(Integer s : ts) {
			System.out.print(s + " ");
		}System.out.println();
		
		System.out.print("기본급 내림차순 = ");
		Iterator<Integer> it = ts.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}System.out.println();
		System.out.println("최재환님 대입 아이디어");
		System.out.println(ts.descendingIterator());
		
		System.out.print("250이상 350이하 출력");
		System.out.println(ts.subSet(250,true, 350,true));
	}

}
