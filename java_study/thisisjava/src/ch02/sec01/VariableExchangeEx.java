package ch02.sec01;

public class VariableExchangeEx {

	public static void main(String[] args) {
		//변수 치환
		
		int x = 3;
		int y = 5;
		System.out.println("x:"+x+ ",y:" +y);
		
		int temp = x;
		
		x=y;
		y=temp;
		System.out.println("x:"+x+ ",y:" +y);
	}

}
