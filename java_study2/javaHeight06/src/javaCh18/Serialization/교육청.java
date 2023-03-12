package javaCh18.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;


public class 교육청 {

	public static void main(String[] args) throws Exception {
		//학교에서 성적을 네트워크로 보내면 입력받아서 가지고있어야 함
		
		FileInputStream fis = new FileInputStream("C:\\webStudyB\\temp/이젠고등학생기록부.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object oj = ois.readObject();
		
		List<Student> list = (List<Student>)oj;
		for(Student s : list) {
			System.out.println(s.getName()+ s.getScore()+ s.isGender());
			
			}
		
	}

}
