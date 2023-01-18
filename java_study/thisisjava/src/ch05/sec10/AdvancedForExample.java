package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
		// 향상된 for 문
		//배열 변수 선언과 배열 생성
		int[] scores = {95,71,84,93,87};
		//배열 전체 합 구하기
		int sum=0;
	/*	for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}System.out.println(sum); */
		
		for(int score : scores) {//scores의 5개의 항목이 한 번씩 score에 저장되고
			sum += score; // sum에 누적
		}

		//배열 항목 전체 평균 구하기
		double avg = (double)sum/scores.length;
		System.out.println(avg);
	}

}
