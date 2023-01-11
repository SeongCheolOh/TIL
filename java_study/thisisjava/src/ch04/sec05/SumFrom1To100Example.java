package ch04.sec05;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		// while문을 사용하여 1부터 100까지 더해라

		int i = 1;
		int sum = 0;
		while(i<=100) {
			sum=sum+i; // = (sum+=i) 
			i++;
			
		}
		System.out.println(sum);
	}

}
