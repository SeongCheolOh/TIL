package ch05.sec06;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// 배열 길이
		// 배열변수.length; >> 그 배열의 길이
		// 배열의 length 필드는 읽기만 가능하므로 다음과 같이 값을 변경할 수 없다
		// intArray.length = 10; >> length의 값을 10으로 바꿔라 >> 컴파일 에러
		
		//배열 변수 선언과 배열 대입
		int[] scores = {84,90,96};
		
		//배열 항목의 총 합 구하기
		int sum = 0;
		for(int i = 0; i<scores.length; i++) {
			sum = sum+ scores[i];
		}
		System.out.println(sum);

		//평균 구하기
		int avg = sum/scores.length;
		System.out.println(avg);
		
		
	}//end main

}//end class
