package ch05.sec06;

public class ArrayLengthEx {

	public static void main(String[] args) {
		// �迭 ����
		int[] score = {84,90,97};
		
		// ��
		int sum = 0;
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
		}System.out.println(sum);
		// ���
		System.out.println((double)sum/score.length);

	}

}
