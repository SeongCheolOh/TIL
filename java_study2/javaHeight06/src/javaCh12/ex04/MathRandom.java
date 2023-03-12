package javaCh12.ex04;

import java.util.Arrays;
import java.util.Random;

public class MathRandom {

	public static void main(String[] args) {
		//p.531 수학클래스 - 랜덤
		int[] selectNum = new int[6];
		Random random = new Random(3);
		System.out.print("선택 번호 : ");
		
		//선택 번호
		for(int i = 0; i<selectNum.length; i++) {
			selectNum[i] = random.nextInt(45)+1;
			System.out.print(selectNum[i] + " ");
		}System.out.println();
		
		//당첨 번호
		int[] winningNum = new int[6];
		random = new Random(5);
		System.out.print("당첨 번호 : ");
		for(int i = 0; i<selectNum.length; i++) {
			winningNum[i] = random.nextInt(45)+1;
			System.out.print(winningNum[i] + " ");
		}System.out.println();
		
		//당첨 여부
		Arrays.sort(selectNum);//배열 정렬
		Arrays.sort(winningNum);//배열 정렬
		System.out.println("============정렬후");
		for(int i = 0; i<selectNum.length; i++) {
			System.out.print(selectNum[i] + " ");
		}System.out.println();
		for(int i = 0; i<selectNum.length; i++) {
			System.out.print(winningNum[i] + " ");
		}System.out.println();
		
		boolean result = Arrays.equals(selectNum, winningNum);
		System.out.println("당첨여부 : ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다");
		}else {
			System.out.println("당첨되지 않았습니다");
		}
	}

}
