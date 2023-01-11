package ch04.sec04;

public class PrintFromTo10Example {

	public static void main(String[] args) {
		// for 문
		
		// 반복적으로 실행해야하는 프로그램에 적합
		
		
		int sum = 0;
		sum = sum+1;
		sum = sum+2;
		sum = sum+3;
		sum = sum+4;
		sum = sum+5;
		System.out.println("1부터 5까지의 합: " + sum);
		
		//간단히 변환 가능
		
		int sum1 = 0;
		for(int i=1 ; i<=5; i++) {//i가 1이고 <=5가 참이니 아래의 문장을 실행하고, i++한 다음 반복해라
			sum1=sum1+i;
		}
		System.out.println("1부터 5까지의 합 : "+ sum1);
		
		for(int i=1 ; i<=10; i++) {
			System.out.print(i + " ");
		}

	}

}
