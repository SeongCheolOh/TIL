package javaCh12.ex05;

import java.text.DecimalFormat;

public class DecimalFormatClass {

	public static void main(String[] args) {
		//p.542
		double i = 0.12345678901234567890123456789;
		double j = 10000;
		System.out.println(i);//�߰��� ¥���� �ݿø���
		
		//�Ҽ��� 3�ڸ������� ���̰� �ض�
		DecimalFormat df = new DecimalFormat("#.###"); // 0.000���� ��Ÿ����
		System.out.println(df.format(i));
		System.out.println(df.format(j)); // �����ڸ��� 1�ڸ��� ��Ÿ���°� �ƴϴ�

		DecimalFormat df1 = new DecimalFormat("#.456"); //#�� ǥ���ϰ�, �������� �����
		System.out.println(df1.format(i));
		System.out.println(df1.format(j));
	
		//��ȭ ��ȣ
		DecimalFormat df2 = new DecimalFormat("\u00A4 #,###");
		System.out.println(df2.format(j));
	}

}
