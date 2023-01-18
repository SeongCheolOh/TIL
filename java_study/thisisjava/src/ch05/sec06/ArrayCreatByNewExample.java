package ch05.sec06;

public class ArrayCreatByNewExample {

	public static void main(String[] args) {
		// new연산자로 배열 생성 (배열 항목을 기본값으로 초기화한 배열 생성)
		
		//int[] arr = new int[5];    >> [0][0][0][0][0]
		//String[] arr1 = new String[5];   >>  [null][null][null][null]
		//boolean[] arr2 = new boolean[5];    >>  [false][false][false][false][false]

		//배열 변수 선언과 배열 생성
		int[] arr1 = new int[3];
		//배열 항목의 초기값 출력
		for(int i = 0 ; i<arr1.length; i++) {
			System.out.print("arr1["+i+"]=" + arr1[i] + ", ");
		}
		System.out.println();
		
		//배열 항목의 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		//배열 항목의 변경값 출력
		for(int i = 0 ; i<arr1.length; i++) {
			System.out.print("arr1["+i+"]=" + arr1[i]+", ");
		}
		System.out.println("\n");
		
		//배열 변수 선언과 배열 생성
		double[]arr2 = new double[3];
		//배열 항목의 초기값 출력
		for(int i = 0; i<arr2.length; i++) {
			System.out.println("arr2의 값은 >>" + arr2[i]);
		}
		System.out.println();
		
		//배열 항목의 값 변경
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		//배열 항목의 변경값 출력
		for(int i = 0; i<arr2.length; i++) {
			System.out.println("arr2의 값은 >>" + arr2[i]);
		}
		System.out.println();
		
		//배열 변수 선언과 배열 생성
		String[]arr3 = new String[3];
		//배열 항목의 초기값 출력
		for(int i = 0; i<arr3.length; i++) {
			System.out.println("arr3의 값은 >>" + arr3[i]);
		}
		System.out.println();
		//배열 항목의 값 변경
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		//출력
		for(int i = 0; i<arr3.length; i++) {
			System.out.println("arr3의 값은 >>" + arr3[i]);
		}
		System.out.println();
	}//end main

}//end class
