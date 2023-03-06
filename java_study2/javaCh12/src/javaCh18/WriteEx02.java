package javaCh18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx02 {

	public static void main(String[] args) {
		// �迭�� ��� �Ѳ����� ����ϱ�
		
		try {
			OutputStream os = new FileOutputStream("c:/webStudyB/temp/data3.txt");

			byte[] array = {10,20,30,40,50}; //���� - byte ���� �� ���ڸ�
			
			os.write(array,1,3);//1�� �ε������� 3���� �����ض�
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//��1) a,b,c,d,e,f,g,h ���ϸ� data4�� �����ϱ�
		try {
			OutputStream os1 = new FileOutputStream("c:/webStudyB/temp/data4.txt");
			
			byte [] array1 = {'a','b','c','d','e','f','g','h'};
			os1.write(array1);
			os1.flush();
			os1.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//��2) 1.1 / 2.2 / 3.3 / 4.4 / 5.5 ���ϸ� data5��, 2.2 / 3.3 / 4.4�� �����ϱ�
		try {
			OutputStream os2 = new FileOutputStream("c:/webStudyB/temp/data5.txt");
			byte []array2 = {1, 2, 3, 4, 5};
			os2.write(array2,1,3);
			os2.flush();
			os2.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
