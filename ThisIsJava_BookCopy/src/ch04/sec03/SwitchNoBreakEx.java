package ch04.sec03;

public class SwitchNoBreakEx {

	public static void main(String[] args) {
		// case ���� break�� ������ ���� case�� ���޾� ����Ǵµ�
		// �� ���� case ������ ������� ����ȴ�
		
		int time = (int)(Math.random()*4)+8;
		System.out.println(time+"��");
		
		switch(time) {
		case 8:System.out.println("���");
		case 9:System.out.println("ȸ��");
		case 10:System.out.println("����");
		default :System.out.println("�ܱ�");
		}

	}

}
