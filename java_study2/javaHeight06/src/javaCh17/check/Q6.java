package javaCh17.check;

import java.util.Arrays;
import java.util.List;

public class Q6 {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(new Member("È«±æµ¿", 30),
											new Member("½Å¿ë±Ç", 40),
											new Member("±èÀÚ¹Ù", 26));
		double avg = list.stream()
							.mapToInt(s->s.getAge())
							.average()
							.getAsDouble();
				
		System.out.println("Æò±Õ ³ªÀÌ : " + avg);
		
	}

}
