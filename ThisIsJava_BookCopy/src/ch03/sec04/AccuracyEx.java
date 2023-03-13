package ch03.sec04;

public class AccuracyEx {

	public static void main(String[] args) {
		// 정확한 연산은 정수 타입으로
		// 실수타입일 때 발생하는 오류를 보여줌
		int apple = 1;
		double aPiece = 0.1;
		int eatPiece = 7;
		
		double result = apple-(aPiece*eatPiece);
		System.out.println(result); // 정확하게 0.3이 출력되지 않는다
		System.out.println("-----------");
		
		int totalPiece = 10;
		int afterEat = totalPiece-eatPiece;
		System.out.println(afterEat);
		System.out.println((double)afterEat/totalPiece);

	}

}


























