package javaCh12.ex09;

public class Time {

	public static void main(String[] args) {
		// Ȯ�ι��� 8��
		//���� ��ü �ڵ带 �����ϴ� �� �ɸ� �ð��� ���ϴ� �ڵ带 �ۼ��ϼ���(���� > ������)
		
		long startTime = System.nanoTime();
		int[]scores = new int[1000];
		for(int i = 0; i<scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}

		double avg = sum/scores.length;
		System.out.println(avg);

		long endTime = System.nanoTime();
		System.out.println("����� �� �ɸ� �ð� : " + (endTime - startTime)/10000000+"��");
	}

}
