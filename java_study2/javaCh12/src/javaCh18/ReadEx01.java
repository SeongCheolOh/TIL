package javaCh18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx01 {

	public static void main(String[] args) {
		// �Է� ��Ʈ��
		try {
			InputStream is1 = new FileInputStream("c:/webStudyB/temp/data5.txt");
			while(true) {
				int data = is1.read();
				//������ ������ ������ ������(false�� �ǰ�) �ۼ��ض� >> -1�� ����
				//EOF(End Of File)
				if(data == -1)break;
//				System.exit(0); // �� �� �ϳ� ���
				System.out.println(data);
			}
			is1.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
