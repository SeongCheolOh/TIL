package ch05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		// 다차원 배열
		
		//2차원 배열 생성
		int[][]scores = {
				{80,90,96},
				{76,88}
		};
		
		//배열의 길이
		System.out.println(scores.length);//2
		System.out.println(scores[0].length);//3
		System.out.println(scores[1].length);//2
		
		//첫번째 항목 세번째 인덱스 읽기
		System.out.println(scores[0][2]);//96
		//두번째 항목 두번째 인덱스 읽기
		System.out.println(scores[1][1]);//88
		//첫번째 항목의 평균점수
		int sum1 = 0;
		for(int i=0; i<scores[0].length; i++) {
			sum1 = sum1 + scores[0][i];
		}System.out.println(sum1); // 266
		//첫번째 항목의 평균점수
		double avg1 = sum1/(double)scores[0].length;
		System.out.println(avg1);// 
		
		//전체 합
		int totalSum = 0;
		int totalIndex = 0;
		for(int i = 0; i<scores.length; i++) {
			totalIndex = totalIndex + scores[i].length;
			for(int j = 0; j<scores[i].length; j++) {
				totalSum = totalSum + scores[i][j];
			}
		}
		System.out.println(totalSum);
		//전체 평균
		double totalAvg = totalSum/(double)totalIndex;
		System.out.println(totalAvg);
	
	}

}
