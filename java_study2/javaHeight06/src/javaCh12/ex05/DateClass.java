package javaCh12.ex05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		//p.532 Date Ŭ����
		Date date1 = new Date();
		System.out.println(date1.getDate());
		System.out.println(date1.getDay());
		System.out.println(date1);
		
		SimpleDateFormat sdf =new SimpleDateFormat("yy�� MM�� dd�� HH�� mm�� ss��");
		String strData1 = sdf.format(date1);
		System.out.println(strData1);
	}

}
