package ch03.sec07;

public class LogicalOperatorEx {

	public static void main(String[] args) {
		// 논리 연산자
		// &, && >> 그리고 연산(논리곱)
		// |, || >> 또는 연산(논리합)
		// ^ >> 하나만 true이면 true(배타적 논리합)
		// ! >> 논리 부정
		int charCode = 'A';
		if(65<=charCode & charCode <=90) {
			System.out.println("대문자 이군요");
		}
		if(97<=charCode && charCode <=122) {
			System.out.println("th문자 이군요");
		}
		if(48<=charCode && charCode <=57) {
			System.out.println("0~9 숫자이군요");
		}
		System.out.println("---------------------");
		int value = 6;
		if(value%2==0 | value%3==0) {
			System.out.println("2 또는 3의 배수이군요");
		}
		System.out.println("----------------------");
		boolean result = (value%2==0) || (value%3==0); // result= true
		if(!result) {// true를 false로 바꿈
			System.out.println("2 또는 3의 배수가 아니군요");
		}
	}

}
