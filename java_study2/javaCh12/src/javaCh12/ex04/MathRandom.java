package javaCh12.ex04;

import java.util.Arrays;
import java.util.Random;

public class MathRandom {

	public static void main(String[] args) {
		//p.531 ����Ŭ���� - ����
		int[] selectNum = new int[6];
		Random random = new Random(3);
		System.out.print("���� ��ȣ : ");
		
		//���� ��ȣ
		for(int i = 0; i<selectNum.length; i++) {
			selectNum[i] = random.nextInt(45)+1;
			System.out.print(selectNum[i] + " ");
		}System.out.println();
		
		//��÷ ��ȣ
		int[] winningNum = new int[6];
		random = new Random(5);
		System.out.print("��÷ ��ȣ : ");
		for(int i = 0; i<selectNum.length; i++) {
			winningNum[i] = random.nextInt(45)+1;
			System.out.print(winningNum[i] + " ");
		}System.out.println();
		
		//��÷ ����
		Arrays.sort(selectNum);//�迭 ����
		Arrays.sort(winningNum);//�迭 ����
		System.out.println("============������");
		for(int i = 0; i<selectNum.length; i++) {
			System.out.print(selectNum[i] + " ");
		}System.out.println();
		for(int i = 0; i<selectNum.length; i++) {
			System.out.print(winningNum[i] + " ");
		}System.out.println();
		
		boolean result = Arrays.equals(selectNum, winningNum);
		System.out.println("��÷���� : ");
		if(result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�");
		}else {
			System.out.println("��÷���� �ʾҽ��ϴ�");
		}
	}

}
