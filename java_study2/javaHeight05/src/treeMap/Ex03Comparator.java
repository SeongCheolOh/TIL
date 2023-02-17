package treeMap;

import java.util.Comparator;

public class Ex03Comparator implements Comparator<Ex03Key>{

	@Override
	public int compare(Ex03Key o1, Ex03Key o2) {
		// TODO Auto-generated method stub
		return o1.get家加().compareTo(o2.get家加());
	}

}
