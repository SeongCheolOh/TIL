package ch02.sec04;

public class FloatDoubleEx {

	public static void main(String[] args) {
		// ¡§π–µµ »Æ¿Œ
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		System.out.println(var1);
		System.out.println(var2);
		
		// 10¿« ∞≈µÏ¡¶∞ˆ ∏Æ≈Õ∑≤
		double var3 = 3e6; //3*10^6
		float var4 = 3e6f; //3*10^6
		double var5 = 2e-3; //2*10^-3
		System.out.println(var3+" "+var4+" "+var5);

	}

}
