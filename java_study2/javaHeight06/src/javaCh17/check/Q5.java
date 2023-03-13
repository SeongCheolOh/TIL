package javaCh17.check;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q5 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("This is a java book",
											"Lambda Expressions",
											"Java8 supports lambda expressions");
		Stream<String> a = list.stream().filter(s->s.toLowerCase().contains("java"));
		System.out.println(a);

	}

}
