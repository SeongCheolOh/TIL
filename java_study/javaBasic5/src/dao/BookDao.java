package dao;

public class BookDao {
	private String name;
	private int age;
	private int score;
	
	public BookDao() {
		// 기본생성자 (ctrl + space bar)
	}
	
	public BookDao(int age) {//age만 쓰는 생성자 
		super();
		this.age = age;
	}//상단 source - constructor using field...

	public BookDao(String name, int age) {//name과 age만 쓰는 생성자
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
