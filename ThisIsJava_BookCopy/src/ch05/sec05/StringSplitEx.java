package ch05.sec05;

public class StringSplitEx {
	public static void main(String[]args) {
		//���ڿ� �и�
		String board = "1,�ڹ� �н�,���� Ÿ�� String�� �н��մϴ�.,ȫ�浿";
		
		//����.split("�и�����");
		String[] tokens = board.split(",");
		
		System.out.println(tokens.length+"\n"); // ��� �߷ȳ� ����;
		System.out.println(tokens[0]);
		System.out.println(tokens[1]);
		System.out.println(tokens[2]);
		System.out.println(tokens[3]+"\n");
		
		//for���� �̿���
		for(int i = 0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
	}

}
