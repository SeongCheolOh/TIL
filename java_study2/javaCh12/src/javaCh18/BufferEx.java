package javaCh18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferEx {

	public static void main(String[] args) throws IOException {
		//p.800
		//���� �Ҹ��� �� ��� �ڵ尡 �ϼ����� �ʾ�����
		//��·�� ���۸� ����ϸ� �ӵ��� �������°� �˰ڴ�
		
		String ofp1 = BufferEx.class.getResource("2.png").getPath();
		System.out.println(ofp1);
		String tfp1 = "C:\\Users\\pc\\Desktop\\study\\temp/copy2.png";
		
		//�ֽ�Ʈ��
		FileInputStream fis = new FileInputStream(ofp1);
		FileOutputStream fos = new FileOutputStream(tfp1);
		
		String ofp2 = BufferEx.class.getResource("3.png").getPath();
		String tfp2 = "C:\\Users\\pc\\Desktop\\study\\temp/copy3.png";
		
		FileInputStream fis2 = new FileInputStream(ofp2);
		FileOutputStream fos2 = new FileOutputStream(tfp2);
		BufferedInputStream bis2 = new BufferedInputStream(fis2);
		BufferedOutputStream bos2 = new BufferedOutputStream(fos2);
		
		long nonBufferTIme = copy(fis, fos);
		System.out.println("���� �̻�� : " + nonBufferTIme + "ns");
		
		long bufferTime = copy(fis2, fos2);
		System.out.println("���� ��� : " + bufferTime + "ns");
		
		bos2.close();
		bis2.close();
		fos2.close();
		fis2.close();
		fos.close();
		fis.close();
	}

	private static long copy(FileInputStream fis, FileOutputStream fos) throws IOException {
		long start = System.nanoTime();
		while(true) {
			int data = fis.read();
			if(data == -1)break;
			fos.write(data);
		}
		fos.flush();
		long end = System.nanoTime();
		return end-start;
	}

}
