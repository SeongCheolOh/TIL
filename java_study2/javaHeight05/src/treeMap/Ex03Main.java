package treeMap;

import java.util.Set;
import java.util.TreeMap;

public class Ex03Main {

	public static void main(String[] args) {
		
		
		TreeMap<Ex03Key, Ex03Value> tm = new TreeMap<Ex03Key, Ex03Value>(new Ex03Comparator());

		tm.put(new Ex03Key("서울본부","강북영업"), new Ex03Value("서울본부", "백화점", 4460));
		tm.put(new Ex03Key("서울본부","강남영업"), new Ex03Value("서울본부", "쇼핑몰", 6860));
		tm.put(new Ex03Key("서울본부","강서영업"), new Ex03Value("서울본부", "백화점", 5560));
		tm.put(new Ex03Key("서울본부","강동영업"), new Ex03Value("서울본부", "쇼핑몰", 3560));
		
		//1) 영업부서 별 실적표 전체 출력
		Set<Ex03Key> a1 = tm.keySet();
		for( Ex03Key a : a1) {
			System.out.println(a.get부서명() + " " + a.get소속()+ " " + tm.get(a).get소속() +" "+ tm.get(a).get매장종류() +" "+ tm.get(a).get판매실적());
		}
		
		//2) 역순 출력
		
		//3) 강북영업을 입력하면 매장 위치와 소속을 출력하세요
		
		//4) 모든 영업소의 판매실적의 합계를 구하세요
		
		//5) 판매실적이 가장 높은 영업소를 출력하세요
		
	}

}
