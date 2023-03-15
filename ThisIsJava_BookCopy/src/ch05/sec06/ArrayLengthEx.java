package ch05.sec06;

public class ArrayLengthEx {

	public static void main(String[] args) {
		// 배열 길이
		int[] score = {84,90,97};
		
		// 합
		int sum = 0;
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
		}System.out.println(sum);
		// 평균
		System.out.println((double)sum/score.length);

	}

}
