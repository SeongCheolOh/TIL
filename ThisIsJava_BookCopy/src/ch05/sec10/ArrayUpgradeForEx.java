package ch05.sec10;

public class ArrayUpgradeForEx {

	public static void main(String[] args) {
		// ���� for���� Ȱ���� �迭 �׸� �ݺ�
		
		int[]scores = {95, 71, 84, 93, 87};
		int sum = 0;
		for(int score: scores) {
			//for(Ÿ�� ���� : �迭){���๮}
			//�迭���� ������ �׸��� �����ϸ�
			//������ �׸��� �����ϰ�, ���๮�� ����
			//�迭 �ε�����ŭ �ݺ��մϴ�
			sum += score;
		}System.out.println(sum);
		System.out.println((double)sum/scores.length);

	}

}
