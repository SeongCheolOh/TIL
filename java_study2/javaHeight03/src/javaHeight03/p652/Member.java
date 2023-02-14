package javaHeight03.p652;

public class Member {

	private String name;
	private int age;
	
	public Member(String name, int age) {
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
	
	//이름이 같고, 나이가 같으면 같은 사람(동등객체) 라는 것을 프로그래밍
	//1. hashCode() 같아야, 2. equals()가 같아야.
	//hashCode수행과 equals수행은 별도로 메소드 호출하지 않아도 Set의 객체가 알아서 동등객체 하려고 자동호출

	@Override
	public int hashCode() {
		// 개발자가 hashCode 재정의
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {//obj 변수에는 마지막으로 입력 될 Set 자료의 주소가 들어간다
		if(obj instanceof Member) {
			Member target = (Member) obj;
			return target.name.equals(this.name) && target.age == this.age;
			//target.name은 들어올 자료의 이름, this.name은 들어가있는 자료의 이름
		}
		return false;
	}
	
	
}
