package javaCh17;

import java.util.*;
import java.util.stream.Stream;

public class ParallenStreamEx01 {

	public static void main(String[] args) {
		// p.725 ���ιݺ���
		List<Integer> hakbun = new ArrayList<Integer>();
		hakbun.add(1);
		hakbun.add(2);
		hakbun.add(3);
		hakbun.add(4);
		hakbun.add(2);
		hakbun.add(6);
		
		Stream<Integer> stream = hakbun.stream();
		stream.forEach(h->System.out.print(h + " "));
		//.forEach >> ����Ǿ��ִ� �����͸� �� ��Ƴ��� ���
//		stream.forEach(h->System.out.print(h + " "));
		//�Ȱ��� ��¹��� ���� stream�� �̹� ����±⶧���� ������ ��
		//�ٽ� ä���ֱ�
		stream = hakbun.stream();
		stream.forEach(h->System.out.print(h + " "));
		
		Stream<Integer> pStream = hakbun.parallelStream();
		pStream.forEach(��->System.out.print("���� " + �� + " " + Thread.currentThread().getName()));
		
	}

}
