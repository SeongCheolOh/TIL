package treeSet;

import java.util.TreeSet;

public class TreeSetEx03 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("과장");
		ts.add("사원");
		ts.add("사원");
		ts.add("대리");
		ts.add("대리");
		ts.add("사원");
		ts.add("과장");
		ts.add("부장");
		
		System.out.print("오름차순 정렬 = ");
		System.out.print(ts);
		System.out.println();
		
		System.out.print("내림차순 정렬 = ");
		System.out.println(ts.descendingSet());
		System.out.println();
		
		System.out.print("직급의 갯수는? = ");
		System.out.println(ts.size());
		System.out.println();
		
		System.out.print("부장 바로 아래는? = ");
		System.out.println(ts.lower("부장"));
		System.out.println();
		
		System.out.print("대리 바로 위는? = ");
		System.out.println(ts.higher("대리"));
		System.out.println();
	}

}
