package javaCh17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx01 {

	public static void main(String[] args) {
		// p.756
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10); list.add(20);
//		double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		//�����Ͱ� ������ ���� �߻�
		//���1
		OptionalDouble od = list.stream().mapToInt(Integer::intValue).average();
		if(od.isPresent()) {
			System.out.println(od.getAsDouble());
		}else {
			System.out.println("����� 0.0 �Դϴ�");
		}
		
		//���2
		double avg1 = list.stream().mapToInt(n->n.intValue()).average().orElse(0.0);
		System.out.println(avg1);
		
		//���3
		list.stream().mapToInt(Integer::intValue).average().ifPresent(a->System.out.println(a));
	}

}
