package comparator;

import java.util.TreeSet;

public class FruitMain {

	public static void main(String[] args) {
		TreeSet<Fruit> fruitTs = new TreeSet<Fruit>(new FruitComparator());
		
		fruitTs.add(new Fruit("포도", 3000));
		fruitTs.add(new Fruit("수박", 18000));
		fruitTs.add(new Fruit("딸기", 6000));
		fruitTs.add(new Fruit("배", 3000));
		fruitTs.add(new Fruit("샤인머스캣", 8000));
		
		System.out.println(fruitTs.size());
		
		//이름으로 비교하기
		
		

	}

}
