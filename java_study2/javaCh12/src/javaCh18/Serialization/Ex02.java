package javaCh18.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		// 고등학교 프로그램 
		// Student 객체에 자료를 넣어 교육청에 보내야(출력스트림) 함
		FileOutputStream fos = new FileOutputStream("C:/webStudyB/temp/이젠고등학교학생기록부.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동1", 100, true));
		list.add(new Student("홍길동2", 80, false));
		list.add(new Student("홍길동3", 90, true));
		
		oos.writeObject(list);
		

	}

}
