package comparator;

public class Shuttle {
	
	private String place;
	private Integer station;
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Integer getStation() {
		return station;
	}
	public void setStation(Integer station) {
		this.station = station;
	}
	
	public Shuttle(String place, Integer station) {
		super();
		this.place = place;
		this.station = station;
	}
	
	

}
