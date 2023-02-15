package javaHeight04.p659;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		Map<String, Data2> shopMap2 = new HashMap<String, Data2>();
		
		KeySet kS1 = new KeySet("������", new Data2("3�г� 1��", 30));
		KeySet kS2 = new KeySet("ȫ�浿", new Data2("2�г� 2��", 27));
		KeySet kS3 = new KeySet("�̼���", new Data2("1�г� 1��", 25));
		
		shopMap2.put(kS1.getTeacher(), kS1.getData2());
		shopMap2.put(kS2.getTeacher(), kS2.getData2());
		shopMap2.put(kS3.getTeacher(), kS3.getData2());
		
		Data2 kS1Addr = shopMap2.get(kS1.getTeacher());
		System.out.println("������ ������ > " + kS1.getTeacher());
		System.out.println("������ ��� �г�� > " + kS1Addr.getGradeClass());
		System.out.println("������ ��� �л��� > " + kS1Addr.getStudentCnt());
		
		Data2 kS2Addr = shopMap2.get(kS2.getTeacher());
		System.out.println("������ ������ > " + kS2.getTeacher());
		System.out.println("������ ��� �г�� > " + kS2Addr.getGradeClass());
		System.out.println("������ ��� �л��� > " + kS2Addr.getStudentCnt());
		
		//������ �̸��� ���
		Set<String> keys = shopMap2.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//�б� ������ �ο�����?
		System.out.println(shopMap2.size());
		
		//�����Ժ��� �б��ο� ����ϱ�
		it = keys.iterator();
		while(it.hasNext()) {
			String addr = it.next();
			shopMap2.get(addr);//value�� ��� ��
			Data2 kSValue = shopMap2.get(addr);
			System.out.println("������ �̸��� "+ addr);
			System.out.println("�г���� " + kSValue.getGradeClass());
			System.out.println("�л����� " + kSValue.getStudentCnt());
		}
	}

}
