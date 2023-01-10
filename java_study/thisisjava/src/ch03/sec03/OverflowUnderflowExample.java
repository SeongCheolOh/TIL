package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// 오버플로우 = 최대값보다 위로 증가 >> 최솟값부터 다시 증가
		// 언더플로우 = 최솟값보다 아래로 감소 >> 최댓값부터 다시 감소
		byte var1 = 125;
		for(int i=0; i<5; i++) { //i=0, i<5가 참이면 
			var1++; 			 //var1++ 실행 
			System.out.println("var1: " + var1);//출력 후 for으로 올라가서 i++
												//다시 i=1<5 가 참이면 실행
		}//거짓이면 탈출

		System.out.println("------------------");
		
		byte var2 = -125;
		for(int i=0; i<5; i++) {//i=0, i<5가 참이면
			var2--;//-125-1=-126
			System.out.println("var2 : "+ var2);//출력 후 i++실행 후 반복재생
		}
		int x = 10000000;
		int y = 10000000;
		int z = x*y; // syso(z); >> -727379968; >> 범위초과 long();으로 바꿔줘야함
		long z1 = x*y;
		System.out.println(z1); // long으로 연산하려면 x또는y 둘중 하나라도 long타입이어야 정상출력
		long x1 = 10000000;
		long y1 = 10000000;
		long z2 = x1*y1;
		System.out.println(z2); // 정상출력
	}

}
