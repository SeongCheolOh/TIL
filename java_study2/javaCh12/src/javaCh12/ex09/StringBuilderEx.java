package javaCh12.ex09;

public class StringBuilderEx {

	public static void main(String[] args) {
		// 확인문제 10번
		//1~100까지 숫자를 통 문자열로 만드는 코드다
		//100개 이상의 String 객체를 만드는것이기 때문에 좋은 코드라고 볼 수 없다
		//StringBuilder를 사용해서 좀 더 효율적인 코드로 만들어라
		
		//String str = "";
		StringBuilder str1 = new StringBuilder();
		for(int i = 1; i<=100; i++) {
			//str + = i;
			str1.append(i);
		}
		System.out.println(str1);
		//str은 마지막 1개 객체 빼고 전부 쓰레기객체가 되지만
		//str1은 계속 덮어쓰기 개념이라 쓰레기객체가 만들어지지 않는다
	}

}
