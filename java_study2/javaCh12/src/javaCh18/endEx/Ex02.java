package javaCh18.endEx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ��� : ");
		String oFile = sc.nextLine();//�������� Ű����� �Է� �ޱ�
		System.out.println("���� ���� ��� : ");
		String copyFile = sc.nextLine();//�������� Ű����� �Է� �ޱ�
		
		//������ �����ϴ��� üũ
		File oF = new File(oFile);
		if(!oF.exists()) {
			System.out.println("���� ������ �������� �ʽ��ϴ�.");
			System.exit(0);
		}
		
		//���� ���� ��ο� ���丮�� ���ٸ� >> �����ؾ� ��
		File targetFile = new File(copyFile);
		File parentFile = targetFile.getParentFile();
		if(!parentFile.exists()) {
			parentFile.mkdirs();
		}
		
		//�����ϱ�
		FileInputStream fis = new FileInputStream(oF);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(targetFile);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		while(true) {
			int data = bis.read();
			if(data==-1) {
				System.out.println("���� ����");break;
			}
			bos.write(data);
			
		}
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		
	}

}
