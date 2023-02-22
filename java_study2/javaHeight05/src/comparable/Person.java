package comparable;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	private Double score;
	
@Override
	public int compareTo(Person o) {
//		1. �̸��� 
//		return name.compareTo(o.name);   >>  String Ŭ������ �ִ� �޼ҵ带 ȣ���ؼ� 0,-1,1�� ������ 
//		2. ���̼�	
//		if( age< o.age)
//		return -1;
//		else if(age == o.age) {
//			return 0;
//		}else {return 1;} 
//		3. �̸��� �������� ���
//		return o.name.compareTo(name);
//		4. ������ �������� ���
//		if(o.age < age)return -1;
//		else if(o.age == age)return 0;
//		else return 1;
//		5. ���������� ���
		return score.compareTo(o.score);
} 
	
	
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
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
	
	public Person(String name, int age, Double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}