package ch04.sec03;

public class SwitchExample {

	public static void main(String[] args) {
		// switch 문
		// if문은 true와 false로 값이 출력되기 때문에
		// 경우의 수가 많아질 수록 else if 를 추가해야 하지만
		// switch문은 변수의 값에 따라 실행문이 결정되는거라 if보다 간결해진다.
		
		/* if(a)가 참이면 else if, 거짓이면 탈출이지만
		 * switch에서는 변수에 값을 대입할 수 있다
		 * switch();
		 * 		case1:
		 * 			syso(); 
		 * 		case2:
		 * 			syso();
		 * 		case3:
		 * 			syso();
		 */
		
		int num = (int)((Math.random()*6)+1);
		System.out.println(num);
		
		switch(num) {
		case 1: System.out.println("1번이 나왔습니다");break;
		case 2: System.out.println("2번이 나왔습니다");break;
		case 3: System.out.println("3번이 나왔습니다");break;
		case 4: System.out.println("4번이 나왔습니다");break;
		case 5: System.out.println("5번이 나왔습니다");break;
		default: System.out.println("6번이 나왔습니다");
		}

	}

}
