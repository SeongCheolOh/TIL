package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr1;//배열 변수 arr1 선언
		int[]arr2;//		arr2 선언
		int[]arr3;//		arr3 선언
		
		arr1 = new int[] {1,2,3};//배열 {1,2,3}을 생성하고, arr1변수에 대입
		arr2 = new int[] {1,2,3};
		arr3=arr2;
		
		System.out.println(arr1==arr2);
		System.out.println(arr2==arr3);

	}

}
