package ch04.sec04;

public class ForEx {

	public static void main(String[] args) {
		//1부터 10까지 한 줄로 출력
		for(int i = 1; i<=10; i++) {
			System.out.print(i+" ");
		}System.out.println();
		
		//1부터 100까지 합
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum += i;
		}System.out.println(sum);
		
		//float타입은 부동소수점으로 그 값을 정확히 표현할 수 없기때문에
		//사용하면 안 된다
		for(float i = 0.1f; i<=1.0f; i+=0.1f) {
			System.out.println(i);
		}//값이 정확하게 나오지 않는다
		
		//2중for문
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
	}

}
