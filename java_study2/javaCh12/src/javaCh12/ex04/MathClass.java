package javaCh12.ex04;

import java.util.Random;

public class MathClass {

	public static void main(String[] args) {
		//p.528 ���� Ŭ����
		double v1 = Math.ceil(5.3);
		double v2 = Math.PI;
		System.out.println(v1+", "+v2);
		
		double v3 = Math.max(1.1, 2.2);// 2�� �� ū ��
		System.out.println(v3);
		System.out.println(Math.random());//��������
		double v4 = Math.round(v3);//�ݿø�
		System.out.println(v4);
		
		
		//����(��Ģ�� ���� ����)�� ��� �� - ����Ʈ���� Ű, ��й�ȣ ��ȣȭ/��ȣȭ
		//1) math.random()
		//2) util - random Ŭ���� �̿�
		Random rd = new Random();
		System.out.println(rd.nextBoolean());//true �Ǵ� false�� ���� ���
		System.out.println(rd.nextLong());//Long ������ �������� ���
		System.out.println(rd.nextInt(10));//10����(���ڰ�)
	}

}
