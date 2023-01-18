package ch05.sec06;

public class ArrayCreatByValueListExample2 {

	public static void main(String[] args) {
		// 타입[]변수;를 선언 하고
		// 변수 = {~~~}; 대입하면 컴파일 에러가 나온다
		
		// 타입[]변수 = null;
		// 변수 = new[]타입{~~~};은 가능하다

		
		//배열 변수 선언
		int[] score;
		//배열 변수에 배열을 대입
		score = new int[] {83,90,97};
		//배열 항목의 총 합을 구하고 출력
		int sum = 0;
		for(int i = 0; i<score.length; i++) {
			sum = sum+score[i];
		}
		System.out.println(sum);
		
		
	
	}

}
