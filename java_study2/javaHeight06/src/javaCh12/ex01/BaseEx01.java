package javaCh12.ex01;

import java.io.IOException;

public class BaseEx01 {

	public static void main(String[] args) throws IOException {
		
		try {//����ó��
			System.out.println("����� ����");
			System.err.println("�������� ���������� ���");
			int value = Integer.parseInt(/*"1oo" */"100");
			System.out.println(value);
			
			while(true) {
			
			int readData = System.in.read();
			System.out.println(readData);
			if(readData==78 || readData==110) {
				System.out.println("���μ��� ����");
				System.exit(0);
			}			
			System.out.println("����� ����");
			
			}
		}catch(NumberFormatException e) {
			System.err.println(e.getMessage());	
		}
	
	}

}
