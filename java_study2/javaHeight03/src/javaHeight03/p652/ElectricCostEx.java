package javaHeight03.p652;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ElectricCostEx {

	public static void main(String[] args) {
		
		//ȣ�� �Է��ϸ� �����뷮�� ������ ����ϱ�
		Set<ElectricCost> ecSet = new HashSet<ElectricCost>();
		ecSet.add(new ElectricCost("502", 1, 423, 25000));
		ecSet.add(new ElectricCost("303", 7, 724, 35000));
		ecSet.add(new ElectricCost("403", 2, 222, 40000));
		ecSet.add(new ElectricCost("503", 2, 483, 25000));
		ecSet.add(new ElectricCost("503", 3, 171, 35000));
		
		System.out.println("set �ȿ� ����ִ� ��Ҵ� " + ecSet.size());
		System.out.println("---------------------");
		
		//��ü ���
		Iterator<ElectricCost> itEC= ecSet.iterator();
		while(itEC.hasNext()) {
			ElectricCost ecAddr = itEC.next();
			System.out.println(ecAddr.getȣ��()+" "+ecAddr.get������()+" "+ecAddr.get�����뷮()+" "+ecAddr.get�������());
		}System.out.println("---------------------");

		//�����뷮�� ���� ���� ������ ã�Ƽ� ȣ���� �������� ���
		int topRate = 0;
		itEC= ecSet.iterator();
		while(itEC.hasNext()) {
			ElectricCost ecAddr = itEC.next();
			if(topRate < ecAddr.get�����뷮()) {
				topRate = ecAddr.get�����뷮();
			System.out.println("���� �����뷮�� ���� ���� ȣ���� "+ecAddr.getȣ��()+", �������� "+ ecAddr.get������());
			}
		}System.out.println("---------------------");
		
		//��������� ���� ���� ���� ȣ���� ã�Ƽ� 500�� �߰�
		itEC= ecSet.iterator();
		int minCost = 99999999;
		while(itEC.hasNext()) {
			ElectricCost ecAddr = itEC.next();
			if(minCost > ecAddr.get�������()) {
				minCost = ecAddr.get�������();
			System.out.println("���� ��������� ���� ȣ���� "+ecAddr.getȣ��());
			}
				
		}System.out.println("---------------------");

		//�����뷮�� ���, ��������� ����� ���ؼ� ��ü ����� �� �Ʒ��κп� �߰�
		int ��������� = 0;
		int ���������� = 0;
		int �����뷮�� = 0;
		int �����뷮��� = 0;
		itEC= ecSet.iterator();
		while(itEC.hasNext()) {
			ElectricCost ecAddr = itEC.next();
			��������� += ecAddr.get�������();
			�����뷮�� += ecAddr.get�����뷮();
		}���������� = ���������/ecSet.size();
		�����뷮��� = �����뷮��/ecSet.size();
		System.out.println("������� �� ���� " + ��������� + "�� �Դϴ�");
		System.out.println("��� ��������� " + ���������� + "�� �Դϴ�");
		System.out.println("�����뷮 �� ���� " + �����뷮�� + " �Դϴ�");
		System.out.println("��� �����뷮�� " + �����뷮��� + " �Դϴ�");
		System.out.println("---------------------");
			
			
		//ȣ�� �Է��ϸ� �����뷮�� ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��Ͻ� ȣ���� �Է��ϼ��� > ");
		String ȣ�� = sc.next();
		itEC= ecSet.iterator();
		while(itEC.hasNext()) {
			ElectricCost ecAddr = itEC.next();
			if(ecAddr.getȣ��().equals(ȣ��)) {
				System.out.println(ȣ��+"�� �����뷮�� " +ecAddr.�����뷮+" �Դϴ�");
			}
		}
		
	}

}
