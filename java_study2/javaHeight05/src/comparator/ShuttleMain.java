package comparator;

import java.util.TreeSet;

public class ShuttleMain {

	public static void main(String[] args) {
		TreeSet<Shuttle> shuttleTS = new TreeSet<Shuttle>(new ShuttleComparator());
		
		shuttleTS.add(new Shuttle("경복궁", 6));
		shuttleTS.add(new Shuttle("광화문", 3));
		shuttleTS.add(new Shuttle("청계천", 4));
		shuttleTS.add(new Shuttle("인사동", 5));
		

	}

}
