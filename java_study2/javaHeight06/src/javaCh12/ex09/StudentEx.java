package javaCh12.ex09;

import java.util.HashSet;

public class StudentEx {

	public static void main(String[] args) {
		//studentNum�� ������ ���ü�� �Ǵܵǵ��� Student Ŭ������ �ۼ�
		
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1"));
		hashSet.add(new Student("2"));
		
		System.out.println("����� Student �� : " + hashSet.size());
	}
}
