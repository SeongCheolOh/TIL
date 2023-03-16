package ch05.sec11;

public class ArrayMainStringEx {

	public static void main(String[] args) {
		// main()메소드의 String[]매개변수 용도
		
		// String[]args는 왜 필요할까?
		//윈도우의 cmd나 맥OS의 터미널에서 프로그램을 실행할 때
		//요구하는 값이 있을 수 있다. 예를들어
		//두 수를 입력받고 덧셈을 수행하는 Sum 프로그램은 다음과 같이 요구할 수 있다
		//java Sum 10 20
		//이게 args[0] = 10; / args[1] = 20;이라는 뜻이다
		//다음은 입력한 값이 2개가 아닐 때 부족함을 알리고, 강제종료하는 코드이다
		if(args.length!=2) {
			System.out.println("부족");
			System.exit(0);//프로그램 강제 종료
		}
		
		String num1 = args[0];
		String num2 = args[1];
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		
		int result = num3 + num4;
		System.out.println(num3+" + "+num4+" = "+ result);
		

	}

}
