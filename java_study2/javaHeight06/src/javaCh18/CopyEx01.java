package javaCh18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyEx01 {

	public static void main(String[] args) {
		// p.791 CopyEx
		//C:\webStudyB\study\til\TIL\web_study\img.1.png
		//��ǲ >> �ƿ�ǲ
		try {
			InputStream is = new FileInputStream("C:\\webStudyB\\study\\til\\TIL\\web_study\\img/2.png");
			OutputStream os = new FileOutputStream("c:/webStudyB/temp/copy1.png");

			byte []b = new byte[1024]; // 1�ް��� �迭�� ��
			while(true) {
				int num = is.read(b);
				if(num == -1)break;
				
				os.write(b,0,num);
			}
			os.flush();
			os.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//��1) data4.txt�� �а� copydata4.txt�� ����
		try {
			InputStream is = new FileInputStream("C:\\webStudyB\\temp/data4.txt");
			OutputStream os = new FileOutputStream("c:/webStudyB/temp/copydata4.txt");
			byte []b = new byte[1024]; // 1�ް��� �迭�� ��
			while(true) {
				int num = is.read(b);
				if(num == -1)break;
				
				os.write(b,0,num);
			}
			os.flush();
			os.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//��2) c:/Program Files/Java/jdk1.8.0.351/javafx-src.zip ����
		//c:/temp/copyjavafx.zip����
		try {
			InputStream is = new FileInputStream("C:\\Program Files\\Java\\jdk1.8.0_351/javafx-src.zip");
			OutputStream os = new FileOutputStream("c:/webStudyB/temp/copyjavafx.zip");
			byte []b = new byte[1024]; // 1�ް��� �迭�� ��
			while(true) {
				int num = is.read(b);
				if(num == -1)break;
				
				os.write(b,0,num);
			}
			os.flush();
			os.close();
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
