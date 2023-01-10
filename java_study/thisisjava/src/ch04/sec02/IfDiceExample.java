package ch04.sec02;

public class IfDiceExample {

	public static void main(String[] args) {
		// if dice example
		
		//문제) 주사위 숫자 중 하나의 수를 뽑아서 출력하는 코드 만들기
		// 임의의 정수 뽑는 Math.random(); 메소드 활용
		// 이 메소드는 0.0<= ~ <1 사이의 double타입 난수를 리턴한다
	/*	0.0 <= Math.random() < 1.0; 각 변에 *6
		0.0 <= (Math.random()*6) < 6.0; 각 변을 (int)화
		(int)0.0 <= (int)(Math.random()*6)+1 < (int)6.0;
	      0      <=   0,1,2,3,4,5         <   6  각 변에 +1
	      1		 <=   1,2,3,4,5,6		  <   7
		-------------------------
		start부터 시작하는 n개의 정수중 하나를 얻기위한 코드는 다음과 같다
		int num = (int)(Math.random()*n)+(start numb);
	    ex) 1부터 10까지 정수 중 하나를 출력해라 */
		int num = (int)(Math.random()*10)+1;
		System.out.println(num);
		
		int num1 = (int)(Math.random()*6)+1;
		System.out.println(num1);
		
		if(num1==1/* 참과 거짓이 나와야해서 비교문 사용 */) {
			System.out.println("1번이 나왔습니다");
		}else if(num1==2) {
			System.out.println("2번이 나왔습니다");
		}else if(num1==3) {
			System.out.println("3번이 나왔습니다");
		}else if(num1==4) {
			System.out.println("4번이 나왔습니다");
		}else if(num1==5) {
			System.out.println("5번이 나왔습니다");
		}else {
			System.out.println("6번이 나왔습니다");
		}

	
	}

}
