package ch03.sec06;

public class CompareOperatorEx {

	public static void main(String[] args) {
		// 비교 연산자
		int num1 = 10;
		int num2 = 10;
		boolean rslt1 = (num1 == num2);
		boolean rslt2 = (num1 != num2);
		boolean rslt3 = (num1 <= num2);
		System.out.println(rslt1);
		System.out.println(rslt2);
		System.out.println(rslt3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean rslt4 = (char1 < char2);
		System.out.println(rslt4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean rslt5 = (num3==num4);
		System.out.println(rslt5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean rslt6 = (num5 == num6);
		boolean rslt7 = (num5 == (float)num6);
		System.out.println(rslt6);
		System.out.println(rslt7);
		
		String str1 = "자바";
		String str2 = "Java";
		boolean rslt8 = (str1.equals(str2));
		boolean rslt9 = (!str1.equals(str2));
		System.out.println(rslt8);
		System.out.println(rslt9);
		

	}

}
