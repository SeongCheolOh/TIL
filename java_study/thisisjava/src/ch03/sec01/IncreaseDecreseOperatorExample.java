package ch03.sec01;

public class IncreaseDecreseOperatorExample {
	public static void main(String[]args) {
		//증감 연산자
		int x = 10;
		int y = 10;
		int z;
		
		x++; // 다른 연산 후 x+1 하기
		++x; // x+1 후 다른 연산 하기 >> 순서가 다르다
		System.out.println("x=" + x);
		
		System.out.println("----------------");
		y--; // 다른 연산 후 y-1 하기
		--y; // y-1 후 다른 연산 하기
		System.out.println("y=" + y);
		
		System.out.println("----------------");
		z = x++;
		System.out.println("z=" + z);//왜 12고
		System.out.println("x=" + x);//왜 13인지
		
		System.out.println("----------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("----------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
	}

}
