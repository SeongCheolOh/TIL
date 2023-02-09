package javaHeight01.p640;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx01 {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		
		List list1 = new ArrayList();
		
		int[]n1 = new int[3];
		//숫자 3개를 넣었는데 숫자 2개 더 넣어주어야 함
		//방법1) 배열5개 생성 후 붙여넣기
		//배열의 단점은 추가하거나 중간에 빈 경우에도 유지가 됨, 메모리 효율이 떨어진다
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("a");
		list1.add(10);
		
		System.out.println(list1.get(3));
		System.out.println("들어있는 개수는 " + list1.size());
		//"k"라는 자료는 있나요? >> 없습니다
		
		if(list1.contains("k"))System.out.println("있습니다");
		else System.out.println("없습니다");
	}

}
