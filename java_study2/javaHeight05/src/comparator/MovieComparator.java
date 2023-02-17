package comparator;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		System.out.println(o1.getMovieName());
		System.out.println(o2.getMovieName());
		System.out.println(o1.getMovieName().compareTo(o2.getMovieName()));
		return o1.getMovieName().compareTo(o2.getMovieName());
	}
	
}
