package ch02.sec12;

public class PrintEx {

	public static void main(String[] args) {
		// 콘솔로 변수값을 출력
		// 형식화된 문자열
		// 솔직히 다 못 외우겠다, p.69 참조하자
		//printf("형식문자열",값1,값2,---); >> 형식문자열에 맞춰 뒤의 값을 출력해라
		
		int value = 12345;
		System.out.printf("상품의 가격 : %d원\n",value); // %d = 정수 그대로 출력, \n = 줄바꿈
		System.out.printf("상품의 가격 : %7d원\n",value); // %?d = ?자리 형태로 출력, 남는 자리는 왼쪽 공백
		System.out.printf("상품의 가격 : %-7d원\n",value); // %-?d = ?자리 형태로 출력, 남는 자리는 오른쪽 공백
		System.out.printf("상품의 가격 : %07d원\n",value); // %?d = ?자리만큼 출력, 남는 자리는 0으로 채움
		
		double area = 3.141592 *10 *10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n",10,area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

	}

}
