package javaCh12.ex05;

import java.text.DecimalFormat;

public class DecimalFormatClass {

	public static void main(String[] args) {
		//p.542
		double i = 0.12345678901234567890123456789;
		double j = 10000;
		System.out.println(i);//중간에 짜르고 반올림함
		
		//소수점 3자리까지만 보이게 해라
		DecimalFormat df = new DecimalFormat("#.###"); // 0.000까지 나타내라
		System.out.println(df.format(i));
		System.out.println(df.format(j)); // 정수자리는 1자리만 나타내는게 아니다

		DecimalFormat df1 = new DecimalFormat("#.456"); //#은 표현하고, 나머지는 덮어쓰기
		System.out.println(df1.format(i));
		System.out.println(df1.format(j));
	
		//통화 기호
		DecimalFormat df2 = new DecimalFormat("\u00A4 #,###");
		System.out.println(df2.format(j));
	}

}
