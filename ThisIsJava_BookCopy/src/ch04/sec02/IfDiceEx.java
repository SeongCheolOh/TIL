package ch04.sec02;

public class IfDiceEx {

	public static void main(String[] args) {
	
		int num = (int)(Math.random()*6)+1;
		//math.random() >> 0.0�̻� 1.0�̸��� doubleŸ�� ������ ����
		//0.0 <= num < 6.0�ε� �� �׿� 1�� ���ؼ�
		//1.0 <= num < 7.0�� intȭ �ϸ�
		//����Ÿ�� 1�̻� 7�̸��̶�� ���� �ȴ� >> 1~6�� ����
		System.out.println(num);
		
		if(num==1) {
			System.out.println(num+"�� ���Խ��ϴ�");
		}else if(num==2) {
			System.out.println(num+"�� ���Խ��ϴ�");
		}else if(num==3) {
			System.out.println(num+"�� ���Խ��ϴ�");
		}else if(num==4) {
			System.out.println(num+"�� ���Խ��ϴ�");
		}else if(num==5) {
			System.out.println(num+"�� ���Խ��ϴ�");
		}else if(num==6) {
			System.out.println(num+"�� ���Խ��ϴ�");
		}

	}

}
