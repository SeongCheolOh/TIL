package ch06.sec08;

public class MethodOverloadingEx {

	public static void main(String[] args) {
		// p.241
		
		MethodOverloading m1 = new MethodOverloading();
		//�Ű����� 1��, 2���� �ٸ��� �־�
		//���簢���� ���簢���� ���̸� ���� ���غ���
		System.out.println(m1.areaRectangle(4));
		System.out.println(m1.areaRectangle(7, 4));

	}

}
