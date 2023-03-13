package javaCh17.check;

public class Member1 {

	private String name;
	private String job;
	public Member1(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{name: " + name + ", job : " + job + "}";
	}
}
