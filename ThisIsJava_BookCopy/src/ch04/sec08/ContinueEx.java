package ch04.sec08;

public class ContinueEx {

	public static void main(String[] args) {
		// �ݺ����� for, while, do-while���� ���Ǵµ�
		// continue �Ʒ��δ� ������ �� �ǰ� �ٷ� ���ǹ����� �ö󰣴�
		for(int i = 1; i<=10; i++) {
			if(i%2 !=0) {//i/2�� �������� 0�� �ƴ�, �� Ȧ���� ���
				continue;//���ǹ����� �ٷ� �ö󰣴�
			}System.out.println(i);
		}

	}

}
