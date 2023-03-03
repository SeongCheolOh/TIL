package javaCh16.p711;

public class Member {

	private String id;
	private String name;
	
	public Member(String id) {
		super();
		this.id = id;
	}

	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		String info="( id: " + id + ", name : " + name + ")";
		return info;
	}
}
