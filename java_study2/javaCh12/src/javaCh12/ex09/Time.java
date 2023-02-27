package javaCh12.ex09;

public class Time {

	public static void main(String[] args) {
		// 확인문제 8번
		//다음 전체 코드를 실행하는 데 걸린 시간을 구하는 코드를 작성하세요(단위 > 나노초)
		
		long startTime = System.nanoTime();
		int[]scores = new int[1000];
		for(int i = 0; i<scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}

		double avg = sum/scores.length;
		System.out.println(avg);

		long endTime = System.nanoTime();
		System.out.println("계산할 때 걸린 시간 : " + (endTime - startTime)/10000000+"초");
	}

}
