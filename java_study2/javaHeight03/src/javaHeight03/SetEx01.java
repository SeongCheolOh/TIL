package javaHeight03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Double> set1 = new HashSet<Double>();
		
		set1.add(1.1);
		set1.add(2.2);
		set1.add(3.3);
		
		Iterator<Double> it = set1.iterator();
		while(it.hasNext()) {
			Double number=it.next();
			System.out.println(number);
		}
		
		System.out.println("ũ��� ? " + set1.size());
		set1.remove(4.4);
		System.out.println("���� ��");
		it = set1.iterator();
		while(it.hasNext()) {
			Double numberDouble = it.next();
			System.out.println(it.next());
		}
	}

}
