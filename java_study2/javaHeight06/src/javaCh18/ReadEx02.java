package javaCh18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx02 {

	public static void main(String[] args) {
		// 입력 스트림
		try {
			InputStream is1 = new FileInputStream("c:/webStudyB/temp/data5.txt");
			//배열에 담아 한꺼번에 출력하기
			byte [] b = new byte[50];
			while(true) {
				int data = is1.read(b);
				//파일을 끝까지 읽으면 끝내게(false가 되게) 작성해라 >> -1을 리턴
				//EOF(End Of File)
				if(data == -1)break;
//				System.exit(0); // 둘 중 하나 사용
				for(int i = 0; i<data; i++) {
					System.out.println(b[i]);	
				}
			}
			is1.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
