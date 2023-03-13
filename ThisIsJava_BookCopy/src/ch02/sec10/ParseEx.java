package ch02.sec10;

public class ParseEx {

	public static void main(String[] args) {
		// 문자열을 기본(숫자)타입으로 변환
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1+" "+value2+" "+value3);
		
		//반대로 기본(숫자)타입>> 문자열 하기
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		System.out.println(str1+" "+str2+" "+str3);

	}

}
