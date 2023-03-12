package javaCh18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx02 {

	public static void main(String[] args) {
		// 배열에 담아 한꺼번에 출력하기
		
		try {
			OutputStream os = new FileOutputStream("c:/webStudyB/temp/data3.txt");

			byte[] array = {10,20,30,40,50}; //주의 - byte 범위 내 숫자만
			
			os.write(array,1,3);//1번 인덱스부터 3개만 저장해라
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//문1) a,b,c,d,e,f,g,h 파일명 data4로 저장하기
		try {
			OutputStream os1 = new FileOutputStream("c:/webStudyB/temp/data4.txt");
			
			byte [] array1 = {'a','b','c','d','e','f','g','h'};
			os1.write(array1);
			os1.flush();
			os1.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//문2) 1.1 / 2.2 / 3.3 / 4.4 / 5.5 파일명 data5로, 2.2 / 3.3 / 4.4만 저장하기
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
