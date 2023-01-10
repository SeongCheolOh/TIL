package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// 나눗셈 연산 후 NaN과 Infinity 처리
		// (/)또는 (%)연산 중
		// 왼쪽 피연산자가 정수, 오른쪽 피연산자가 0이면 출력 불가 >> 무한대를 정수로 표현 불가능  ex)5/0=?
		// but) 왼쪽이 실수이거나 오른쪽이 0.0 또는 0.0f이면 출력은 됨  >> if문에서 참으로 인식
		// 5/0.0 = Infinity
		// 5/0.0f = NaN
		// and) Infinity 또는 NaN에 어떤 연산을 하더라도 결과는 같음
		// 그래서 / 또는 % 연산의 결과를 항상 확인하고 다음으로 넘어가는게 좋다
		
		// 확인하기 위해서
		//boolean result = Double.inInfinite(변수);
		//boolean result = Double.inNaN(변수);

		int x = 5;
		double y = 0.0;
		double z = x / y;
		System.out.println(z);
		double a = x % y;
		System.out.println(z+2);
		
		if(Double.isInfinite(z) || Double.isNaN(z)) { // ||=또는 // 만약 inf(z)또는 nan(z)가 참이면
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z+2);
		}
		
		
	}

}
