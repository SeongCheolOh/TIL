package comparator;

import java.util.TreeSet;

public class FruitMain {

	public static void main(String[] args) {
		TreeSet<Fruit> fruitTs = new TreeSet<Fruit>(new FruitComparator());
		
		fruitTs.add(new Fruit("����", 3000));
		fruitTs.add(new Fruit("����", 18000));
		fruitTs.add(new Fruit("����", 6000));
		fruitTs.add(new Fruit("��", 3000));
		fruitTs.add(new Fruit("���θӽ�Ĺ", 8000));
		
		System.out.println(fruitTs.size());
		
		//�̸����� ���ϱ�
		
		

	}

}
