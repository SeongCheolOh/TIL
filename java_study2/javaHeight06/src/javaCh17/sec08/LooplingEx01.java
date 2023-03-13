package javaCh17.sec08;

import java.util.Arrays;

public class LooplingEx01 {

	public static void main(String[] args) {
		// p.748
		
		int[] intArr = {1,2,3,4,5};
		
		int total = Arrays.stream(intArr)
				.filter(a->a %2 == 0)
				.peek(n->System.out.println(n))
				.sum();

		System.out.println(total);
	}

}
