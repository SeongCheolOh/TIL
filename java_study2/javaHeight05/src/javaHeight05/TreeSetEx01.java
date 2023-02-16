package javaHeight05;


import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		
		ts1.add(4);
		ts1.add(7);
		ts1.add(4);
		ts1.add(0);
		ts1.add(8);
		ts1.add(9);
		ts1.add(2);
	
		System.out.println("트리의 노드 갯수 = " + ts1.size());
		System.out.println("제일 낮은 객체 = " + ts1.first());
		System.out.println("제일 높은 객체 = " + ts1.last());
		System.out.println("7 밑에 있는 객체 = " + ts1.lower(7));
		System.out.println("2 위에 있는 객체 = " + ts1.higher(2));
	
		//p.665 참고하여 프로그램 작성해보기
		
		System.out.println("입력한게 객체에 있으면 출력, 없으면 밑의 객체 출력 = " + ts1.floor(3));
		System.out.println("입력한게 객체에 있으면 출력, 없으면 위의 객체 출력 = " + ts1.ceiling(3));
		System.out.println("제일 낮은 객체 꺼내오고 컬렉션에서 제거 = " + ts1.pollFirst());
		System.out.println("제일 높은 객체 꺼내오고 컬렉션에서 제거 = " + ts1.pollLast());
		System.out.println("내림차순으로 정렬된 Iterator를 리턴 = " + ts1.descendingIterator());
		System.out.println("내림차순으로 정렬된 NavigableSet을 리턴 = " + ts1.descendingSet());
		System.out.println("트리의 노드 갯수 = " + ts1.size());

		//모든 노드를 다 출력하기
		Iterator<Integer> it = ts1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("전체를 출력하기");
		for(Integer i : ts1) {
			System.out.println(i);
		}
		
		//내림차순으로 정렬된 Iterator 리턴
		System.out.println("내림차순으로 정렬된=====");
		Iterator<Integer> dit = ts1.descendingIterator();
		while(dit.hasNext()) {
			System.out.println(dit.next());
		}
		
		//NavigableSet으로 정렬된
		System.out.println("NavigableSet으로 정렬된=====");
		NavigableSet<Integer> ns = ts1.descendingSet();
		for(Integer n : ns) {
			System.out.println(n);
		}
		System.out.println("변수 이름으로 저장해서 사용해보기 - 최재환님 아이디어");
		System.out.println(ts1.first());
		System.out.println(ts1.floor(3));
		
		System.out.println("8보다 적은 노드들=====");
		SortedSet<Integer> ss = ts1.headSet(8);
		for(Integer s : ss) {
			System.out.println(s);
		}
		System.out.println("4보다 높은 노드들=====");
		SortedSet<Integer> ss2 = ts1.tailSet(4,false);
		for(Integer s : ss2) {
			System.out.println(s);
		}
		System.out.println("4이상 7이하 노드들=====");
		SortedSet<Integer> ss3 = ts1.subSet(4,true, 7, true);
		for(Integer s : ss3) {
			System.out.println(s);
		}
	}
}
