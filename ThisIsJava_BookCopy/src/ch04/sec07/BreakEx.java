package ch04.sec07;

public class BreakEx {

	public static void main(String[] args) {

		//break����
		//�ݺ����� for, while, do-while���� �����ϰų�
		//���ǹ��� switch�� ������ �� ����Ѵ�
		int num;
		System.out.println("�� ���α׷��� ���� 6�� ���� �� ���� �ݺ��˴ϴ�");
		while(true) {
			num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}System.out.println("����");
		
		//���� ���� �ݺ����ϰ��, ���� ����� �ݺ����� ������Ų��
		//������ ��ġ���� �����Ű����
		//�ش��ϴ� �κ��� �ݺ��� �տ� '�̸�:' �� ���̰�, break�ڿ� '�̸�;' �� ����ϸ� �ȴ�
		Outter : for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}System.out.println("����");
	}

}
