package ch05.sec09;

public class ArrayCopyEx {

	public static void main(String[] args) {
		// 배열 복사
		//길이 3인 배열
		int[]arr1 = {1,2,3};
		
		// 길이 5인 배열을 새로 생성
		int[]arr2 = new int[5];
		
		//배열 항목 복사
		for(int i = 0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// 배열 항목 출력
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}System.out.println();
		
		// 좀 더 간단한 방법
		String[]arr3 = {"java", "array", "copy"};
		String[]arr4 = new String[5];
		//복사
		System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		//(복사 할 배열, 시작인덱스, 복사 받을 배열, 시작 인덱스, 복사 할 인덱스 수);
		for(int i = 0; i<arr4.length; i++) {
			System.out.print(arr4[i]+" ");
		}
		

	}

}
