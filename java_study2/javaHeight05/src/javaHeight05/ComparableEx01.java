package javaHeight05;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx01 {

	public static void main(String[] args) {
		
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("ȫ�浿", 45));
		ts.add(new Person("����", 25));
		ts.add(new Person("������", 31));
		ts.add(new Person("������", 33));
		ts.add(new Person("��ä��", 32));
		
		Iterator<Person> it = ts.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName() + " - " + p.getAge());
		}
		
		TreeSet<Person> ts1 = new TreeSet<Person>();
		ts1.add(new Person("ȫ�浿", 45,1.1));
		ts1.add(new Person("����" , 25,2.2));
		ts1.add(new Person("������", 31,3.3));
		ts1.add(new Person("������", 33,0.0));
		ts1.add(new Person("��ä��", 32,7.8));
		
		it = ts1.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getScore());
		}
	}

}
