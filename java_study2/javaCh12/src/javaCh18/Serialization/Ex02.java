package javaCh18.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		// ����б� ���α׷� 
		// Student ��ü�� �ڷḦ �־� ����û�� ������(��½�Ʈ��) ��
		FileOutputStream fos = new FileOutputStream("C:/webStudyB/temp/��������б��л���Ϻ�.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("ȫ�浿1", 100, true));
		list.add(new Student("ȫ�浿2", 80, false));
		list.add(new Student("ȫ�浿3", 90, true));
		
		oos.writeObject(list);
		

	}

}
