package checkEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex09 {

	public static void main(String[] args) {
		
		//평균점수, 최고점수, 최고점수를 받은 아이디를 출려하도록 코드 작성
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; // 최고 점수 받는 아이디를 저장하는 변수
		int maxScore = 0; // 최고 점수를 저장하는 변수
		int totalScore = 0; // 점수 합계를 저장하는 변수
		
		//여기에 코드 작성
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> es : entrySet) {
			totalScore += es.getValue();
			if(maxScore < es.getValue()) {
				maxScore = es.getValue();
				name = es.getKey();
			}
		}
		System.out.println("최고 점수를 받은 사람의 아이디는 > " + name);
		System.out.println("평균 점수는 > " + (double)totalScore/map.size());
		System.out.println("최고 점수는 > " + maxScore);
	}

}
