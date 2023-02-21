package ch02.sec08;

public class CastingEx {

	public static void main(String[] args) {
		int var1 = 10;
		byte var2 = (byte)var1;
		System.out.println(var2); //강제타입 변환후에 10이 그대로 유지
		
		long var3 = 300;
		int var4 = (int)var3;
		System.out.println(var4); //이것도 그대로 유지
		
		int var5 = 65;
		char var6 = (char)var5;
		System.out.println(var6); //'A'출력
		
		double var7 = 3.14;
		int var8 = (int)var7;
		System.out.println(var8); // 소수점 짤리고 출력
		
	}

}
