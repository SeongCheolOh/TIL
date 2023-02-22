package javaHeight02.p646;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx05 {

	public static void main(String[] args) {
		//스레드 프로그램에서 이용되는 ArrayList와 동일한 컬렉션
		List<Student> vlist = new Vector<Student>(); 
		vlist.add(new Student("홍길동1", 100));
		vlist.add(new Student("홍길동2", 80));
		vlist.add(new Student("홍길동3", 90));
		vlist.add(new Student("홍길동4", 100));
		
		Iterator<Student> it = vlist.iterator();//반복자
		
		while(it.hasNext()) {
			Student st = it.next();
			System.out.println(st);
		}
	}

}
