package javaCh18.Serialization;

import java.io.Serializable;

public class Student implements Serializable{

	private String name;
	private int score;
	private boolean gender;
	
	private static final long serialVersionUID = -1244489514496856198L;
	
	public Student(String name, int score, boolean gender) {
		super();
		this.name = name;
		this.score = score;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
}
