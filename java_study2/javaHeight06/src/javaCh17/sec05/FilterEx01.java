package javaCh17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilterEx01 {

	public static void main(String[] args) {
		// p.736
		
		// List �÷��� ����
		List<String> list = new ArrayList<>();
		list.add("ȫ�浿");
		list.add("�ſ��");
		list.add("���ڹ�");
		list.add("�ſ��");
		list.add("�Ź�ö");
		
		//�ߺ� ��� ����
		list.stream().distinct().forEach(n->System.out.println(n));
		System.out.println();
		
		//������ �����ϴ� ��Ҹ� ���͸�
		list.stream().filter(n->n.startsWith("��")).forEach(n->System.out.println(n));
		System.out.println();
		
		//�ߺ� ��Ҹ� ���� �����ϰ�, ������ �����ϴ� ��Ҹ� ���͸�
		list.stream().distinct().filter(n->n.startsWith("��")).forEach(n->System.out.println(n));
	}

}
