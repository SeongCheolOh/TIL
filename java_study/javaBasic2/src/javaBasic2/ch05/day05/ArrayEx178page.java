package javaBasic2.ch05.day05;

public class ArrayEx178page {

	public static void main(String[] args) {
		// p.178
		int[][] scores = { {80,90,96},{76,88} };
		//[89][90][96]
		//[76][88]
		
		System.out.println("배열의 길이 = " + scores.length); // 행의 갯수
		System.out.println("배열의 길이 0행의 열의 갯수 = " + scores[0].length); // 0행의 열의 갯수
		System.out.println("배열의 길이 1행의 열의 갯수 = " + scores[1].length); // 1행의 열의 갯수
		
		//96점을 찍어보자
		System.out.println(scores[0][2]);
		//88점을 찍어보자
		System.out.println(scores[1][1]);
		
		//1행의 평균을 구해보자
		int avg = 0;
		int sum = 0;
		for(int i = 0; i<scores[0].length; i++) {
			sum = sum + scores[0][i];
		}
		avg = sum / scores[0].length;
		System.out.println("1행의 평균 = " + avg);

		//2행의 평균을 구해보자
		int avg1 = 0;
		int sum1 = 0;
		for(int s :scores[1]) {
			sum1 = sum1 + s;
		}
		avg1 = sum1 / scores[1].length;
		System.out.println("2행의 평균 = " + avg1);
	}

}
