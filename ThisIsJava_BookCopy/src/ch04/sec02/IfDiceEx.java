package ch04.sec02;

public class IfDiceEx {

	public static void main(String[] args) {
	
		int num = (int)(Math.random()*6)+1;
		//math.random() >> 0.0이상 1.0미만의 double타입 난수를 리턴
		//0.0 <= num < 6.0인데 각 항에 1을 더해서
		//1.0 <= num < 7.0을 int화 하면
		//정수타입 1이상 7미만이라는 뜻이 된다 >> 1~6의 정수
		System.out.println(num);
		
		if(num==1) {
			System.out.println(num+"이 나왔습니다");
		}else if(num==2) {
			System.out.println(num+"이 나왔습니다");
		}else if(num==3) {
			System.out.println(num+"이 나왔습니다");
		}else if(num==4) {
			System.out.println(num+"이 나왔습니다");
		}else if(num==5) {
			System.out.println(num+"이 나왔습니다");
		}else if(num==6) {
			System.out.println(num+"이 나왔습니다");
		}

	}

}
