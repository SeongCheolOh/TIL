package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y" + y);
		
		int temp = x; // = 3
		x = y; // = 5
		y = temp; // = 3
		System.out.println("x:" + x + ", y:" + y);

	}

}
