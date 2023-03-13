package javaCh17.sec12;

public class Student1 {

	private String grade;
	private String name;
	private String sex;
	private int score;
	
	
	
	public String getGrade() {
		return grade;
	}
	public Student1(String grade, String name, String sex, int score) {
		super();
		this.grade = grade;
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public int getScore() {
		return score;
	}
	
	
}
