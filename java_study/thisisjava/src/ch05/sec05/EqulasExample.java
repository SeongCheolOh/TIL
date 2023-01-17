package ch05.sec05;

public class EqulasExample {

	public static void main(String[] args) {
		//
		
		String var1 = "홍길동";
		String var2 = "홍길동";
		
		if(var1==var2) {//데이터 비교
			System.out.println("var1과 var2는 참조가 같음");
		}else {
			System.out.println("var1과 var2는 참조가 다름");
		}
		
		
		if(var1.equals(var2)) {//문자열 비교
			System.out.println("var1과 var2는 문자열이 같음");
		}
		
		
		String var3 = new String("홍길동");
		String var4 = new String("홍길동");
		
		if(var3==var4) {//번지 비교
			System.err.println("var3과 var4는 참조가 같음");
		}else {
			System.out.println("var3과 var4는 참조가 다름");
		}
		
		if(var3.equals(var4)) {
			System.out.println("var3과 var4는 문자열이 같음");
		}
				
		
		
	}//end main

}//end calss
