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
		return name.compareTo(o.name);//�̸� ������������ ����
	//	return o.name.compareTo(name);//�̸� ������������ ����
	//	return Integer.compare(score, o.score);
	}

}
