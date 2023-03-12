package javaCh18;

import java.io.BufferedReader;	
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class BufferEx02 {

	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("C:/Users/pc/Desktop/study/TIL/diary/march/230306.txt", Charset.forName("utf-8"));
		FileWriter fw1 = new FileWriter("C:\\Users\\pc\\Desktop\\study\\temp.copy230306.txt", Charset.forName("utf-8"));

		timeCheck(fr1, fw1,"버퍼 미사용");
		
		BufferedReader br = new BufferedReader(fr1);
		BufferedWriter bw = new BufferedWriter(fw1);
		timeCheck(fr1, fw1,"버퍼 사용");
		
	}

	private static void timeCheck(FileReader fr1, FileWriter fw1, String memo) throws IOException {
		long start = System.nanoTime();
		while(true) {
			int data = fr1.read();
			if(data == -1)break;
			fw1.write(data);
			
		}
		fw1.flush();
		long end = System.nanoTime();
		System.out.println(memo+ " : " + (start-end));
		
	}
}
