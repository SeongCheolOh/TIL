package ch05.sec06;

public class ArrayNewEx {

	public static void main(String[] args) {
		// int Ÿ�� �迭 ���� ����� �迭 ����
		int[]arr1 = new int[3];
		// �ʱⰪ ���
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}System.out.println();
		// �� ���� �� ���
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = 10*(i+1);
			System.out.print(arr1[i]+" ");
		}System.out.println();
		
		// double Ÿ�� �迭 ���� ����� �迭 ����
		double[]arr2 = new double[3];
		// �ʱⰪ ���
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}System.out.println();
		// �� ���� �� ���
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = 0.1*(i+1);
			System.out.print(arr2[i]+" ");
		}System.out.println();
		
		// String Ÿ�� �迭 ���� ����� �迭 ����
		String[]arr3 = new String[3];
		// �ʱⰪ ���
		for(int i = 0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}System.out.println();
		// �� ���� �� ���
		for(int i = 0; i<arr3.length; i++) {
			arr3[i] = (i+1)+"��";
			System.out.print(arr3[i]+" ");
		}System.out.println();
	}

}
