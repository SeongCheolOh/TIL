package javaCh17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamEx01 {

	public static void main(String[] args) {
		// p.723 스트림
		
		Set<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("신용권");
		set.add("김자바");
		
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		// 스트림 특징 : 데이터를 넣기 시작하면 멈춤 없이 끝까지 넣는다
		// 마지막 단계 코드가 있어야 에러가 없다
		Stream<String> stream = set.stream(); 
		stream.forEach(name -> System.out.println(name));
	}

}
