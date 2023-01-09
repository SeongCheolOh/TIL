package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		// 정확한 계산은 정수 연산으로
		
		//사과 1개를 10조각으로 나눠 7조각을 뺀다
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양 : " + result); // 정확히 0.3이 안나온다
		
		int melon = 1;
		int totalPieces = 10;
		double result2 = totalPieces - number;
		System.out.println("사과 1개에서 남은 조각: "+result2);
		System.out.println("사과 1개에서 남은 양 : " + result2/10);

	}

}
