package ch04.sec04;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		// for(초기화식;조건식;증감식){}
		// () 안의 내용들은 복수형 (a,b; c,d; e,f)로 저장 가능
		
		//1부터 100까지 숫자 출력
		
		int sum = 0;
		
		int i;
		
		for(i=1; i<=100; i++) {
			sum=sum+1;
			System.out.print(sum+ " ");
		}

	}

}
