package javaCh17.sec06;

public class Student {
	//p.739
	private String name;
	private int score;
	private double see;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public double getSee() {
		return see;
	}

	public Student(String name, int score, double see) {
		super();
		this.name = name;
		this.score = score;
		this.see = see;
	}

	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	
}
