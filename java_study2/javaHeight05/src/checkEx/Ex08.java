package checkEx;

import java.util.HashSet;
import java.util.Set;

public class Ex08 {
	
	public static void main(String[] args) {
		
		//�й��� ������ ������ �л��̶� �����ϰ� �ߺ� ���� �����ʰԲ� class�� ����
		
		Set<Ex08Class> set = new HashSet<Ex08Class>();
		
		set.add(new Ex08Class(1, "ȫ�浿"));
		set.add(new Ex08Class(2, "�ſ��"));
		set.add(new Ex08Class(1, "���ο�"));
		
		System.out.println("����� ��ü �� : " + set.size());
		for(Ex08Class ex : set) {
			System.out.println(ex.studentNum + " : " + ex.name);
		}
	}

}
