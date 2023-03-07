package javaCh18.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:\\webStudyB\\temp/memberObject.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Member m1 = new Member("fall", "��ǳ��");
		
		oos.writeObject(m1);//����ȭ
		
		FileInputStream fis = new FileInputStream("C:\\webStudyB\\temp/memberObject.dat");//����ȭ��Ų ������ �����
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object oj = ois.readObject();
		if(oj instanceof Member) {
			Member mj = (Member)oj;
			System.out.println(mj.getId());
			System.out.println(mj.getName());
		}

	}

}
