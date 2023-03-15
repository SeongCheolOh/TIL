package ch04.sec07;

public class BreakEx {

	public static void main(String[] args) {

		//break문은
		//반복문인 for, while, do-while문을 중지하거나
		//조건문인 switch를 종료할 때 사용한다
		int num;
		System.out.println("이 프로그램은 숫자 6이 나올 때 까지 반복됩니다");
		while(true) {
			num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}System.out.println("종료");
		
		//만약 다중 반복문일경우, 가장 가까운 반복문만 중지시킨다
		//지정된 위치까지 종료시키려면
		//해당하는 부분의 반복문 앞에 '이름:' 을 붙이고, break뒤에 '이름;' 을 사용하면 된다
		Outter : for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}System.out.println("종료");
	}

}
