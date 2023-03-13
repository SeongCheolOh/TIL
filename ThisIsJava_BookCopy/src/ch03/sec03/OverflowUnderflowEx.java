package ch03.sec03;

public class OverflowUnderflowEx {

	public static void main(String[] args) {
		// 타입이 허용하는 범위를 벗어났을 때
		
		byte var1 = 125;
		for(int i = 0; i<5; i++) {
			var1++;
			System.out.println(var1);
		}//오버플로우 발생 >> 최대범위를 벗어나면 최소부터 다시 시작한다
		System.out.println("----------");
		byte var2 = -125;
		for(int i = 0; i<5; i++) {
			var2--;
			System.out.println(var2);
		}

	}

}
