package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		// for-for 문
		// 바깥for 실행
		// 안for 실행, 반복, 종료
		// 바깥for 1회 반복
		// 안for 실행, 반복, 종료
		// -> ... -> 바깔for까지 반복종료
		
		//구구단 표 만들기
		for(int i=2; i<=9; i++) {
			System.out.println("*** " + i + "단 ***");
			for(int j=1; j<=9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
	}

}
