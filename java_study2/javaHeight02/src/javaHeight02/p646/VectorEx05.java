package javaHeight02.p646;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorEx05 {

	public static void main(String[] args) {
		//������ ���α׷����� �̿�Ǵ� ArrayList�� ������ �÷���
		List<Student> vlist = new Vector<Student>(); 
		vlist.add(new Student("ȫ�浿1", 100));
		vlist.add(new Student("ȫ�浿2", 80));
		vlist.add(new Student("ȫ�浿3", 90));
		vlist.add(new Student("ȫ�浿4", 100));
		
		Iterator<Student> it = vlist.iterator();//�ݺ���
		
		while(it.hasNext()) {
			Student st = it.next();
			System.out.println(st);
		}
	}

}
