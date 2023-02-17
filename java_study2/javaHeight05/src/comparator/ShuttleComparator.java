package comparator;

import java.util.Comparator;

public class ShuttleComparator implements Comparator<Shuttle>{

	@Override
	public int compare(Shuttle o1, Shuttle o2) {
		System.out.println(o1.getPlace());
		System.out.println(o2.getPlace());
		System.out.println(o1.getPlace().compareTo(o2.getPlace()));
		
		return o1.getStation().compareTo(o2.getStation());
	}
	
	

}
