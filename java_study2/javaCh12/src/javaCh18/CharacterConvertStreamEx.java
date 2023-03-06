package javaCh18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamEx {

	public static void main(String[] args) throws IOException {
		// p.799
		write("문자 변환 스트림을 사용합니다.");
		
		StringBuilder data = read();
		System.out.println(data);
	}

	private static StringBuilder read() throws IOException {
		// 
		InputStream is = new FileInputStream("c:/webStudyB/temp/memo.txt");
		Reader reader = new InputStreamReader(is,"utf-8");
		char[] c = new char[1024];
		StringBuilder sb = new StringBuilder();
		sb.append("");
		while(true) {
			int num = reader.read(c);
			if(num==-1)break;
			for(int i = 0; i<num; i++) {
				String str = new String(c,0,num);
				sb.append(str);
				
			}
		}
		reader.close();
		is.close();
		return sb;
		
	}

	private static void write(String string) throws IOException {
//		OutputStream os = new FileOutputStream("c:/webStudyB/temp/text10.txt");//주 스트림
//		Writer writer = new OutputStreamWriter(os);
		Writer writer = new OutputStreamWriter(new FileOutputStream("c:/webStudyB/temp/text10.txt"), "utf-8");
		//위 두줄 합친것
		writer.write(string);
		writer.flush();
		writer.close();
	}

}
