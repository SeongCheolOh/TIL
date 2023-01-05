package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		/* long = 8byte = 64bit >> -2의63승 ~ 2의63승-1 의 범위를 가짐
 		수치가 큰 데이터를 다루는 프로그램에서 사용된다 ex) 은행, 과학 등
		기본적으로 정수 리터럴을 int타입 값으로 간주하기때문에
	  	int = 4byte = 32bit >> -2의31승 ~ 2의31승-1을 초과한 값은
	  	뒤에 l을 붙여 long타입 값임을 컴파일러에게 알려줘야함*/
		
		long var1 = 10;
		long var2 = 20l;
		/*long var3 = 10000000000000; >> int의 허용범위를 넘어섬 >> 대입값 끝에 l 붙여주기 */
		long var4 = 10000000000000l;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
				   
	}

}
