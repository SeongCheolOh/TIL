package ch05.sec06;

public class ArrayEx {

	public static void main(String[] args) {
		// �迭 ���� ���� ������ �迭 ����
		String[] season = {"Spring","Summer","Fall","Winter"};
		
		//�迭�� �׸� �� �б�
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		//1�� �ε��� �� ����
		season[1] = "����";
		System.out.println(season[1]+"\n");
		
		//�迭 ���� ����� �迭 ����
		int[] scores = {83,90,87};
		
		//���� , ���
		int sum = 0;
		for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}System.out.println(sum);
		System.out.println((double)sum/scores.length+"\n");
		
		//�迭 ���� ����
		int score[];
		//������ �迭 ����
		sum=0;
		score = new int[] {93,90,87,88,75,97,88};
		//����, ���
		for(int i = 0; i<score.length; i++) {
			sum += score[i];
		}System.out.println(sum);
		System.out.println((double)sum/score.length+"\n");
		
		//�迭�� �Ű������� �ְ�, printItem() �޼ҵ� ȣ��
		printItem(new int[] {11,84,84,22,75,97});
		

	}//end main
	public static void printItem(int[]score) {
		for(int i = 0; i<score.length; i++) {
			System.out.print(score[i]+" ");
		}
	}

}//end class
