package javaBasic2.ch05.day04;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 배열 Array 타입
		int[] a1;
		int a2[];
		
		//배열 안 값 넣기
		//1) 초기값으로 넣기
		int[] a3 = {1,2,3,4,5};
		System.out.println(a3[3]);//a3의 3열에 있는 항목 출력
		System.out.println(a3[0]);//a3의 0열에 있는 항목 출력
		
		for(int i=0; i<a3.length /* = i<5 */; i++) {//i=0~5
			System.out.print(a3[i] + " ");
		}//값이 많을때를 대비 >> for 활용 연습
		
		System.out.println();
		System.out.println("배열의 길이(크기)= " + a3.length);
		
		//향상된 for( 자료형 변수 : 배열명){}
		for(int a :a3 ) {//배열에 있는 원소들을 한개씩 거내어 자료형 변수에 넣는다
			System.out.print(a + " ");
		}System.out.println();
		
		//문)1.1, 3.3, 5.4, 10.3, 8.9, 11.23 // 배열에 넣기 10.3 - 3.3
		double[] a4 = {1.1, 3.3, 5.4, 10.3, 8.9, 11.23};
		System.out.println(a4[3] + " - " + a4[1]);
		
		for(double a : a4) {
			System.out.print(a + " ");
		}System.out.println();
		
		//문) true, false, false, true, true, false, false, true // 제일 끝의 true 출력
		boolean[] a5 = {true,false,true,true,false,false,true};
		System.out.println(a5[6]);
		
		for(boolean a : a5) {
			System.out.print(a+ " ");
		}System.out.println();
		
		//문) "돈까스", "김밥", "떡볶이", "피자" //김밥, 떡볶이 를 출력
		String[] a6 = {"돈까스","김밥","떡볶이","피자"};
		System.out.println(a6[1] + ", " + a6[2]);
		
		for(String d : a6) {
			System.out.print(d + ", ");
		}System.out.println();
		
		
		//2) 배열 생성 후 필요할 때 넣기

	}//end main

}//end class
