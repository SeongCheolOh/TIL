package ch05.sec03;

public class RefVarCompareEx {

	public static void main(String[] args) {
		// 참조타입 변수의 == , != 연산
		// 참조타입 변수에는 객체의 번지가 저장된다
		// 따라서 비교연산에는 객체 번지가 같은지 다른지를 비교하게 된다
		
		int[]arr1 = new int[] {1,2,3};
		int[]arr2 = new int[] {1,2,3};
		int[]arr3 = arr2;
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
		

	}

}
