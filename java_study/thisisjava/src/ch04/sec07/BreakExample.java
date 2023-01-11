package ch04.sec07;

public class BreakExample {

	public static void main(String[] args) {
		// break문
		//for, while, do-while 반복문에서 탈출 후 종료할때 사용
		
		//주사위 숫자 중 6을 뽑으면 종료
		
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				System.out.println(num+"을 뽑았으니 종료합니다");
				break;
			}
		}

	}//end main

}//end class
