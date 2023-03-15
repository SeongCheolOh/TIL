package ch05.sec05;

public class StringSplitEx {
	public static void main(String[]args) {
		//문자열 분리
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		
		//변수.split("분리기준");
		String[] tokens = board.split(",");
		
		System.out.println(tokens.length+"\n"); // 몇개로 잘렸나 보고싶어서
		System.out.println(tokens[0]);
		System.out.println(tokens[1]);
		System.out.println(tokens[2]);
		System.out.println(tokens[3]+"\n");
		
		//for문을 이용한
		for(int i = 0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
	}

}
