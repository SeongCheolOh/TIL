package checkEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex09 {

	public static void main(String[] args) {
		
		//�������, �ְ�����, �ְ������� ���� ���̵� ����ϵ��� �ڵ� �ۼ�
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; // �ְ� ���� �޴� ���̵� �����ϴ� ����
		int maxScore = 0; // �ְ� ������ �����ϴ� ����
		int totalScore = 0; // ���� �հ踦 �����ϴ� ����
		
		//���⿡ �ڵ� �ۼ�
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> es : entrySet) {
			totalScore += es.getValue();
			if(maxScore < es.getValue()) {
				maxScore = es.getValue();
				name = es.getKey();
			}
		}
		System.out.println("�ְ� ������ ���� ����� ���̵�� > " + name);
		System.out.println("��� ������ > " + (double)totalScore/map.size());
		System.out.println("�ְ� ������ > " + maxScore);
	}

}
