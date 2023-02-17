package comparator;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		// o2 = 트리에 달려있는 자료의 주소 // o1 = 트리에 달고싶은 자료의 주소
		
		//과일 가격을 기준으로 트리에 달아줌
/*		System.out.println(o1.getPrice());
		System.out.println(o2.getPrice());
		System.out.println(o1.getPrice().compareTo(o2.getPrice())+ "이곳을 출력");
		System.out.println();
		return o1.getPrice().compareTo(o2.getPrice()); */
	
		//과일 이름을 기준으로 트리에 달아줌
		System.out.println(o1.getName());
		System.out.println(o2.getName());
		System.out.println(o1.getName().compareTo(o2.getName())+ "이곳을 출력");
		System.out.println();
		return o1.getName().compareTo(o2.getName());
	}

	
}
