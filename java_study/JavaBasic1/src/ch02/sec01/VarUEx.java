package ch02.sec01;

public class VarUEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
		int x=3, y=5;
		swap(x,y);
		System.out.println("x=" + x + ",y=" + y);

		int bkor = 0b1011;//2진수
		System.out.println(bkor);
		int var1 = 0b1011; // 2진수
		int var2 = 0206; //8진수
		int var3 = 365;//10진수
		int var4 = 0xb3;//16진수
	}//end main
	static void swap(int x, int y) {
		int temp = y; // temp = 5
		y = x; // y = 3
		x = temp; // x = 5
		System.out.println("x=" + x + ",y=" + y);

		//자료형(숫자)
		byte kor = 100; // 1byte = 8bit >> -128 ~ 127
		short eng = 85; // 2byte = 16bit >> -32768 ~ 32767
		int mat = 90; // 4byte = 32bit >> -2,147,483,648 ~ 2,147,483,647
		long sci = 86; // 8byte = 64bit >> -2의63승 ~ 2의63승-1
		byte kor1 = 2;
		
		/* byte total = kor + kor1; >> 오류
		 *  4칙연산 부호는 4byte 차지해서 total 앞 4byte짜리인 int를 붙여야 함 */
		int total = (kor+kor1);
		System.out.println(total);  // 100+89인데 왜 11이 나오지..?

		
}//end class
}