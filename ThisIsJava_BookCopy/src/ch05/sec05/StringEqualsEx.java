package ch05.sec05;

public class StringEqualsEx {

	public static void main(String[] args) {
		//문자열 비교
		String var1 = "홍길동";
		String var2 = "홍길동";
		
		if(var1==var2) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
		
		if(var1.equals(var2)) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}System.out.println("----------------");
		
		//객체 생성을 통해 비교
		String var3 = new String("홍길동");
		String var4 = new String("홍길동");
		if(var3==var4) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}

		if(var3.equals(var4)) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
	}

}
