package ch02.sec02;

public class ByteExample {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127; //byte = 8bit >> -2의(8-1)승 ~ 2의(8-1)승-1 = -128~127의 범위
		/*byte var6 = 128;  >> 대입값이 범위를 초과해서 에러 발생 */
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);

	}

}
