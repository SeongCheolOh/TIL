package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) {
		// break를 사용하면 {}한단계만 탈출한다
		// 탈출시키고자 하는 지점에 이름(레이블) : (반복문 for while do-while 등){
		// 								}break 이름;								
		// 을 사용하면 된다

		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		
		
		
	}//end main

}// end class