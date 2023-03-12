package javaCh17.sec06;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MapEx02 {
	
	public static void main(String[]args) {
		//p.741
		int[] ia = {1,2,3,4,5};
		
		IntStream is = Arrays.stream(ia);
		is.asDoubleStream().forEach(d->System.out.println(d));
		System.out.println();
		
		//long 배열을 만들고
		long[] la = {1L, 2L, 3L, 4L};
		//double로 바꾸고 3.14를 곱햇 ㅓ출력
		LongStream ls = Arrays.stream(la);
		ls.asDoubleStream().map(s->s*3.14).forEach(s1-> System.out.println(s1));
		System.out.println();
		
		double[] da = {1.1, 2.2, 3.3};
		DoubleStream ds = Arrays.stream(da);
		ds.boxed().forEach(s->System.out.println(s.doubleValue()));
	}

}
