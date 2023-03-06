package javaCh18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx01 {

	public static void main(String[] args) {
		// 입력 스트림
		try {
			InputStream is1 = new FileInputStream("c:/webStudyB/temp/data5.txt");
			while(true) {
				int data = is1.read();
				//파일을 끝까지 읽으면 끝내게(false가 되게) 작성해라 >> -1을 리턴
				//EOF(End Of File)
				if(data == -1)break;
//				System.exit(0); // 둘 중 하나 사용
				System.out.println(data);
			}
			is1.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
