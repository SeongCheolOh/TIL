package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// 오버플로우 // 언더플로우
		byte var1 = 125;
		for(int i=0; i<5; i++) { //{}를 5번 반복 실행
			var1++; 				 //++연산값은 var1의 값을 1 증가시킴
			System.out.println("var1: " + var1);
		}

		System.out.println("------------------");
		
		byte var2 = -125;
		for(int i=0; i<5; i--) {
			var2--;
			System.out.println("var2 : "+ var2);
		}
		int x = 10000000;
		int y = 10000000;
		int z = x*y; // z= -727379968; >> 범위초과 >> long으로 바꿔줘야함
	}

}
