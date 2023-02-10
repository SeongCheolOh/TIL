package javaHeight02.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticeEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Practice> list = new ArrayList<Practice>();
		Practice prtc = new Practice(null, null, null, 0, 0, null);
		
		//�Է�
		list.add(new Practice("4/3", "BC103", "������", 230, 276000, "3470-1234"));
		list.add(new Practice("4/5", "BL203", "���ʱ�", 150, 180000, "3470-2200"));
		list.add(new Practice("4/8", "AC205", "���ı�", 270, 324000, "3470-3300"));
		list.add(new Practice("4/12", "DU103", "��걸", 350, 420000, "3709-4321"));
		
		//���
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println("-----------------");
			System.out.print(list.get(i).getDate());
			System.out.print(list.get(i).getCode());
			System.out.print(list.get(i).getArea());
			System.out.print(list.get(i).getSellCnt());
			System.out.print(list.get(i).getSaleAmout());
			System.out.println(list.get(i).getCallNum());
			System.out.println("=================");
		}
		
		//�ŷ�ó �ڵ带 �Է��ϸ� ���� ������ ����ó�� ����ϼ���
		System.out.print("ã���� �ŷ�ó�� �ڵ带 �Է��ϼ��� > ");
		String searchCode = sc.next();
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getCode().equals(searchCode)){
				System.out.print(list.get(i).getArea());
				System.out.println(list.get(i).getCallNum());
			}
		}System.out.println("==================");
	
		//������� ���� ���� �ŷ�ó �ڵ带 ����ϼ���
		int max = 0;
		int maxIndex = 0;//������� ���� ���� �ŷ�ó�� �ε��� �Է�
		for(int i = 0 ; i < list.size(); i++) {
				if(list.get(i).getSaleAmout() > max) {
					max = list.get(i).getSaleAmout();
					maxIndex = i;
			}
		}
		System.out.println("�ִ� ������ �߻���Ų "+ list.get(maxIndex).getCode() + "(��)�� " + max + "���� �Ǹ��Ͽ����ϴ� ");
		System.out.println("================");
		
		//������� ���� �������� ��������, �ŷ�ó �ڵ�, �Ǹŷ��� ����ϼ���
		int min = 999999999;
		int minIndex = 0;//������� ���� ���� �ŷ�ó�� �ε��� �Է�
		for(int i = 0 ; i < list.size(); i++) {
				if(list.get(i).getSaleAmout() < min) {
					min = list.get(i).getSaleAmout();
					minIndex = i;
			}
		}System.out.println("���� ������ ���� ��¥�� "+ list.get(minIndex).getDate());
		System.out.println("���� ������ ���� �ŷ�ó �ڵ�� "+ list.get(minIndex).getCode());
		System.out.println("���� ������ ���� �Ǹŷ��� "+ list.get(minIndex).getSellCnt());
		
	}

}
