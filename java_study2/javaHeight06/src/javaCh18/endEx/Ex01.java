package javaCh18.endEx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\webStudyB\\study\\til\\TIL\\java_study\\javaBasic2\\src\\javaBasic2\\ch05/RefEx3.java";
		
		FileReader fr = new FileReader(filePath,Charset.forName("utf-8"));
		BufferedReader br = new BufferedReader(fr);
		int rowNum = 0;
		String rowData;
		while(true) {
			int data = br.read();
			if(data==-1)break;
			System.out.println(br.readLine());
			
		}
		br.close();
		fr.close();

	}

}
