package checkEx;

import java.util.Comparator;

public class Ex10class2Comparator implements Comparator<Ex10class2>{

	@Override
	public int compare(Ex10class2 o1, Ex10class2 o2) {
		
		return o2.getId().compareTo(o1.getId());
	}

}
