package ch02.sec12;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// Ű���� �Է� �����͸� ������ ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x�� �Է� > ");
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y�� �Է� > ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);

		System.out.println(x+y);
		System.out.println();
		
		while(true) {//�ݺ���
			System.out.print("�Է� ���ڿ� : ");
			String data = sc.nextLine();
			if(data.equals("q")) {
				System.out.println("�����մϴ�");
				break;//�Էµ� ���� q��� while�� ����
			}
			System.out.println("��� ���ڿ� : " + data);
			System.out.println("�ݺ��մϴ�");
		}

	}

}
