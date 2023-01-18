package ch05.sec06;

public class ArrayCreatByValueListExample1 {

	public static void main(String[] args) {
		// 배열 변수
		
		//배열변수 선언과 배열 생성
		String[] season = {"Spring","Summer","Fall","Winter"};
		
		//배열의 항목값 읽기
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		//인덱스 1번 항목의 값 변경
		season[1]="여름";
		System.out.println(season[1]);
		System.out.println();
		
		//배열 변수 선언과 배열 생성
		int[] scores = {83, 90, 87};
		
		//총 합과 평균 구하기
		int sum=0;
		for(int i=0; i<scores.length; i++) {
			sum=sum+scores[i];
		}
		double avg= sum/(double)scores.length;
		System.out.println(sum);//합
		System.out.println(avg);//평균
		
		

	}

}
