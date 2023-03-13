package ch03.sec01;

public class IncreaseDecreaseOperatorEx {

	public static void main(String[] args) {
		// 증감 연산자
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println(x);
		System.out.println("----------------");
		y--;
		--y;
		System.out.println(y);
		System.out.println("-----------------");
		z=x++; // z에 x를 먼저 대입하고, x++연산은 나중
		System.out.println(z);//12
		System.out.println(x);//13
		System.out.println("-----------------");
		z=++x;
		System.out.println(z);
		System.out.println(x);
		System.out.println("-----------------");
		z=++x + y++;
		//1) (1+14) + y++ = 15 + y++
		//2) z에 15+y 대입
		//3) y++
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}

}
