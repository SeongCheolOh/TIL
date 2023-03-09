package javaCh17;

import java.util.*;
import java.util.stream.Stream;

public class ParallenStreamEx01 {

	public static void main(String[] args) {
		// p.725 내부반복자
		List<Integer> hakbun = new ArrayList<Integer>();
		hakbun.add(1);
		hakbun.add(2);
		hakbun.add(3);
		hakbun.add(4);
		hakbun.add(2);
		hakbun.add(6);
		
		Stream<Integer> stream = hakbun.stream();
		stream.forEach(h->System.out.print(h + " "));
		//.forEach >> 저장되어있던 데이터를 다 쏟아내어 출력
//		stream.forEach(h->System.out.print(h + " "));
		//똑같은 출력문을 쓰면 stream은 이미 비워냈기때문에 에러가 남
		//다시 채워넣기
		stream = hakbun.stream();
		stream.forEach(h->System.out.print(h + " "));
		
		Stream<Integer> pStream = hakbun.parallelStream();
		pStream.forEach(ㅔ->System.out.print("병렬 " + ㅔ + " " + Thread.currentThread().getName()));
		
	}

}
