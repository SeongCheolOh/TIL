package ideaTest;

import java.time.LocalDateTime;
import java.util.Date;

public class DateEx {
	
	public static void main(String[]args) {
		//���� �ڱⰡ ���� �޿� ��¥��ŭ �迭�� �����ϰ�
		//�⼮�� �� ���� �� ���� �ε������� 1�� �����Ϸ��� �Ѵ�
		LocalDateTime now = LocalDateTime.now();
		Date date = new Date();
		int monthSize = now.getDayOfMonth();
		System.out.println(monthSize);//�ش��ϴ� ���� �� ����
		System.out.println(date.getDate());
		
		int[] attPer = new int[monthSize];//���� ��¥��ŭ �迭 ���� >> �⺻���� 0
		//if(xxx�� �⼮������){
		//	a��° �ε����� ���� 1�� ����
		
		System.out.println(attPer.length);
		
	//	for(int i = 0; i<a; i++) {}
	}//end main

}//end class

class ListEx{
	
	
	
}
