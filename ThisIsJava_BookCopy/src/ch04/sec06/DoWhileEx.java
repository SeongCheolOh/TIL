package ch04.sec06;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// �Ϲ����� while������ ���ǹ��� ���� {}�� ����������
		// ��쿡 ���� do�� ���� {}�� ���� ���� ��
		// while(���ǹ�)�� �Ǻ��� �ݺ����� �׸����� �����ϱ⵵ �Ѵ�
		
		System.out.println("�޼��� �Է�");
		System.out.println("(���Ḧ ���Ͻø� q�� �Է�)");
		Scanner sc = new Scanner(System.in);
		String input;
		do {
			System.out.print(">");
			input = sc.next();
			System.out.println(input);
		}while(!input.equals("q"));
		System.out.println("����");

	}

}
