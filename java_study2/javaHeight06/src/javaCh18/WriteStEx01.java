package javaCh18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriteStEx01 {

	public static void main(String[] args) {
		// 문자 입출력
		
		try {
			Reader reader = new FileReader("c:/webStudyB/temp/memo.txt");
			Writer writer = new FileWriter("c:/webStudyB/temp/copyMemo.txt");
			//한 글자씩 읽기
			while(true) {
				int data = reader.read();
				if(data == -1) break;
				System.out.print((char)data);
				writer.write(data);
			}
			writer.flush();
			writer.close();
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Reader reader = new FileReader("c:/webStudyB/temp/memo.txt");
			Writer writer = new FileWriter("c:/webStudyB/temp/copyMemo1.txt");
			char[] data = new char[100];
			while(true) {
				int data1 = reader.read(data);
				if(data1 == -1)break;
				for(int i = 0; i<data1; i++) {
					System.out.print(data[i]);
				}
				writer.write(data);
			}
			writer.flush();
			writer.close();
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
