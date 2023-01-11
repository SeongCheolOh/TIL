package ch04.sec04;

public class FloatCounterExample {

	public static void main(String[] args) {
		// 부동소수점 방식의 float타입은 연산과정에서 정확하지 않은 값이 출력될 수 있다
		// 사용 불가능
		
		for(float i=0.1f; i<=1.0f; i+=0.1f) {
			System.out.println(i);
		}// 이론적으로 10번 출력되어야 하지만, 9번밖에 출력되지 않는다

	}

}
