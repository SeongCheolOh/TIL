package ch05.sec07;

public class ArrayMultiEx01 {

	public static void main(String[] args) {
		// 다차원 배열
		
		int[][]score = {
				{80,90,96},
				{76,88}
		};
		
		//배열의 길이
		System.out.println(score.length);
		System.out.println(score[0].length+" "+score[1].length);
		
		//인덱스 0-2, 1-1 값 읽기
		System.out.println(score[0][2]+" "+score[1][1]);

		//인덱스 0의 평균
		int sum = 0;
		for(int i = 0; i<score[0].length; i++) {
			sum += score[0][i];
		}
		System.out.println((double)sum/score[0].length);
		
		//인덱스 1의 평균
		sum = 0;
		for(int i = 0; i<score[1].length; i++) {
			sum += score[1][i];
		}
		System.out.println((double)sum/score[1].length);
		
		//전체 학생의 평균
		int cnt = 0;
		sum = 0;
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j<score[i].length; j++) {
				sum += score[i][j];
				cnt++;
			}
		}System.out.println((double)sum/cnt);
			
	}

}
