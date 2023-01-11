package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		// continue문
		// 반복문에서만 사용(for, while, do-while 등)
		// continue가 실행되면 for문의 증감식 / while, do-while문의 조건식으로 바로 이동
		
		// 1~10 중 짝수만 출력
		
		for(int i = 1; i<=10; i++) {
			if(i%2 != 0) {//if(홀수)면 true니깐 continue - 반복, 짝수면 false니깐 탈출
				continue;
			}System.out.print(i+ " ");
		}

	}

}
