package comparator;

import java.util.TreeSet;

public class ShuttleMain {

	public static void main(String[] args) {
		TreeSet<Shuttle> shuttleTS = new TreeSet<Shuttle>(new ShuttleComparator());
		
		shuttleTS.add(new Shuttle("�溹��", 6));
		shuttleTS.add(new Shuttle("��ȭ��", 3));
		shuttleTS.add(new Shuttle("û��õ", 4));
		shuttleTS.add(new Shuttle("�λ絿", 5));
		

	}

}
