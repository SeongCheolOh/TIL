package ch05.sec10;

public class ArrayUpgradeForEx {

	public static void main(String[] args) {
		// 향상된 for문을 활용한 배열 항목 반복
		
		int[]scores = {95, 71, 84, 93, 87};
		int sum = 0;
		for(int score: scores) {
			//for(타입 변수 : 배열){실행문}
			//배열에서 가져올 항목이 존재하면
			//변수에 항목을 저장하고, 실행문을 실행
			//배열 인덱스만큼 반복합니다
			sum += score;
		}System.out.println(sum);
		System.out.println((double)sum/scores.length);

	}

}
