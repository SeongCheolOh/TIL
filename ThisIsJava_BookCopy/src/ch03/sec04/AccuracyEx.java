package ch03.sec04;

public class AccuracyEx {

	public static void main(String[] args) {
		// ��Ȯ�� ������ ���� Ÿ������
		// �Ǽ�Ÿ���� �� �߻��ϴ� ������ ������
		int apple = 1;
		double aPiece = 0.1;
		int eatPiece = 7;
		
		double result = apple-(aPiece*eatPiece);
		System.out.println(result); // ��Ȯ�ϰ� 0.3�� ��µ��� �ʴ´�
		System.out.println("-----------");
		
		int totalPiece = 10;
		int afterEat = totalPiece-eatPiece;
		System.out.println(afterEat);
		System.out.println((double)afterEat/totalPiece);

	}

}


























