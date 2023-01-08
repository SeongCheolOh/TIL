package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		// 강제타입변환
		int var1 = 10;
		byte var2 = (byte)var1;
		System.out.println(var2); //10 그대로 유지

		long var3 = 300;
		int var4 = (int)var3;
		System.out.println(var4); // 300 그대로 유지
		
		int var5 = 65;
		char var6 = (char)var5;
		System.out.println(var6); // 65를 유니코드로 읽어 'A'가 출력
		
		double var7 = 3.14;
		int var8 = (int)var7;
		System.out.println(var8); // 3.14의 정수부분인 '3'만 출력
	
		
	}

}
