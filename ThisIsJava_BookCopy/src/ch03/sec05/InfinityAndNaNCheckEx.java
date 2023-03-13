package ch03.sec05;

public class InfinityAndNaNCheckEx {

	public static void main(String[] args) {
		// 나눗셈 연산 후 NaN과 Infinity 처리
		
		// 나눗셈(/) 또는 나머지(%)연산에서
		// 좌측 피연산자가 정수이고 우측 피연산자가 0일 경우 ArithmeticExeption 예외가 발생한다
		int x = 5;
		int y = 0;
//		System.out.println(x/y);
		// 좌측 피연산자가 실수이거나 우측 피연산자가 0.0 또는 0.0f이면 예외가 발생하지 않고
		// 연산의 결과는 
		double z = 0.0;
		System.out.println(x/z);
		// Infinity(무한대) 또는 NaN(Not a Number)이 된다
		// 그렇게 때문에 /와 %연산의 결과를 Infinity or NaN인지 먼저 확인 후
		// 다음 단계의 연산을 실행하는게 좋다
		boolean result1 = Double.isInfinite(x/z);
		boolean result2 = Double.isNaN(x/z);
		System.out.println(result1 + " " + result2);
		
		if(Double.isInfinite(x/z)||Double.isNaN(x/z)) {
			System.out.println("값 산출 불가");
		}else {System.out.println(z+2);
		}
	}

}
