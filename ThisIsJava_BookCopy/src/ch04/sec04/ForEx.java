package ch04.sec04;

public class ForEx {

	public static void main(String[] args) {
		//1���� 10���� �� �ٷ� ���
		for(int i = 1; i<=10; i++) {
			System.out.print(i+" ");
		}System.out.println();
		
		//1���� 100���� ��
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum += i;
		}System.out.println(sum);
		
		//floatŸ���� �ε��Ҽ������� �� ���� ��Ȯ�� ǥ���� �� ���⶧����
		//����ϸ� �� �ȴ�
		for(float i = 0.1f; i<=1.0f; i+=0.1f) {
			System.out.println(i);
		}//���� ��Ȯ�ϰ� ������ �ʴ´�
		
		//2��for��
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}

}
