package javaCh17.sec10;

import java.util.Arrays;

import javaCh17.sec09.Student;

public class AggregateEx01 {

	public static void main(String[] args) {
		// p.752
		
		Student[] stdArr = {new Student("È«±æµ¿",100),
				new Student("È«±æµ¿",80),
				new Student("È«±æµ¿",60),
				new Student("È«±æµ¿",70),
				new Student("È«±æµ¿",50),
				new Student("È«±æµ¿",40),
				new Student("È«±æµ¿",60)};
		
		//Ä«¿îÆÃ
		long count = Arrays.stream(stdArr).count();
		System.out.println(count);
		
		//ÃÑ ÇÕ
		int sum = Arrays.stream(stdArr).mapToInt(n->n.getScore()).sum();
		System.out.println(sum);
		
		//Æò±Õ
		double avg = Arrays.stream(stdArr).mapToInt(n->n.getScore()).average().getAsDouble();
		System.out.println(avg);
		System.out.println((double)sum/count);
		
		//ÃÖ´ñ°ª
		int max = Arrays.stream(stdArr).mapToInt(n->n.getScore()).max().getAsInt();
		System.out.println(max);
		
		//ÃÖ¼Ú°ª
		int min = Arrays.stream(stdArr).mapToInt(n->n.getScore()).min().getAsInt();
		System.out.println(min);
		
		//Ã¹¹øÂ° ¿ä¼Ò
		int findFirst = Arrays.stream(stdArr).mapToInt(n->n.getScore()).findFirst().getAsInt();
		System.out.println(findFirst);
		
		//Á¡¼ö°¡ ¸ğµÎ 60À» ³Ñ¾ú´Â°¡ > true

	}

}
