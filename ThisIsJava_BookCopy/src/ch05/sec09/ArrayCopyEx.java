package ch05.sec09;

public class ArrayCopyEx {

	public static void main(String[] args) {
		// �迭 ����
		//���� 3�� �迭
		int[]arr1 = {1,2,3};
		
		// ���� 5�� �迭�� ���� ����
		int[]arr2 = new int[5];
		
		//�迭 �׸� ����
		for(int i = 0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// �迭 �׸� ���
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}System.out.println();
		
		// �� �� ������ ���
		String[]arr3 = {"java", "array", "copy"};
		String[]arr4 = new String[5];
		//����
		System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		//(���� �� �迭, �����ε���, ���� ���� �迭, ���� �ε���, ���� �� �ε��� ��);
		for(int i = 0; i<arr4.length; i++) {
			System.out.print(arr4[i]+" ");
		}
		

	}

}
