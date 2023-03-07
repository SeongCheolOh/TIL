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
		System.out.println("원본 파일 경로 : ");
		String oFile = sc.nextLine();//원본파일 키보드로 입력 받기
		System.out.println("복사 파일 경로 : ");
		String copyFile = sc.nextLine();//복사파일 키보드로 입력 받기
		
		//파일이 존재하는지 체크
		File oF = new File(oFile);
		if(!oF.exists()) {
			System.out.println("원본 파일이 존재하지 않습니다.");
			System.exit(0);
		}
		
		//복사 파일 경로에 디렉토리가 없다면 >> 생성해야 함
		File targetFile = new File(copyFile);
		File parentFile = targetFile.getParentFile();
		if(!parentFile.exists()) {
			parentFile.mkdirs();
		}
		
		//복사하기
		FileInputStream fis = new FileInputStream(oF);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(targetFile);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		while(true) {
			int data = bis.read();
			if(data==-1) {
				System.out.println("복사 실행");break;
			}
			bos.write(data);
			
		}
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		
	}

}
