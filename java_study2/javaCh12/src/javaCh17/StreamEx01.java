package javaCh17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {
		// p.723 ��Ʈ��
		
		Set<String> set = new HashSet<String>();
		set.add("ȫ�浿");
		set.add("�ſ��");
		set.add("���ڹ�");
		
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		// ��Ʈ�� Ư¡ : �����͸� �ֱ� �����ϸ� ���� ���� ������ �ִ´�
		// ������ �ܰ� �ڵ尡 �־�� ������ ����
		Stream<String> stream = set.stream(); 
		stream.forEach(name -> System.out.println(name));
	}

}
