package comparable;

public class Movie implements Comparable<Movie>{

	private String movieName;
	private Integer ticketing;
	
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Integer getTicketing() {
		return ticketing;
	}
	public void setTicketing(Integer ticketing) {
		this.ticketing = ticketing;
	}
	
	public Movie(String movieName, Integer ticketing) {
		super();
		this.movieName = movieName;
		this.ticketing = ticketing;
	}
	@Override
	public int compareTo(Movie o) {
		movieName.compareTo(o.movieName);
		return 0;
	}
	
	
}
