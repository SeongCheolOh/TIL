package javaCh18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx02 {

	public static void main(String[] args) {
		// �Է� ��Ʈ��
		try {
			InputStream is1 = new FileInputStream("c:/webStudyB/temp/data5.txt");
			//�迭�� ��� �Ѳ����� ����ϱ�
			byte [] b = new byte[50];
			while(true) {
				int data = is1.read(b);
				//������ ������ ������ ������(false�� �ǰ�) �ۼ��ض� >> -1�� ����
				//EOF(End Of File)
				if(data == -1)break;
//				System.exit(0); // �� �� �ϳ� ���
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
