package ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		// 논리 타입 boolean
		
		// 참과 거짓을 의미하는 true 와 false로 출력됨
		boolean stop = false/* or true */; //초기값에 true나 false가 대입되는 식이어야 한다
		if(stop) {//if(stop)이
			System.out.println("중지합니다");}//true(참)일 때 "중지합니다" 출력
		else {System.out.println("시작합니다");//false(거짓)일 때 "시작합니다" 출력 
		}

		// 주로 두 가지 상태값을 저장할 필요가 있을 때 사용
		int x= 10;
		boolean result1 = (x == 20); // == 좌우가 같다
		boolean result2 = (x != 20); // != 좌우가 같지 않다
		System.out.println("result1:" + result1);
		System.out.println("resutl2:" + result2);
		
		//ex)
		int y = 100;
		boolean result3 = (y == 50); // false
		boolean result4 = (y != 50); // true
		boolean result5 = (y > 50); // true
		boolean result6 = (50 < y && y < 100); // true
		boolean result7 = (y < 50 || 150 < y); // false
		if (result3) {
			System.out.println("참 입니다");}
		else {System.out.println("거짓 입니다");}
		if (result4) {
			System.out.println("참 입니다");}
		else {System.out.println("거짓 입니다");}
		if (result5) {
			System.out.println("참 입니다");}
		else {System.out.println("거짓 입니다");}
		if (result6) {
			System.out.println("참 입니다");}
		else {System.out.println("거짓 입니다");}
		if (result7) {
			System.out.println("참 입니다");}
		else {System.out.println("거짓 입니다");}

	}

}
