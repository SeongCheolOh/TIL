package javaCh18;
	
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx01 {

	public static void main(String[] args) {
		//����Ʈ�� ��� ����ϱ�
		try {
			OutputStream os = new FileOutputStream("c:/webStudyB/temp/data1.txt");
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();//�ܷ��� ��Ƴ��� ���
			os.close();//�ݰ� ��� �޸� ����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ������ �������
	}

}
