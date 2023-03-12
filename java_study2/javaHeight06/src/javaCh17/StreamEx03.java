package javaCh17;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class StreamEx03 {

	public static void main(String[] args) {
		// p.732 ArrayStream
		
		double[] da = {1.1, 2.2, 3.3, 4.4, 5.5};
		boolean[] ba = {true, false, true, true, false, true};
		long[] la = {1000L, 20000L, -12340000L};
		float[] fa = {2.3f, 3.5f, 5.5f};
		
		//da, ba 스트림으로 만들고 출력
//		DoubleStream ds = Arrays.stream(da);
//		ds.forEach(d->System.out.print(d+ " "));
//		System.out.println();
		Arrays.stream(da).forEach(d-> System.out.print(d+ " "));
		System.out.println();
		
		Arrays.asList(ba).stream().forEach(b->System.out.print(b+" "));

		//fa 합계를 구해서 출력
		 Arrays.asList(fa).stream().forEach(f-> System.out.println(f));
//		 double c = Arrays.asList(fa).stream().mapToDouble(s-> s).sum();
//		 System.out.println(c);
		
		//la 평균 구해서 출력
		 System.out.println(Arrays.stream(la).average().getAsDouble());

	}

}
