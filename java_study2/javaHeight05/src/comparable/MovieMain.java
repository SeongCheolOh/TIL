package comparable;

import java.util.TreeSet;

public class MovieMain {

	public static void main(String[] args) {
		
		TreeSet<Movie> setMovie = new TreeSet<Movie>();
		
		setMovie.add(new Movie("조커", 12405));
		setMovie.add(new Movie("알라딘", 25100));
		setMovie.add(new Movie("남산의 부장들", 11478));
		setMovie.add(new Movie("극한직업", 30100));
		setMovie.add(new Movie("기생충", 33542));
		
		System.out.println(setMovie.size());
		
	}

}
