package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// 논리 연산자
		// a&&b = a와 b가 모두 true여야 ture  // 어느 한쪽이라도 false면 false
		// a||b = a또는 b중 하나만이라도 true면 true  // 둘 다 false여야 false
		// a^b  = a와 b가 달라야 true(true^false or false^true)
		// a!b  = 논리 부정
		int charCode = 'A';
		//int charCode = 'a';
		//int charCode = '5';
		
		if((65<=charCode)&(charCode<=90)) {
			System.out.println("대문자이군요");
		}
		if((97<=charCode)&&(charCode<=122)) {
			System.out.println("소문자이군요");
		}
		if((48<=charCode)&&(charCode<=57)) {
			System.out.println("0~9 숫자이군요");
		}
		//------------------------------------------
		int value = 6;
		//int value = 7;
		
		if((value%2==0)|(value%3==0)){
			System.out.println("2또는3의 배수군요");
		}
		
		boolean result = (value%2==0||value%3==0);
		if(!result/*논리 부정*/) {
			System.out.println("2또는3의 배수가 아니군요");
		}

	}

}
