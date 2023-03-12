package javaCh17;

import java.util.ArrayList;
import java.util.List;

public class StreamEx02 {

	public static void main(String[] args) {
		// p.729
		List<Product> list1 = new ArrayList<Product>();
		
		for(int i = 1; i <= 5; i++) {
			Product product = new Product(i, "상품"+i, "멋진회사"+i, (int) (1000*Math.random()));
			list1.add(product);
		}
		list1.stream().forEach(p-> System.out.println(p));
	}

}
