package comparable;

import java.util.TreeSet;

public class MovieMain {

	public static void main(String[] args) {
		
		TreeSet<Movie> setMovie = new TreeSet<Movie>();
		
		setMovie.add(new Movie("��Ŀ", 12405));
		setMovie.add(new Movie("�˶��", 25100));
		setMovie.add(new Movie("������ �����", 11478));
		setMovie.add(new Movie("��������", 30100));
		setMovie.add(new Movie("�����", 33542));
		
		System.out.println(setMovie.size());
		
	}

}
