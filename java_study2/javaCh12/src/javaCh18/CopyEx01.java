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
		//인풋 >> 아웃풋
		try {
			InputStream is = new FileInputStream("C:\\webStudyB\\study\\til\\TIL\\web_study\\img/2.png");
			OutputStream os = new FileOutputStream("c:/webStudyB/temp/copy1.png");

			byte []b = new byte[1024]; // 1메가를 배열로 줌
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
		
		//문1) data4.txt를 읽고 copydata4.txt로 쓰기
		try {
			InputStream is = new FileInputStream("C:\\webStudyB\\temp/data4.txt");
			OutputStream os = new FileOutputStream("c:/webStudyB/temp/copydata4.txt");
			byte []b = new byte[1024]; // 1메가를 배열로 줌
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
		
		
		//문2) c:/Program Files/Java/jdk1.8.0.351/javafx-src.zip 복사
		//c:/temp/copyjavafx.zip으로
		try {
			InputStream is = new FileInputStream("C:\\Program Files\\Java\\jdk1.8.0_351/javafx-src.zip");
			OutputStream os = new FileOutputStream("c:/webStudyB/temp/copyjavafx.zip");
			byte []b = new byte[1024]; // 1메가를 배열로 줌
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
