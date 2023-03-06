package javaCh18;
	
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx01 {

	public static void main(String[] args) {
		//바이트로 담아 출력하기
		try {
			OutputStream os = new FileOutputStream("c:/webStudyB/temp/data1.txt");
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();//잔류량 쏟아내어 출력
			os.close();//닫고 사용 메모리 해제
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 파일이 만들어짐
	}

}
