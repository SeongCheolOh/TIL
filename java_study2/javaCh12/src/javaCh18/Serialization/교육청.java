package javaCh18.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;


public class ����û {

	public static void main(String[] args) throws Exception {
		//�б����� ������ ��Ʈ��ũ�� ������ �Է¹޾Ƽ� �������־�� ��
		
		FileInputStream fis = new FileInputStream("C:\\webStudyB\\temp/��������л���Ϻ�.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object oj = ois.readObject();
		
		List<Student> list = (List<Student>)oj;
		for(Student s : list) {
			System.out.println(s.getName()+ s.getScore()+ s.isGender());
			
			}
		
	}

}
