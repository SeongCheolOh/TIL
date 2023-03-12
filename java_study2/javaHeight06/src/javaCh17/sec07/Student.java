package javaCh17.sec07;

public class Student implements Comparable<Student>{
	
	private String name;
	private int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);//이름 오름차순으로 정렬
	//	return o.name.compareTo(name);//이름 내림차순으로 정렬
	//	return Integer.compare(score, o.score);
	}

}
