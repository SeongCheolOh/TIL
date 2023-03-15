package ch05.sec06;

public class ArrayEx {

	public static void main(String[] args) {
		// 배열 변수 선언 과정과 배열 생성
		String[] season = {"Spring","Summer","Fall","Winter"};
		
		//배열의 항목 값 읽기
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		//1번 인덱스 값 변경
		season[1] = "여름";
		System.out.println(season[1]+"\n");
		
		//배열 변수 선언과 배열 생성
		int[] scores = {83,90,87};
		
		//총합 , 평균
		int sum = 0;
		for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}System.out.println(sum);
		System.out.println((double)sum/scores.length+"\n");
		
		//배열 변수 선언
		int score[];
		//변수에 배열 대입
		sum=0;
		score = new int[] {93,90,87,88,75,97,88};
		//총합, 평균
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
		}System.out.println(sum);
		System.out.println((double)sum/score.length+"\n");
		
		//배열을 매개값으로 주고, printItem() 메소드 호출
		printItem(new int[] {11,84,84,22,75,97});
		

	}//end main
	public static void printItem(int[]score) {
		for(int i = 0; i<score.length; i++) {
			System.out.print(score[i]+" ");
		}
	}

}//end class
