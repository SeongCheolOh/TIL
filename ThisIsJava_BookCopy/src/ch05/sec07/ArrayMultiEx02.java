package ch05.sec07;

public class ArrayMultiEx02 {
	public static void main(String[] args) {
		// �� �迭 �� �ε��� ������ ������ ��
		int[][] mathScore = new int[2][3];
		for(int i = 0; i < mathScore.length; i++) {
			for(int k = 0; k < mathScore[i].length; k++) {
				System.out.print(mathScore[i][k]+" ");
			}
		}System.out.println();
		//�� ����
		mathScore[0][0] = 80;
		mathScore[0][1] = 83;
		mathScore[0][2] = 85;
		mathScore[1][0] = 86;
		mathScore[1][1] = 90;
		mathScore[1][2] = 92;
		//���
		int cnt = 0;
		int sum = 0;
		for(int i = 0; i < mathScore.length; i++) {
			for(int k = 0; k < mathScore[i].length; k++) {
				sum += mathScore[i][k];
				cnt++;
			}
		}System.out.println((double)sum/cnt);
		
		//�� �迭 �� �ε��� ������ �ٸ� ���� �� �迭���� �ε����� ���� ��������� �Ѵ�
		int[][]engScore = new int [2][];
		engScore[0] = new int[2];
		engScore[1] = new int[3];
		engScore[0][0] = 90;
		engScore[0][1] = 91;
		engScore[1][0] = 92;
		engScore[1][1] = 93;
		engScore[1][2] = 94;
		cnt = 0;
		sum = 0;
		for(int i = 0; i < engScore.length; i++) {
			for(int k = 0; k < engScore[i].length; k++) {
				sum += engScore[i][k];
				cnt++;
			}
		}System.out.println((double)sum/cnt);
		
	}

}
