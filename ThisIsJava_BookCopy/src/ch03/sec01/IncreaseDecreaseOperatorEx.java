package ch03.sec01;

public class IncreaseDecreaseOperatorEx {

	public static void main(String[] args) {
		// ���� ������
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
		z=x++; // z�� x�� ���� �����ϰ�, x++������ ����
		System.out.println(z);//12
		System.out.println(x);//13
		System.out.println("-----------------");
		z=++x;
		System.out.println(z);
		System.out.println(x);
		System.out.println("-----------------");
		z=++x + y++;
		//1) (1+14) + y++ = 15 + y++
		//2) z�� 15+y ����
		//3) y++
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}

}
