package javaCh17.sec07;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{
	
	@Override
	public int compare(Person o1, Person o2) {
		// 급여순을 정렬의 기준으로
	//	return (int) (o1.getPay() - o2.getPay());
		return (int) (o2.getPay() - o1.getPay());
	}

}
