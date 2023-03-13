package ch03.sec09;

public class BitShiftEx01 {

	public static void main(String[] args) {
		// 비트 이동 연산자
		// a << b = 2진수화 한 a를 b만큼 왼쪽으로 이동, 오른쪽 빈자리는 0으로 채움 >> a*2^b
		//   >>                      오른쪽	   , 왼쪽 빈자리는 최상위 부호와 같은 값으로 채움 >> a*2^-b
		//   >>>					 오른쪽      , 왼쪽 빈자리는 0으로 채움
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int)Math.pow(2, 3); // math.pow(a,b) = a^b를 double값으로 산출한다
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("-----------");
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int)Math.pow(2, 3);
		System.out.println(result3);
		System.out.println(result4);
	}

}
