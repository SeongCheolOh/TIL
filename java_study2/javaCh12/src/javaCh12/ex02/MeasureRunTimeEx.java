package javaCh12.ex02;

public class MeasureRunTimeEx {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		long startMiTime = System.currentTimeMillis();
		System.out.println(startTime + " " + startMiTime);
		
		int sum = 0;
		for(int i = 1; i<=10000000; i++) {
			sum += i;
		}
		long endTime = System.nanoTime();
		long endMiTime = System.currentTimeMillis();
		System.out.println(endTime +" " + endMiTime);
		System.out.println("1~10000000까지의 합을 구하는데 걸리는 시간은? " + (endTime-startTime)+"초");
		System.out.println("1~10000000까지의 합을 구하는데 걸리는 시간은? " + (endMiTime-startMiTime)+"초");

	}

}
