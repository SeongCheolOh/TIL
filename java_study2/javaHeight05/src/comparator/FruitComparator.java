package comparator;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		
		// o2 = Ʈ���� �޷��ִ� �ڷ��� �ּ� // o1 = Ʈ���� �ް����� �ڷ��� �ּ�
		
		//���� ������ �������� Ʈ���� �޾���
/*		System.out.println(o1.getPrice());
		System.out.println(o2.getPrice());
		System.out.println(o1.getPrice().compareTo(o2.getPrice())+ "�̰��� ���");
		System.out.println();
		return o1.getPrice().compareTo(o2.getPrice()); */
	
		//���� �̸��� �������� Ʈ���� �޾���
		System.out.println(o1.getName());
		System.out.println(o2.getName());
		System.out.println(o1.getName().compareTo(o2.getName())+ "�̰��� ���");
		System.out.println();
		return o1.getName().compareTo(o2.getName());
	}

	
}