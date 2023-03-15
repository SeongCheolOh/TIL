package ch05.sec04;

public class NullPointExceptionEx {

	public static void main(String[] args) {
		// 변수의 값이 null일 때
		// 변수.메소드()를 호출하면 참조할 객체가 없으므로
		// NullPointException이 발생한다
		
		int[]arr1 = null;//객체를 생성하지 않은 상태에서
		arr1[0] = 10;//데이터를 대입하므로 예외 발생
		
		String str = null;//변수의 데이터가 없는데
		System.out.println(str.length());//글자수를 구하라고 하니 당연히 예외 발생

	}

}
