package checkEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Ex10 {

	public static void main(String[] args) {
		
		//TreeSet�� Ex10Class ��ü�� ������ ��, score �ʵ尪�� �������� �ڵ����ĵǵ��� �����ϰ����
		//TreeSet�� last() �޼ҵ带 ȣ������ �� ���� ���� score�� Ex10class ��ü�� ���ϵǵ��� class�� �ڵ� �ۼ�
		
		TreeSet<Ex10class> tS = new TreeSet<Ex10class>();
		tS.add(new Ex10class("blue", 96));
		tS.add(new Ex10class("hong", 86));
		tS.add(new Ex10class("white", 92));
		
		Ex10class ec = tS.last();
		System.out.println("�ְ� ���� : " + ec.score);
		System.out.println("�ְ� ������ ���� ���̵� : " + ec.id);

		TreeSet<Ex10class2> tS2 = new TreeSet<Ex10class2>(new Ex10class2Comparator());
		tS2.add(new Ex10class2("blue", 96));
		tS2.add(new Ex10class2("hong", 86));
		tS2.add(new Ex10class2("white", 92));
		
		Ex10class2 ec2 = tS2.first();
		System.out.println("���� ���� : " + ec2.getScore());
		System.out.println("���� ������ ���� ���̵� : " + ec2.getId());
		
		int[]a = new int[5];
		a[0] = 10;
		
		int [] a2 = {1,2,3};
		List<Integer> list = new ArrayList<Integer>();
		list.add(a2[0]);
		list.add(a2[1]);
		list.add(a2[2]);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		List list2 = Arrays.asList(10,20,30,40,50);
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		System.out.println(list2.get(3));
		System.out.println(list2.get(4));
		
		//���ڿ� �迭 5�� �̸� �ֱ�
		//1�ܰ� �迭����� ���� �ִ´�
		//2�ܰ� ArrayList �����
		//3�ܰ� ArrayList ���� �迭 ���� ��� add�Ѵ�
		List list3 = Arrays.asList("ȫ�浿","������","�̸��","������","�̼���");
		
		//���� �ֳ���? > n
		if(list3.contains("����")) {
			System.out.println("�ֽ��ϴ�");
		}else {
			System.out.println("�����ϴ�");
		}
	}

}
