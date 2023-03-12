package javaCh17.sec06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingEx {

	public static void main(String[] args) {
		// p.742
		
		List<String> list1 = new ArrayList<String>();
		list1.add("this is java");
		list1.add("i'm a best developer");
		
		list1.stream().flatMap(s->Arrays.stream(s.split(" "))).forEach(s->System.out.println(s));

		List<String> list2 = Arrays.asList("10,20,30","40,50");
		list2.stream()
			 .flatMapToInt(data->{ //data ¾È¿¡´Â "10,20,30" "40,50"
				 String[] strArr = data.split(",");
				 int[] intArr = new int[strArr.length];
				 for(int i = 0; i<intArr.length; i++) {
					 intArr[i] = Integer.parseInt(strArr[i]);
				 }
				 return Arrays.stream(intArr);
			 }).forEach(s->System.out.println(s+" "+(s+50)));
//		list2.stream().flatMap(s->Arrays.stream(s.split(", "))).mapToInt(s-> Integer.parseInt(s)).forEach(s->System.out.println(s));

	}

}
