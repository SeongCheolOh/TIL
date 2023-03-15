package ch05.sec06;

public class ArrayNewEx {

	public static void main(String[] args) {
		// int 타입 배열 변수 선언과 배열 생성
		int[]arr1 = new int[3];
		// 초기값 출력
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}System.out.println();
		// 값 변경 후 출력
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = 10*(i+1);
			System.out.print(arr1[i]+" ");
		}System.out.println();
		
		// double 타입 배열 변수 선언과 배열 생성
		double[]arr2 = new double[3];
		// 초기값 출력
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}System.out.println();
		// 값 변경 후 출력
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = 0.1*(i+1);
			System.out.print(arr2[i]+" ");
		}System.out.println();
		
		// String 타입 배열 변수 선언과 배열 생성
		String[]arr3 = new String[3];
		// 초기값 출력
		for(int i = 0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}System.out.println();
		// 값 변경 후 출력
		for(int i = 0; i<arr3.length; i++) {
			arr3[i] = (i+1)+"월";
			System.out.print(arr3[i]+" ");
		}System.out.println();
	}

}
